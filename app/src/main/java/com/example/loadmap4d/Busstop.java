package com.example.loadmap4d;

public class Busstop {
    String BusStopID;
    String Name;
    String PlaceNameFromName;
    Double Lat;
    Double Lon;

    public Busstop(String busStopID, String name, String placeNameFromName, Double lat, Double lon) {
        BusStopID = busStopID;
        Name = name;
        PlaceNameFromName = placeNameFromName;
        Lat = lat;
        Lon = lon;
    }

    public String getBusStopID() {
        return BusStopID;
    }

    public void setBusStopID(String busStopID) {
        BusStopID = busStopID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlaceNameFromName() {
        return PlaceNameFromName;
    }

    public void setPlaceNameFromName(String placeNameFromName) {
        PlaceNameFromName = placeNameFromName;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLon() {
        return Lon;
    }

    public void setLon(Double lon) {
        Lon = lon;
    }
}
