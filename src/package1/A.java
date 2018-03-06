package package1;

public class A {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        // public variable is accessible outside the class in the same package

        System.out.println(testClass.publicVariable);

        // so this private variable is not accessible to other class in same package
//        System.out.println(testClass.privateVariable);


        //so the protected variable is accessible in same package class
        System.out.println(testClass.protectedVariable);

        //default variable is available to local package class/ same package class
        System.out.println(testClass.defaultVariable);
    }
}
