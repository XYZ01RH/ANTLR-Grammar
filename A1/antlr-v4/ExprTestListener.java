// Generated from ExprTest.g by ANTLR 4.5.2

	import java.util.HashMap;
	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprTestParser}.
 */
public interface ExprTestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprTestParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprTestParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprTestParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprTestParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprTestParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprTestParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprTestParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprTestParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprTestParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(ExprTestParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprTestParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(ExprTestParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprTestParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprTestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprTestParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprTestParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(ExprTestParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprTestParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(ExprTestParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprTestParser#eList}.
	 * @param ctx the parse tree
	 */
	void enterEList(ExprTestParser.EListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprTestParser#eList}.
	 * @param ctx the parse tree
	 */
	void exitEList(ExprTestParser.EListContext ctx);
}