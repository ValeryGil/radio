public class Radio {

    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentRadio = minRadio;
    private int currentVolume;

    public Radio(int minRadio, int maxRadio) {
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;
        this.currentRadio = minRadio;
    }

    public Radio(int size) {
        maxRadio = minRadio + size;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > minRadio && newCurrentRadio < maxRadio) {
        }
        currentRadio = newCurrentRadio;
    }

    public void nextStation() {
        if (currentRadio > 8) {
        }
        currentRadio = 0;
    }

    public void prevStation() {
        if (currentRadio < 1) {
        }
        currentRadio = 9;
    }

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

    public void maxVolume() {
        currentVolume = 100;
    }

    public void minVolume() {
        currentVolume = 0;
    }
}
