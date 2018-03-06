package package2;

import package1.TestClass;

public class B {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        // this public variable is accessible to other class in different package
        System.out.println(testClass.publicVariable);

        // this private variable is not available to other package classes also
//        System.out.println(testClass.privateVariable);

        // so protected variable is not allowed for other packages
//        System.out.println(testClass.protectedVariable);

        // so default variable is not accessible outside the packge 
        System.out.println(testClass.defaultVariable);
    }
}
