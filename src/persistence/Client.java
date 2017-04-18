package persistence;
   
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
 