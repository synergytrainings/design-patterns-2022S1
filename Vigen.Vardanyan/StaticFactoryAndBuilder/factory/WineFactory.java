package factory;

import builder.RedWine;
import builder.WhiteWine;
import builder.Wine;

public class WineFactory extends AbstractFactory {
    @Override
    public Wine getWine(EnumWineType wineType) {
        if (wineType == null) {
            return null;
        }
        switch (wineType) {
            case RED:
                return new RedWine();
            case WHITE:
                return new WhiteWine();
            case OTHER:
                break;
        }
        return null;
    }
}
