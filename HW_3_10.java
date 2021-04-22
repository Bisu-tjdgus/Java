public class HW_3_10 {
    public static void main(String[] args) {
        int [][] arr = new int[4][4];
        for(int i = 0; i<10;) {
            int tmp1 = (int) ((Math.random() * 10) % 4);
            int tmp2 = (int) ((Math.random() * 10) % 4);
            if (arr[tmp1][tmp2] == 0) {
                arr[tmp1][tmp2] = (int) (Math.random() * 10 + 1);
                i++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
