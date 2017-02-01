package pl.eka.models.fake;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ReportSummary {

    private final String reportName;
    private final String property1;

    private final String verdict;

    public String getVerdict() {
        return verdict;
    }

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

    private final String property2;
    private final String timestampStart;
    private final String timestampEnd;
    private final String reportId;

    public ReportSummary() {
        this.reportName = MyRandom.randomString(60);
        this.property1 = MyRandom.randomProperty();
        this.property2 = MyRandom.randomOtherProperty();
        this.timestampStart = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();
        this.timestampEnd = new DateTime(MyRandom.randomLongForDate()).toDateTimeISO().toString();
        this.reportId = UUID.randomUUID().toString();
        this.verdict = String.valueOf(MyRandom.randomBol());
    }
}
