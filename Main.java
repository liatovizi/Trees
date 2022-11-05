import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Tree
		Tree t1 = new Tree();
		Tree t2 = new Tree(1.2, "Beech", 7);
		System.out.println(t1);
		System.out.println(t2);
		
		t1.leafFall();
		t2.leafFall();
		System.out.println(t1);
		System.out.println(t2);
		
		//XmasTree
		XmasTree[] xmasstrees = new XmasTree[3];
		xmasstrees[0]= new XmasTree(6.78, 8, 5, true);
		xmasstrees[1]= new XmasTree(-5.2, 3, 17, false);
		xmasstrees[2] = new XmasTree(1.95, 7, 7, true);
		
		System.out.println(Arrays.toString(xmasstrees));
		
		xmasstrees[2].decorate();
		xmasstrees[2].lapseOfTime(2);
		
		System.out.println(xmasstrees[2]);
		
		System.out.println(XmasTree.bestTree(xmasstrees));
	
		//MagicTree
		MagicTree [] team1 = new MagicTree[3];
		MagicTree [] team2 = new MagicTree[5];
		
		//random
		Random random = new Random();
		
		for(int i = 0; i<team1.length;i++) {
			team1[i] = new MagicTree(random.nextDouble()*3, random.nextInt(12)+1,random.nextDouble()*5,
					random.nextDouble()*4+1, "attack");		
		}
		
		for(int i = 0; i<team2.length;i++) {
			team2[i] = new MagicTree(random.nextDouble()*4, random.nextInt(20)+5,random.nextDouble()*4,
					random.nextDouble()*3+1, "healing");		
		}
		
	
		team1[random.nextInt(team1.length)].learn(50);
		team1[random.nextInt(team1.length)].badWay();
		team2[random.nextInt(team2.length)].badWay();
		
		
		if(MagicTree.battle(team1, team2)) {
			System.out.println(Arrays.toString(team1));
		} else {
			System.out.println(Arrays.toString(team2));
		}
		 
		
	}

}
