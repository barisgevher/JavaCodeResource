package dev.lpa;

import java.util.Arrays;

public abstract class Point implements IMappable{

    private String[] location;

    public Point(String... locations) {
        this.location = locations;
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location(){
        return Arrays.toString(location);
    }


}
