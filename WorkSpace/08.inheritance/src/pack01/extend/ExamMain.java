package pack01.extend;

public class ExamMain {
	public static void main(String[] args) {
		ParentClass pa = new ParentClass();
		System.out.println(pa.parent_field);
		pa.parentMethod();
		
		ChildClass ch = new ChildClass();
		System.out.println(ch.child_field);
		ch.childMethod();
		// 상속 후
		System.out.println("Childe : " +ch.parent_field);
		
		
	}
	
}
