public final class Dvojcislo {
    public int real;
    public int imaginary;

    public Dvojcislo(int num1, int num2) {
        this.real = num1;
        this.imaginary = num2;
    }

    public Dvojcislo add(Dvojcislo b) {
        Dvojcislo c = new Dvojcislo(this.real + b.real, this.imaginary + b.imaginary);

        return c;
    }

    public Dvojcislo multiply(Dvojcislo b) {
        Dvojcislo c = new Dvojcislo(this.real *b.real - this.imaginary *b.imaginary,(this.real *b.imaginary + this.imaginary *b.real));
        return c;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
