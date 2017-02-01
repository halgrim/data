package pl.eka.models.fake;

import org.joda.time.DateTime;

import java.util.UUID;

public class Report {

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


    private final String property2;

    public Report() {
        this.reportName = MyRandom.randomString(60);
        this.property1 = MyRandom.randomProperty();
        this.property2 = MyRandom.randomOtherProperty();
    }
}
