
public class Tree { 
	
	private double height; 
	private String typeOfTree; 
	private int age; 
	public double getHeight() {
		return height;
	}
	
	
	
	public Tree() {
		height = 2.2;
		typeOfTree = "Oak"; 
		age = 20;
	}



	public Tree(double height, String typeOfTree, int age) {
		setHeight(height);
		this.typeOfTree = typeOfTree;
		setAge(age);
	}

	public void leafFall() {
		System.out.println("Leaf fall of " + typeOfTree);
		age++;
	}; 
	

	public double avgGrowing() {
		return height/age;
	}

	public void setHeight(double height) {
		if(height<=0) {
			this.height = Math.abs(height);
		} else {
			this.height = height;}
		if(height == 0) {
			this.height++;
		}
	}
	
	public String getTypeOfTree() {
		return typeOfTree;
	}
	public void setTypeOfTree(String typeOfTree) {
		this.typeOfTree = typeOfTree;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			this.age = Math.abs(age);
		}else {
		this.age = age;}
		if(age==0) {
			this.age++;
		}
	}


	@Override
	public String toString() {
		return "Tree [height=" + height + ", typeOfTree=" + typeOfTree + ", age=" + age + "]";
	}

	
}
