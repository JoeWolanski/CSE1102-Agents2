import java.io.File;
import java.util.HashMap;

import jeff.ini.Ini;

//
public class ConfigLoader {
	private Ini _ini;
	private HashMap<String, Space>  _spaces  = new HashMap<String, Space>();
	private HashMap<String, Portal> _portals = new HashMap<String, Portal>();
	private HashMap<String, Agent>  _agents  = new HashMap<String, Agent>();
	public ConfigLoader(File iniFile)
	{
	  _ini = new Ini(iniFile);
	}
	public Agent buildAll()
	{
	  //_buildSpaces();
	  //_buildPortals();
	  //_buildExits();
	  //_buildDestinations();
	  //_buildAgents();
	  //return _selectStartAgent();
	  return null;
	}

}
