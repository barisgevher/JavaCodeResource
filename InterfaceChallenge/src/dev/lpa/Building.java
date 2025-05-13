package dev.lpa;


import java.awt.*;

enum UsageType{ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS}


public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building( String name, UsageType usage) {
        this.usage = usage;
        this.name = name;
    }

    @Override
    public String getLabel() {
       return  name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return  Geometry.POINT;
    }

    @Override
    public String getMarker() {
       return switch (usage){
           case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
           case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
           case RESIDENTIAL -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
           default-> Color.BLACK + " " + PointMarker.CIRCLE;
       };
    }

    @Override
    public String toJSON() {
        return  Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
