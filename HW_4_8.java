import java.util.Scanner;
class Phone{
    String name=null;
    String p_number=null;

    Phone(String name, String p_number){
        this.name = name;
        this.p_number= p_number;
    }
}

public class HW_4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");

        int people=scanner.nextInt();
        Phone [] p= new Phone [people];
        for(int i=0;i<people;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name=scanner.next();
            String p_number=scanner.next();
            p[i] = new Phone(name, p_number);
        }
        System.out.println("저장되었습니다....");

        while(true){
            System.out.print("검색할 이름>>");
            String search=scanner.next();
            if(search.equals("그만")) break;
            for(int i = 0;i<=people;i++){
                if(i==people) {
                    System.out.println(search+" 이 없습니다.");
                    break;
                }
                if(p[i].name.equals(search)) {
                    System.out.println(search +"의 번호는"+ p[i].p_number+"입니다.");
                    break;
                }
            }

        }
    }
}