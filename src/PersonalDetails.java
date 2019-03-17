import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class PersonalDetails
{
    // Programme should print your Name, Address, DOB and Age

    public static void main(String[] args)
    {
        System.out.println("Personal Details");
        System.out.println("Name : " + name);
        System.out.println("Address :" + Address);
        System.out.println("DOB :" + dob);
        System.out.println("Age :" + age);
    }


   static String name = "Neo";
   static String Address = "7 Bhoot Khana, Uk BK00 900";
   static String dob = "16-03-1920";
   static int age = 99;


}
