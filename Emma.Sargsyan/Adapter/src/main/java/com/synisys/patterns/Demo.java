package com.synisys.patterns;

import com.synisys.patterns.impl.Actionism;
import com.synisys.patterns.impl.Adapter;
import com.synisys.patterns.impl.Impressionism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emma.sargsyan
 */
public class Demo {

    public static void main(String[] args) {
        ContemporaryArtPainting actionism = new Actionism("Wiener Aktionismu", "Günter Brus", "Endemic violence of humanity");

        List<ModernArtPainting> modernArtPaintings = new ArrayList<>();
        ModernArtPainting impressionism = new Impressionism("Impression, Sunrise", "Claude Monet", "Hazy painting style");
        modernArtPaintings.add(impressionism);

        ModernArtPainting actionismAsModerSrt = new Adapter(actionism);
        modernArtPaintings.add(actionismAsModerSrt);

        modernArtPaintings.forEach(painting ->  System.out.println(painting.getUniqueAspect()));

    }

}