public class UC6 {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            String result = "Hello, ";

            // Using enhanced for loop to append names
            for (String name : args) {
                result += name + ", ";
            }

            // Remove trailing comma and space using substring
            result = result.substring(0, result.length() - 2);

            // Print final greeting
            System.out.println(result + "!");
        }
    }
}