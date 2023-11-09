package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.GreetingDto;
import ee.mainor.classroom.dto.GreetingRequest;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private UniversityNameProvider universityNameProvider;

    public GreetingService(UniversityNameProvider universityNameProvider) {
        this.universityNameProvider = universityNameProvider;
    }

    public GreetingDto createName(GreetingRequest greetingRequest) {
        return new GreetingDto()
                .setFullName(greetingRequest.getFirstname() + " " + greetingRequest.getLastname())
                .setUniversity(universityNameProvider.getUniversityByTeachersName(greetingRequest));
    }

}
