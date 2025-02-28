/*
 * Create an Mini Application of EVM Machine Using simple if and if elseif Ladder Statements
 */

import java.util.Scanner;

class Evm
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int bjp = 0, cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;

		System.out.println();
		System.out.println("--------------> WELCOME <--------------");
		System.out.println();
		System.out.print("Enter the Population : ");
		int pop = sc.nextInt();

		for (int i = 1;i<=pop ;i++)
		{
			System.out.println();
			System.out.println("------------- LIST OF PARTIES -------------");
			System.out.println("                 1. BJP");
			System.out.println("                 2. CONGRESS");
			System.out.println("                 3. SHIV SENA");
			System.out.println("                 4. AAP");
			System.out.println("                 5. MNS");
			System.out.println("                 6. NOTA");
			System.out.println("-------------------------------------------");
			System.out.println();
			System.out.print("Enter the Option : ");
			int opt = sc.nextInt();

			if(opt>=1 && opt<=6){
				if(opt==1){
					++bjp;
					System.out.println("ACCHE DIN AYENGE!\n THANK YOU!\n");
				}
				if(opt==2){
					++cng;
					System.out.println("BHARAT TODO!\n THANK YOU!\n");
				}
				if(opt==3){
					++ss;
					System.out.println("HUM HAI ASLI SENA!\n THANK YOU!\n");
				}
				if(opt==4){
					++aap;
					System.out.println("MUZE AZAD KARO!\n THANK YOU!\n");
				}
				if(opt==5){
					++mns;
					System.out.println("JAI MAHARASHTRA!\n THANK YOU!\n");
				}
				if(opt==6){
					++nota;
					System.out.println("YOU ARE AN EDUCATED PERSION!\n THANK YOU!\n");
				}

			}
			if(!(opt>=1 && opt<=6)){
				i--;
				System.out.println("INVALID OPTION\n THANK YO1U!\n");
			}
		}

			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
				System.out.println("------------------------------------- BJP HAS WON THE ELECTION "+bjp+" VOTE! -------------------------------------");
			}
			else if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
				System.out.println("------------------------------------- CONGRESS WON THE ELECTION "+cng+" VOTE! -------------------------------------");
			}
			else if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota){
				System.out.println("------------------------------------- SHIV SENA WON THE ELECTION "+ss+" VOTE! -------------------------------------");
			}
			else if(aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota){
				System.out.println("------------------------------------- Aam ADMI PARTY WON THE ELECTION "+" VOTE! -------------------------------------");
			}
			else if(mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota){
				System.out.println("------------------------------------- M.N.S WON THE ELECTION "+" VOTE! -------------------------------------");
			}
			else if(nota>=bjp && nota>=cng && nota>=ss && nota>=aap && nota>=nota){
				System.out.println("------------------------------------- NOTA WON THE ELECTION "+" VOTE -------------------------------------");
			}
	
	}
}