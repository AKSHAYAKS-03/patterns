public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            char c = (char)('A' + n - 1);

             for(int j =0;j<=i;j++){
                
            System.out.print(c+" ");
              c-=1;
        }
      
      System.out.println();  
    }
    }
}

n=9
I 
I H 
I H G 
I H G F 
I H G F E 
