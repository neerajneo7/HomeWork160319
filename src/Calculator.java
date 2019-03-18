public class Calculator
{
        // We shall be creating the data to add, sub, divide, multiplication for 2 int numbers
        // I am using this as No Return type, No Parameters(No Argument) Method
        static int a = 10;
        static int b = 2;

        // This method will do the addition
        static void add(){
            System.out.println("Add:" + (a+b));
        }

        // This method will do the substraction
        static void sub() {
            System.out.println("Sub:" + (a-b));
        }

        // This method will divide the integers
        static void divide(){
            System.out.println("Divide:" + (a/b));
        }

        // This method will provide multiplication
        static void multi(){
            System.out.println("Multiply:" + (a*b));
        }
        // java main method
        public static void main(String[] args) {
            add(); // This will add the value of a+b and is also called No Parameters method
            sub();
            divide();
            multi();
        }
    }


