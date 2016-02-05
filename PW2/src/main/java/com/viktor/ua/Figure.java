package com.viktor.ua;

import java.util.List;

public class Figure implements iFigure {
    private String type;
    private int aSide;
    private int bSide;
    List<String> mColorSide;

    public void setmColorSide(List<String> mColorSide) {
        this.mColorSide = mColorSide;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }

    public List<String> getmColorSide() {

        return mColorSide;
    }

    public Figure(int a, int b) {
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
        String color;
        for(int i=0;i<mColorSide.size();i++) {
            System.out.println(mColorSide.get(i));
        }
    }



    public void drawFigure() {
        System.out.println("Type : "+getType());
    }
}