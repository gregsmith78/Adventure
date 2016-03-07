
public class Beer {
	String kind;
	boolean isOpen;
	int percentFull;
	
	public void Open() {
		isOpen = true;
	}
	public void TakeSip() {
		percentFull -=10;
	}
	public String getKind () {
		return kind;
	 }
	public void setKind(String bKind) {
		kind = bKind;
	}
}
