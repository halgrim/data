package pl.eka.models.fake;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ReportStep {

    private final String stepName;
    private final String stepType;
    private final String timestampStart;
    private final String timestampEnd;
    private final String stepResult;

    public String getStepName() {
        return stepName;
    }

    public String getStepType() {
        return stepType;
    }

    public String getTimestampStart() {
        return timestampStart;
    }

    public String getTimestampEnd() {
        return timestampEnd;
    }

    public String getStepResult() {
        return stepResult;
    }

    public List<ReportSubSteps> getSubSteps() {
        return subSteps;
    }

    private final List<ReportSubSteps> subSteps = new ArrayList<>();


    public ReportStep() {
        this.stepName =  MyRandom.randomString(60);
        this.stepType = MyRandom.randomStep();
        this.timestampStart = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();
        this.timestampEnd = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();
        if (MyRandom.randomBol()) {
            this.stepResult =  MyRandom.randomString(30);
        } else {
            this.stepResult = "";
        }
        for (int i = 0 ; i < new Random().nextInt(40); i ++){
            subSteps.add(new ReportSubSteps());
        }

    }
}
