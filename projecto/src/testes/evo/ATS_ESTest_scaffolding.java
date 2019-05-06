/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 12 21:30:10 GMT 2018
 */


import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ATS_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ATS"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/diogo/universidade/4/ATS/2018atsg004/projecto"); 
    java.lang.System.setProperty("user.home", "/home/diogo"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "diogo"); 
    java.lang.System.setProperty("user.timezone", "Europe/Lisbon"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ATS_ESTest_scaffolding.class.getClassLoader() ,
      "ATS",
      "org.antlr.v4.runtime.tree.SyntaxTree",
      "org.antlr.v4.runtime.tree.RuleNode",
      "ATSParser$AutenticadoContext",
      "UMeR",
      "ATSParser$FuncaoContext",
      "org.antlr.v4.runtime.misc.Interval",
      "ATSParser$FimContext",
      "org.antlr.v4.runtime.ANTLRErrorStrategy",
      "ATSParser$LogContext",
      "org.antlr.v4.runtime.TokenStream",
      "org.antlr.v4.runtime.Token",
      "ATSParser$RegCondContext",
      "org.antlr.v4.runtime.tree.ParseTreeVisitor",
      "Vehicle",
      "ATSParser$RegClienteContext",
      "org.antlr.v4.runtime.Lexer",
      "org.antlr.v4.runtime.CharStreams",
      "org.antlr.v4.runtime.IntStream",
      "org.antlr.v4.runtime.CodePointBuffer$Builder",
      "Client",
      "org.antlr.v4.runtime.misc.IntSet",
      "org.antlr.v4.runtime.misc.Utils",
      "org.antlr.v4.runtime.TokenFactory",
      "org.antlr.v4.runtime.CodePointCharStream",
      "ATSParser$ViajarContext",
      "org.antlr.v4.runtime.Recognizer",
      "org.antlr.v4.runtime.misc.IntegerList",
      "org.antlr.v4.runtime.CodePointBuffer$1",
      "org.antlr.v4.runtime.tree.Tree",
      "ATSParser$LoginContext",
      "org.antlr.v4.runtime.tree.TerminalNode",
      "org.antlr.v4.runtime.Vocabulary",
      "org.antlr.v4.runtime.atn.ATNSimulator",
      "ATSParser$RecviagContext",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.tree.ErrorNode",
      "org.antlr.v4.runtime.misc.IntervalSet",
      "org.antlr.v4.runtime.misc.Predicate",
      "User",
      "ATSParser",
      "Driver",
      "org.antlr.v4.runtime.CodePointBuffer$Type",
      "org.antlr.v4.runtime.tree.Trees",
      "org.antlr.v4.runtime.RuleContext",
      "ATSParser$SolicitarContext",
      "org.antlr.v4.runtime.CharStream",
      "org.antlr.v4.runtime.atn.ParseInfo",
      "org.antlr.v4.runtime.tree.ParseTree",
      "org.antlr.v4.runtime.atn.ParserATNSimulator",
      "Trip",
      "org.antlr.v4.runtime.atn.ProfilingATNSimulator",
      "org.antlr.v4.runtime.TokenSource",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePattern",
      "ATSParser$LogoutContext",
      "org.antlr.v4.runtime.atn.ATN",
      "org.antlr.v4.runtime.CodePointCharStream$1",
      "org.antlr.v4.runtime.RecognitionException",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.v4.runtime.tree.ParseTreeListener",
      "ATSParser$RegEmpresaContext",
      "org.antlr.v4.runtime.CodePointBuffer",
      "org.antlr.v4.runtime.ANTLRErrorListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ATS_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ATS",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.runtime.CodePointBuffer$Type",
      "org.antlr.v4.runtime.CodePointCharStream$1",
      "ATSParser$AutenticadoContext",
      "ATSParser$LogContext",
      "ATSParser$RegClienteContext",
      "ATSParser$ViajarContext",
      "ATSParser$SolicitarContext",
      "ATSParser$FuncaoContext",
      "ATSParser$LogoutContext",
      "ATSParser$RegEmpresaContext",
      "ATSParser$LoginContext",
      "org.antlr.v4.runtime.Recognizer",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.v4.runtime.tree.Trees",
      "org.antlr.v4.runtime.misc.Utils",
      "ATSParser$RecviagContext",
      "ATSParser$RegCondContext",
      "org.antlr.v4.runtime.misc.Interval",
      "UMeR",
      "org.antlr.v4.runtime.CharStreams",
      "org.antlr.v4.runtime.CodePointBuffer",
      "org.antlr.v4.runtime.CodePointBuffer$Builder",
      "org.antlr.v4.runtime.CodePointBuffer$1",
      "ATSParser$FimContext"
    );
  }
}