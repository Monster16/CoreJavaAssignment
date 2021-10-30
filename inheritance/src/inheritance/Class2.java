package inheritance;

class Class2 extends Class1 {
    private int age;

    public void setAge(int age) {
        this.age = age;
        System.out.println("The age has been set successfully.");
    }

    public void showAge() {
        System.out.println("The age is: " + age);
    }

    public void displayName() {
        //Accessing the private member of superclass here
        //System.out.println("The name is: " + name); //error, can't compile because access to the private member name of the superclass Class1 is not permitted here.
    }
}
