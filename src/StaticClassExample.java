
/**
 * Class cannot be declared static unless it is nested
* */

public class StaticClassExample {

    int nonStaticInstance = 0;
    static int staticInstance = 0;
    static class StaticNestedClass {
        void function() {
            //TODO Static Nested Class cannot access instance variables of outer class directly
//            System.out.println(nonStaticInstance);
            System.out.println(staticInstance);
        }
    }

    class InnerClass {
        //TODO A non-static nested class has full access to the members of the class within which it is nested.
        void function() {
            System.out.println(nonStaticInstance);
            System.out.println(staticInstance);
        }
    }

    class InnerSubClass extends InnerClass {
    }
}

class StaticSubClass extends StaticClassExample.StaticNestedClass {

}

class MainClass {
    public static void main(String[] args) {
        StaticClassExample staticClass = new StaticClassExample();
        StaticClassExample.StaticNestedClass nestedClassObject = new StaticClassExample.StaticNestedClass();
        StaticClassExample.InnerClass innerClassObject = staticClass.new InnerClass();
    }
}
