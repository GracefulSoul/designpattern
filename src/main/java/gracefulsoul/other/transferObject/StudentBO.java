package gracefulsoul.other.transferObject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	// List is working as a database.
	List<StudentVO> students;

	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Robert", 0);
		StudentVO student2 = new StudentVO("John", 1);
		students.add(student1);
		students.add(student2);
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}

	// Retrieve list of student from the database.
	public List<StudentVO> getAllStudents() {
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", updated from database");
	}

}
