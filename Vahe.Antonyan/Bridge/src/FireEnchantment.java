public class FireEnchantment implements Enchantment {

    @Override
    public void onActivate() {
        System.out.println("The item glows with fire.");
    }

    @Override
    public void applyEffect() {
        System.out.println("Burning effect is applied for short duration.");
    }

    @Override
    public void onDeactivate() {
        System.out.println("The item's glow fades.");
    }
}