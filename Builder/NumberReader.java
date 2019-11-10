import java.util.HashMap;

// Custom func interface for making our apply method accepting int
// Thus we prevent Java syntax error related to type error in lambda function
interface Function<T>
{
    public void apply(int number);
}

class NumberReader {

    private Ca1Converter ca1Converter;
    private Ca2Converter ca2Converter;
    private NaturalBinaryConverter naturalBinaryConverter;

    private HashMap<String, Function<Integer>> actions;

    NumberReader(){
        
        // Classic Option
        this.ca1Converter = new Ca1Converter();
        this.ca2Converter = new Ca2Converter();
        this.naturalBinaryConverter = new NaturalBinaryConverter();

        // Option using Java 8
        this.actions = new HashMap<>();
        actions.put("CA1", (int number) -> this.ca1Converter.Convert(number));
        actions.put("CA2", (int number) -> this.ca2Converter.Convert(number));
        actions.put("NATURAL_BINARY", (int number) -> this.naturalBinaryConverter.Convert(number));
    }

    // using a switch we determine the type of output that we want.
    public void parseNumber(String parseTo, int number){

        switch (parseTo) {
            case "CA1":
                this.ca1Converter.Convert(number);
                break;
            
            case "CA2":
                this.ca2Converter.Convert(number);
                break;

            case "NATURAL_BINARY":
                this.naturalBinaryConverter.Convert(number);
            break;
        
            default:
                System.out.println("Unknown type of conversion, TYPE: " + parseTo);
                break;
        }
    }

    // Overloading 
    public void parseNumber(int number, String typeOfConversion){
        this.actions.get(typeOfConversion).apply(number);
    }

}