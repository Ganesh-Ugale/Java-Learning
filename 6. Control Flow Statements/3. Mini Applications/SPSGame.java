import java.util.Scanner;
class SPSGame
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n---------------> PLAY GAME STONE PAPER SEASSOR <---------------\n");
		
		// User Name 
		System.out.print("Enter your name : ");
		String userName = sc.nextLine();

		System.out.println("\n1. STONE");
		System.out.println("2. PAPER");
		System.out.println("3. SEASSOR");
		System.out.print("\nSELECT ONE OPTION : ");
		int userNum = sc.nextInt();

		// User Decision
		String userChoise = null;
		if (userNum == 1){
			userChoise = "STONE";
		}
		else if(userNum == 2){
			userChoise = "PAPER";
		}
		else if(userNum == 3){
			userChoise = "SEASSOR";
		}
		else{
			System.out.println("INVALID OPTION\n");
		}

		// Bot Random Number Selector Code
		int botNum = 0;
		for ( ; ; ) // This is infinite Loop it stops when num meets between 1 and 3 bcz in the if condition the break statement is work then & then loop over.
		{
			int randomNum = (int) (Math.random()*10);
			
			if (randomNum>=1 && randomNum<=3)
			{
				botNum = randomNum;
				break;
			}
		}
		
		// Bot Decision
		String botChoise = null;
		if (botNum == 1){
			botChoise = "STONE";
		}
		else if(botNum == 2){
			botChoise = "PAPER";
		}
		else if(botNum == 3){
			botChoise = "SEASSOR";
		}
		else{
			System.out.println("INVALID OPTION");
		}
		
		System.out.println("\n" + userName + " : " + userChoise + " & " + "BOT : " + botChoise + "\n");
		// Match the Result
		if((userNum == 1 && botNum == 3) || (userNum == 2 && botNum == 1) || (userNum == 3 && botNum == 2)){
			System.out.println(userName + " Wins the Game");
		}
		else if((userNum == 1 && botNum == 2) || (userNum == 2 && botNum == 3) || (userNum == 3 && botNum == 1)){
			System.out.println("BOT Wins the Game");
		}
		else{
			System.out.println("MATCH DRAW");
		}

		System.out.println("\n--------------------------------> Thank You! Play Again <--------------------------------");
	}
}