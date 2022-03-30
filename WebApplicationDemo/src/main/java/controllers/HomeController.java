package controllers;

import models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    public List<Student> students;
    @ResponseBody
    @GetMapping(value = "/hello")
    public String home(ModelAndView modelAndView){

        return "";
    }

}
