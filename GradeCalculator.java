import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter student name:");
        String name=input.nextLine();
        System.out.println("Enter grades(separated by spaces):");
        String grades=input.nextLine();
        String[]gradeArray=grades.split(" ");
        int total=0;
        for(String grade:gradeArray){
            total+=Integer.parseInt(grade);
        }
        double average=(double)total/gradeArray.length;
        System.out.println("Student Name:"+name);
        System.out.println("Average Grade:"+average);
        if(average>=90){
            System.out.println("Grade:A");
        }
        else if(average>=80){
            System.out.println("Grade:B");
        }
        else if(average>=70){
            System.out.println("Grade:C");
        }
        else if(average>=60){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Grade:F");
        }
        }
    }

    