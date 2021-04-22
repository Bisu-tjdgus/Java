import java.util.Scanner;
public class HW_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money= scanner.nextInt();

        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        for(int i = 0; i<unit.length;i++){
            if(money/unit[i]==0) continue;
            System.out.println(unit[i]+"원 짜리 : " + money/unit[i]+"개");
            money= money - (money/unit[i] * unit[i]);
        }

    }
}
