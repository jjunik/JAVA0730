import java.util.Random;

    public class Start {
        Random random = new Random();
        int num = random.nextInt((50)+1);
        String down = "Down!";
        String Up = "Up!";
        String judge(int sum) {
            if(num > sum) {
                return down;
            }else if(sum > num){
                return Up;
            }else {
                return " ";
            }
        }
    }

