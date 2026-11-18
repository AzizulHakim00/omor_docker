package bd.edu.seu.practice_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class docker_controller {

    @GetMapping("api/hello")
    public String showItems(){

        return "Hello World sdv";
    }

}
