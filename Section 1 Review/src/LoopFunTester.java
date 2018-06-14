import org.junit.*;
import static org.junit.Assert.*;
public class LoopFunTester 
{

//	public static void main(String[] args) 
//	{
//		LoopFun x1 = new LoopFun();
//		LoanApplicant Bob = new LoanApplicant(60000.0,6);
//		System.out.println(x1.getPermutationCount(8));
//		System.out.println(x1.removeDuplicates("seeped"));
//		System.out.println(x1.largestPowerLessThan(15));
//		System.out.println(x1.largestPowerLessThan(17));
//		System.out.println(x1.largestPowerLessThan(2));
//		System.out.println(x1.largestPowerLessThan(8));
//
//		System.out.println(x1.sumOdd(6));
//		System.out.println(x1.getECount("SeepEEED"));
//		Bob.setYearsOnJob(1);
//		System.out.println(Bob.qualifies());	
//	}
	
	//** Write JUnit tests for LoopFun
	private LoopFun obj;
	@Before
	public void setUp()
	{
		obj = new LoopFun();
	}
	
	@Test
	public void testPermutaitonCount() 
	{
		assertEquals(obj.getPermutationCount(8), 40320);
		assertEquals(obj.getPermutationCount(0), 0);
		assertEquals(obj.getPermutationCount(-1), 0);
		assertEquals(obj.getPermutationCount(10), 3628800);
		assertEquals(obj.getPermutationCount(1), 1);
	}

}
