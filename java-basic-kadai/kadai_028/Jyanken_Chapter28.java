package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		String myChoice = "-";
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			myChoice = scanner.nextLine();
			scanner.close();
		} while (!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("r"));
		
		
		return myChoice;
	}
	
	public String getRandom() {
		int randomChoice= (int) Math.ceil(Math.random()*3);
		if (randomChoice ==1) {
			return "r";
		} else if (randomChoice==2) {
			return "s";
		} else if (randomChoice==3) {
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
			System.out.println("あいこです");
		} else if ( (myChoice.equals("r") && randomChoice.equals("s")) || (myChoice.equals("s") && randomChoice.equals("p")) || (myChoice.equals("p") && randomChoice.equals("r")) ) {
			System.out.println("自分の勝ちです");
		} else if ( (myChoice.equals("r") && randomChoice.equals("p")) || (myChoice.equals("s") && randomChoice.equals("r")) || (myChoice.equals("p") && randomChoice.equals("s")) ) {
			System.out.println("自分の負けです");
		}
	}
	
}
