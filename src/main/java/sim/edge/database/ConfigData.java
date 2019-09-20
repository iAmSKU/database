package sim.edge.database;

class ConfigData
{
	String clientID;
	String hostName;
	String port;
	String userName;
	String password;
	
	public void setClientID(String clientID)
	{
		this.clientID = clientID;
	}
	
	public String getClientID()
	{
		return this.clientID;
	}
	
	public void setHostName(String hostName)
	{
		this.hostName = hostName;
	}
	
	public String getHostName()
	{
		return this.hostName;
	}
	
	public void setPort(String port)
	{
		this.port = port;
	}
	
	public String getPort()
	{
		return this.port;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getUserName()
	{
		return this.userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return this.password;
	}
}