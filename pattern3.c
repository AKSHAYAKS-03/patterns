#include <stdio.h>

int main() {
    int n = 3; // Number of rows
    for (int i = 0; i < n; i++) {
        // Print spaces
        for (int j = 0; j < i; j++) {
            printf("  ");
        }

        // Print increasing numbers
        for (int j = 0; j < 2*n - (2 * i + 1); j++) {
            printf("* ");
        }

        // Print spaces
        for (int j = 0; j < i ; j++) {
            printf("  ");
        }

        printf("\n");
    }

    return 0;
}

* * * * * 
  * * *   
    * 
