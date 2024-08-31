package task_2;

public class calculator {

	private int num1,num2;
	private double num3,num4;
	 
	public calculator(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	public calculator(double num3,double num4)
	{
		this.num3=num3;
		this.num4=num4;
		
	}
	public int add()
	{
		return num1+num2;
	}
	public double add(double num5)
	{
		return num3+num4+num5;
	}
	public static void main(String[] args) 
	{
		calculator calculator1=new calculator(12,34);
		System.out.println(" sum of two integer numbers :"+calculator1.add());
		calculator calculator2=new calculator(12.9,34.8);
		System.out.println(" sum of three decimal numbers :"+calculator2.add(3.3));

	}

}
