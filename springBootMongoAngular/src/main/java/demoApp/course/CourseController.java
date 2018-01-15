package demoApp.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("/Courses")
	public List<Course> getAllCourses(){
		return CourseService.getAllCourses();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/Courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return CourseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Courses")
	public void addCourse(@RequestBody Course Course) {
		CourseService.addCourse(Course);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/Courses")
	public void updateCourse(@RequestBody Course Course) {
		CourseService.updateCourse(Course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/Courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		CourseService.deleteCourse(id);
	}
}
