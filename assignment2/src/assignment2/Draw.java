package assignment2;

public class Draw {
    public static void main(String[] args) {

        
        
        Shape rectangle = new Rectangle();
        rectangle.draw();

       
        Shape cube = new Cube();
        cube.draw();

        
        Shape line = new Line();
        line.draw();
    }
}

abstract class Shape {
public abstract void draw();

}
class Rectangle extends Shape {
public void draw() {
	System.out.println("This is Rectangle");
			// TODO Auto-generated method stub	
		}

    }
class Line extends Shape {
           
public void draw() {
	System.out.println("This is Line");
				// TODO Auto-generated method stub
				
			}

        }
class Cube extends Shape {
               
public void draw() {
	System.out.println("This is Cube");
					// TODO Auto-generated method stub
					
				}

            }
