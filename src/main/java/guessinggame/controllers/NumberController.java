package guessinggame.controllers;

import guessinggame.service.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumberController {


    NumberService numberService;

    private NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @PostMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/firstGuess")
    public String firstResult(Model model) {
        int generatedNumber = numberService.random();
        model.addAttribute("generatedNumber", generatedNumber);
        return "firstGuess";
    }

    @PostMapping("/no")
    public String failed() {
        return "no";
    }

    @PostMapping("/failed")
    public String answeredNo() {
        return "failed";
    }

    @PostMapping("/tryagain")
    public String triedAgain(Model model) {
        int generatedAgain = numberService.random();
        model.addAttribute("generatedAgain", generatedAgain);
        return "tryagain";
    }

    @PostMapping("/yes")
    public String answeredYes() {
        return "yes";
    }


//    @RequestMapping(value = "/no", method = RequestMethod.GET)
//    public String answeredNo() {
//        return "no";
//    }
//


}
