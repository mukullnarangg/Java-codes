import java.util.Scanner;

class Complex{
    int real;
    int imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        int r = real + c.real;
        int i = imag + c.imag;
        return new Complex(r, i);
    }

    Complex subtract(Complex c) {
        int r = real - c.real;
        int i = imag - c.imag;
        return new Complex(r, i);
    }

    Complex multiply(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.imag + imag * c.real;
        return new Complex(r, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real and imaginary parts of the first complex number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        System.out.println("Sum: " + sum.real + " + " + sum.imag + "i");
        System.out.println("Difference: " + diff.real + " + " + diff.imag + "i");
        System.out.println("Product: " + prod.real + " + " + prod.imag + "i");
    }
}
