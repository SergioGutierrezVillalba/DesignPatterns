import java.util.Scanner;

class BuilderExample {
    public static void main(String[] args) {

        // We create a number reader
        NumberReader numberReader = new NumberReader();

        // Read the decimal number put into the console
        Scanner sc = new Scanner(System.in);
        int someNumber = sc.nextInt();
        sc.close();

        // Let's see the output of the different conversions
        numberReader.parseNumber("CA1", someNumber);
        numberReader.parseNumber("CA2", someNumber);
        numberReader.parseNumber("NATURAL_BINARY", someNumber);
        
        // Alternative option in order to avoid 
        // switch loops using Lambda Functions from Java 8
        numberReader.parseNumber(someNumber, "CA1");
        numberReader.parseNumber(someNumber, "CA2");
        numberReader.parseNumber(someNumber, "NATURAL_BINARY");

    }
}