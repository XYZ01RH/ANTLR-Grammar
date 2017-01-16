grammar ExprTest;

@header {
	import java.util.HashMap;
	import java.util.ArrayList;
}

@parser::members {
	HashMap<String, Object> memory = new HashMap<>();

	boolean checkMem(String s) {
		if(memory.containsKey(s)) {
			return true;
		} else { return false; }
	}

	void printError() {
		error("SYNTAX ERROR");
	}

	void error(String err) {
		System.err.println(err);
		System.exit(0);
	}

	int eval(int left, int opr, int right) {
		switch(opr) {
			case MUL : return left * right;
			case DIV : 
				if(right == 0) {
					return 0;
				} else { return left / right; }
			case ADD : return left + right;
			case SUB : return left - right;
		}
		printError();
		return 0;
	}

	String eval(String left, int opr, String right) {
		switch(opr) {
			case ADD : return left + right;
		}
		printError();
		return "";
	}

	String eval(String left, int opr, int right) {
		switch(opr) {
			case MUL :
				StringBuilder sb = new StringBuilder();
				if(right == 0) {
					return("");
				} else if(right > 0) {
					for(int i = 0; i < right; i++) {
						sb.append(left);
					} return sb.toString();
				} else { error("ERROR NEGATIVE STRING MULTIPLIER");}
			case DIV : error("ERROR STRING DIVISION");
			case ADD : 
				if(right > 0) {
					if(right < left.length()) {
						return left.substring(right);
					} else { printError(); }
				} else {
					if( (right * -1) < left.length() ) {
						return left.substring(0, left.length() + right);
					} else { printError(); }
				}
			case SUB :
				if(right > 0) {
					if(right < left.length()) {
						return left.substring(0, left.length() - right);
					} else { printError(); }
				} else {
					if( (right * -1) < left.length() ) {
						return left.substring(0, left.length() - right);
					} else { printError(); }
				}
		}
		printError();
		return "";
	}
}

prog	:	stat+;
stat	:	PRINT expr ENDLINE	{System.out.println($expr.value);}
		|	expr ENDLINE		{System.out.println($expr.value);}
		| 	ID '=' expr ENDLINE
				{
					if(checkMem($ID.text)) {
						//Object x=null;
						//Object z=$expr.value;
						//x=memory.get($ID.text);
						//if ((x instanceof String) && (z instanceof String))
						//{ 
						if( (memory.get($ID.text) instanceof String &&    $expr.value instanceof String) || (memory.get($ID.text) instanceof Integer && $expr.value instanceof Integer)) {
							memory.put($ID.text, $expr.value);
						} else { error("VARIABLE ALREADY DECLARED"); }
					} else { printError(); }
				}
		|	ID ':=' expr ENDLINE
				{
					if(checkMem($ID.text)) {
						error("ERROR VARIABLE ALREADY DECLARED");
					} else {
						memory.put($ID.text, $expr.value);
					}
				}
		|	vardecl
		|	expr
		|	NL
		;

vardecl	:	VAR vA=idList STRING ENDLINE
				{
					for(String id : $vA.list) {
						memory.put(id, "\"");
					}	
				}
		| 	VAR vA=idList INTEGER ENDLINE
				{
					for(String id : $vA.list) {
						memory.put(id, 0);
					}
				}
		| 	VAR vA=idList ID '=' iA=eList ENDLINE
				{
					ArrayList<String> v = $vA.list;
					ArrayList<Object> e = $iA.list;
					if(v.size() == e.size()) {
						for(int i = 0; i < v.size(); i++) {
							if(e.get(i) instanceof String) {
								memory.put(v.get(i), (String)e.get(i));
							} else if(e.get(i) instanceof Integer) {
								memory.put(v.get(i), (Integer)e.get(i));
							} else { printError(); }
						}
					}
				}
		| 	VAR vA=idList STRING ID '=' iA=eList ENDLINE
				{
					ArrayList<String> v = $vA.list;
					ArrayList<Object> e = $iA.list;
					if(v.size() == e.size()) {
						for(int i = 0; i < v.size(); i++) {
							if(e.get(i) instanceof String) {
								memory.put(v.get(i), (String) e.get(i));
							} else { printError(); }
						}
					} else { printError(); }
				}
		| 	VAR vA=idList INTEGER '=' iA=eList ENDLINE
				{
					ArrayList<String> v = $vA.list;
					ArrayList<Object> e = $iA.list;
					if(v.size() == e.size()) {
						for(int i = 0; i < v.size(); i++) {
							if(e.get(i) instanceof Integer) {
								memory.put(v.get(i), (Integer) e.get(i));
							} else { printError(); }
						}
					} else { printError(); }
				}
		;

expr returns [Object value]
		:	e=expr op=(MUL | DIV) f=expr
				{
           			if ($e.value instanceof Integer && $f.value instanceof Integer){
               			$value = eval((Integer)$e.value, $op.type, (Integer)$f.value);
           			} else if ($e.value instanceof String && $f.value instanceof Integer){
               			$value = eval((String)$e.value, $op.type, (Integer)$f.value);
           			} else if ($e.value instanceof Integer && $f.value instanceof String){
               			$value = eval((String)$f.value, $op.type, (Integer)$e.value);
        			} else { printError(); }
				}
		| 	e=expr op=(ADD | SUB) f=expr
				{
					if ($e.value instanceof Integer && $f.value instanceof Integer){
               			$value = eval((Integer)$e.value, $op.type, (Integer)$f.value);
           			} else if ($e.value instanceof String && $f.value instanceof String){
               			$value = eval((String)$e.value, $op.type, (String)$f.value);
           			} else if ($e.value instanceof String && $f.value instanceof Integer){
               			$value = eval((String)$e.value, $op.type, (Integer)$f.value);
           			} else if ($e.value instanceof Integer && $f.value instanceof String){
               			$value = eval((String)$f.value, $op.type, (Integer)$e.value);
           			} else { printError(); }
				}
		|	INT 	{$value = $INT.int;}
		|	STR 	{$value = $STR.text.replaceAll("\"", "");}
		|	ID
				{
					String id = $ID.text;
					if(checkMem(id)) {
						$value = memory.get(id);
					} else { printError(); }
				}
		|	'(' e=expr ')'	{$value = $e.value;}
		;

//varList returns[java.util.ArrayList list]
//		: v=ID ',' ol=varList	{ArrayList<String> alist=$ol.list; alist.add($v.text); $list = alist;}
//		| v=ID {ArrayList<String> alist=new ArrayList<>();alist.add($v.text); $list=alist;}
//		;

//idList returns [java.lang.Object list]
//		: v=ID ',' ol=idList {$list = null;}
//		| v=ID {$list=null;}
//		;


//ID List
idList returns [ArrayList<String> list]
locals [
    ArrayList<String> ids = new ArrayList<>();
]
    : ID {$ids.add($ID.text);} (',' ID {$ids.add($ID.text);})* {$list = $ids;};

//Expression List
eList returns [ArrayList<Object> list]
locals [
    ArrayList<Object> exprs = new ArrayList<>();
]
    : e=expr {$exprs.add($e.value);} (',' f=expr {$exprs.add($f.value);})* {$list = $exprs;};

//OPERATIONS 
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';

//KEYWORDS
ENDLINE : 	(';' NL | NL | ';');
VAR 	:	'var';
PRINT 	:	'print';
STRING 	:	'string';
INTEGER :	'int';

//TOKENS
INT 	: '-'? ('0'..'9')+;
STR 	: '"' ('a'..'z'|'A'..'Z'|'0'..'9')* '"';
ID 		: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
NL 		: '\r'? '\n';
WS 		: (' ' | '\t'|'\r'| '\n') {skip();};