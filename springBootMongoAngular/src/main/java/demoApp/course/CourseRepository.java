package demoApp.course;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CourseRepository extends MongoRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
	public List<Course> findByName(String name);
	
}
