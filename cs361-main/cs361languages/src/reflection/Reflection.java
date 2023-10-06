/**
 * 
 */
package reflection;

/**
 * @author Christian Concepcion
 *
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		 System.out.println("Inheritance chain:");
	        Class<?> currentClass = o.getClass();

	        while (currentClass != null) {
	            System.out.print(currentClass.getName());
	            if (currentClass.getSuperclass() != null) {
	                System.out.print(" inherits from ");
	                currentClass = currentClass.getSuperclass();
	            } else {
	                break;
	            }
	        }
	        System.out.println(" java.lang.Object");
			System.out.println("\n");

	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		System.out.println("\n");
		System.out.println("List of methods:");
        for (Method method : m) {
            System.out.println(method.toString());
        }
        
		System.out.println();

	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String str = "Welcome to CS 361!";
        r.correspondingClass(str);
        r.inheritanceChain(str);
        r.listMethods(str);
		
		// Demonstration of the methods on an objet of type ColoredCircle
        //I put an empty class of ColoredCircle below main():
		// TODO To complete		
        ColoredCircle circle = new ColoredCircle();
        r.correspondingClass(circle);
        r.inheritanceChain(circle);
        r.listMethods(circle);
	}
	
	public static class ColoredCircle {
		
	}

}
