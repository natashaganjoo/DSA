package oops;

//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


class Test{
    public static void A(){
        System.out.print("Good ");
        throw new RuntimeException();
    }
    public static void B(){
         A();
         System.out.print("This ");
    }
    public static void main(String[] args){
        try{
           B();
        }
        catch(Exception e){
           System.out.print("Time ");
        }
        finally{
           System.out.print("at CodingNinjas");
        }
    }
}