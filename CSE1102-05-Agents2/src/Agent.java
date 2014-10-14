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

public class Agent {
	// Two private String variables for name and location of the agent
	private String _name;
	private Space _location;


	/* A full-simple-Constructor
	 * Add a constructor to class Agent
	 * one parameter for each member variable 
	 * inside the constr. store arguments into member variables
	 */

	public Agent(String name, Space location){
		_name = name;
		_location = location;
	}


	public boolean usePortal(TextConsole textConsole){
		Portal p = _location.getPortal();
		if(p != null) {
			p.transport(this);	
			return true;
		}
		else {
			return false;
		}
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {

		_name = name;
	}

	public Space getLocation() {
		return _location;
	}

	public void setLocation(Space location) {
		_location = location;
	}

	public String toString() {
		return (_name);
	}

	public String toStringLong() {
		return (_name + " is in " + _location);
	}
}
