import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PlantBasket implements CanBeUsedToMakeTea {

    private List<CanBeUsedToMakeTea> plantsThatCanBeUsedInTea;

    public PlantBasket(List<CanBeUsedToMakeTea> plantsThatCanBeUsedInTea) {
        Objects.requireNonNull(plantsThatCanBeUsedInTea);
        this.plantsThatCanBeUsedInTea = plantsThatCanBeUsedInTea;
    }

    @Override
    public String getPartUsedInTea() {
        return this.plantsThatCanBeUsedInTea.stream()
                .map(CanBeUsedToMakeTea::getPartUsedInTea)
                .distinct()
                .collect(Collectors.joining(", "));
    }

    @Override
    public String getEffect() {
        return this.plantsThatCanBeUsedInTea.stream()
                .map(CanBeUsedToMakeTea::getEffect)
                .distinct()
                .collect(Collectors.joining(", "));
    }
}
