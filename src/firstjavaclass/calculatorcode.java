package firstjavaclass;

public class calculatorcode {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		int num4 =  obj.multiply(4,5);//function call
		int num6 = obj.square(4);
		int num3 = obj.sum(4,5);
		int num5 = obj.subtract(4,5);

System.out.println(num4);
		System.out.println(num6);
		System.out.println(num3);
		System.out.println(num5);
			}
			
			
		}
		class Calculator{
			//method overloading
			
		int	sum(int num1,int num2){
				int num3 = num1 + num2;
				return num3;
		}
				
			int multiply(int num1,int num2) {
				int num4 = num1 * num2;
				return num4;
			
			}
			
			int subtract(int num1,int num2) {
			int num5 = num1-num2;
			return num5;
			}
			int square(int num1){
				int num6 = num1*num1;
				return num6;
				
				
			}

		


	}
