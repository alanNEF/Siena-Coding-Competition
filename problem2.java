import java.util.Scanner;

public class problem2 {
    static int getDigit(int number, int index) {
        String temp = "" + number;
        temp = temp.substring(index, index+1);
        return Integer.valueOf(temp);
    }
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double z = kb.nextInt();
        double diff = 9999999;
        // System.out.println((int) Math.sqrt(num));
        int result[] = {0,0,0,0,0,0};
        
        for (int i = 100; i <= 999; i++) {
            for (int w = 10; w <= 99; w++) {
                for (int x = 1; x <= 9; x++) {
                    double radicalSum = Math.sqrt((double) i) - Math.sqrt((double) w) - Math.sqrt((double) x);
                    double currentDiff = Math.abs(z - radicalSum);
                    if (currentDiff < diff) {
                        diff = currentDiff;
                        System.out.println(x);
                        result[0] = getDigit(i,0);
                        result[1] = getDigit(i,1);
                        result[2] =getDigit(i,2);
                        result[3] = getDigit(w,0);
                        result[4] = getDigit(w,1);
                        result[5] = x;
                    }
                }
            }
        }
        
        for (int i = 0; i<6 ; i++) {
            System.out.println(result[i]);
        }
        
        }
    }