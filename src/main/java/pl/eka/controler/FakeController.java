package pl.eka.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.eka.models.fake.Report;
import pl.eka.models.fake.ReportResult;
import pl.eka.models.fake.ReportSummary;
import pl.eka.models.images.ImageRequestGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
public class FakeController {

    @CrossOrigin
    @RequestMapping(value = "/report", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity report() {
        return new ResponseEntity<>(new ReportResult(UUID.randomUUID().toString()), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/report/{runID}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity testRunByID(@PathVariable(value="runID") String runID) {


        if (!runID.matches("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Arrays.asList("Pass a proper ID"));
        }

        return new ResponseEntity<>(new ReportResult(runID), HttpStatus.OK);

    }

    @CrossOrigin
    @RequestMapping(value = "/reportListSummary", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity reportListSummary() {

        List<ReportSummary> summaryList = new ArrayList<>();

        for (int i = 0; i < 100 ; i ++ ){
            summaryList.add(new ReportSummary());
        }

        return new ResponseEntity<>(summaryList, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/reportList", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity reportList() {

        List<Report> reportList = new ArrayList<>();

        for (int i = 0; i < 100 ; i ++ ){
            reportList.add(new Report());
        }

        return new ResponseEntity<>(reportList, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/image/{imageId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity sentImage(@PathVariable(value="imageId") String runID) {

        return new ResponseEntity<>(ImageRequestGenerator.generate(), HttpStatus.OK);
    }

}
