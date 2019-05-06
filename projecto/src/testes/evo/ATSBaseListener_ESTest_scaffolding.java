/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 12 21:30:54 GMT 2018
 */


import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ATSBaseListener_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ATSBaseListener"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ATSBaseListener_ESTest_scaffolding.class.getClassLoader() ,
      "org.antlr.v4.runtime.tree.SyntaxTree",
      "org.antlr.v4.runtime.tree.RuleNode",
      "ATSParser$AutenticadoContext",
      "ATSParser$FuncaoContext",
      "ATSParser$FimContext",
      "org.antlr.v4.runtime.misc.Interval",
      "ATSBaseListener",
      "ATSParser$LogContext",
      "ATSParser",
      "org.antlr.v4.runtime.Token",
      "ATSParser$RegCondContext",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.runtime.tree.ParseTreeVisitor",
      "ATSParser$RegClienteContext",
      "ATSParser$SolicitarContext",
      "org.antlr.v4.runtime.tree.ParseTree",
      "ATSParser$ViajarContext",
      "org.antlr.v4.runtime.Recognizer",
      "ATSListener",
      "org.antlr.v4.runtime.tree.Tree",
      "ATSParser$LoginContext",
      "org.antlr.v4.runtime.tree.TerminalNode",
      "ATSParser$LogoutContext",
      "org.antlr.v4.runtime.Parser",
      "org.antlr.v4.runtime.tree.ParseTreeListener",
      "ATSParser$RegEmpresaContext",
      "ATSParser$RecviagContext",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.tree.ErrorNode"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("ATSParser$AutenticadoContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$FimContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$FuncaoContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$LogContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$LoginContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$LogoutContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$RecviagContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$RegClienteContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$RegCondContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$RegEmpresaContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$SolicitarContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("ATSParser$ViajarContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.antlr.v4.runtime.ParserRuleContext", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.antlr.v4.runtime.tree.ErrorNode", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.antlr.v4.runtime.tree.TerminalNode", false, ATSBaseListener_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ATSBaseListener_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ATSBaseListener",
      "org.antlr.v4.runtime.RuleContext",
      "org.antlr.v4.runtime.ParserRuleContext",
      "ATSParser$LoginContext",
      "ATSParser$AutenticadoContext",
      "ATSParser$SolicitarContext",
      "ATSParser$RegClienteContext",
      "ATSParser$LogContext",
      "ATSParser$FuncaoContext",
      "ATSParser$FimContext",
      "ATSParser$ViajarContext",
      "ATSParser$RegCondContext",
      "ATSParser$LogoutContext",
      "ATSParser$RecviagContext",
      "ATSParser$RegEmpresaContext"
    );
  }
}
