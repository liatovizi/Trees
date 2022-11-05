
public class XmasTree extends Tree{
	
	private int beauty; //1-10
	private boolean permanent; 
	
	
	
	public XmasTree(double height,  int age, int beauty, boolean permanent) {
		super(height,"Xmastree", age);
		setBeauty(beauty);
		this.permanent = permanent;
	}
	

	public void throwAway() {
		System.out.println(" the tree was thrown out");
		leafFall();
		beauty = 1;
	}
	

	public void lapseOfTime(int num) {
		if(permanent) {
			setBeauty(beauty-num); 
		}else {
			setBeauty(beauty - 2* num);
		}
		
		if(beauty < 4) {
			throwAway();
		}
	}
	
	
	public double valueofTree() {
		double e = getHeight()*beauty*beauty;
		if(!permanent) {
			e/=3;
		}
		return e;
	}
	

	public void decorate() {
		System.out.println("The tree is ready");
		setBeauty(beauty+3);
	}
	

	public static XmasTree bestTree(XmasTree[] xmastrees) {
		double best = 0;
		XmasTree bestXTree=null;
		for(int i = 0; i<xmastrees.length; i++) {
			double currentValue=xmastrees[i].valueofTree();
			if(currentValue>best) {
				best = currentValue;
				bestXTree = xmastrees[i];
			}
		}
		
		return bestXTree;
	}
	
	@Override
	public void setHeight(double height) {
		if(Math.abs(height) > 3 ) {
			super.setHeight(3);
		}else {
			super.setHeight(height);
		}
	}

	public void setBeauty(int beauty) {
		if(beauty<1) {
			this.beauty = 1;
		}else if (beauty > 10) {
			this.beauty = 10;
		} else {
		this.beauty = beauty;}
	}
	


	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	@Override
	public String toString() {
		return "XmasTree [beauty= " + beauty + " " +
				(permanent?"permanent":"not permanent")
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
