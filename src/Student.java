
public class Student {
	private String password;
	private String name;
	public int grade;
	char behaviorGrade;

	public Student (String myName, String myPassword, int myGrade, char myBehaviorGrade){
		name = myName;
		password = myPassword;
		grade = myGrade;
		behaviorGrade = myBehaviorGrade;
	}
	
	public String getName(){
		return name;
	}
	
	public void signIn(String passwordEntered){
		if(checkPassword(password)){
			System.out.println("logged in");
		}
	}
	
	private boolean checkPassword(String passwordEntered){
		return(password==passwordEntered);
	}
	
	public String getPassword(){
		return password;
	}
	
	public boolean isPassingClass(){
		return grade>70;
	}
}
