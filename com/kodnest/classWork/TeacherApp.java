package classWork;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		t1.name = "Omkar";
		t1.id = 143;
		t1.subject = "Anatomy";
		t2.name = "likith";
		t2.id = 144;
		t2.subject = "Physics";
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
		t2.teach();
		t2.motivate();
		t2.giveAssignment();
//		System.out.println(t1.id);
//		System.out.println(t1.subject);

	}

}
