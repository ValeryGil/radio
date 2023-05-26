import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(5);

        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(1);
        radio.increaseRadio();

        int expected = 2;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);
        radio.increaseRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);
        radio.increaseRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(2);
        radio.decreaseRadio();

        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMaxRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(10);
        radio.decreaseRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinRadio() {
        Radio radio = new Radio();

        radio.setCurrentRadio(-1);
        radio.decreaseRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxRadio() {
        Radio radio = new Radio();

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
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        radio.decreaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
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
