/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestWord;

import com.mycompany.prjunittestingpractice.Guessing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author lab_services_student
 */
public class TestWord {
    //Test word array has the correct data inside
    //Test the guess method that will have word inside that is true
    //Test the guess method that does not have the word inside that returns false
    private Guessing guessing;
    
    @BeforeEach
    public void setUp() {
        guessing = new Guessing(); //sort of like calling that class before doing the tests
    }
    
    @Test
    public void testWordArrayHasCorrectData() {
        String[] expectedWords = {"cat", "dog", "bird", "mouse"};
        assertArrayEquals(expectedWords, guessing.getWords(),"The word array does not contain the expected data.");
    }
    
    @Test
    public void testGuessMethodWithCorrectWord() {
        assertTrue(guessing.TestWord("cat"), "The guess method should return true for a word that is in the array");
    }
    
    @Test
    public void testGuessMethodWithIncorrectWord(){
        assertFalse (guessing.TestWord("elephant"), "The guess method should return false for a word that is not in teh array");
    }
    
    //more than one way to test a boolean. This is the second way where we dont have to include treu as the expected string
    
}
