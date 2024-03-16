public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        
        char c ='A';
             for(int i=0;i<n;i++)
        {
             for(int j=0;j<=i;j++){
                
            System.out.print(c+" ");
        }
        c +=1;
      System.out.println();  
    }
    }
}

n =3
A 
B B 
C C C 
