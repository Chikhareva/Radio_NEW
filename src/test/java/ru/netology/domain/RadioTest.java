package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio orange = new Radio();

    @Test
    public void shouldNextStation() {
        int currentStation = 9;
        orange.setCurrentStation(currentStation);
        orange.nextRadioStation();
        assertEquals(0, orange.getCurrentStation());
    }

    @Test
    public void shouldNextStation1() {
        int currentStation = 5;
        orange.setCurrentStation(currentStation);
        orange.nextRadioStation();
        assertEquals(6, orange.getCurrentStation());
    }

    @Test
    public void shouldNextStation2() {
        int currentStation = 10;
        orange.setCurrentStation(currentStation);
        orange.nextRadioStation();
        assertEquals(1, orange.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        int currentStation = 0;
        orange.setCurrentStation(currentStation);
        orange.prevRadioStation();
        assertEquals(9, orange.getCurrentStation());
    }

    @Test
    public void shouldPrevStation1() {
        int currentStation = -1;
        orange.setCurrentStation(currentStation);
        orange.prevRadioStation();
        assertEquals(9, orange.getCurrentStation());
    }

    @Test
    public void shouldPrevStation2() {
        int currentStation = 5;
        orange.setCurrentStation(currentStation);
        orange.prevRadioStation();
        assertEquals(4, orange.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation() {
        int RadioStation = 7;
        int currentStation = 2;
        orange.setCurrentStation(currentStation);
        orange.inputRadioStation(RadioStation);
        assertEquals(7, orange.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation1() {
        int RadioStation = 10;
        int currentStation = 2;
        orange.setCurrentStation(currentStation);
        orange.inputRadioStation(RadioStation);
        assertEquals(2, orange.getCurrentStation());
    }

    @Test
    public void shouldInputRadioStation2() {
        int RadioStation = -1;
        int currentStation = 2;
        orange.setCurrentStation(currentStation);
        orange.inputRadioStation(RadioStation);
        assertEquals(2, orange.getCurrentStation());
    }

    @Test
    public void shouldSoundVolumePlus() {
        int currentVolume = 10;
        orange.setCurrentVolume(currentVolume);
        orange.soundVolumePlus();
        assertEquals(10, orange.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumePlus1() {
        int currentVolume = 5;
        orange.setCurrentVolume(currentVolume);
        orange.soundVolumePlus();
        assertEquals(6, orange.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumePlus2() {
        int currentVolume = 11;
        orange.setCurrentVolume(currentVolume);
        orange.soundVolumePlus();
        assertEquals(1, orange.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMinos() {
        int currentVolume = 5;
        orange.setCurrentVolume(currentVolume);
        orange.soundVolumeMinos();
        assertEquals(4, orange.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMinos1() {
        int currentVolume = 0;
        orange.setCurrentVolume(currentVolume);
        orange.soundVolumeMinos();
        assertEquals(0, orange.getCurrentVolume());
    }

    @Test
    public void shouldSoundVolumeMinos2() {
        int currentVolume = -1;
            orange.setCurrentVolume(currentVolume);
        orange.soundVolumeMinos();
        assertEquals(0, orange.getCurrentVolume());
    }


}