public class Solution {
    public static void symmetry(int n) {
    
        int sp = 2 * n - 2;

        // Upper half of the pattern
        for(int i = 1; i <= 2 * n - 1; i++) {
            // Print stars
            int star = i;
            if(i>n){
                star = 2 * n - i;
            }
            for(int j = 1; j <=star; j++) {
                System.out.print("* ");
            }
            
            // Print spaces
            for(int j = 1; j <=sp; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for(int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if(i<n){
                sp-=2;
            }
            else{
            sp+= 2; // Decrease space count for the next row
            }
        }
    
    }
}  


n=3
*     * 
* *   * * 
* * * * * * 
* *   * * 
*     * 
