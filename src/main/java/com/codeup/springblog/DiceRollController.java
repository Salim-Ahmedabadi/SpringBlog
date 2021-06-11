package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceRollController {

    @GetMapping("/dice-roll")
    public String diceGame() {
        return "/dice-roll";
    }
}
@GetMapping Getmapping("/dice-roll/{num}")}
    public String diceGuess(@PathVariable int num, Model model) {
    model.addAttribute("num", num);
            int randomNum = (int)(Math.random() * ((6 - 1) + 1)) + 1;
            boolean isCorrect = (randomNum == num);
            model.addAttribute("isCorrect", isCorrect);
            model.addAttribute("randomNum", randomNum);
            return "/userGuess";
            }
        }