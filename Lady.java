
public class Lady {
	String name;
	String colorHair;
	String eyeColor;
	String colorDress;
	double height;
	boolean isFun;
	long phoneNum;
	
	
	public void isFun(){
		isFun = true;
	}	

public Lady(String Name, String cH, String eC, String cD, double Height, long pNum){
	name = Name;
	colorHair = cH;
	eyeColor = eC;
	colorDress = cD;
	height = Height;
	phoneNum = pNum;
}

public void myaDialogue() {
	System.out.println("Hi, I'm Mya!");
	//System.out.println("Here's my number: " + pNum);
}
	
}

