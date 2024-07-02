#include <stdio.h>

int main() {
    int Number = 457;

    printf("Collatz Conjecture(using while loop) for %d is:\n", Number);

    //We run the loop until the number becomes 1
    while (Number != 1) {
        // Print the present number
        printf("%d---->> ", Number);

        //divide by 2 if the number is even.
        if (Number % 2 == 0) {
            Number = Number / 2;
        } else {
            // Multiply by 3 and add 1 if the number is odd
            Number = 3 * Number + 1;
        }
    }

    // Lastly print 1.
    printf("%d\n", Number);

    return 0;
}