package com.string.learn;

public class Test1 {

	public static void main(String[] args) 
	{
		String s1="java";
		String s2=new String("java");
		String s3=new String("java");
		String s4="JAVA";
		String s5="java";
		
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equals");
		}
		if(s1==s3)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equals");
		}
		if(s1==s4)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equals");
		}
		if(s2.equals(s3))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		if(s1==s5)
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
		if(s1.equalsIgnoreCase(s4))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}
	}

}
