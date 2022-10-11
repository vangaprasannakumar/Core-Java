package own;

public class Patient {
	private String name;
	private int age;
	private String disease;
	private int amount;
	
	 public Patient() {
		
	}

	 public Patient(String name, int age, String disease, int amount) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.amount = amount;
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ",  amount=" + amount + "]";
	}

}