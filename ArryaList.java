package com.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

class Emp
{
	int id;
	String name,cmpName;
	public Emp(int id,String name,String cmpName)
	{
		this.id=id;
		this.name=name;
		this.cmpName=cmpName;
	}
	public String toStirng()
	{
		return id+" "+name+" "+cmpName;
	}
}
public class ArryaList 
{

	public static void main(String[] args)
	{
		ArrayList<Emp> arr=new ArrayList<Emp>();
		
		Emp e1=new Emp(121,"Abc","GL");
		Emp e2=new Emp(122,"Xyz","GL");
		Emp e3=new Emp(123,"Pqr","GL");
		
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
	//	System.out.println(arr);
		
		
		Iterator<Emp> itr=arr.iterator();
		while(itr.hasNext())
		{
			Emp emp=(Emp)itr.next();
			System.out.println(emp.id+" "+emp.name+" "+emp.cmpName);
		}

	}

}
