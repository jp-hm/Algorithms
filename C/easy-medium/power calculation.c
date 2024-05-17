#include <stdio.h>
#include <math.h>

int main() {
    float base, result;
    int exponent;
    printf("Enter base: ");
    scanf("%f", &base);
    printf("Enter exponent: ");
    scanf("%d", &exponent);
    result = pow(base, exponent);
    printf("Result: %.2f\n", result);
    return 0;
}