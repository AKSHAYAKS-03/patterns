#include <stdio.h>

int main() {
    int n = 4; // Number of rows
       for (int i = 0; i < n; i++) {
           for (int j = 0; j <=i; j++) {
            printf("* ");
        }

        printf("\n");
    }
     for (int i = 1; i < n; i++) {
           for (int j = 0; j < n-i ; j++) {
            printf("* ");
        }

        printf("\n");
    }

    
    return 0;
}


* 
* * 
* * * 
* * * * 
* * * 
* * 
* 
