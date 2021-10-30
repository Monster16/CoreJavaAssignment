package inheritance;

// Testing if a subclass can access the private members of a superclass


class InheritanceTest {
    public static void main(String[] args) {

        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        c1.setName("Name_C1");
        c2.setName("Name_C2"); //No error, setName() is a public member of the superclass which indirectly gives access to the private member "name".

        c1.showName();
        c2.showName(); //No error, showName() is a public member of the superclass which indirectly gives access to the private member "name".

        c2.setAge(25);
        c2.showAge();

        //c2.displayName(); //error
    }
}