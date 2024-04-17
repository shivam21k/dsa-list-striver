package Pattern;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args){
        //    A
        //   ABA
        //  ABCBA
        // ABCDCBA
        //ABCDEDCBA

        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<rows-1-i; j++){
                System.out.print(" ");
            }
            for(int j = rows-1-i; j<=rows-1; j++){
                System.out.print(Character.toChars('A'+ (j - (rows-1-i))));
            }
            for(int j = rows; j<=rows-1+i; j++) {
                System.out.print(Character.toChars('A' + (rows -1 + i - j)));
            }
            System.out.print("\n");
        }
        input.close();
    }
}
