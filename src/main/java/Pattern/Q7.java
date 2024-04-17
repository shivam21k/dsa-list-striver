package Pattern;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        //* * * * * * * * *
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j=0; j< 2*rows-1; j++){
                if( (j < i) || (j >= 2*rows-1-i)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print('\n');
        }

        //method two
        for(int i=0; i<rows;i++){
            for(int j=0; j< i;j++){
                System.out.print("  ");
            }
            for(int j = i ; j < 2*rows -1 - i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        input.close();
    }
}
