import com.niit.student.dao.StudentDAO;
import com.niit.student.daoimpl.StudentDAOImpl;
import com.niit.student.entity.Student;

public class StudentDAODemo {
	public static void main(String ...strings){
		//Displaying all the students
		System.out.println("Displaying all students");
		StudentDAO studentDAO = StudentDAOImpl.getStudentDAO();
		displayAllStudents(studentDAO);	
		
		//Adding
		System.out.println("After Adding");
		Student student = new Student(6, "Test", "Kurla", 5, 106);
		studentDAO.add(student);
		displayAllStudents(studentDAO);
		
		//Updating
		System.out.println("After Updating");
		student = studentDAO.getId(4);
		studentDAO.update(student);
		student.setName("Sailee");
		displayAllStudents(studentDAO);
		
		//Deleting
		System.out.println("After Deleting");
		student = studentDAO.getId(5);
		studentDAO.delete(student);
		displayAllStudents(studentDAO);
	}

	private static void displayAllStudents(StudentDAO studentDAO) {
		for (Student student : studentDAO.studentList()) {
			System.out.println(student);
		}
		
	}
	
}
