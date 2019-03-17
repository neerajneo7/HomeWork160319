public class StudentMarks
{
    // This programme is to find the total marks and percentage for 3 subjects of the students
    public static void main(String[] args)
    {

      System.out.println("Kaushal"); // This describes student name
      addition (80,50, 50); // This is the addition of the total marks for 3 subjects
      percentage (80,50,50); // This is the total percentage for 3 subjects

    }

    static void addition (int m, int s, int e)
    {
        System.out.println("Total Marks : " + (m+s+e)); // M is Maths, S is Science and E is English
    }

    static void percentage (int m, int s, int e)
    {

        System.out.println ("Total Percentage : " + ((m+s+e) * 100 / 300)); // Percentage formulae used eg.80*100/100

    }
}






