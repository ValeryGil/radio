public class Radio {

    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > 0 && newCurrentRadio < 9) {
        }
        currentRadio = newCurrentRadio;
    }

    public void increaseRadio() {
        if (currentRadio < 9 && currentRadio >= 0) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio > 9) {
            currentRadio = 0;
        }
        if (currentRadio < 0) {
            currentRadio = 9;
        }
    }

    public void decreaseRadio() {
        if (currentRadio <= 9 && currentRadio > 0) {
            currentRadio = currentRadio - 1;
        }
        if (currentRadio > 9) {
            currentRadio = 0;
        }
        if (currentRadio < 0) {
            currentRadio = 9;
        }
    }

    public void maxRadio() {currentRadio = 9;}

    public void minRadio() {currentRadio = 0;}

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0 && newCurrentVolume < 100) {
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100 && currentVolume >= 0) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= 100 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        if (currentVolume < 0) {
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
