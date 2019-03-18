public class StudentMarks
{
    // This programme is to find the total marks and percentage for 3 subjects of the students
    // I am using this as No Return type, With Parameters(With Argument) Method
    public static void main(String[] args)
    {

      addition ("Neeraj", 80,50, 50); // This is the addition of the total marks for 3 subjects
      percentage ("Neeraj",50,50,50); // This is the total percentage for 3 subjects

    }

    static void addition (String name, int maths, int science, int english)
    {
        System.out.println("Total marks of " + name + " in all subjects is: "+ (maths + science + english)); // M is Maths, S is Science and E is English
    }

    static void percentage (String name, int maths, int science, int english)
    {

        System.out.println ("Total Percentage of " + name + " is : "  + ((maths + science + english) * 100 / 300)); // Percentage formulae used eg.80*100/100

    }
}






