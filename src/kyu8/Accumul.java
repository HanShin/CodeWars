package kyu8;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/*This time no story, no theory. The examples below show you how to write function accum:

        Examples:

        Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
        Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
        The parameter of accum is a string which includes only letters from a..z and A..Z.
        */
public class Accumul {
    public static String accum(String s){
        StringBuffer resultString = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            resultString.append((s.charAt(i) + "").toUpperCase());
            for (int j = 0 ; j < i ; j++){
                resultString.append((s.charAt(i) + "").toLowerCase() );
            }
            if (i != s.length() - 1)
            {
                resultString.append("-");
            }
        }
        return resultString.toString();
    }

    @Test
    public void accmuTest(){

        Assertions.assertThat(Accumul.accum("abcd")).isEqualTo("A-Bb-Ccc-Dddd");
        Assertions.assertThat(Accumul.accum("RqaEzty")).isEqualTo("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy");
        Assertions.assertThat(Accumul.accum("cwAt")).isEqualTo("C-Ww-Aaa-Tttt");
        Assertions.assertThat(Accumul.accum("ZpglnRxqenU")).isEqualTo("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        Assertions.assertThat(Accumul.accum("NyffsGeyylB")).isEqualTo("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        Assertions.assertThat(Accumul.accum("MjtkuBovqrU")).isEqualTo( "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        Assertions.assertThat(Accumul.accum("EvidjUnokmM")).isEqualTo( "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        Assertions.assertThat(Accumul.accum("HbideVbxncC")).isEqualTo( "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");

    }
}
