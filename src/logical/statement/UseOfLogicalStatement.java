package logical.statement;

public class UseOfLogicalStatement {

	public static void main(String[] args) {

		int num1 = 11;
		
		if((num1 % 2) == 0){
			System.out.println("Number "+num1+" is even : " );
		}else{
			System.out.println("Number "+num1+" is odd");
		}
		if((num1%2)==0 || num1>5){
			System.out.println(" give me this number");
		}else{
			System.out.println("don't want this number");
		}

		

	}

}
