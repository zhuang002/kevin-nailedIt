/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nailedit;

/**
 *
 * @author zhuan
 */
public class NailedIt {

    static int maxLength;
    static int heightCount;
    static int longestPiece;
    static int shortestPiece;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        readIn();
        process();
        System.out.println(maxLength+" "+heightCount);
    }

    private static void process() {
        for (int height=shortestPiece*2;height<=longestPiece*2;height++) {
            int length=getLengthForHeight(height);
            //update maxLength and heightCount by length;
        }
    }

    private static void readIn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the fence length with the height.
     * @param height the height of the fence.
     * @return the fence length;
     */
    private static int getLengthForHeight(int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
