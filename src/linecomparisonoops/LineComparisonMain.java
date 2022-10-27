package linecomparisonoops;

public class LineComparisonMain {
    public static void main(String[] args) {
        LineComparisonComputation lc = new LineComparisonComputation();
        lc.setFirstX1(4);
        lc.setFirstX2(5.0);
        lc.setFirstY1(6);
        lc.setFirstY2(7);
        lc.setSecondX1(9);
        lc.setSecondX2(8);
        lc.setSecondY2(10);
        System.out.println("Line Comparison :" + lc.toString());
        double firstLineLength = Math.sqrt((lc.getFirstX2() - lc.getFirstX1()) * 2 + (lc.getFirstY2() - lc.getFirstY1()) * 2);
        System.out.println("First Line Length : " + firstLineLength);
        double secondLineLength = Math.sqrt((lc.getSecondX2() - lc.getSecondX1()) * 2 + (lc.getSecondY2() - lc.getSecondY1()) * 2);
        System.out.println("Second Line Length : " + secondLineLength);
        if (firstLineLength == secondLineLength) {
            System.out.println("Both Lines are Equal");
        } else {
            System.out.println("Not Equal");
        }
        if (firstLineLength > secondLineLength) {
            System.out.println("FirstLine is Larger than Second Line");
        } else {
            System.out.println("Second Line is Larger than First Line");
        }
        if(firstLineLength == secondLineLength) {
            System.out.println("Lines are Equal" + firstLineLength +" "+secondLineLength);
        }else {
            System.out.println("Lines are not Equal " + firstLineLength +" "+secondLineLength);
        }

    }
}
