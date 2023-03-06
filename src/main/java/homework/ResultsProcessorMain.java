package homework;

import java.io.IOException;
        import java.util.List;

import homework.config.ResultsProcessorConfig;
import homework.model.Distance;
import homework.model.Gender;
import homework.model.Result;
import homework.service.ResultsProcessor;
import homework.service.ResultsReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
        import org.springframework.core.io.ClassPathResource;

public class ResultsProcessorMain {

    public static void main(String[] args) throws IOException {
        var applicationContext = new AnnotationConfigApplicationContext(ResultsProcessorConfig.class);

        var resultsReader = applicationContext.getBean(ResultsReader.class);
        var filePath = new ClassPathResource("./result.csv").getFile().toPath();
        var results = resultsReader.readFromFile(filePath);

        var resultsProcessor = new ResultsProcessor(results);
        List<Result> fastestMen = resultsProcessor.getFastes(Gender.MALE, Distance.TEN_KM, 3);


        for (Result fastestMAN : fastestMen) {
            System.out.println(fastestMAN);
        }
    }
}