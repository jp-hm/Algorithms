#include <stdio.h>

int main() {
    int num, a = 0, b = 1, c;
    printf("Enter a number: ");
    scanf("%d", &num);
    while (a < num) {
        c = a + b;
        a = b;
        b = c;
    }
    if (a == num) {
        printf("The number is in the Fibonacci sequence.\n");
    } else {
        printf("The number is not in the Fibonacci sequence.\n");
    }
    return 0;
}