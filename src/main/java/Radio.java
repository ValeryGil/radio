public class Radio {

    private int maxRadio;
    private int minRadio = 0;
    private int currentRadio;
    public int maxVolume = 100;
    public int minVolume = 0;
    private int currentVolume;

    public Radio(int volumeRadio) { this.maxRadio = volumeRadio - 1; }

    public Radio() { this.maxRadio = 9; }

    public int getMaxRadio() { return maxRadio; }

    public int getMinRadio() { return minRadio; }

    public int getCurrentRadio() { return currentRadio; }

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public int getCurrentVolume() { return currentVolume; }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > maxRadio) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void increaseRadio() {
        if (currentRadio != maxRadio) {
            currentRadio = currentRadio + 1;
        } else {
            currentRadio = minRadio;
        }
    }

    public void decreaseRadio() {
        if (currentRadio != minRadio) {
            currentRadio = currentRadio - 1;
        } else {
            currentRadio = maxRadio;
        }
    }

    public void maxRadio() {currentRadio = maxRadio;}

    public void minRadio() {currentRadio = minRadio;}

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public void maxVolume() { currentVolume = maxVolume; }

    public void minVolume() { currentVolume = minVolume; }
}
