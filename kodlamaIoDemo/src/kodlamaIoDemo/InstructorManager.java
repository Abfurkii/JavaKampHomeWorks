package kodlamaIoDemo;

public class InstructorManager extends UserManager{
	public void giveEducation(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+", "+instructor.getCourseName()+" e�itimini vermeye ba�lad�!");
	}
}
