public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
      int n =5;
       int s=1;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
             s = 1;
            }
            else{
            s = 0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s = 1-s;
            }
         System.out.print("\n");
        }
    }
}



1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
