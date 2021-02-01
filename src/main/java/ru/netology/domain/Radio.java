package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextRadioStation() {
        int currentStation = this.getCurrentStation();
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    public void prevRadioStation() {
        int currentStation = this.getCurrentStation();
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    public void inputRadioStation(int RadioStation) {
        if (RadioStation > maxStation) {
            return;
        }
        if (RadioStation < minStation) {
            return;
        }
        this.currentStation = RadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

        public void soundVolumePlus () {
            int currentVolume = this.getCurrentVolume();
            if (currentVolume >= maxVolume) {
                return;
            }
            this.currentVolume++;
        }

        public void soundVolumeMinos () {
            int currentVolume = this.getCurrentVolume();
            if (currentVolume <= minVolume) {
                return;
            }
            this.currentVolume--;
        }
    }


//package ru.netology.domain;
//
//public class Radio {
//    private int currentStation;
//    private int stationMin = 0;
//    private int stationMax = 9;
//    private int currentVolume;
//    private int volumeMax = 10;
//    private int volumeMin = 0;
//
//    public int getCurrentStationConsole() {
//        return currentStation;
//    }
//
//    public void setCurrentStationConsole(int currentStation) {
//        if (currentStation >= stationMin && currentStation <= stationMax) {
//            this.currentStation = currentStation;
//        }
//    }
//
//    public void NextRadioStation(int currentStation) {
//        if (currentStation < stationMax) {
////            this.currentStation = stationMin;
////            return;
////        }
//        currentStation++;
////        return;
//    }
//
////    public void PrevRadioStation(int currentStation) {
////        if (currentStation == stationMin) {
////            this.currentStation = stationMax;
////            return;
////        }
////        currentStation--;
////        return;
////    }
////
////
////    public int getCurrentVolumeConsole() {
////        return currentVolume;
////    }
////
////    public void setCurrentVolumeConsole(int currentVolume) {
////        if (currentVolume >= volumeMin && currentVolume <= volumeMax) {
////            this.currentVolume = currentVolume;
////        }
////    }
////
////
////    public void VolumePlus(int currentVolume) {
////        if (currentVolume >= volumeMax) {
////            this.currentVolume = volumeMax;
////            return;
////        }
////        currentVolume++;
////        return;
////    }
////
////    public void VolumeMinos(int currentVolume){
////        if (currentVolume<=volumeMin){
////            this.currentVolume=volumeMin;
////            return;
////        }
////        currentVolume--;
////        return;
//   }
//
//}