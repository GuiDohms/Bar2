   
public class Client {
	private String name, cpf;
	private int age;
	private char gender;
	
	public Client(String name, String cpf, int age, char gender){
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString(){
		return("Client info: "+ '\n' +
				"Name: " + name + '\n' +
				"CPF: " + cpf + '\n' +
				"Age: " + age + '\n' +
				"Gender: " + gender);
	}
}
 