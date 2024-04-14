import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String scenarios[][] = {
            {"A","A","A","A","A","A","B","B","B","B","B","B","C","C","C","C","C","C","D","D","D","D","D","D",},
            {"B","B","C","C","D","D","A","A","C","C","D","D","A","A","B","B","D","D","A","A","B","B","C","C",},
            {"C","D","B","D","B","C","C","D","A","D","A","C","B","D","A","D","A","B","B","C","A","C","A","B",},
            {"D","C","D","B","C","B","D","C","D","A","C","A","D","B","D","A","B","A","C","B","C","A","B","A",}
        };
        
        String input = kb.nextLine();
        String[] splitInput = input.split(" ");
        int[] numInput = new int[24];
        
        for (int i = 0; i < splitInput.length; i++) {
            numInput[i] = Integer.valueOf(splitInput[i]);
        }
        
        int AfirstChoice = 0;
        int BfirstChoice = 0;
        int CfirstChoice = 0;
        int DfirstChoice = 0;
        
        // first pass 
        for (int i = 0; i < 6; i++) {
            AfirstChoice+=numInput[i];
        }
        
        for (int i = 6; i < 12; i++) {
            BfirstChoice+=numInput[i];
        }
        
        for (int i = 12; i < 18; i++) {
            CfirstChoice+=numInput[i];
        }
        
        for (int i = 18; i < 24; i++) {
            DfirstChoice+=numInput[i];
        }
        
        if (AfirstChoice < BfirstChoice && AfirstChoice < CfirstChoice && AfirstChoice < DfirstChoice) {
            AfirstChoice = -1;
        }
        
        if (BfirstChoice < AfirstChoice && BfirstChoice < CfirstChoice && BfirstChoice < DfirstChoice) {
            BfirstChoice = -1;
        }
        
        if (CfirstChoice < AfirstChoice && CfirstChoice < BfirstChoice && CfirstChoice < DfirstChoice) {
            CfirstChoice = -1;
        }
        
        if (DfirstChoice < AfirstChoice && DfirstChoice < CfirstChoice && DfirstChoice < BfirstChoice) {
            DfirstChoice = -1;
        }
        
        String charToErase = "";
        if (AfirstChoice == -1) {charToErase = "A";}
        if (BfirstChoice == -1) {charToErase = "B";}
        if (CfirstChoice == -1) {charToErase = "C";}
        if (DfirstChoice == -1) {charToErase = "D";}
        for (int i = 0; i < 4; i++) {
            for (int w = 0; w < 24; w++) {
                if (scenarios[i][w].equals(charToErase)) {
                    scenarios[i][w] = "Z";
                }
            }
        }
        // first pass complete
        
        AfirstChoice = 0;
        BfirstChoice = 0;
        CfirstChoice = 0;
        DfirstChoice = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int w = 0; w < 24; i++) {
                if (scenarios[i][w] == "Z" && i!=4) {
                    ////
                }
            }
        }
        
        if (AfirstChoice < BfirstChoice && AfirstChoice < CfirstChoice && AfirstChoice < DfirstChoice) {
            AfirstChoice = -1;
        }
        
        if (BfirstChoice < AfirstChoice && BfirstChoice < CfirstChoice && BfirstChoice < DfirstChoice) {
            BfirstChoice = -1;
        }
        
        if (CfirstChoice < AfirstChoice && CfirstChoice < BfirstChoice && CfirstChoice < DfirstChoice) {
            CfirstChoice = -1;
        }
        
        if (DfirstChoice < AfirstChoice && DfirstChoice < CfirstChoice && DfirstChoice < BfirstChoice) {
            DfirstChoice = -1;
        }
    }
}