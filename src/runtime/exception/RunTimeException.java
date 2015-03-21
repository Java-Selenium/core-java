package runtime.exception;

public class RunTimeException {

	public static void main(String[] args) {
		int number = 10;
		
		try{
		int result = number / 0;
		System.out.println(result);
		}catch(Exception ex){
			System.out.println(" you can't divide any number by zero. go lean math ");
		}

	}

}
