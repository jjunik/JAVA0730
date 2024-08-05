import java.util.Scanner;

public class StartMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Start start = new Start();
        boolean sysOff = false;

        while (sysOff){
            System.out.print("정수 입력 : ");
            int sum = sc.nextInt();
            start.judge(sum);





        }






    }
}

