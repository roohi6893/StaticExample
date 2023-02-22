class Test
{
    // static variable
    //TODO follows written order - static variable initialization and static blocks
    static int staticVariable = staticMethodWhichReturnsAnInt();

    // static block
    static {
        System.out.println("I am a static block");
    }
    static {
        System.out.println("I am a static block no 2");
    }

    // static method
    static int staticMethodWhichReturnsAnInt() {
        System.out.println("I am a static method");
        return 20;
    }

    //TODO Story of PSVM
    public static void main(String[] args)
    {
        System.out.println("I am main method");
        System.out.println("Value of my variable: "+staticVariable);
    }
}