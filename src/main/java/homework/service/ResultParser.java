package homework.service;

import homework.model.Distance;
import homework.model.Gender;
import homework.model.Person;
import homework.model.Result;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
public class ResultParser {

    private static final String SEPARATOR = ",";

    public Result parseResult(String line){
        var resultParts = line.split(SEPARATOR);

        var name = resultParts[0];
        var gender = Gender.of(resultParts[1]);
        var distance = Distance.of(resultParts[2]);
        var time = parseTime(resultParts[3]);


        var person = new Person(name, gender);
        return new Result(person, distance, time);
    }

    private Duration parseTime(String time){
        var timeParts = time.split(":");

        var totalSecond = Integer.parseInt(timeParts[0]) * 60 + Integer.parseInt(timeParts[1]);

        return Duration.ofSeconds(totalSecond);
    }
}
