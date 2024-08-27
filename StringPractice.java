//AR


import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {

        System.out.printf("\n Welcome to String Practice!\n");


        // Create a String object
        String myPracticeStr;
        myPracticeStr = "Hello from my STRING practice program!";

        System.out.println("\n myPracticeStr is : "+ myPracticeStr);

        // Use a few String methods
        // a method is a object-oriented language name for a function\
        // methods always have a pair of () attached to them
        //
        //Use the toLowerCase()
        String myNewStr= "";

        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is : "+myNewStr);

        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is : "+myNewStr);

        // use the lenght method
        // Create an int variable, because the length() method return an int
        int myInt= 0;

        // Find the lenght of out String object

        myInt = myPracticeStr.length();
        // Prove it!
        System.out.println("\n The lenght of "+ myPracticeStr + "is"+myInt);

        // .contains ()
        boolean isItThere;
        isItThere = myPracticeStr.contains("xyz");
        System.out.println("\n The value of the isitThere is: "+ isItThere );

        // charAt
        int anotherInt = 4;
        myPracticeStr.charAt(5);
        char myChar = myPracticeStr.charAt(anotherInt);
        // Output the result
        System.out.println("\n The char at index" + anotherInt + myChar);

        //.indexof
        int mySecondInt;

        mySecondInt = myPracticeStr.indexOf("Str");
        System.out.println("\n The index of Str is : ");


        // .lastIndexof
        int OneMoreInt;
        
        OneMoreInt = myPracticeStr.lastIndexOf("m")
        System.out.println("\n OneMoreInt is"+OneMoreInt);
        
        // SubString !!
        myPracticeStr.substring(6);

        // Output that ! 
        String myLastStrObject = "";
        System.out.println("\n myLastStrObj:"+ myLastStrObject );
                
                
    }   
    }
