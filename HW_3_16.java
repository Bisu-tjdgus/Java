import java.util.Scanner;
public class HW_3_16 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String [] str = {"가위", "바위" ,"보" };
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다!");
        while (true){
            System.out.print("가위 바위 보>>");
            String user=scanner.next();
            if(user.equals("그만")) break;
            int n = (int)(Math.random()*3);
            System.out.print("사용자 = "+user +" 컴퓨터 = "+str[n]);
            if(str[n].equals(user)) System.out.println(", 비겼습니다!");

            else if(str[n].equals("가위")){                       //컴퓨터가 가위
                if(user.equals("바위")) System.out.println(", 이겼습니다^^");
                else{System.out.println(", 졌습니다ㅜㅜ");}
            }
            else if(str[n].equals("바위")){                       //컴퓨터가 바위
                if(user.equals("가위")) System.out.println(", 졌습니다ㅜㅜ");
                else System.out.println(", 이겼습니다^^");
            }
            else{                                                //컴퓨터가 보
                if(user.equals("가위")) System.out.println(", 이겼습니다^^");
                else System.out.println(", 졌습니다ㅜㅜ");
            }
        }
    }
}
