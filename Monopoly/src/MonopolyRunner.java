import java.util.Scanner;
import java.util.ArrayList;

public class MonopolyRunner 
{

	static int playerOnePosition = 1;
	static int playerTwoPosition = 1;
	static int playerOneMoney = 1500;
	static int playerTwoMoney = 1500;
	static String playerOneName;
	static String playerTwoName;
	static boolean endGame = false;
	static int diceRoll;
	
	public static void main(String[] args) 
	{
	Board.fillBoard();
	playerNames();	
	gameplay();
	}
	
	private static int rollDice()
	{
	int banana = (((int)(Math.random()*6))+1);
	int orange = (((int)(Math.random()*6))+1);
	return (banana+orange);
	}
	
	private static void playerNames()
	{
	System.out.println("Hello and welcome to Monopoly.");	
	System.out.println("This is a 2 player game.");	
	sleep();
	System.out.println("What is the name of Player 1?");
	Scanner userInput1 = new Scanner(System.in);
	playerOneName = userInput1.nextLine();
	System.out.println("What is the name of Player 2?");
	Scanner userInput2 = new Scanner(System.in);
	playerTwoName = userInput2.nextLine();
	System.out.println("Hello " + playerOneName + " and " + playerTwoName + ".");
	System.out.println("Press ENTER to begin.");
	Scanner userInput3 = new Scanner(System.in);
	String DeezNuts = userInput3.nextLine();
	}
	
	public static void gameplay()
	{
	while(endGame == false)
		{
		playerOneTurn();
		playerTwoTurn();
		}
	}
	
	public static void sleep()
	{
	try 
		{
		Thread.sleep(1000);
		} 
	catch (InterruptedException e) 
		{
		e.printStackTrace();
		}	
	}
	
	public static void playerOneTurn()
	{
	System.out.println("It is " + playerOneName + "'s turn.");	
	System.out.println("Press ENTER to roll the dice.");
	Scanner userInput1 = new Scanner(System.in);
	String sushi = userInput1.nextLine();
	diceRoll = rollDice();
	System.out.println("You rolled a " + diceRoll + ".");
	if(playerOnePosition + diceRoll <= 40)
		{
		playerOnePosition += diceRoll;
		}
	else
		{
		playerOnePosition = (playerOnePosition + diceRoll) - 40;
		}
	System.out.println("You have landed on " + Board.space.get(playerOnePosition-1).getSpaceName() + ".");
	if(Board.space.get(playerOnePosition-1).isSpaceOwned() == false)
		{
		if(Board.space.get(playerOnePosition-1).getSpaceType().equals("property"))
			{
			System.out.println("Would you like to buy " + Board.space.get(playerOnePosition-1).getSpaceName() + " for $" + Board.space.get(playerOnePosition-1).getSpaceCost() + "? You have $" + playerOneMoney + ".");	
			}
		else if(Board.space.get(playerOnePosition-1).getSpaceType().equals("railroad"))
			{
			System.out.println("Would you like to buy " + Board.space.get(playerOnePosition-1).getSpaceName() + " for $" + Board.space.get(playerOnePosition-1).getSpaceCost() + "? You have $" + playerOneMoney + ".");
			}
		else if(Board.space.get(playerOnePosition-1).getSpaceType().equals("utility"))
			{
			System.out.println("Would you like to buy " + Board.space.get(playerOnePosition-1).getSpaceName() + " for $" + Board.space.get(playerOnePosition-1).getSpaceCost() + "? You have $" + playerOneMoney + ".");
			}
		else if(Board.space.get(playerOnePosition-1).getSpaceType().equals("other"))
			{
			
			}
		}
	else
		{
		if(Board.space.get(playerOnePosition-1).getSpaceOwner() == 2)
			{
			if(Board.space.get(playerOnePosition-1).getSpaceType().equals("property"))
				{
				System.out.println("You have payed $" + Board.space.get(playerOnePosition-1).getSpaceRent() + " to " + playerTwoName + ".");
				}
			else if(Board.space.get(playerOnePosition-1).getSpaceType().equals("utility"))
				{
				if(Board.space.get(13).getSpaceOwner() == 2 && Board.space.get(29).getSpaceOwner() == 2)
					{
					System.out.println("You have payed $" + (diceRoll*10) + " to " + playerTwoName + ".");
					playerOneMoney -= diceRoll*10;
					playerTwoMoney += diceRoll*10;
					}
				else
					{
					System.out.println("You have payed $" + (diceRoll*4) + " to " + playerTwoName + ".");
					playerOneMoney -= diceRoll*4;
					playerTwoMoney += diceRoll*4;
					}
				}
			}
		}
	}
	
	public static void playerTwoTurn()
	{
	System.out.println("It is " + playerTwoName + "'s turn.");
	System.out.println("Press ENTER to roll the dice.");
	Scanner userInput1 = new Scanner(System.in);
	String joeMama = userInput1.nextLine();
	diceRoll = rollDice();
	System.out.println("You rolled a " + diceRoll + ".");
	if(playerTwoPosition + diceRoll <= 40)
		{
		playerTwoPosition += diceRoll;
		}
	else
		{
		playerTwoPosition = (playerTwoPosition + diceRoll) - 40;
		}
	System.out.println("You are on space " + playerTwoPosition);
	}
	

}