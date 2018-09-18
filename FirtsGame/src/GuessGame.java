public class GuessGame {
    Player pl1;
    Player pl2;
    Player pl3;
    public void startgame()
    {
        pl1 = new Player();
        pl2 = new Player();
        pl3 = new Player();
        int numpl1 = 0;
        int numpl2 = 0;
        int numpl3 = 0;
        boolean pl1isRight = false;
        boolean pl2isRight = false;
        boolean pl3isRight = false;
        int targetNumber = (int) (Math.random() *10);
        System.out.println("I'm thinking a number of between 0 and 9 ...");
        while(true)
        {
            System.out.println("Number to guess is " + targetNumber);
            pl1.guess();
            pl2.guess();
            pl3.guess();
            numpl1 = pl1.number;
            System.out.println("Player 1 guessed " + numpl1);
            numpl2 = pl2.number;
            System.out.println("Player 2 guessed " + numpl2);
            numpl3 = pl3.number;
            System.out.println("Player 3 guessed " + numpl3);
            if (numpl1 == targetNumber)
            {
                pl1isRight = true;
            }
            if (numpl2 == targetNumber)
            {
                pl2isRight = true;
            }
            if (numpl3 == targetNumber)
            {
                pl3isRight = true;
            }
            if (pl1isRight || pl2isRight || pl3isRight) {
                System.out.println("We have a winner!");
                if (pl1isRight) {
                    System.out.println("Player 1 is the winner");
                } else if (pl2isRight) {
                    System.out.println("Player 2 is the winner ");
                } else {
                    System.out.println("Player 3 is the winner ");
                }
                System.out.println("Game is over");
                break;
            }
            else {
                System.out.println("Players lose, let's try again.");
            }
        }
    }
}
