/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
/*
* KeyEventDemo
*/

//Edited by Evan O'Suilleabhain for the Technology Senior Seminar Project.

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class KeyEventDemo extends JFrame
        implements KeyListener,
        ActionListener
{
    JTextField typingArea;
    static final String newline = System.getProperty("line.separator");
    SimpleSound sound = new SimpleSound();
    static HashMap<Character, Integer> keyboard = new HashMap<Character, Integer>();
    
    public static void main(String[] args) {
        keyboard.put('a', 48);
        keyboard.put('w', 49);
        keyboard.put('s', 50);
        keyboard.put('e', 51);
        keyboard.put('d', 52);
        keyboard.put('f', 53);
        keyboard.put('t', 54);
        keyboard.put('g', 55);
        keyboard.put('y', 56);
        keyboard.put('h', 57);
        keyboard.put('u', 58);
        keyboard.put('j', 59);
        keyboard.put('k', 60);
        keyboard.put('A', 60);
        keyboard.put('W', 61);
        keyboard.put('S', 62);
        keyboard.put('E', 63);
        keyboard.put('D', 64);
        keyboard.put('F', 65);
        keyboard.put('T', 66);
        keyboard.put('G', 67);
        keyboard.put('Y', 68);
        keyboard.put('H', 69);
        keyboard.put('U', 70);
        keyboard.put('J', 71);
        keyboard.put('K', 72);
        /* Use an appropriate Look and Feel */
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        KeyEventDemo frame = new KeyEventDemo("Piano!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Set up the content pane.
        frame.addComponentsToPane();
         
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
     
    private void addComponentsToPane() {
        
        JButton button = new JButton("Clear");
        button.addActionListener(this);
        
        typingArea = new JTextField(20);
        typingArea.addKeyListener(this);
        
        //Uncomment this if you wish to turn off focus
        //traversal.  The focus subsystem consumes
        //focus traversal keys, such as Tab and Shift Tab.
        //If you uncomment the following line of code, this
        //disables focus traversal and the Tab events will
        //become available to the key event listener.
        //typingArea.setFocusTraversalKeysEnabled(false);
        
        
        getContentPane().add(typingArea, BorderLayout.PAGE_START);
        getContentPane().add(button, BorderLayout.PAGE_END);
    }
    
    public KeyEventDemo(String name) {
        super(name);
    }
    
    
    /** Handle the key typed event from the text field. For our purposes, we leave this method empty.*/
    public void keyTyped(KeyEvent e) {}
    
    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'b'){
            sound.midChannel[5].noteOn(55, 0);
        }
        else{sound.midChannel[5].noteOn(keyboard.get(e.getKeyChar()), 550);}        
    }
    
    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        sound.midChannel[5].noteOff(keyboard.get(e.getKeyChar()), 200);
    }
    
    /** Handle the button click. */
    public void actionPerformed(ActionEvent e) {
        //Clear the text components.
        typingArea.setText("");
        
        //Return the focus to the typing area.
        typingArea.requestFocusInWindow();
    }
}