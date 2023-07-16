package classWork;
public class Teacher {
	//DataMembers or Instance Variables
	int id;
	String name;
	String subject;
	
	//Member Functions
	void teach() {
		System.out.println(this.name+" is teaching "+this.subject);
	}
	
	void motivate() {
		System.out.println(this.name+ " is motivationg");
	}
	
	void giveAssignment() {
		System.out.println(this.name+" is giving assignment");
	}
}
