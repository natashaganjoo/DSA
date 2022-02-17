package oops;

public class ComplexNumber {

	private int real;
	private int img;
	
	public int getReal() {
		return real;
	}
	
	public int getImg() {
		return img;
	}
	
	public void setReal(int real) {
		this.real = real;
	}
	
	public void setImg(int img) {
		this.img = img;
	}
	
	public ComplexNumber(int real, int img) {
		this.real = real;
		this.img = img;
	}
	
	public static ComplexNumber addTwoComplex(ComplexNumber c1, ComplexNumber c2) 
	{	
		int sumOfReal = c1.real + c2.real;
		int sumofImg = c1.img + c2.img;
		ComplexNumber c = new ComplexNumber(sumOfReal,sumofImg);
		c.print();
		return c;
	}
	
	public ComplexNumber add(ComplexNumber c) {
		int real = c.real + this.real;
		int img = c.img + this.img;
		ComplexNumber c3 = new ComplexNumber(real, img);
		c3.print();
		return c3;
	}
	
	// wrong bcz (a + ib)(c + id) = a*c + a*id + ib*c + i2*b2
//	public ComplexNumber multiply(ComplexNumber c) {
//		int real = c.real * this.real;
//		int img = c.img * this.img;
//		ComplexNumber c3 = new ComplexNumber(real, img);
//		c3.print();
//		return c3;
//	}
	
	 public void multiply(ComplexNumber c) 
	    {
	        int p1 = this.real * c.real;
	        int p2 = this.img * c.img;
	        int p3 = this.img * c.real;
	        int p4 = this.real * c.img;
	        this.img = p3 + p4;
	        this.real = p1 - p2;
		}
	    
	public void print() {
		System.out.println(real + " + i" + img);
	}
}
