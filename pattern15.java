
public class Main
{
	public static void main(String[] args) {

        // Write your code here
        int n=4;
        int sp=0;
        for(int i=0;i<n*2;i++){

            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
             for(int j=0;j<sp;j++){
                System.out.print("  ");
            }
             for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
            sp+=2;
        }
    }
    
}

n=4

* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 
