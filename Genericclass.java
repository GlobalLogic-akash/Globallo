package com.collectionFramework;
class Employee<X,Y,Z>
{
	X id;
	Y name;
	Z cmp;
	
	public Employee(X id,Y name,Z cmp)
	{
		this.id=id;
		this.name=name;
		this.cmp=cmp;
	}
	public void show()
	{
		System.out.print(id+" ");
		System.out.print(name+" ");
		System.out.print(cmp);
	}
}
public class Genericclass 
{
	public static void main(String[] args)
	{
		Employee<Integer,String,String> emp=new Employee<Integer,String,String>(121,"AK","GL");
		emp.show();
	}

}
