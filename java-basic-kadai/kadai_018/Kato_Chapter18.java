package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName ="加藤";
	public String givenName;
	public String address;
	
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は東京都中野区○×です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
