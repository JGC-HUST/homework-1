package com.littlejava;

public class QuadPolynomial {
    int a;
    int b;
    int c;

    int result(int x) {
        return a * x * x + b * x + c;
    }
}
