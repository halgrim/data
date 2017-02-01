package pl.eka.models.fake;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ReportResult {

    private final String reportName;
    private final String property1;

    public String getReportName() {
        return reportName;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public String getTimestampStart() {
        return timestampStart;
    }

    public String getTimestampEnd() {
        return timestampEnd;
    }

    public String getReportId() {
        return reportId;
    }

    public List<ReportStep> getReportSteps() {
        return reportSteps;
    }

    private final String property2;
    private final String timestampStart;
    private final String timestampEnd;
    private final String reportId;
    private final List<ReportStep> reportSteps = new ArrayList<>();

    public ReportResult(String id) {
        this.reportName = MyRandom.randomString(60);
        this.property1 = MyRandom.randomProperty();
        this.property2 = MyRandom.randomOtherProperty();
        this.timestampStart = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();
        this.timestampEnd = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();
        this.reportId = id;
        for (int i = 0 ; i < new Random().nextInt(40); i ++){
            reportSteps.add(new ReportStep());
        }
    }
}
