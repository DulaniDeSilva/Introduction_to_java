public class Main {

    public static void main(String[] args) {
        Student newstudent = new Student("Dulani",23, 56, 89, 68);

        newstudent.printDetails();

        System.out.println("Average marks of student: " + newstudent.calAverage());

        System.out.println("Grade of the Student: " + newstudent.getGrade());


        Array newArray = new Array();
        newArray.display();
        System.out.println("Sum of the numbers:" + newArray.calculate());


    }
}
