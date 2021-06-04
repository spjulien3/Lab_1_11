package exercise_3;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(1,3,2);

        System.out.println("The Descriminant is:"+q1.getDiscriminant());

        System.out.print("x = "+q1.getRoot1()+" or ");

        System.out.println(q1.getRoot2());

    }
}
