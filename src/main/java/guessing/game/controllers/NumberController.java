package guessing.game.controllers;

import guessing.game.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberController {


    @Autowired
    NumberService numberService;

    @RequestMapping("/home")
    public String home(){ return "home";}

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String firstResult(Model model){
    int generatedNumber = numberService.random();
    model.addAttribute("generatedNumber", generatedNumber);
    return "firstGuess";

    }

}
