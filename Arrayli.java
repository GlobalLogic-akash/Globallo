package com.collectionFramework;

import java.util.ArrayList;

import java.util.List;

public class Arrayli 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("AK");
		arr.add(121);
		arr.add("GL");
		arr.add("Vns");
		
		System.out.println(arr);
		arr.add(56.98f);
		arr.add(6.91772);
		arr.add("arraylist");
		System.out.println(arr);
		System.out.println(arr.get(1));
		 ArrayList<Object> arr1=new ArrayList<Object>(arr);
		 arr1.add("second arrayList");
		 arr1.add(9999);
		 
		 System.out.println(arr1);
		  
		 for(Object i :arr1)
		 {
			 System.out.println(i);
		 }
		 
	}

}
