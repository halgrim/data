package pl.eka.models.fake;

import org.joda.time.DateTime;

import java.util.Random;
import java.util.UUID;

public class ReportSubSteps {

    private final String subStepType;
    private final String timestamp;
    private final String subStepResult;
    private final String imageReferenceUrl;
    private final String imageToCompare;

    public String getSubStepType() {
        return subStepType;
    }

    public String getTimestamp() {
        return timestamp;
    }


    public String getSubStepResult() {
        return subStepResult;
    }

    public String getImageReferenceUrl() {
        return imageReferenceUrl;
    }

    public String getImageToCompare() {
        return imageToCompare;
    }

    public ReportSubSteps() {
        this.subStepType =  MyRandom.randomSubStep();
        this.subStepResult =  MyRandom.randomString(30);
        this.timestamp = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();

        this.imageReferenceUrl = UUID.randomUUID().toString();
        if (MyRandom.randomBol()) {
            this.imageToCompare = UUID.randomUUID().toString();
        } else {
            this.imageToCompare = "no image to compare";
        }
    }

}
