import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testLombok() {
        Radio radio = new Radio();
    }

    @Test
    public void testRadio() {
        Radio radio = new Radio(5);

        radio.setCurrentRadio(5);

        Assertions.assertEquals(0, radio.getMinRadio());
        Assertions.assertEquals(9, radio.getMaxRadio());
        Assertions.assertEquals(5, radio.getCurrentRadio());
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(55, radio.getCurrentVolume());
    }

    @Test
    public void setRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioTrue() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioFalse() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioTrue() {
        Radio radio = new Radio();

        radio.setCurrentRadio(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioFalse() {
        Radio radio = new Radio();

        radio.setCurrentRadio(7);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.maxVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.minVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
