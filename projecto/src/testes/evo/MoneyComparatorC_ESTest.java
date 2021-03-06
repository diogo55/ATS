/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 12 21:17:08 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MoneyComparatorC_ESTest extends MoneyComparatorC_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MoneyComparatorC moneyComparatorC0 = new MoneyComparatorC();
      Client client0 = mock(Client.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(client0).getEmail();
      doReturn(0.0, 0.0).when(client0).getMoney();
      Client client1 = mock(Client.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(client1).getEmail();
      doReturn(0.0, 0.0).when(client1).getMoney();
      // Undeclared exception!
      try { 
        moneyComparatorC0.compare(client0, client1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MoneyComparatorC", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MoneyComparatorC moneyComparatorC0 = new MoneyComparatorC();
      Client client0 = mock(Client.class, new ViolatedAssumptionAnswer());
      doReturn(">9;/&{Gz}xSB*", ">9;/&{Gz}xSB*").when(client0).getEmail();
      doReturn((-4405.720520030881), (-1.7359097170284246), 312.855109, (-1.7359097170284246)).when(client0).getMoney();
      int int0 = moneyComparatorC0.compare(client0, client0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MoneyComparatorC moneyComparatorC0 = new MoneyComparatorC();
      Client client0 = mock(Client.class, new ViolatedAssumptionAnswer());
      doReturn(1194.999787056294, (-2806.4953227)).when(client0).getMoney();
      int int0 = moneyComparatorC0.compare(client0, client0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MoneyComparatorC moneyComparatorC0 = new MoneyComparatorC();
      Client client0 = mock(Client.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0), 277.607984).when(client0).getMoney();
      int int0 = moneyComparatorC0.compare(client0, client0);
      assertEquals(1, int0);
  }
}
