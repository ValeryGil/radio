public class Radio {

    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void increaseRadio() {
        if (currentRadio != 9) {
            currentRadio = currentRadio + 1;
        } else {
            currentRadio = 0;
        }
    }

    public void decreaseRadio() {
        if (currentRadio != 0) {
            currentRadio = currentRadio - 1;
        } else {
            currentRadio = 9;
        }
    }

    public void maxRadio() {currentRadio = 9;}

    public void minRadio() {currentRadio = 0;}

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public void maxVolume() {
        currentVolume = 100;
    }

    public void minVolume() {
        currentVolume = 0;
    }
}
