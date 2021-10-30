package assignment2_4;


abstract final class Final
{
    String collegeName = "KUK";
    public void collegeName()
    {
        System.out.println("Name of college = "+ collegeName);
    }
    //abstract methods
    public abstract void deptName();
    public abstract void noOfTeachers();
    
}
class CannotFinal extends Final
{
    public static void main(String arg[])
    {
    	CannotFinal obj = new CannotFinal();
    }
    public void deptName() {
        // TODO Auto-generated method stub
        
    }
    public void noOfTeachers() {
        // TODO Auto-generated method stub
        
    }
}