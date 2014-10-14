import java.io.File;

import jeff.imagewindow.ImageWindow;
import jeff.textconsole.TextConsole;


/*Agents and Spaces
 * CSE1102 Homework 4, Spring 2013
 * Joseph Wolanski
 * 2/22/13
 * Samir Elsayed
 * Section 5
 * Instructor Jeffrey A. Meunier
 * Help: Jeff M. & Samir E.
 */

//I seem to be getting more and more lost within this assignment.
//Is it supposed to be a new class and method on a separate window?
//Problem solved in output display.
//Final output obtained through the "public" Main
// do NOT adjust the "private" classes
public class Main {
	public static void main(String[] args)
	{	
		TextConsole textConsole = TextConsole.create();
		
		/* Change the constructors to a single constructor
		 * Example{ Space classroom = new Space();
		 * classroom.setName("classroom");
		 * classroom.setDescription("a large lecture hall");
		 * 
		 * to ==>
		 * 
		 * Space classroom = new Space("classroom", "a large lecture hall", null, null);
		 *
		 * Do this for all Space() Constructors:
		 * null,null
		 */
		
		//Given to me by the magical Jeff. 
		//How does he come up with this!?
		TextConsole  textconsole     = TextConsole.create();
	    ImageWindow  imageWindow = new ImageWindow();
	    File         configFile  = new File("data", "config.ini");
	    ConfigLoader cl          = new ConfigLoader(configFile);
	    Agent        a           = cl.buildAll();
	    CommandInterpreter.run(imageWindow, a, textConsole);

	
	}

}



