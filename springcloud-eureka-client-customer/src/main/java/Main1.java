import org.spring.DBManage.oracleManage;


public class Main1 {

	public static void main(String[] args){
		
		 
		System.out.println("...........11");
	    	oracleManage om = new oracleManage();
			System.out.println("...........");
	    	om.getConnection();
	    	om.ReleaseResource();
	 
//		new A2();
//		
//		char[] ch ={'1','2'};
//		a(ch);
//		System.out.print(ch);
	    	
	    	System.exit(0);
	}
	
	private static  void a(char[] ch){
		ch[0]= 'p';
	}
	
	private static class A{
		A(){
			System.out.print("A");
		}
	}
	
	private static class A1 extends A{
		A1() {this("A1");}
		
		A1(String s){
			System.out.print(s);
		}
	}
	
	private static class A2 extends A1{
		A2(){
			super("A2");
			new A1();
		}
	}
}
