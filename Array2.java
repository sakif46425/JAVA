public class Array2 
{
    public static void main(String[]args)
    {
        int[]arrfirst = new int [] {1,2,3,4,5};
        int[]arrsecond = new int [arrfirst.length];
        for(int i = 0; i<arrfirst.length; i++)
        {
            arrsecond[i] = arrfirst[i];
        } 
        System.out.println("Elements of original array: ");

        for (int i = 0; i<arrfirst.length; i++)
        {
            System.out.print(arrfirst[1] + " ");

        }
        System.out.println();

        System.out.println("Elements of new array: ");
        for(int i=0; i<arrsecond.length; i++)
        {
            System.out.println(arrsecond[i] + " ");
        }
    }
}
    

