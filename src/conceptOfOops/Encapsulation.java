package conceptOfOops;

public class Encapsulation
{
	
	private String name;
	private String dept;
	private String address;
	private int age;
	
//	public  Polymorphism(String name,String dept,String address,int age)
//	{
//		this.name=name;
//		this.dept=dept;
//		this.address=address;
//		this.age=age;
//		
//	}
	public String getName()
	{
		return name;
	}
	public String setName(String name){
	{
    	 return  this.name=name;
	}
	
	}
	public String getDept()
	{
		return dept;
	}
	public String setDept(String dept)
	{
		return this.dept=dept;
	}
	public String getAddress()
	{
		return address;
	}
	public String setAddress(String address)
	{
	   return  this.address=address;
	}
	public int getAge()
	{
		return age;
	}
	public int setAge(int age)
	{
		return this.age=age;
	}
	
	public static void main(String[] args)
	{
		Encapsulation pk= new Encapsulation();
		pk.setName("prem");
		pk.setDept("CSE");
		pk.setAddress("middel street");
		pk.setAge(20);
		
		System.out.println("Name    : "+pk.getName());				
		System.out.println("Dept    : "+pk.getDept());	
		System.out.println("Address : "+pk.getAddress());	
		System.out.println("Age     : "+pk.getAge());	

	

    }
}
