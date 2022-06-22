import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    @DisplayName("Should concantenate two strings")
    void concat() {
        assertEquals("papa",StringUtils.concat("pa","pa"));
    }

    @Nested
    @DisplayName("isPalindrome")
    class Palindrome{
        @Test
        @DisplayName("Should return true with kayak")
        void isPalindromeKayak(){
            boolean result=StringUtils.isPalindrom("kayak");
            assertTrue(result);
        }



        @Test
        @DisplayName("Should return false with bonjour")
        void isPalindromeBonjour(){
            boolean result=StringUtils.isPalindrom("bonjour");
            assertFalse(result);
        }

        @Test
        @DisplayName("Should return true with empty string")
        void isPalidndromeChaineVide(){
            boolean result=StringUtils.isPalindrom("");
            assertTrue(result);
        }

        @Test
        @DisplayName("Should return true with KAyaK")
        void isPalindromeKAYak(){
            boolean result=StringUtils.isPalindrom("KAyaK");
            assertTrue(result);
        }

        @Test
        @DisplayName("Should return true with string containing spaces")
        void isPalindromeWithSpaces(){
            boolean result=StringUtils.isPalindrom("Engage le jeu que je le gagne");
            assertTrue(result);
        }

        @Test
        @DisplayName("Should return true if the prefix is in uppercase")
        void isPrefixUpperCase(){
            boolean result=StringUtils.isPrefix("banner","Ban");
            assertTrue(result);
        }
    }

    @Nested
    @DisplayName("IsAnagram")
    class IsAnagram
    {
        @Test
        @DisplayName("Should be false if size different")
        void isLeigthDifferent() {
            assertFalse(StringUtils.isPalindrom("saga"));
        }
        @Test
        @DisplayName("Should be true if is lowercase palindrom")
        void isAnagramLower() {
            assertTrue(StringUtils.isAnagram("gare","rage"));
        }

        @Test
        @DisplayName("Should be true if is uppercase palindrom")
        void isAnagramUpper() {
            assertTrue(StringUtils.isAnagram("GARE","RAGE"));
        }

        @Test
        @DisplayName("Should be true if is capitalize anagram")
        void isAnagramCapitalize() {
            assertTrue(StringUtils.isAnagram("Gare","Rage"));
        }

        @Test
        @DisplayName("Should be true if string empty")
        void isAnagramEmpty() {
            assertTrue(StringUtils.isAnagram("",""));
        }

        @Test
        @DisplayName("Should be true in sentence anagram")
        void isAnagramSentence() {
            assertTrue(StringUtils.isAnagram("Tom Elvis Jedusor","Je suis Voldemort"));
        }
        @Test
        @DisplayName("Should be false is string diffent")
        void IsDifferent(){
            assertFalse(StringUtils.isAnagram("Bonjour","jours bon"));
        }
    }
}

@Nested
@DisplayName("reverseInt")
class reverseInt
{
    @Test
    @DisplayName("should return an inversed int from an int lasting 0")
    void reverseInt()
    {
        assertEquals(89,StringUtils.reverseInt(98));
    }
    @Test
    @DisplayName("should return an inversed int from an int lasting 0")
    void reverseIntZero()
    {
        assertEquals(1,StringUtils.reverseInt(10));
        assertEquals(21,StringUtils.reverseInt(120));
        assertEquals(0,StringUtils.reverseInt(0));
    }
    @Test
    @DisplayName("should return an inversed int from a negative int lasting 0")
    void reverseIntNeg()
    {
        assertEquals(-1,StringUtils.reverseInt(-10));
        assertEquals(-98,StringUtils.reverseInt(-89));
        assertEquals(-21,StringUtils.reverseInt(-120));
    }
}