package kyu8;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Random;


/**
 * Created by vlrkw on 2017-03-04.
 */
public class Square {
    public static boolean isSquare(int n){
        return Math.floor(Math.sqrt(n)) * Math.floor(Math.sqrt(n)) == n;
    }

    @Test
    public void squareTest(){
        Assertions.assertThat( Square.isSquare(-1)).isFalse(); // => false
        Assertions.assertThat( Square.isSquare( 3)).isFalse(); // => false
        Assertions.assertThat( Square.isSquare( 4)).isTrue(); // => true
        Assertions.assertThat( Square.isSquare(25)).isTrue(); // => true
        Assertions.assertThat( Square.isSquare(26)).isFalse(); // => false

        Random rand = new Random();
        for(int i = 0; i < 100; ++i){
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            Assertions.assertThat(isSquare(randomSq)).isTrue();
        }
    }
}
