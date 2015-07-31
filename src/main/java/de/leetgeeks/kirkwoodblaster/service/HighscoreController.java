package de.leetgeeks.kirkwoodblaster.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighscoreController {

    @RequestMapping("/scores")
    public Score scores(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Score(1337, "Tosken", 500);
    }
}
