 
public class ClientAssociate extends Client {
	private String associateNum;
	
	public ClientAssociate(String name, String cpf, int age, char gender, String associateNum) {
		super(name, cpf, age, gender);
		this.associateNum = associateNum;
	}

	public String getAssociateNum() {
		return associateNum;
	}

	public void setAssociateNum(String associateNum) {
		this.associateNum = associateNum;
	}

	@Override
	public String toString() {
		return "ClientAssociate [associateNum=" + associateNum + ", toString()=" + super.toString() + "]";
	}
	
	
	 
	
		
		
	

}
