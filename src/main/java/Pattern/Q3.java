package Pattern;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        for(int i = 1; i<rows+1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.print('\n');
        }
        input.close();
    }
}
