import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        int maxPower = 0;
        
        for (int i = 1; i<1000000000; i++) {
            double rem = Math.IEEEremainder((double) input, Math.pow(2,i));
            if (rem == 0) {
                maxPower=i;
            } else {
                break;
            }
        }
        
        System.out.println(maxPower);
    }
}