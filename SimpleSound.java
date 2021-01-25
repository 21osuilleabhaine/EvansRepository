//This code was created by user d_air on Stack Overflow.
//https://stackoverflow.com/questions/31910434/how-to-generate-audio-in-java

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

    public void makeAChord(int x, int y) {
        Note1 = x;
        Note2 = y;
        this.midChannel[5].noteOn(x, 550);
        this.midChannel[5].noteOn(y, 550);
        //The MIDI channel can be anything from 0 to 15. Anything below or above that will fail to produce a sound.
    }
    public void makeASound(int x) {
        Note1 = x;
        this.midChannel[5].noteOn(x, 550);
    }
    public SimpleSound(int x, int y) {
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
                    makeAChord(x,y);
                }
            });

        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
    }
    public SimpleSound(int x) {
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
                    makeASound(x);
                }
            });

        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}