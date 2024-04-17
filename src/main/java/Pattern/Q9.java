package Pattern;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cols = input.nextInt();
        int rows = cols;
        for(int i =0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        rows = cols-1;
        for(int i=0; i<rows; i++){
            for(int j = 0; j<rows-i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //mothod two
        for(int i=0; i<2*cols-1; i++){
            int stars = i+1;
            if(i >= cols){
                stars = 2*cols -1- i;
            }
            for(int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        input.close();
    }
}
