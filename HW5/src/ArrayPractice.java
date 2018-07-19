public class ArrayPractice 	
{
	private int[] array;
	
	public ArrayPractice()
	{
//		array = new int[10];
//		for(int i = 0; i < 10; i++)
//		{
//			array[i] = i + 1;
//		}
	array = new int[] {1,2,3,4,5,6,7,8,9,10};
	}
	
	public int sumOfArray()
	{
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}
	
	public double averageOfArray()
	{
//		int sum = 0;
//		for(int i = 0; i < array.length; i++)
//		{
//			sum = sum + array[i];
//		}
		return sumOfArray()/ array.length;
	}
	
	public int[][] create2DArray(int x, int y)
	{
		int[][] twoD = new int[y][x];
		return twoD;
	}
	
	public int maxValueoftwoD(int[][] twoD)
	{
		int max = twoD[0][0];
		for(int i = 0; i < twoD.length; i++)
		{
			for(int j = 0; i < twoD[i].length; i++)
			{
				if(twoD[i][j] > max)
				{
					max = twoD[i][j];
				}
			}
		}	
		return max;	
	}
}
