public class Light 
{
    boolean isOn;

    void turnOn()
    {
        isOn = true;
        System.out.println("Light on? " + isOn);
    }

    void turnOff()
    {
        isOn = false;
        System.out.println("Light on? " + isOn);
    }

    public static void main(String[] args)
    {
        Light l1 = new Light();
        Light l2 = new Light();

        l1.turnOn();
        l2.turnOff();
    }
}
    

