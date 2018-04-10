import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class test {
	public static void main(String[] args) {
		new chi();
		new chi();
	}
	
	public static int te(){
		int i = 0;
		try{			
		 return  i;
		}catch(Exception  ex){
			
		}
		finally{
			++i;
			return i++;
		}
	}
	
	public static int te(ArrayList<?> list){
		return 10;
	
	}
	
	public static int te(Collection<?> list){
		return 100;
	
	}
	
	public static class peo{
		public peo(){System.out.print("a");}
		{System.out.print("b");}
		static {System.out.print("c");}
	}
	
	public static class chi extends peo{
		public chi(){System.out.print("d");}
		{System.out.print("e");}
		static {System.out.print("f");}
	}
}
