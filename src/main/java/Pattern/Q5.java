package Pattern;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j=0; j<rows-i; j++){
                System.out.print(j+1);
            }
            System.out.print('\n');
        }
        input.close();
    }
}
