package demoApp.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DbSeeder implements CommandLineRunner {

	@Autowired
	private TopicRepository topicRepository;
	
	public DbSeeder(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}
	@Override
	public void run(String... arg0) throws Exception {
		
		log.trace("DbSeeder needed more information - {}");
		log.debug("DbSeeder needed to debug - {}");
		log.info("DbSeeder took input - {}");
		log.warn("DbSeeder needed to warn - {}");
		log.error("DbSeeder encountered an error with value - {}");
		
		
		Topic spring =	 new Topic("Spring", "Spring Framework", "Spring framework description");
		Topic java = new Topic("java" ,"Core Java", "Core Java Description");
		Topic javascript = new Topic("JavaScript", "JavaScript", "JavaScript Description");
		Topic angular = new Topic("Angular", "AngularJS", "AngularJS Description");
		
		
		
		this.topicRepository.deleteAll();
		List<Topic> topics = Arrays.asList(spring, java, javascript, angular);
		
		this.topicRepository.save(topics);
	}
}
