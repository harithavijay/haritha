package firstjavaclass;

public class firstjavacode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student(); //creating an object of type student
		std1.name="haritha";
		std1.rollno=123;
		System.out.println(std1.name); //------accessing property
		std1.attendsession(); //-----calling the class method 

		Student std2 = new Student();
		std2.name = "vijay";
		System.out.println(std2.name);
			}
		}
		class Student{
			String name;
			int rollno;
			String courseenrolled;
			
			void attendsession(){
				System.out.println ("attend the session");
				
			}
				void leavesession(){
					System.out.println("leave the session");
				}
		}
