/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Miguel Mendez Nevarez A01411490
package spp.mmendezn.a06.p2;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class SPPMMendezNA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               for (int counter = 0; counter <= 10; counter++){
                   System.out.println("inroduce numero");
Scanner kb = new Scanner(System.in);
counter = kb.nextInt();
            System.out.printf("%d el facotorial es = %d\n", counter,

            factorial(counter));

        }

    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
    
}
