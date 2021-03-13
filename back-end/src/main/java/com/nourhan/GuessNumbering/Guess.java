package com.nourhan.GuessNumbering;
import java.util.Random;

public class Guess {
	int randomNumber;
	int guessedNumber;
	
	public Guess(int guessedNumber) {
		if(guessedNumber > 1 && guessedNumber < 10) {
			this.guessedNumber = guessedNumber;
		}else {
			guessedNumber = -1;
		}
	}
	
	public boolean isItTheRightNumber() {
		Random rand = new Random();
		this.randomNumber = rand.nextInt(10);
		if(this.randomNumber == this.guessedNumber) {
			return true;
		}
		return false;
	}
	public boolean getTrue() {
		return true;
	}

}
