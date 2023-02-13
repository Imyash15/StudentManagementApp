import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App ");
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			System.out.println("PRESS 1 TO ADD Student");
			System.out.println("PRESS 2 TO Delete Student");
			System.out.println("PRESS 3 TO Display Student");
			System.out.println("PRESS 4 TO Exit Student");
			
			int c=Integer.parseInt(br.readLine());
			
			
			if(c==1) {
                 //add Student		
				System.out.println("Enter User Name :");
				String name=br.readLine();
				
				System.out.println("Enter User Phone :");
				String phone=br.readLine();
				
				System.out.println("Enter User City :");
				String city=br.readLine();
				
				//create student object  to store student
				
				Student st= new Student(name,phone,city);
				boolean answer=StudentDao.insertStudentToDb(st);
				if(answer) {
					System.out.println("Student added Successfully.....");
				}else {
					System.out.println("Something went wrong try again.....");
				}
				System.out.println(st);
				
				
			}else if (c==2) {
			   //delete
				System.out.println("Enter Student id to Delete ");
				int userId=Integer.parseInt(br.readLine());
				
				boolean f=StudentDao.deleteStudent(userId);
				if (f) {
					System.out.println("Deleted....");
					
				} else {
					System.out.println("Something went Wrong...");

				}
				
			}else if (c==3) {
                 //display
				StudentDao.showAllStudent();
				
			}else if (c==4) {
				//exit
				break;
			}else {
				
			}
			
			
		}
		System.out.println("Thankyou For Using My App..... ");
		System.out.println("See You Soon.......");

	}

}
