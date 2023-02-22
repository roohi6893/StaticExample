public class BlocksAndConstructors {

    int check;
    static
    {
        System.out.println("1st static block");
    }

    //TODO Example for initialization block
    //Executed irrespective of constructor nature, etc. Has default things.
    {
        System.out.println("1st instance block");
        System.out.println(this.check);
    }

    {
        System.out.println("2nd instance block");
    }

    static
    {
        System.out.println("2nd static block");
    }

    /**
    * If there are two or more static/initializer blocks,
     * then they are executed in the order in which they appear in the source code.
    * */

    BlocksAndConstructors()
    {
        System.out.println("No  argument constructor");
    }
    BlocksAndConstructors(int x)
    {
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args)
    {
        new BlocksAndConstructors();
        new BlocksAndConstructors(6);
    }
}

