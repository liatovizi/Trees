
public class MagicTree extends Tree{
	
	private double magic;
	private double evilness; //1-5
	private String skill; 
	
	private static int magicTrees;
	
	

	public MagicTree(double height, int age,  double magic, double evilness, String skill) {
		super(height, "MagicTree", age);
		this.magic = magic;
		setEvilness(evilness);
		this.skill = skill;
	}

	public void learn(int num) {
		magic = magic * 1* num/100.0;
	}
	
	public void badWay() {
		setEvilness(evilness+2);
		if(evilness >= 5) {
			magic = magic *2;
		} else {
			magic = magic/2;
		}
	}
	
	public static boolean battle(MagicTree[] team1,MagicTree[]team2 ) {
		if(team1.length >= team2.length*3) {
			return true;
		} else if (team2.length >= team1.length * 3) {
			return false;
			}
		double magicTotal1 = 0;
		double magicTotal2 = 0;
		
		for(int i = 0; i<team1.length;i++) {
			magicTotal1 += team1[i].magic;
		}
		
		for(int i = 0; i< team2.length; i++) {
			magicTotal2 += team2[i].magic;
		}
		
		if(magicTotal1>magicTotal2*2) {
			return true;
		} else if (magicTotal2 > magicTotal1 * 2) {
			return false;
		}
		
		double heightRoot1 = 0;
		double heightRoot2 = 0;
		
		for(int i = 0;i<team1.length;i++) {
			heightRoot1 += Math.sqrt(team1[i].getHeight());
		}
		
		for(int i = 0;i<team2.length;i++) {
			heightRoot2 += Math.sqrt(team2[i].getHeight());
		}
		
		if(heightRoot1 > heightRoot2) {
			return true;
		} else if(heightRoot2 > heightRoot1){
			return false;
		} 
		
		System.err.println("TIE - Team one was the lucky one");
		return true;
	}
	
	public double getMagic() {
		return magic;
	}

	public void setMagic(double magic) {
		this.magic = magic;
	}

	public double getEvilness() {
		return evilness;
	}

	public void setEvilness(double evilness) {
		if(evilness < 1) {
			this.evilness = 1;
		} else if(evilness > 5) {
			this.evilness = 5;
		} else {
			this.evilness = evilness;
		}
	}
		
	

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public static int getMagicTrees() {
		return magicTrees;
	}

	@Override
	public String toString() {
		return "MagicTree [magic=" + magic + ", evilness=" + evilness + ", skill=" + skill + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
