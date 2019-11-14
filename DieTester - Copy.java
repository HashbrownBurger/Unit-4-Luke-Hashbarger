public class DieTester {
    public static void main(String[] args) {
        System.out.println("Good you're finally awake");

        Die d1 = new Die();
        System.out.println("Die 1 = " + d1.getFace());

        d1.roll();

        System.out.println("Die 1 is " + d1);
    }
}
