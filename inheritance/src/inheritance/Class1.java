package inheritance;

class Class1 {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("The name has been set successfully.");
    }

    public void showName() {
        System.out.println("The name is: " + name);
    }
}