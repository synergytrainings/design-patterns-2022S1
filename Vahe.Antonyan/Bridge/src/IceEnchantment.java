public class IceEnchantment implements Enchantment {

    @Override
    public void onActivate() {
        System.out.println("The item glows with ice.");
    }

    @Override
    public void applyEffect() {
        System.out.println("Reduced enemy speed by 20% for short duration.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The item's glow fades.");
    }
}