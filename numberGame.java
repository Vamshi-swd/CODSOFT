import java.util.Scanner;

class Example {
    int y;
    double randomNumber;
    int maxAttempts=5;
    int attempts;
    int score;

    public void generateNum() {
        randomNumber = Math.floor(Math.random() * 100);  // Generates a random 
        
    }

    public void game() {
        Scanner sc = new Scanner(System.in);
        boolean isCorrect = false;
        attempts=0;
        System.out.println("your current score:"+score);
    

        while (attempts<maxAttempts && !isCorrect) {
            System.out.println("Guess The Number:");
            y = sc.nextInt();
            attempts++;

            if (y == randomNumber) {
                System.out.println("Guess is correct");
                isCorrect = true;
                score++;
                System.out.println(score);
            }
            else if (y > randomNumber + 10) {
                System.out.println("Value is too high, try again");
                
            } 
            else if(y > randomNumber){
                System.out.println("Value is high, try again");
              
                
            }
            else if(y<randomNumber - 10) {
                System.out.println("Value is too low,try again");
              
            }
            else{
                 System.out.println("Value is low,try again");
                 
            }
        }
        if(!isCorrect){
            System.out.println("You have reached the limit.the correct number was:"+randomNumber);

        }
       
        System.out.println("your current score:"+score);
        
    }
    public void newGame(){
        Scanner sc=new Scanner(System.in);
        boolean playAgain=true;

        while(playAgain){
            generateNum();
            game();
            System.out.println("do you want to play again?(yes/no)");
            String response=sc.next();
            playAgain=response.equalsIgnoreCase("yes");
            
        }
        System.out.println("your final score:"+score);
       sc.close();
    }

}

public class numberGame {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.newGame();
    }
}
