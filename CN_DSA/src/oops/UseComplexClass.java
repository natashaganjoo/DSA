package oops;
import oops.ComplexNumber;
public class UseComplexClass {

	public static void main(String[] args) {

//		ComplexNumber complex = new ComplexNumber();
		
		// initializing values using setters
//		complex.setReal(1);
//		complex.setImg(2);
//		complex.print();
		
		// using constructors
//		ComplexNumber complex = new ComplexNumber(3,4);
//		System.out.println(complex.getReal());
//		complex.print();
		
		// adding two complex numbers
//		ComplexNumber c1 = new ComplexNumber(2, 4);
//		ComplexNumber c2 = new ComplexNumber(3, 7);
//		// static method
//		ComplexNumber.addTwoComplex(c1, c2);
		
		// add 1st complex number
		ComplexNumber c1 = new ComplexNumber(5, 4);
		ComplexNumber c2 = new ComplexNumber(1, 7);
		
// add c2 to c1 and change c1 only
//		c1 = c1.add(c2);
//		c1.print();
//		c2.print();
		
		c1.multiply(c2);
		c1.print();
		c2.print();
		
		
	}

}
