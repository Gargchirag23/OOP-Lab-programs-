class CommandLineArgument {
    public static void main(String[] args) {

        if (args.length >= 3) {
            System.out.println("First Argument: " + args[0]);
            System.out.println("Second Argument: " + args[1]);
            System.out.println("Third Argument: " + args[2]);
        } else {
            System.out.println("Please enter 3 command line arguments.");
        }
    }
}