package assignment1.entityclassassignment1;
import java.util.Scanner;

	
	class Student {
	    String name;
	    int age;
	    String grade;

	  
	    Student(String name, int age, String grade) {
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	    }

	 
	    void display() {
	        System.out.println("Name : " + name);
	        System.out.println("Age  : " + age);
	        System.out.println("Grade: " + grade);
	        System.out.println("----------------------");
	    }
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Student[] students = new Student[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter details for Student " + (i + 1) + ":");

	            System.out.print("Name: ");
	            String name = sc.nextLine();

	            System.out.print("Age: ");
	            int age = sc.nextInt();
	            sc.nextLine(); // consume leftover newline

	            System.out.print("Grade: ");
	            String grade = sc.nextLine();

	            students[i] = new Student(name, age, grade);
	        }

	        System.out.println("\nStudent Details:");
	        for (Student s : students) {
	            s.display();
	        }

	        sc.close();
	 

}
}
