package at.fhtw.bic.graderegarding.ControllerGrades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Grades {
    @GetMapping("/Grades")
    public double GradeRegarding(@RequestParam double relative){
        //double GradeOne = 90% = 1;
        //double GradeTwo = 50% = 4;
        //double GradeThree = 0% = 5;
        return 0;
    }

}
