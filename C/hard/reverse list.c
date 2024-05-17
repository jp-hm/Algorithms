#include <stdio.h>

int main() {
    int n, i;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d numbers: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Reversed list:");
    for (i = n - 1; i >= 0; i--) {
        printf(" %d", arr[i]);
    }
    printf("\n");
    return 0;
}