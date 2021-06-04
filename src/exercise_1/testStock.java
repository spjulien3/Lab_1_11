package exercise_1;

public class testStock {
    public static void main(String[] args) {
    Stock s1 = new Stock ("ORCL","Oracle Corporation",34.5,34.35);
    System.out.println(s1);

    Stock s2 = new Stock( "MSFT", "Mircosoft", 89.13,90.11);
    System.out.println(s2);

    Stock s3 = new Stock("GOOGL", "Alphabet Inc", 1130.65,1133.88);
    System.out.println(s3);
    }
}
