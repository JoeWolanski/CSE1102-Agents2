/*Agents and Spaces
 * CSE1102 Homework 4, Spring 2013
 * Joseph Wolanski
 * 2/22/13
 * Samir Elsayed
 * Section 5
 * Instructor Jeffrey A. Meunier
 * Help: Jeff M. & Samir E.
 */

import java.io.File;


import java.util.Scanner;
import jeff.imagewindow.ImageWindow;
import jeff.textconsole.TextConsole;



public class CommandInterpreter {


	private static void _showImage(ImageWindow img01 , Agent a){

		File imageDir = new File("data", "images");
		String section = "images";
		String key = "Bedroom";
		String value = ini.get(section,key);
		File imageFile = new File(imageDir, imageName);
		ImageWindow imageWindow = new ImageWindow();
		imageWindow.loadImage(imageFile);

	}

	//Display Agent and their initial location


	public static void run (ImageWindow imageWindow, Agent a, TextConsole textConsole) {


		boolean contin = true;
		//not sure if this is supposed to be here v ????

		textConsole.println( a.getName() + " is at the " + a.getLocation());

		CommandInterpreter._showImage(imageWindow, a);

		do{
			Object command;
			command = textConsole.readLine();
			
			//Scanner sc = new Scanner(System.in);
			textConsole.print("==> ");
			((Scanner) command).next();


			if (command.equals("quit")) {
				contin = false;
			}
			//Move the agent through the current space's portal
			//Call the usePortal method on the Agent
			else if (command.equals("go")){		
				textConsole.print(a.getName() + " is moving from the " + a.getLocation());
				a.usePortal(textConsole);
				CommandInterpreter._showImage(imageWindow, a);

				//How do I get the previous location between from and "to"????
				textConsole.println(" to the " + a.getLocation());

				//Describe the Agent's transportation "from" to "to"

			}
			//Display all the available options
			else if (command.equals("help")){
				textConsole.println("Please enter a command:");
				textConsole.println("go, help, look, where");
			}
			//Display the agent's location's (toStringLong) string
			/*You must use only the instances that you've already 
			 * created. Each space contains a portal -- that's its 
			 * _portal. Each portal refers to a space -- that's its 
			 * _destination. You just need to ask these existing 
			 * instances to give you what you need. That's what the 
			 * getter methods are for.
			 */
			else if (command.equals("look")){

				textConsole.println( a.getLocation().toStringLong());

			}
			// Display the agent's locations (toString) string
			else if (command.equals("where")){
				textConsole.println(a.getLocation().toString());

			}
			else { 
				textConsole.println("Sorry, I don't understand " + "'" + 
						command + "'");
			}
		}
		while(contin == true);
		System.exit(0);

	}


}




