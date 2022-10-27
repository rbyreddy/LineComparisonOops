package linecomparisonoops;

public class LineComparisonComputation {
    private double firstX1;
    private double firstX2;
    private double firstY1;
    private double firstY2;
    private double secondX1;
    private double secondX2;
    private double secondY1;
    private double secondY2;

//    public LineComparisonComputation(double firstX1, double firstX2, double firstY1, double firstY2, double secondX1,
//                                     double secondX2, double secondY1, double secondY2) {
//        this.firstX1 = firstX1;
//        this.firstX2 = firstX2;
//        this.firstY1 = firstY1;
//        this.firstY2 = firstY2;
//        this.secondX1 = secondX1;
//        this.secondX2 = secondX2;
//        this.secondY1 = secondY1;
//        this.secondY2 = secondY2;
//    }

    public double getFirstX1() {
        return firstX1;
    }

    public void setFirstX1(double firstX1) {
        this.firstX1 = firstX1;
    }

    public double getFirstX2() {
        return firstX2;
    }

    public void setFirstX2(double firstX2) {
        this.firstX2 = firstX2;
    }

    public double getFirstY1() {
        return firstY1;
    }

    public void setFirstY1(double firstY1) {
        this.firstY1 = firstY1;
    }

    public double getFirstY2() {
        return firstY2;
    }

    public void setFirstY2(double firstY2) {
        this.firstY2 = firstY2;
    }

    public double getSecondX1() {
        return secondX1;
    }

    public void setSecondX1(double secondX1) {
        this.secondX1 = secondX1;
    }

    public double getSecondX2() {
        return secondX2;
    }

    public void setSecondX2(double secondX2) {
        this.secondX2 = secondX2;
    }

    public double getSecondY1() {
        return secondY1;
    }

    public void setSecondY1(double secondY1) {
        this.secondY1 = secondY1;
    }

    public double getSecondY2() {
        return secondY2;
    }

    public void setSecondY2(double secondY2) {
        this.secondY2 = secondY2;
    }

    @Override
    public String toString() {
        return "LineComparisonComputation{" +
                "firstX1=" + firstX1 +
                ", firstX2=" + firstX2 +
                ", firstY1=" + firstY1 +
                ", firstY2=" + firstY2 +
                ", secondX1=" + secondX1 +
                ", secondX2=" + secondX2 +
                ", secondY1=" + secondY1 +
                ", secondY2=" + secondY2 +
                '}';
    }
}
