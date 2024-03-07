import java.util.Scanner;

public class ValidatePass {

    public static void main(String[] args){

        final int NUM_UPPER_LETTERS = 2;
        final int NUM_LOWER_LETTERS = 3;
        final int NUM_DIGITS = 1;

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");

        String input = sc.nextLine();
        int inputLen = input.length();

        for(int i=0; i<inputLen; i++){

            char ch = input.charAt(i);

            if(Character.isUpperCase(ch))
            upperCount++;
            else if (Character.isLowerCase(ch)) 
                lowerCount++;
            else if (Character.isDigit(ch)) 
                digitCount++;
                
            }

            if (upperCount >= NUM_UPPER_LETTERS  && lowerCount >= NUM_LOWER_LETTERS && digitCount >= NUM_DIGITS) 

                System.out.println("Valid password");
            
            
            else{

                System.out.println("The password did not have enough of the following:");

                if (upperCount < NUM_UPPER_LETTERS) 
                    System.out.println("uppercase letters");
                if (lowerCount < NUM_LOWER_LETTERS) 
                    System.out.println("lowercase letters");
                if (digitCount < NUM_DIGITS)
                    System.out.println("digits"); 
                        
             }       
        }
    }   
    
    

