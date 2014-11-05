package main;

public class Fractal { private int lenght = 0; private int iterations = 0;

public Fractal(int l, int i) {
    this.lenght = l;
    this.iterations =i;
}

public int getLenght() {
    return this.lenght;
}

public int getIterations() {
    return this.iterations;
}

public void setLenght(int l) {
    this.lenght = l;
}

public void setIterations(int i) {
    this.iterations = i;
}

public int computePerimeter() {
    int factor = 4;
    for (int i = 0; i < iterations; i++) {
        factor *= 5;
        this.lenght /= 3;
    }
    return factor * this.lenght;
}

}
