/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operators;

/**
 *
 * @author Slugs
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        integerTest();
        
    }

    private static void integerTest() {
       int radius = 2;
       double pi = 3.141592653;
       double d;
       int i;
       
       d = pi;
        System.out.println("d = " + d);
        
       d = radius;
        System.out.println("d = " +d);
        
       i = (int) pi;
        System.out.println("i = " +i);
       
    }
    
    
    
}