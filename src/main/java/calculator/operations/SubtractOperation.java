package calculator.operations;

public final class SubtractOperation {
    private double a;
    private double b;

    public double getSubtractionResult(){
        return this.a - this.b;
    }

    public SubtractOperation(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
