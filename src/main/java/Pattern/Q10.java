package Pattern;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for(int i =0 ;i<rows; i++){
            for (int j=0; j<=i; j++){
                System.out.print((j+i)%2);
            }
            System.out.print("\n");
        }
        input.close();
    }
}
