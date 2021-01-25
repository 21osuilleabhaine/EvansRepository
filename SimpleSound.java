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
    int xNote;
    int yNote;

    public void makeASound(int x, int y) {
        xNote = x;
        yNote = y;
        this.midChannel[5].noteOn(x, y);
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
                    makeASound(x,y);
                }
            });

        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}