package ee.mainor.classroom.service;

import ee.mainor.classroom.dto.GreetingRequest;
import org.springframework.stereotype.Component;

@Component
public class UniversityNameProvider {

    public static final String MAINOR_UNI_TEACHER = "Nikita";

    public String getUniversityByTeachersName(GreetingRequest greetingRequest) {
        if (greetingRequest.getFirstname().equals(MAINOR_UNI_TEACHER)) {
            return "Mainor";
        }
        return "TalTech";
    }

}
