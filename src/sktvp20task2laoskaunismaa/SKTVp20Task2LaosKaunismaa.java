/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sktvp20task2laoskaunismaa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SKTVp20Task2LaosKaunismaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число");
        Scanner scanner = new Scanner(System.in);
        int troinoe4islo = scanner.nextInt();
        //System.out.println(troinoe4islo );
        int one = troinoe4islo%10;
        int to = troinoe4islo%100/10;
        int three = troinoe4islo%1000/100;
        
        int summ = one + to + three;
        System.out.println(summ);
        
        
        
    }
    
}
