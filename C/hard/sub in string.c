#include <stdio.h>
#include <string.h>

int main() {
    char str[100], sub[100];
    printf("Enter a string: ");
    scanf("%s", str);
    printf("Enter a subsequence: ");
    scanf("%s", sub);
    if (strstr(str, sub) != NULL) {
        printf("The subsequence is present in the string.\n");
    } else {
        printf("The subsequence is not present in the string.\n");
    }
    return 0;
}