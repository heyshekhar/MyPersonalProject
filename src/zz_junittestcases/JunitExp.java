package zz_junittestcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExp {

	@BeforeClass
	public static void BeforeAllTestMethod()
	{
		System.out.println("before all test method");
	}
	
	@AfterClass
	public static void afterAllTestMethod()
	{
		System.out.println("after all test method");
	}
	
	@After
	public void afterEachTestMethod()
	{
		System.out.println("after");
	}
	
	@ Test
	public void checkLogic()
	{
		assertEquals(4,Calculation.findMax(new int[]{1,4,3,2}));
	}
	
	@Test
	public void checkBooleanLogic()
	{
		assertTrue(Calculation.booleanLogic("shekhar","rathore"));
	}
	
	@Test
	public void checkNullLogic()
	{
		assertNull(Calculation.nullLogic());
	}

}            

class Calculation
{
	public static int findMax(int arry[])
	{
		Arrays.sort(arry);
		
		return arry[arry.length-1];
	}
	
	public static boolean booleanLogic(String one, String two)
	{
		if(one.length()>=two.length())
		{
			return true;
		}
		return false;
	}
	
	public static String nullLogic()
	{
		return null;
	}
}
