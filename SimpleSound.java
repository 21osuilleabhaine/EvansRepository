//This code was created by user d_air on Stack Overflow.
//https://stackoverflow.com/questions/31910434/how-to-generate-audio-in-java
//Edited by Evan O'Suilleabhain for the Technology Seminar Senior Project.

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.swing.*;

public class SimpleSound extends JFrame{
    Synthesizer syn;
    MidiChannel[] midChannel;
    Instrument[] instrument;
    int Note1;
    int Note2;
    int Note3;

    public void makeAChord3(int x, int y, int z) {
        Note1 = x;
        Note2 = y;
        Note3 = z;
        this.midChannel[0].noteOn(x, 550);
        this.midChannel[0].noteOn(y, 550);
        this.midChannel[0].noteOn(z, 550);
    }
    public void makeAChord2(int x, int y) {
        Note1 = x;
        Note2 = y;
        this.midChannel[0].noteOn(x, 550);
        this.midChannel[0].noteOn(y, 550);
    }
    public void makeASound(int x) {
        Note1 = x;
        this.midChannel[5].noteOn(x, 550);
        //The MIDI channel can be anything from 0 to 15. Anything below or above that will fail to produce a sound.
    }
    public void makeAFifth(int x) {
        Note1 = x;
        this.midChannel[5].noteOn(x, 550);
        this.midChannel[5].noteOn(x+4, 550);
        this.midChannel[5].noteOn(x+7, 550);
        this.midChannel[5].noteOn(x+12, 550);
    }
    public SimpleSound() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button1 = new JButton("Try");
        this.add(panel);
        panel.add(button1);
        this.pack();

        try {
            syn = MidiSystem.getSynthesizer();
            syn.open();
            midChannel = syn.getChannels();

            instrument = syn.getDefaultSoundbank().getInstruments();
            syn.loadInstrument(instrument[90]);

            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    makeASound(100);
                }
            });

        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}