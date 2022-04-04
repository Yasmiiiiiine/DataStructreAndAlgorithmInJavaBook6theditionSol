
package javaapplication25;

/**
 *
 * @author Yasmine
 */
public class GameEntry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array named a 
        int A [] ={0,1,2,3,550};
        //array clone == to array copy 
        int B[]= new int[A.length];
        B=A;
        System.out.println("B value "+B[4]);
        
    }
    
}
