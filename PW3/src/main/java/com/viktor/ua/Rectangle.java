package com.viktor.ua;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class Rectangle implements iFigure {
    private int aSide;
    private int bSide;
    @Autowired
    private iColour colour;
    public Collection<iColour> colours;

    public Rectangle(int a, int b) {
        this.aSide = a;
        this.bSide = b;
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }


    public void figereInfo() {
        System.out.println("Side a " + aSide + " side b " + bSide);
        colour.setColor();
    }


    public iColour getColour() {
        return colour;
    }

    public void setColour(iColour colour) {
        this.colour = colour;
    }

    public Collection<iColour> getColours() {
        return colours;
    }

    public void setColours(Collection<iColour> colours) {
        this.colours = colours;
    }

    public void drawFigure() {
        System.out.println("rectangle");
    }
}