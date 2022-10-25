public class Result
{
    private int id;
    private String name;
    private double cgpa;

    private void setid(int id)
    {
        this. id=id;
    }
    public void setname(String name)
    {
        this. name=name;
    }
    public void setcgpa(string cgpa)
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
        System.out.println("id is: "+id);
        System.out.println("name is: "+name);
        System.out.println("cgpa: "+cgpa);
    }
    public static void main(String[] args)
    {
        Student.s = new Student();
        s.setid(22464251);
        s.setname("Sakif KHan");
        s.setcgpa(3.58);
        s.showdetails();


    }
}
    
        