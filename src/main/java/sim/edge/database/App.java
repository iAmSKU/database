package sim.edge.database;

/**
 * Json read (config + topic)
 * Save data to the database
 *
 */
public class App 
{
	static ConfigData configData;
	
	static JsonReader jsonReader;
	
	static TopicData topicData;
	
	static final String configFilePath = "config/config.json";
	static final String topicFilePath = "config/topics.json";
	
    public static void main( String[] args )
    {
        System.out.println( "Inside main method..." );
        
        configData = new ConfigData();
        
        parseData();
        
        parseTopics();
    }
    
    public static void parseData()
    {
        jsonReader = new JsonReader(); 
        if(jsonReader.read(configFilePath, configData))
        {            
            System.out.println("Successfully parsed data...");      	
        }
        else
        {
            System.out.println("Parsing config data is failed, please check the json file and mapping class...");        	
        }    	
    }
    
    public static void parseTopics()
    {        
        if(jsonReader.read(topicFilePath, topicData))
        {            
            System.out.println("Successfully parsed topic...");      	
        }
        else
        {
            System.out.println("Parsing topic is failed, please check the json file and mapping class...");        	
        }
    	
    }
}
