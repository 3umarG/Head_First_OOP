package chapter1.rick_guitar;

import chapter1.rick_guitar.enums.Builder;
import chapter1.rick_guitar.enums.Type;
import chapter1.rick_guitar.enums.Wood;

import java.util.LinkedList;
import java.util.List;


// TODO : Encapsulation
// TODO : Encapsulation is breaking your application into logical parts that have a clear boundary that allows an object to hide its data and methods from other objects.
// TODO : We Encapsulate all Special Information that not unique to Special Class
// TODO : We used this class when search, because client when try to search he must know these properties ..
// TODO : He doesn't need to know any thing about Serial Number OR Price because these are unique for every Guitar

public class GuitarSpecial {

    private final Builder builder;
    private final String model;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;

    public GuitarSpecial(Builder builder,
                         String model,
                         Type type,
                         Wood backWood,
                         Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }


    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }


    public boolean isMatch(GuitarSpecial special) {


        // Ignore serial number since that’s unique
        // Ignore price since that’s unique

        // The Builder of your search guitar

        if (!this.builder.equals(special.builder))
            return false;

        if (!this.model.equals("") && !this.model.equals(special.model))
            return false;

        if (!this.type.equals(special.type))
            return false;


        if (!this.backWood.equals(special.backWood))
            return false;


        if (!this.topWood.equals(special.topWood))
            return false;


        return true;
    }
}
