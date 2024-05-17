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
    int max_num = arr[0];
    for (i = 1; i < n; i++) {
        if (arr[i] > max_num) {
            max_num = arr[i];
        }
    }
    printf("Maximum element: %d\n", max_num);
    return 0;
}