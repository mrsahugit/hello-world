/**
 * 
 */
package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manas Sahu
 *
 */
@RestController
public class HelloController {

	/**
	 * 
	 */
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
