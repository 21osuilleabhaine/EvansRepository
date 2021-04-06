//This code was created by user d_air on Stack Overflow.
//https://stackoverflow.com/questions/31910434/how-to-generate-audio-in-java
//Edited by Evan O'Suilleabhain for the Technology Seminar Senior Project.

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.Synthesizer;
import javax.swing.*;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

public class SimpleSound extends JFrame{
    Synthesizer syn;
    MidiChannel[] midChannel;
    Instrument[] instrument;
    int Note;

    public void makeAChord3(int x) {
        Note = x;
        this.midChannel[5].noteOn(x, 550);
        this.midChannel[5].noteOn(x+3, 550);
        this.midChannel[5].noteOn(x+7, 550);
    }
    public void makeAChord2(int x) {
        Note = x;
        this.midChannel[5].noteOn(x, 550);
        this.midChannel[5].noteOn(x+12, 550);
    }
    public void makeASound(int x) {
        Note = x;
        this.midChannel[5].noteOn(x, 550);
        this.midChannel[5].noteOff(x, 200);
        //The MIDI channel can be anything from 0 to 15. Anything below or above that will fail to produce a sound.
    }
    public void makeAFifth(int x) {
        Note = x;
        this.midChannel[5].noteOn(x, 550);
        this.midChannel[5].noteOn(x+4, 550);
        this.midChannel[5].noteOn(x+7, 550);
        this.midChannel[5].noteOn(x+12, 550);
    }
    public SimpleSound() {
        try {
            syn = MidiSystem.getSynthesizer();
            syn.open();
            midChannel = syn.getChannels();

            instrument = syn.getDefaultSoundbank().getInstruments();
            syn.loadInstrument(instrument[90]);
        } catch (MidiUnavailableException ex) {
            ex.printStackTrace();
        }
    }
}