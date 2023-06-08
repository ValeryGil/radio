public class Radio {

    //private int maxRadio = 9;
    private int minRadio = 0;
    private int currentRadio;
    private int volumeRadio;
    public int maxVolume = 100;
    public int minVolume = 0;
    private int currentVolume;

    public Radio(int volumeRadio) {
        this.volumeRadio = volumeRadio;
    }

    public Radio() { }

    public int getMaxRadio() { return volumeRadio - 1; }

    public int getMinRadio() { return minRadio; }

    public int getCurrentRadio() { return currentRadio; }

    public int getVolumeRadio() { return volumeRadio; }

    public int getMaxVolume() { return maxVolume; }

    public int getMinVolume() { return minVolume; }

    public int getCurrentVolume() { return currentVolume; }

    public void setVolumeRadio(int newVolumeRadio) {
        if (newVolumeRadio < minRadio) {
            return;
        }
        volumeRadio = newVolumeRadio;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < minRadio) {
            return;
        }
        if (newCurrentRadio > volumeRadio - 1) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void increaseRadio() {
        if (currentRadio < volumeRadio - 1) {
            currentRadio = currentRadio + 1;
        }
        if (currentRadio > volumeRadio - 2) {
            currentRadio = minRadio;
        }
    }

    public void decreaseRadio() {
        if (currentRadio > minRadio) {
            currentRadio = currentRadio - 1;
        }
        if (currentRadio < 1) {
            currentRadio = volumeRadio - 1;
        }
    }

    /*public void maxRadio() {currentRadio = maxRadio;}*/

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
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 99) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 1) {
            currentVolume = minVolume;
        }
    }

    public void maxVolume() { currentVolume = maxVolume; }

    public void minVolume() { currentVolume = minVolume; }
}
