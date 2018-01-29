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
@RequestMapping("/api/courses")
public class CourseController {

	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/")
	public List<Course> getAllCourses(){
		return CourseService.getAllCourses();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Course getCourse(@PathVariable String id) {
		return CourseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	public void addCourse(@RequestBody Course course) {
		CourseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/")
	public void updateCourse(@RequestBody Course course) {
		CourseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteCourse(@PathVariable String id) {
		CourseService.deleteCourse(id);
	}
}
