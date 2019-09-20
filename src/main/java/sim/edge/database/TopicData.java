package sim.edge.database;

import java.util.List;

class TopicData
{
	List <String> topicList;
	
	public void addTopic(String topicName)
	{
		topicList.add(topicName);
	}
	
	public List <String> getTopics()
	{
		return topicList;
	}
}