import java.util.Scanner;
public class HW_3_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String ch=scanner.next();
        char c=ch.charAt(0);
        for(int i=c; i>=97;i--){
            for(int j=97;j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}