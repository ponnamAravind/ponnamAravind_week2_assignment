package task_2;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
	  this.name=name;
	  this.age=age;
	  
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void displaydetails()
	{
		System.out.println("Name: "+ name);
	     System.out.println("Age: "+ age);
	     
	}

	public static void main(String[] args) 
	{
		Person person =new Person("ram", 23);
	     person.displaydetails();	

	}

}
