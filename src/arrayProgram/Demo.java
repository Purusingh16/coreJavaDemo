package arrayProgram;

public class Demo
{

	public static void main(String[] args) 
	{
//		step-1
		int arr[];
		String str[];
//		step-2
		arr=new int[3];
		str=new String[3];
//		step-3
		arr[0]=99;
		arr[1]=88;
		
		str[0]="amit";
		str[1]="raj";
		
		int length=arr.length;
		System.out.println("\nsee the 1st array element");
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]);
		}
		int length1=str.length;
		System.out.println("\nsee the 2nd array element");
		for(int i=0;i<length1;i++)
		{
			System.out.println(str[i]);
		}
	}

}
