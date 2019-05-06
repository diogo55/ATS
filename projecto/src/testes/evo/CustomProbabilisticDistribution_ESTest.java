/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 12 21:24:15 GMT 2018
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CustomProbabilisticDistribution_ESTest extends CustomProbabilisticDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CustomProbabilisticDistribution customProbabilisticDistribution0 = new CustomProbabilisticDistribution();
      customProbabilisticDistribution0.addValues((-3137), (-87.893345957));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CustomProbabilisticDistribution customProbabilisticDistribution0 = new CustomProbabilisticDistribution();
      customProbabilisticDistribution0.addValues(28, 28);
      int int0 = customProbabilisticDistribution0.pickNumber();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CustomProbabilisticDistribution customProbabilisticDistribution0 = new CustomProbabilisticDistribution();
      customProbabilisticDistribution0.addValues((-629), 3603.0);
      int int0 = customProbabilisticDistribution0.pickNumber();
      assertEquals((-629), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CustomProbabilisticDistribution customProbabilisticDistribution0 = new CustomProbabilisticDistribution();
      customProbabilisticDistribution0.addValues(1, 1);
      customProbabilisticDistribution0.addValues(1, 1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CustomProbabilisticDistribution customProbabilisticDistribution0 = new CustomProbabilisticDistribution();
      int int0 = customProbabilisticDistribution0.pickNumber();
      assertEquals(0, int0);
  }
}