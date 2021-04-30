package kodlamaIoDemo;

public class StudentManager extends UserManager{
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ��rencisi kay�t oldu!");
	}
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ��rencisi login oldu!");
	}
	public void addCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" ki�isi kursa eklendi!");
	}
	public void removeCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" ki�isinden kurs kald�r�ld�!");
	}
}
