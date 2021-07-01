package com.rachita.ludo.model;

public class Piece {
    private Colour colour;
    private boolean isAtHome;
    private boolean isOutOfPlay;

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public boolean isAtHome() {
        return isAtHome;
    }

    public void setAtHome(boolean atHome) {
        isAtHome = atHome;
    }

    public boolean isOutOfPlay() {
        return isOutOfPlay;
    }

    public void setOutOfPlay(boolean outOfPlay) {
        isOutOfPlay = outOfPlay;
    }
}
