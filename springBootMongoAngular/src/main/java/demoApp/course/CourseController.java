package demoApp.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class CourseController {

	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/api/courses")
	public List<Course> getAllCourses(){
		return CourseService.getAllCourses();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return CourseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/api/courses")
	public void addCourse(@RequestBody Course course) {
		CourseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/api/courses")
	public void updateCourse(@RequestBody Course course) {
		CourseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/api/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		CourseService.deleteCourse(id);
	}
}
