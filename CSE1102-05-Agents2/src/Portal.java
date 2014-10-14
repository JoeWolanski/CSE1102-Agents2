/*Agents and Spaces
 * CSE1102 Homework 4, Spring 2013
 * Joseph Wolanski
 * 2/22/13
 * Samir Elsayed
 * Section 5
 * Instructor Jeffrey A. Meunier
 * Help: Jeff M. & Samir E.
 */

public class Portal {

	// three private member variables (name, direction, Space)
	//Agent added to member variable and set to use location destination
	private String _name;
	private Space _destination;
	private String _direction;	

	/* A full-simple-Constructor
	 * Add a constructor to class Portal
	 * one parameter for each member variable 
	 * inside the constr. store arguments into member variables
	 */

	public Portal(String name, String direction, Space destination){
		_name = name;
		_direction = direction;
		_destination = destination;

	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}


	public String getDirection() {
		return _direction;
	}

	//Java did not call for this, I needed to manually get&set
	public void setDirection(String direction) {
		_direction = direction;
	}


	public Space getDestination(){
		return _destination;
	}
	public void setDestination(Space destination) {
		_destination = destination; 
	}
	public void transport(Agent a){

		a.setLocation(_destination);
	}

	public String toString(){
		return (_name + " that goes "+ _direction);
	}
	public String toStringLong(){
		return (_name + " that goes " + _direction + " to " + _destination);

	}

}
