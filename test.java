public class test {
    public static void main(String[] args) {
        
        Area areas[] = new Area[10];

        Area a1 = new Area();
        a1.setlength( 1.5);
        a1.setwidth( 1.2);
        a1.setheight( 2.7);

        Area a2 = new Area();
        a2.setlength(2.5);
        a2.setwidth(2.1);
        a2.setheight( 2.7);

        Area[0] = a1;
        Area[2] = a2;

       for(int i = 0; i<areas.length; i++)
       {
        if(areas[i] != null)
        {
            System.out.println("<------------------------------------------------>");
            System.out.println("Areas["+i+"] length: "+areas[i].getlength());
            System.out.println("Areas["+i+"] width: "+areas[i].getwidth());
            System.out.println("Areas["+i+"] height: "+areas[i].getheight());
        }

        else
        {
            System.out.println("<===================================>");
            System.out.println("There is No object in areas["+i+"]");
        }
       }
    }
}
