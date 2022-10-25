public class Identity
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
        System.out.println("id is: "+id);
        System.out.println("name is: "+name);
        System.out.println("cgpa: "+cgpa);
    }
    public static void main(String[] args)
    {
        Identity i = new Identity();
        i.setid(22464251);
        i.setname("Sakif Khan");
        i.setcgpa(3.58);
        i.showdetails();


    }
}
    
        