
package newpackage;


public class Student {
    int id;
    String name;
    String department; 
    double cgpa;
    private static String university="Ulab";
    private static int totalStudent=0;
    
    
    public Student(int id,String name,String department,double cgpa){
        this.id=id;
        this.name=name;
        this.department=department;
        this.cgpa=cgpa; 
        totalStudent++;
    }
    
    public void displayDetails(){
        System.out.println("ID: "+id+" Name: "+name+" Department: "+department+" Cgpa: "+cgpa+" University: "+university);
    }
    public static int getTotalStudent(){
        return totalStudent;
        
    }
    
    
    
    
    public static void main(String[] args){
        Student s1=new Student(241,"Samiha","CSE",3.65);
        Student s2=new Student(243,"John","MSJ",3.50);
        Student s3=new Student(210,"maliha","BBA",3.75);
        
        
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        
        System.out.println("Total num of Student: "+Student.getTotalStudent());
        
        
        
        
    }
    
}
