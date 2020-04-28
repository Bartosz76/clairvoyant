package guessinggame.controllers;

import guessinggame.service.NumberService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NumberController {


    NumberService numberService;

    private NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String getHome() {
        return "home";
    }

    @RequestMapping(value = "home", method = RequestMethod.POST)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/firstGuess", method = RequestMethod.POST)
    public String firstResult(Model model) {
        int generatedNumber = numberService.random();
        model.addAttribute("generatedNumber", generatedNumber);
        return "firstGuess";
    }

    @RequestMapping(value = "no", method = RequestMethod.POST)
    public String failed() {
        return "no";
    }

    @RequestMapping(value = "failed", method = RequestMethod.POST)
    public String answeredNo() {
        return "failed";
    }

    @RequestMapping(value = "tryagain", method = RequestMethod.POST)
    public String triedAgain(Model model) {
        int generatedAgain = numberService.random();
        model.addAttribute("generatedAgain", generatedAgain);
        return "tryagain";
    }

    @RequestMapping(value = "yes", method = RequestMethod.POST)
    public String answeredYes() {
        return "yes";
    }


//    @RequestMapping(value = "/no", method = RequestMethod.GET)
//    public String answeredNo() {
//        return "no";
//    }
//


}
