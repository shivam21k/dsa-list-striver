package Pattern;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0;j<rows-i; j++){
                System.out.print(Character.toChars('A'+j));
            }
            System.out.print("\n");
        }
        input.close();
    }
}
