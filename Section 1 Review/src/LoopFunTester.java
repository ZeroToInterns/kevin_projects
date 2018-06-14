
public class LoopFunTester {

	public static void main(String[] args) 
	{
//		LoopFun x1 = new LoopFun();
		LoanApplicant Bob = new LoanApplicant(60000.0,6);
//		System.out.println(x1.removeDuplicates("seeped"));
//		System.out.println(x1.largestPowerLessThan(15));
//		System.out.println(x1.largestPowerLessThan(17));
//		System.out.println(x1.largestPowerLessThan(2));
//		System.out.println(x1.largestPowerLessThan(8));

//		System.out.println(x1.sumOdd(6));
//		System.out.println(x1.getECount("SeepEEED"));
		System.out.println(Bob.qualifies());
	}

}
