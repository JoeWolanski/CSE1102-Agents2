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

public class Space {
	//All member variables defined at the beginning of the code

	private String _imgName;
	//Private class member variable name
	private String _name;
	//private class member variable portal
	private Portal _portal;
	//Private class member variable description
	private String _description;

	/* A full-simple-Constructor
	 * Add a constructor to class Space
	 * one parameter for each member variable 
	 * inside the constr. store arguments into member variables
	 * 
	 */
	public Space(String name, String description, Portal portal, String imgName){
		_name = name;
		_portal = portal;
		_description = description;
		_imgName = imgName; 
	}

	public String getImgName(){
		return _imgName;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Portal getPortal() {
		return _portal;
	}
	public void setPortal(Portal portal) {
		_portal = portal;
	}

	//Create toString and toStringLong
	public String toString(){
		return (_name);
	}
	public String toStringLong(){
		return (_name + ": " + getDescription() + " with a " + _portal + " to "+ _portal.getDestination()); 
	}

}

