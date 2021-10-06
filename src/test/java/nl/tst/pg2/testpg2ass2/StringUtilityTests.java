package nl.tst.pg2.testpg2ass2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class StringUtilityTests {

    StringUtility su = new StringUtility();

    @Test
    void ReverseString_Should_ReturncBa_When_GivenaBc_Test() {
        String reversedWord = su.reverseString("aBc");
        assertEquals("cBa", reversedWord);
    }

    @Test
    void ReverseString_Should_ReturnelloH_When_GivenHello_Test() {
        String reversedWord = su.reverseString("Hello");
        assertEquals("olleH", reversedWord);
    }

    @Test
    void ReverseString_Should_Return321_When_Given123_Test() {
        String reversedResult = su.reverseString("123");
        assertEquals("321", reversedResult);
    }

    @Test
    void ReverseString_Should_ReturnStringWithSpace_When_GivenStringWithSpace_Test() {
        String reversedResult = su.reverseString(". _ - *");
        assertEquals("* - _ .", reversedResult);
    }

    @Test
    void ReverseString_Should_ReturnStillCorrectPalindrome_When_GivenPalindrome_Test() {
        String reversedResult = su.reverseString("Emil peed deep lime");
        assertEquals("emil peed deep limE", reversedResult);
    }


    @Test
    void CapitalizeString_Should_ReturnABC_When_GivenaBc_Test() {
        String capitalizedResult = su.capitalizeString("aBc");
        assertEquals("ABC", capitalizedResult);
    }

    @Test
    void CapitalizeString_Should_ReturnMUHAHAHAAAHA_When_GivenmUhaHAhAaaHA_Test() {
        String capitalizedResult = su.capitalizeString("mUhaHAhAaaHA");
        assertEquals("MUHAHAHAAAHA", capitalizedResult);
    }

    @Test
    void CapitalizeString_Should_Return123678_When_Given123678_Test() {
        String capitalizedResult = su.capitalizeString("123678");
        assertEquals("123678", capitalizedResult);
    }

    @Test
    void CapitalizeString_Should_ReturnSameSmiley_When_GivenSmiley_Test() {
        String capitalized = su.capitalizeString("\\(^-^)/");
        assertEquals("\\(^-^)/", capitalized);
    }

    @Test
    void CapitalizeString_Should_ReturnAMixOfEverythingUppercase_When_GivenEverything_Test() {
        String capitalizedMix = su.capitalizeString("3veRy71n9!N #%&/(?");
        assertEquals("3VERY71N9!N #%&/(?", capitalizedMix);
    }

    @Test
    void LowerCaseString_Should_Returnabc_When_GivenaBc_Test() {
        String lowercasedResult = su.lowercaseString("aBc");
        assertEquals("abc", lowercasedResult);
    }

    @Test
    void LowercaseString_Should_Returnmuuhahaaaaaha_When_GivenMuUhaHaAAaAHA_Test() {
        String lowercasedRes = su.lowercaseString("MuUhaHaAAaAHA");
        assertEquals("muuhahaaaaaha", lowercasedRes);
    }

    @Test
    void LowercaseString_Should_Return876456_When_Given876456_Test() {
        String lowerRes = su.lowercaseString("876456");
        assertEquals("876456", lowerRes);
    }

    @Test
    void LowercaseString_Should_ReturnSameSmiley_When_GivenSmiley_Test() {
        String lowercased = su.lowercaseString("\\(^-^)/");
        assertEquals("\\(^-^)/", lowercased);
    }

    @Test
    void LowercaseString_Should_ReturnAMixOfEverythingLowercase_When_GivenEverything_Test() {
        String lowercaseMix = su.lowercaseString("3veRy71n9!N #%&/(?");
        assertEquals("3very71n9!n #%&/(?", lowercaseMix);
    }
}
