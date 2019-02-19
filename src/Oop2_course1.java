import java.util.Scanner;

public class Oop2_course1 {

	public static void main(String[] args) {
		java.util.ArrayList<String> courses = new java.util.ArrayList<String>();
        java.util.ArrayList<Integer> marks = new java.util.ArrayList<Integer>();
        java.util.ArrayList<String> grades = new java.util.ArrayList<String>();
        
     float sum=0, avg;
     Scanner scan = new Scanner(System.in);
     for (int j = 0; j <= 5; j++) {
    	 int k = j + 1;
		System.out.println("enter your " + k + " course: ");
		String a = scan.next();
		courses.add(a);
	}
	 System.out.println("Enter Marks>>>>>>>>>>>>");
     for (int i=0; i <= 5; i++)
     {
    	 System.out.println("Enter " + courses.get(i) + " marks: ");
         int mark = 0;
         mark = scan.nextInt();
         marks.add(mark);
         sum = sum + marks.get(i);
     }
     
     for(int j=0; j <= 5; j++) {
    	 if (marks.get(j) >= 85 && marks.get(j) <= 100) {
    		 grades.add("A");
    	 } else if (marks.get(j) >= 75 && marks.get(j) <= 84) {
    		 grades.add("B");
    	 } else if(marks.get(j) >= 65 && marks.get(j) <= 74) {
    		 grades.add("C");
    	 } else if (marks.get(j) >= 55 && marks.get(j) <= 64) {
    		 grades.add("D");
    	 } else if (marks.get(j) >= 45 && marks.get(j) <= 54) {
    		 grades.add("E");
    	 } else if (marks.get(j) >= 35 && marks.get(j) <= 44) {
    		 grades.add("F");
    	 } else if (marks.get(j) <= 34) {
    		 grades.add("U");
    	 }
     }
     
     System.out.println("********");
     for (int m = 0; m <= 5; m++) {
    	System.out.println("Course: " + courses.get(m) + " marks: " + marks.get(m) + " Grades: " + grades.get(m));
     }
     
     avg = sum/6;
     System.out.println("your average grade is: " +avg);

	}

}
