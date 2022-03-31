package com.ramosbros.useless;

/**
 * This is the class name
 */
public class ExampleClass {

    /**
     * These are fields within a class
     * We can use them to store data about whatever for this particular class
     */
    private String uselessParam1;
    private String uselessParam2;
    private UselessClass uselessClass;

    // This is a base constructor
    /**
     * If a class contains no constructor declarations,
     * then a default constructor with no formal parameters and
     * no throws clause is implicitly declared.
     */
    public ExampleClass() {

    }

    // This is a constructor, its purpose is to construct
    // or build an object using this class
    public ExampleClass(String uselessPara1, String uselessParam2) {
        this.uselessParam1 = uselessPara1;
        this.uselessParam2 = uselessParam2;
        uselessClass = new UselessClass("Brian");
    }

    /**
     * This is an example of a method.
     * 
     * It takes in two arguments and does what ever you want within the method.
     * The scope of the params is within the method
     * 
     * @param uselessParam1 some useless String
     * @param uselessParam2 some other useless String
     */
    private void doNothingMethod(String uselessParam1, String uselessParam2) {
        // This does nothing
    }

    /**
     * Another example of a method, can do whatever youd like it to
     */
    private void doSomething() {
        uselessClass.setFirstName(uselessParam1);
        uselessClass.setLastName(uselessParam2);
    }
}
