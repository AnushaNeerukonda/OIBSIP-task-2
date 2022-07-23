import java.util.*;
public class Number_Guessing_Game
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x, num=0, chances=5, score,guess=0,t_score=0;
		char ch,s;
		while(true)
		{
		    System.out.println("\n\t\t*****Welcome To Number Guessing Game*****\n");
		    System.out.println("Description:\n1. There are 5 rounds.");
		    System.out.println("2. In each round you have to guess a number.");
		    System.out.println("3. You are given 5 chances for each round.\n   Lesser the guesses more the points you gain.");
		    System.out.println("4. Once all the chances are exhausted you loose.\n   You can start the game from the first round.");
		    System.out.println("5. To exit from the rounds enter 0 to return to the home page.");
		    System.out.println("\n\t\tAll the best\n");
		    System.out.print("Do you want to start the game? y/n: ");
		    s=sc.next().charAt(0);
		    if(s== 'n' || s=='N')
		    break;
		    t_score=0;
		    for(int i=0;i<5;i++)
		    {
		    	score=100;
		    	guess=0;
		        chances = 5;
		        System.out.println("\n\n\n\t\t=====Round "+(i+1)+"=====");
		        double d=Math.random();
		        x=(int)(d*100+1);
		        System.out.println("\nA number is choosen between 1 to 100."+"\n");
		        for(int j=0;j<5 && chances!=0;j++)
		        {
		            
		            System.out.print("Enter Number Between 1 to 100: ");
		            guess++;
			        num=sc.nextInt();

			        if(num==0)
			        {
			        	break;
			        }
		            else if(num == x )
		            {
		            	System.out.print("\nCorrect Answer! you have guessed the answer in "+(guess));
		                if((guess)==1)
		                	System.out.println(" guess");
		                else if((guess)>1)
		                	System.out.println(" guesses");
		                System.out.println("You have gained +"+score+" points.");
		                t_score=t_score+score;
		                
		                break;
		            }
		            else if(num < x)
		            {
		                if(chances==1)
				        {
		                	System.out.println("Your number is lesser than the actual one.");
					        --chances;
					        score = score-10;
					        
				        }
				        else
				        {
					        System.out.println("\nYour number is lesser than the actual one.");
					        System.out.println((--chances)+" chances left... "+"\nTry Again.\n");
					        score=score-10;
					        
				        }
		            }
		            else if(num > x)
		            {
				        if(chances==1)
				        {
		                	System.out.println("\nYour number is greater than the actual one.");
					        --chances;
					        score=score-10;
				        }
				        else
				        {
					        System.out.println("\nYour number is greater than the actual one.");
					        System.out.println((--chances)+" chances left... "+"\nTry Again.\n");
					        score=score-10;
				        }
		            }
			
		        }
		        
		        if(chances == 0)
		        {
		            System.out.println("\nNo chances left!");
		            System.out.println("Your Total Score: "+t_score+"/500\n\nBetter Luck Next Time.\n");
		            break;
		        }
		        
		        
		        if(num == 0)
		        break;
		        if(i==4)
		        {
		            System.out.println("Greate! You have guessed all the numbers correctly.\nTotal Score: "+t_score+"/500\n");
		        }
		    }
		    if(num == 0)
		    {
		    	System.out.println("Returning to Home...");
		    	continue;
		    }
		    
		    
		    System.out.print("\nDo you want to continue? y/n:");
		    ch=sc.next().charAt(0);
		    if(ch== 'n' || ch=='N')
		    {
		        System.out.print("\nDo you want to quit? y/n: ");
		        char f=sc.next().charAt(0);
		        if(f== 'y' || f=='y')
		        break;
		        else
		        continue;
		    }
		    
		}
		System.out.println("\n\t\t*****Thank you*****");
		sc.close();
	}
}