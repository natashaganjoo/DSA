package recursion;

public class Test {

	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
	    print(num);
	}

}
