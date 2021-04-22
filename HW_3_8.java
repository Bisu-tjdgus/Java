import java.util.Scanner;
public class HW_3_8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("정수 몇개?? >>");
            int num=scanner.nextInt();
            while(true){
                if(num<=100) break;
                System.out.print("입력하신 정수가 100보다 큽니다! 다시 입력해주세요>>");
                num=scanner.nextInt();
            }
            System.out.println();
            int tmp=1;
            int [] arr = new int[num]; //랜덤 정수를 받을 정수 배열
            arr[0] = ((int)(Math.random()*100+1)); // 1~100 사이의 랜덤 정수를 arr[0]에 넣어줌
            for (int i = 1; i<num;i++){
                tmp=((int)(Math.random()*100+1)); //1~100사이의 랜덤 정수를 생성
                for(int j=0;j<i;j++){ //앞 배열과 겹치는 것이 있는지 확인
                    while(true){ //같은 것이 있으면 다시 랜덤 정수 생성후 확인
                        if(arr[j] != tmp) {
                            break;
                        }
                        tmp=((int)(Math.random()*100+1));
                        j=0;
                    }
                }
                arr[i]=tmp; //같은 숫자가 없는 랜덤 정수를 배열에 넣어줌
                System.out.print(arr[i]+ " ");
                if(i%10==0) System.out.println();
            }

        }
}
