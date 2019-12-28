package guessing.game.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public int random() {
        double doubleRandom = Math.random();
        doubleRandom = (doubleRandom * 100) + 1;
        int guessedNumber = (int) doubleRandom;
        return guessedNumber;


    }
}
