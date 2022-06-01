package ma.fsbm.Enumiration;

public enum LotType {
	  R2("R+2"),
	  R3("R+3"),
	  R4("R+4"),
	  VILLA("VILLA");
     private String value;
	 LotType(String value) {
		this.value=value;
	 }
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value;
	}
	
}
