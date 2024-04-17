package Pattern;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        //1        1
        //12      21
        //123    321
        //1234  4321
        //1234554321
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            for(int j = i+1; j<2*rows-1-i; j++){
                System.out.print(" ");
            }
            for(int j=2*rows-1-i;j<2*rows;j++){
                System.out.print(2*rows - j);
            }
            System.out.print("\n");
        }
        input.close();
    }
}
