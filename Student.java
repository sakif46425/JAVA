public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public void setid(int id)
	{
		this. id=id;
	}
	public void setname(String name)
	{
		this. name=name;
	}
	public void setcgpa(double cgpa)
	{
		this. cgpa=cgpa;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	public void showdetails()
	{
		System.out.println("id is  : "  +id);
		System.out.println("name is: "  +name);
		System.out.println("cgpa is: "  +cgpa);
	}
	public static void main(String args[])
	{
		Student s= new Student();
		s.setid    (22464251);
		s.setname("Sakif khan");
		s.setcgpa(4.00);
		s.showdetails();
	}
}


		
	
	
	
