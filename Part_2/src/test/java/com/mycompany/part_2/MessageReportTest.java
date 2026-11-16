/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.part_2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class MessageReportTest {
    
    public MessageReportTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of displaySenderRecipient method, of class MessageReport.
     */
    @Test
    public void testDisplaySenderRecipient() {
        System.out.println("displaySenderRecipient");
        MessageReport.displaySenderRecipient();
       
    }

    /**
     * Test of displayLongestMessage method, of class MessageReport.
     */
    @Test
    public void testDisplayLongestMessage() {
        System.out.println("displayLongestMessage");
        MessageReport.displayLongestMessage();
        
    }

    /**
     * Test of searchMessageID method, of class MessageReport.
     */
    @Test
    public void testSearchMessageID() {
        System.out.println("searchMessageID");
        String id = "Enter Message ID: ";
        MessageReport.searchMessageID(id);
        
    }

    /**
     * Test of searchRecipient method, of class MessageReport.
     */
    @Test
    public void testSearchRecipient() {
        System.out.println("searchRecipient");
        String recipient = "Enter Recipient: ";
        MessageReport.searchRecipient(recipient);
     
    }

    /**
     * Test of deleteMessage method, of class MessageReport.
     */
    @Test
    public void testDeleteMessage() {
        System.out.println("deleteMessage");
        String hash = "Enter Message Hash: ";
        MessageReport.deleteMessage(hash);
        
    }

    /**
     * Test of displayReport method, of class MessageReport.
     */
    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        MessageReport.displayReport();
       
    }
    
}
