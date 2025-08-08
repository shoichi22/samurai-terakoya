package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		String myChoice = "-";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			myChoice = scanner.nextLine();
		} while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p"));
		
		scanner.close();
		
		return myChoice;
	}
	
	public String getRandom() {
		int randomChoice= (int) Math.floor(Math.random()*3);
		if (randomChoice ==0) {
			return "r";
		} else if (randomChoice==1) {
			return "s";
		} else if (randomChoice==2) {
			return "p";
		} else {
			return "-";
		}
	}
	
	public void playGame() {
		HashMap<String,String> handMap= new HashMap<String,String>();
		handMap.put("r","グー");
		handMap.put("s","チョキ");
		handMap.put("p", "パー");
		
		String myChoice=getMyChoice();
		String randomChoice=getRandom();
		if ( (myChoice.equals("r") && randomChoice.equals("r")) || (myChoice.equals("s") && randomChoice.equals("s")) || (myChoice.equals("p") && randomChoice.equals("p")) ) {
			System.out.println("自分の手は"+handMap.get(myChoice)+"、対戦相手の手は"+handMap.get(randomChoice)+"なのであいこです");
		} else if ( (myChoice.equals("r") && randomChoice.equals("s")) || (myChoice.equals("s") && randomChoice.equals("p")) || (myChoice.equals("p") && randomChoice.equals("r")) ) {
			System.out.println("自分の手は"+handMap.get(myChoice)+"、対戦相手の手は"+handMap.get(randomChoice)+"なので自分の勝ちです");
		} else if ( (myChoice.equals("r") && randomChoice.equals("p")) || (myChoice.equals("s") && randomChoice.equals("r")) || (myChoice.equals("p") && randomChoice.equals("s")) ) {
			System.out.println("自分の手は"+handMap.get(myChoice)+"、対戦相手の手は"+handMap.get(randomChoice)+"なので自分の負けです");
		}
	}
	
}
