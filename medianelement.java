import java.util*;
int middle(int a, int b, int c) 
{
    // effectively sort the values a, b & c
    // putting smallest in a, median in b, largest in c

    int t;

    if (a > b) {
        // swap a & b
        t = a;
        a = b;
        b = t;
    }

    if (b > c) {
        // swap b & c
        t = b;
        b = c;
        c = t;

        if (a > b) {
            // swap a & b
            t = a;
            a = b;
            b = t;
        }
    }
    return b;
    }
