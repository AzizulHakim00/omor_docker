package bd.edu.seu.practice_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class docker_controller {

    @GetMapping("api/hello")
    public String showItems(){

        System.out.println("hello");

        return "This is the 1st version of ci cd pipeliine";
    }

}
