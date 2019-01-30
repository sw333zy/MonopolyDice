public class MonopolyDice {
    public static void main(String[] args) {

        int die1 = 0;
        int die2 = 0;

        int count = 0;
        int sum = 0;

        do {
            die1 = (int) (Math.random() * 6 + 1);
            die2 = (int) (Math.random() * 6 + 1);
            sum = die1 + die2;

            if (die1 == die2) {
//                sum = die1 + die2;
                System.out.println("Doubles! Move " + sum + " spaces and roll again!");
                count++;

                if (count == 2) {
                    System.out.println("You rolled DOUBLES AGAIN! Go to jail --->");
                    System.exit(0);
                }
            }

            else if (die1 != die2) {
                sum = die1 + die2;
                System.out.println("You rolled a " + die1 + " and " + die2 + ". Move " + sum + " spaces and stop.");
            }

        } while(count <= 2);
    }
}
