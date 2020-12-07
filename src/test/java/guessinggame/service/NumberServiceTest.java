package guessinggame.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberServiceTest {

    NumberService numberService;

    @Test
    void additionForCICDTestingPurposes() {
        int a = 2;
        int b = 3;
        assertThat(numberService.additionForCICDTestingPurposes(a, b)).isEqualTo(5);
    }

    @BeforeEach
    void setUp(){
        numberService = new NumberService();
    }
}
