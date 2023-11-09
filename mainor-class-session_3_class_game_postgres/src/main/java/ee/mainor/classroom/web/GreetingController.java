package ee.mainor.classroom.web;

import ee.mainor.classroom.dto.GreetingDto;
import ee.mainor.classroom.dto.GreetingRequest;
import ee.mainor.classroom.service.GreetingService;
import ee.mainor.classroom.service.UniversityNameProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;
    private final UniversityNameProvider universityNameProvider;

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello! " + name;
    }

    @GetMapping("hello")
    public String sayHelloWithRequestParam(@RequestParam String name) {
        return "Hello! " + name;
    }

    @PostMapping("hello")
    public GreetingDto createName(@RequestBody GreetingRequest greetingRequest) {
        return greetingService.createName(greetingRequest);
    }


    @GetMapping("goodbye")
    public String sayGoodbye() {
        return "Goodbye!";
    }

}
