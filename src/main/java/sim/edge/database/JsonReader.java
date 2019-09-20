package sim.edge.database;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

class JsonReader
{
	Gson gson = new Gson();
	
	public Boolean read(String filePath, ConfigData configData)
	{
		System.out.println("Inside read, configData");
		
		ConfigData jsonData = null;
		try 
		{
			jsonData = gson.fromJson(new FileReader(filePath), ConfigData.class);
		} 
		catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) 
		{
			System.out.println("Error occurred while reading JSON file, error is" + e);
			return false;
		}
		
		//Set data to the passed parameter		
		try
		{
			configData.setClientID(dataValidator(jsonData.getClientID()));
			configData.setHostName(dataValidator(jsonData.getHostName()));
			configData.setPort(dataValidator(jsonData.getPort()));
			configData.setUserName(dataValidator(jsonData.getUserName()));
			configData.setPassword(dataValidator(jsonData.getPassword()));
		}
		catch(Exception e)
		{
			return false;
		}

		return true;
	}
	
	public boolean read(String filePath, TopicData topicData)
	{
		System.out.println("Inside read, topicData");
		
		TopicData jsonTopic = null;
		try 
		{
			jsonTopic = gson.fromJson(new FileReader(filePath), TopicData.class);
		} 
		catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) 
		{
			System.out.println("Error occurred while reading JSON file, error is" + e);
			return false;
		}
		
		return true;
	}
	
	private String dataValidator(String dataValue) throws Exception
	{
		if (dataValue == null)
		{
			throw new Exception();
		}
		
		return dataValue;
	}
}