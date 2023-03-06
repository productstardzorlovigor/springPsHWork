package homework.service;

import homework.model.Distance;
import homework.model.Gender;
import homework.model.Result;

import java.time.Duration;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ResultsProcessor {

    private final Collection<Result> results;

    public ResultsProcessor(Collection<Result> results) {
        this.results = results;
    }

    public List<Result> getFastes(Gender gender, Distance distance, int limit) {
        return results.stream()
                .filter(result -> result.hasDistance(distance) && result.hasGender(gender))
                .sorted(Comparator.comparing(Result::time))
                .limit(limit)
                .collect(Collectors.toList());
    }
}
