// Generated from /home/diogo/universidade/4/ATS/2018atsg004/projecto/src/antlr4/ATS.g4 by ANTLR 4.7

  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.util.*;
  import java.util.concurrent.ThreadLocalRandom;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ATSParser}.
 */
public interface ATSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ATSParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(ATSParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(ATSParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#fim}.
	 * @param ctx the parse tree
	 */
	void enterFim(ATSParser.FimContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#fim}.
	 * @param ctx the parse tree
	 */
	void exitFim(ATSParser.FimContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(ATSParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(ATSParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#autenticado}.
	 * @param ctx the parse tree
	 */
	void enterAutenticado(ATSParser.AutenticadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#autenticado}.
	 * @param ctx the parse tree
	 */
	void exitAutenticado(ATSParser.AutenticadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#regCond}.
	 * @param ctx the parse tree
	 */
	void enterRegCond(ATSParser.RegCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#regCond}.
	 * @param ctx the parse tree
	 */
	void exitRegCond(ATSParser.RegCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#regCliente}.
	 * @param ctx the parse tree
	 */
	void enterRegCliente(ATSParser.RegClienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#regCliente}.
	 * @param ctx the parse tree
	 */
	void exitRegCliente(ATSParser.RegClienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#regEmpresa}.
	 * @param ctx the parse tree
	 */
	void enterRegEmpresa(ATSParser.RegEmpresaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#regEmpresa}.
	 * @param ctx the parse tree
	 */
	void exitRegEmpresa(ATSParser.RegEmpresaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#regAut}.
	 * @param ctx the parse tree
	 */
	void enterRegAut(ATSParser.RegAutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#regAut}.
	 * @param ctx the parse tree
	 */
	void exitRegAut(ATSParser.RegAutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(ATSParser.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(ATSParser.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#logout}.
	 * @param ctx the parse tree
	 */
	void enterLogout(ATSParser.LogoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#logout}.
	 * @param ctx the parse tree
	 */
	void exitLogout(ATSParser.LogoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#solicitar}.
	 * @param ctx the parse tree
	 */
	void enterSolicitar(ATSParser.SolicitarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#solicitar}.
	 * @param ctx the parse tree
	 */
	void exitSolicitar(ATSParser.SolicitarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#solicitarE}.
	 * @param ctx the parse tree
	 */
	void enterSolicitarE(ATSParser.SolicitarEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#solicitarE}.
	 * @param ctx the parse tree
	 */
	void exitSolicitarE(ATSParser.SolicitarEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#altDisp}.
	 * @param ctx the parse tree
	 */
	void enterAltDisp(ATSParser.AltDispContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#altDisp}.
	 * @param ctx the parse tree
	 */
	void exitAltDisp(ATSParser.AltDispContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATSParser#viajar}.
	 * @param ctx the parse tree
	 */
	void enterViajar(ATSParser.ViajarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATSParser#viajar}.
	 * @param ctx the parse tree
	 */
	void exitViajar(ATSParser.ViajarContext ctx);
}