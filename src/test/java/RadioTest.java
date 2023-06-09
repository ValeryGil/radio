import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio(11);

        radio.setCurrentRadio(5);

        Assertions.assertEquals(0, radio.getMinRadio());
        Assertions.assertEquals(10, radio.getMaxRadio());
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
        Radio radio = new Radio(10);

        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadio() {
        Radio radio = new Radio(10);

        radio.setCurrentRadio(8);
        radio.increaseRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(9);
        radio.increaseRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadio() {
        Radio radio = new Radio(10);

        radio.setCurrentRadio(9);
        radio.decreaseRadio();

        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinRadio() {
        Radio radio = new Radio(10);

        radio.setCurrentRadio(0);
        radio.decreaseRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxRadio() {
        Radio radio = new Radio(10);

        radio.setCurrentRadio(9);
        radio.maxRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(0);
        radio.minRadio();

        int expected = 0;
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
    public void setVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
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

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

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
