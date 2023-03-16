public class Student {

    String name;
    int age;
    int mathsMarks;
    int statMarks;
    int csMarks;
    int average;



    Student(String name, int age, int mathsMarks, int statMarks, int csMarks){
        this.name = name;
        this.age =  age;
        this.mathsMarks = mathsMarks;
        this.statMarks = statMarks;
        this.csMarks = csMarks;
    }

    public void printDetails(){
        System.out.println("Name of the student:" + this.name);
        System.out.println("Age of the student:" + this.age);
        System.out.println("Maths Marks of the student:" + this.mathsMarks);
        System.out.println("Statistics Marks of the student:" + this.statMarks);
        System.out.println("Computer Science Marks: " + this.csMarks);
    }

    //Method to calculate the average
    public  int calAverage(){
        average =  (this.mathsMarks + this.statMarks + this.csMarks)/3;
        return average;
    }

    //Method to find the grade
    public char getGrade(){
        if (average<=100 && average >=75){
            return 'A';
        }else if(average<75 && average >= 65){
            return 'B';
        }else if(average< 65 && average >=55){
            return 'C';
        }else if(average<55 && average >=45){
            return 'D';
        }
        return 'F';
    }

}

