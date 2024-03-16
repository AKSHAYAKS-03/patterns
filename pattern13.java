public class Solution {
    public static void alphaHill(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Print increasing stars
            char c='A';
            int brk = (2*i+1)/2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(c+" ");
                if(j >=brk){
                   c--;
                }
                else{
                 c++;
                }

            }

            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}


n=9
                A                 
              A B A               
            A B C B A             
          A B C D C B A           
        A B C D E D C B A         
