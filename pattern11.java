public class Main
{
	public static void main(String[] args) {
	    int n =4;

        for(int i=0;i<n;i++)
        {
             for(char c ='A' ; c<= 'A' + (n-i-1) ;c++){
                
            System.out.print(c+" ");
        }
      System.out.println();  
    }
    
}
}

A B C D 
A B C 
A B 
A 

