package com.synisys.patterns.impl;

import com.synisys.patterns.ContemporaryArtPainting;
import com.synisys.patterns.ModernArtPainting;

/**
 * Created by emma.sargsyan
 */
public class Adapter implements ModernArtPainting {

    private ContemporaryArtPainting contemporaryArtPainting;

    public Adapter(ContemporaryArtPainting contemporaryArtPainting) {
        this.contemporaryArtPainting = contemporaryArtPainting;
    }

    @Override
    public String getUniqueAspect() {
        return String.format("Social Implication about %s", contemporaryArtPainting.getSocialImplication());
    }

}