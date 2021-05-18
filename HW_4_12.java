import java.util.Scanner;
class Concert{
    Scanner scanner = new Scanner(System.in);

    String [] seatS={"___","___","___","___","___","___","___","___","___","___"};
    String [] seatA={"___","___","___","___","___","___","___","___","___","___"};
    String [] seatB={"___","___","___","___","___","___","___","___","___","___"};

    boolean reserve(){                                                          //예약시스템
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int seatCase=scanner.nextInt();
        show(seatCase);
        System.out.print("이름>>");
        String name=scanner.next();
        System.out.print("번호>>");
        int seatNumber=scanner.nextInt();
        switch (seatCase){
            case 1:
                if(!seatS[seatNumber-1].equals("___")) return false;
                seatS[seatNumber-1]=name;
                return true;
            case 2:
                if(!seatA[seatNumber-1].equals("___")) return false;
                seatA[seatNumber-1]=name;
                return true;
            case 3:
                if(!seatB[seatNumber-1].equals("___")) return false;
                seatB[seatNumber-1]=name;
                return true;
        }
        return false;
    }

    void show(int n){                                                       //좌석표 출력을 도와줌
        switch (n){
            case 0:                                                         //전체 출력
                System.out.print("S>>");
                for(int i=0;i<10;i++) System.out.print(" "+seatS[i]);
                System.out.println();
                System.out.print("A>>");
                for(int i=0;i<10;i++) System.out.print(" "+seatA[i]);
                System.out.println();
                System.out.print("B>>");
                for(int i=0;i<10;i++) System.out.print(" "+seatB[i]);
                System.out.println();
                System.out.println("<<<조회를 완료하였습니다.>>>");
                break;
            case 1:                                                        //S출력
                System.out.print("S>>");
                for(int i=0;i<10;i++) System.out.print(" "+seatS[i]);
                System.out.println();
                break;
            case 2:                                                       //A출력
                System.out.print("A>>");
                for(int i=0;i<10;i++) System.out.print(" "+seatA[i]);
                System.out.println();
                break;
            case 3:                                                       //B출력
                System.out.print("B>>");
                for(int i=0;i<10;i++) System.out.print(" "+seatB[i]);
                System.out.println();
                break;
        }
    }

    boolean cancle(){                                                   //취소시스템
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int seatCase=scanner.nextInt();
        show(seatCase);
        System.out.print("이름>>");
        String name=scanner.next();
        switch (seatCase){
            case 1:
                for(int i=0;i<10;i++){
                    if(seatS[i].equals(name)){
                        seatS[i]="___";
                        return true;
                    }
                }
                return false;
            case 2:
                for(int i=0;i<10;i++){
                    if(seatA[i].equals(name)){
                        seatA[i]="___";
                        return true;
                    }
                }
                return false;
            case 3:
                for(int i=0;i<10;i++){
                    if(seatB[i].equals(name)){
                        seatB[i]="___";
                        return true;
                    }
                }
                return false;
        }
        return false;
    }
}
public class HW_4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트 예약 시스템입니다.");
        Concert concert = new Concert();
        int key=0;
        while(key!=4){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            key=scanner.nextInt();
            switch (key){
                case 1:
                    if(!concert.reserve()) System.out.println("예약 실패!");
                    break;
                case 2:
                    concert.show(0);
                    break;
                case 3:
                    if(!concert.cancle()) System.out.println("취소 실패!");
                    break;
                case 4:
                    key=4;
                    break;
            }
        }
    }
}
