#include <stdio.h>

int main() {
    int n = 4;
    char startChar = 'A';
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j <= i; j++) {
            printf("%c ", startChar + j);
        }
        printf("\n");
        startChar += i +1; // Increment startChar for the next row
    }

    return 0;
}

A 
B C 
D E F 
G H I J 
