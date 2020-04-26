package guessing.game.controllers;

import guessing.game.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NumberController{


    @Autowired
    NumberService numberService;

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String firstResult(Model model) {
        int generatedNumber = numberService.random();
        model.addAttribute("generatedNumber", generatedNumber);
        return "firstGuess";
    }

    @RequestMapping(value = "/no", method = RequestMethod.POST)
    public String triedAgain(Model model) {
        int generatedAgain = numberService.random();
        model.addAttribute("generatedAgain", generatedAgain);
        return "tryagain";
    }


    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/firstGuess", method = RequestMethod.GET)
    public String firstGues() {
        return "firstGuess";
    }

    @RequestMapping(value = "/no", method = RequestMethod.GET)
    public String answeredNo() {
        return "no";
    }

    @RequestMapping(value = "/yes", method = RequestMethod.GET)
    public String answeredYes() {
        return "yes";
    }

    @RequestMapping(value = "/failed", method = RequestMethod.POST)
    public String failed() {
        return "failed";
    }


}
