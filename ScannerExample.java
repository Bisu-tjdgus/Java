import java.util.Scanner;

public class ScannerExample {
    public static void mian(String[] args) {
        Scanner s1 = new SCanner(System.in);
        System.out.print(">>");
        while(s1.hasNext()) {
            System.out.println(s1.next());
        }
    }
}
