public class FinalExample {
    //Field
    public static final double PI_VALUE;

    static {
        PI_VALUE = 3.14;
    }

    //Constructor
    public FinalExample() {
        //PI_VALUE = 3.14;
    }

    public static void main()
    {
        final double PI;
        int radius =1;

        PI = 3.14;

        double parameter = 2 * PI * radius;
    }
}

