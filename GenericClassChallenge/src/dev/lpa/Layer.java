package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends  IMappable> {
    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }


   public  void addElements(T... element){
        layerElements.addAll(List.of(element));

    }



    public void renderLayer(){
        for(T element : layerElements){
            element.render();
        }
    }

}
