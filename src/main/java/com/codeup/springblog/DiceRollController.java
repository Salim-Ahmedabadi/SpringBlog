package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiceRollController {
    @GetMapping("/roll-dice")
    public String RollDice(){
        return "/roll-dece";
    }
}
