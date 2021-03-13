package com.nourhan.GuessNumbering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuessController {
	
	@GetMapping("/api/guess")
	public Guess guessing(@RequestParam(value="guessedNumber", defaultValue = "-1")int guessedNumber) {
		return new Guess(guessedNumber);
	}

}
