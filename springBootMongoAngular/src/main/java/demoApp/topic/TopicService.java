package demoApp.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
		private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
					new Topic("Spring", "Spring Framework", "Spring framework description"),
					new Topic("java" ,"Core Java", "Core Java Description"),
					new Topic("JavaScript", "JavaScript", "JavaScript Description"),
					new Topic("Angular", "AngularJS", "AngularJS Description")
				));
		
		public List<Topic> getAllTopics() {
			return topics;
		}
		
		public Topic getTopic(String id) {
			return topics.stream().filter(item -> item.getId().equalsIgnoreCase(id)).findFirst().get();
		}

		public void addTopic(Topic topic) {
			topics.add(topic);
		}

		public void deleteTopic(String id) {
			topics.removeIf(item -> item.getId().equalsIgnoreCase(id));
		}

		public void updateTopic(String id, Topic topic) {
			topics.set(topics.indexOf(topics.stream().filter(item -> item.getId().equalsIgnoreCase(id)).findFirst().get()) , topic);
		}
	
}
