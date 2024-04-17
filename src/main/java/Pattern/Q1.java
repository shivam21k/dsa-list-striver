package Pattern;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("* ");
            }
            System.out.print('\n');
        }
        input.close();
    }
}
