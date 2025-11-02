
package stringpackage;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    String department;
    double cgpa; 
    private static String university="'Ulab";
    
    private static int totalStudent=0;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudent++;
    }
    
    
    public void displayDetails(){
        System.out.println("ID: "+id+" Name: "+name+" Department: "+department+" Cgpa: "+cgpa+" University: "+university);
    }
    public static int getTotalStudent(){
        return totalStudent;
        
    }
    public static void main(String[] args){
       Student s[]=new Student[3];
       Scanner sc=new Scanner(System.in);
    
    
    for(int i=0;i<3;i++){
     System.out.println("Enter details for the students: "+(i+1)+"");
  
     System.out.println("Enter student ID: ");
     int id=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter student Name: ");
     String name=sc.nextLine();
     System.out.println("Enter department: ");
     String department=sc.nextLine();
     System.out.println("Enter CGPA: ");
     double cgpa=sc.nextDouble();
     sc.nextLine();
     
     s[i]=new Student(id,name,department,cgpa);
    }
    for(int i=0;i<3;i++){
        s[i].displayDetails();
    }
    System.out.println("Total num of Student: "+getTotalStudent());
    }
    

    }
    

