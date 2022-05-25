package factory;

import builder.Wine;

public abstract class AbstractFactory {
    public abstract Wine getWine(EnumWineType wineType);
}
