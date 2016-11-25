import com.niit.student.dao.StudentDAO;
import com.niit.student.daoimpl.StudentDAOImpl;
import com.niit.student.entity.Student;

public class StudentDAODemo {
	private static StudentDAO studentDAO = StudentDAOImpl.getStudentDAO();
	public static void main(String ...strings){
		//Displaying all the students
		System.out.println("Displaying all students");
		
		displayAllStudents();	
		
		//Adding
		System.out.println("After Adding");
		Student student = new Student(6, "Test", "Kurla", 5, 106);
		studentDAO.add(student);
		displayAllStudents();
		
		//Updating
		System.out.println("After Updating");
		student = studentDAO.getId(4);
		studentDAO.update(student);
		student.setName("Sailee");
		displayAllStudents();
		
		//Deleting
		System.out.println("After Deleting");
		student = studentDAO.getId(5);
		studentDAO.delete(student);
		displayAllStudents();
		
		//get by address
		System.out.println("Address");
		displayByAddress("Chembur");
	}

	private static void displayByAddress(String address) {
		for (Student student : studentDAO.getByAddress(address)) {
			System.out.println(student);
		}
		
	}

	private static void displayAllStudents() {
		for (Student student : studentDAO.studentList()) {
			System.out.println(student);
		}
		
	}
	
}
