import java.util.*;
public class Student1 {
static String clgname;
int id;
String name;

public static void clgInfo() {
	System.out.println(clgname);
}
public void stInfo() {
	System.out.println(id);
	System.out.println(name);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student1 s=new Student1();
	s.clgname=sc.next();
	s.id=sc.nextInt();
	sc.nextLine();
	s.name=sc.nextLine();
	
	s.clgInfo();
	s.stInfo();
}
}
