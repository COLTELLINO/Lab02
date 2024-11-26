package it.unibo.cli.arguments.test;

class TestCommandLine {

    public static void main(final String[] args) {
        /*
         * Write the main method in such a way that it iterates through the
         * array of arguments, printing each one along with the length of the
         * string - the String class provides an
         *
         * int length()
         *
         * method that returns the length of the String.
         *
         * Example output:
         *
         * $ java it.unibo.cli.arguments.test.TestCommandLine Welcome to the lab
         *
         * The provided arguments are:
         *  * Welcome, 7 characters long
         *  * to, 2 characters long
         *  * the, 3 characters long
         *  * lab, 3 characters long
         */
        if (args.length == 0) {
            System.out.println("No argument has been provided.");
        } else {
            System.out.println("The provided arguments are:");
            for (final String arg: args) {
                System.out.println(" * " + arg + ", " + arg.length() + " characters long");
            }
        }
    }
}
