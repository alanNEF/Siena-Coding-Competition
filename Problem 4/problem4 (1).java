import java.util.Scanner;
import java.util.ArrayList;
public class problem4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int limit = kb.nextInt();
        int repeat = 1;
        int itterations = 0;
        
        ArrayList<Integer>seq = new ArrayList<Integer>();
        
        for (int i = 1; i<=limit; i++) {
            if(i%2==0){
                repeat++;
            }
            
            for(int j = 0; j <repeat; j++){
                seq.add(i);
                itterations++;
            }
            if(itterations >= limit){
                break;
            }
        }
        
        System.out.println(seq.get(limit-1));
    }
}