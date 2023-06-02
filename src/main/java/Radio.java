public class Radio {

    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentRadio;
    public int maxVolume = 100;
    public int minVolume = 0;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int currentRadio) {
        this.currentRadio = currentRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    /*public Radio(int currentRadio) {
        this.currentRadio = currentRadio;
    }

    public Radio() { }

    public int getMaxRadio() { return maxRadio; }

    public int getMinRadio() { return minRadio; }

    public int getCurrentRadio() { return currentRadio; }

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public int getCurrentVolume() { return currentVolume; }*/

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > minRadio && newCurrentRadio < maxRadio) {
        }
        currentRadio = newCurrentRadio;
    }

    public void nextStation() {
        if (currentRadio > 8) {
        }
        currentRadio = minRadio;
    }

    public void prevStation() {
        if (currentRadio < 1) {
        }
        currentRadio = maxRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > minVolume && newCurrentVolume < maxVolume) {
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume && currentVolume >= minVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
    }

    public void maxVolume() {
        currentVolume = maxVolume;
    }

    public void minVolume() {
        currentVolume = minVolume;
    }
}
