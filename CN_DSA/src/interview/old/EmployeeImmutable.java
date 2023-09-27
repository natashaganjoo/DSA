package interview.old;

public final class EmployeeImmutable {

	final String pancardNumber;

	public EmployeeImmutable(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeImmutable e = new EmployeeImmutable("ABC123");  
		String s1 = e.getPancardNumber();  
		System.out.println("Pancard Number: " + s1); 
		
		EmployeeImmutable e1 = new EmployeeImmutable("GYGDSUYG");  
		
		System.out.println(e1.getPancardNumber());
	}

}
