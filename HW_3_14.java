import java.util.Scanner;
public class HW_3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int [] score = {95, 88, 76, 62, 55};
        while(true) {
            System.out.print("과목이름>>");
            String name = scanner.next();
            if(name.equals("그만")){
                break;
            }
            for(int i=0;i<course.length+1;i++){
                if(i==5) {
                    System.out.println("없는과목입니다!");
                    break;
                }
                if(course[i].equals(name)){
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    break;
                }

            }
        }

    }
}
