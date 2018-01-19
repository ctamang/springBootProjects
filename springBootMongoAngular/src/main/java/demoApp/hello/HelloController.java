package demoApp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("api/hello")
	public String sayHi() {
		return "hi";
	}
}
