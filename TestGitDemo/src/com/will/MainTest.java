package com.will;

public class MainTest
{

	public static void main(String[] args)
	{
		System.out.println("Hello GitHub.");

		String str = "abc,ddd,abc,weer";
		String[] strArray = str.split(",");
		for (String perStr : strArray)
		{
			System.out.println(perStr);
		}

	}

}
