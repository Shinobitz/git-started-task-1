
public class Example {
	//attributes
	private int rollNum;
	
	//constructor
	Example(){
		rollNum = 100;
	}
	
	Example(int rollNum1){
		this();//calling the constructor. So, going back to the line 7 and get the value of 100;
		rollNum = rollNum + rollNum1;
	}
	//methods
	public int getRollNum() {
		return rollNum;
	}
	
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public static void main(String[] args) {
		Example object = new Example(12);
		System.out.println(object.getRollNum());
	}

}
