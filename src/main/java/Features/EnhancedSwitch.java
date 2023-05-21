package Features;

public class EnhancedSwitch {
    public static void main(String[] args) {
        var language = "C#";
        switch (language) {
            case "Java":
                System.out.println("The Best");
                break;
            case "C#":
            case "Python":
                System.out.println("Acceptable");
                break;
            case "JavaScript":
                System.out.println("Somebody kill me!");
                break;
            default:
                System.out.println("You should try Java!");
        }

        switch (language) {
            case "Java" -> System.out.println("The Best");
            case "C#", "Python" -> System.out.println("Acceptable");
            case "JavaScript" -> System.out.println("Somebody Kill ME!");
            default -> System.out.println("You should try Java!");
        }
    }
}
