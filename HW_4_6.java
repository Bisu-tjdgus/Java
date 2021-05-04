import java.util.Scanner;
class Circle{
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public int square(){return radius*radius;}
}

public class HW_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];
        for(int i=0;i<c.length;i++){
            System.out.print("x, y, radius>>");
            double x=scanner.nextDouble();
            double y=scanner.nextDouble();
            int r = scanner.nextInt();
            c[i]=new Circle(x,y,r);
        }
        int max=0;
        int res=0;
        for(int i=0;i<c.length;i++){
            if(res<c[i].square()) {
                res=c[i].square();
                max = i;
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[max].show();
        scanner.close();
    }
}
