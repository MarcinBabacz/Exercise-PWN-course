package gatunki;

import java.util.ArrayList;
import java.util.Scanner;

public class Gatunki {

	public static void main(String[] args){
		ArrayList<Gatunek> listGatunkow = new ArrayList<>();
		Scanner rl = new Scanner(System.in);	
		String rr = "";
		do{
			System.out.println("Wprowadz nazwe rodzaju gatunku lub ¿eby zakoñczyæ wprowadz \"end\"" );
			rr = rl.nextLine();
			if(!rr.equals("end")){
			System.out.println("Wprowadz nazwe gatunku: " );
			String rn = rl.nextLine();
			System.out.println("Wprowadz liczbê chromosomów:" );
			int rnr = rl.nextInt();
			rl.nextLine();
			Gatunek gat1 = new Gatunek(rr, rn, rnr);
			gat1.addChromosoms();
			listGatunkow.add(gat1);
			}
			else{
				break;
			}
			
		}while(true);
		
		for(int i = 0; i<listGatunkow.size();i++){
			listGatunkow.get(i).printInfo();
			listGatunkow.get(i).printInfoChromo();
		}
	}
}
