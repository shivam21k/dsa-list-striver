package Pattern;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args){
        //E
        //DE
        //CDE
        //BCDE
        //ABCDE
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=i; j>=0; j--) {
                System.out.print( Character.toChars('A' + rows-1-j));
            }
            System.out.print("\n");
        }
        input.close();
    }
}
