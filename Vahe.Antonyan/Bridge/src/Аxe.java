public class Аxe implements Weapon {

    private final Enchantment enchantment;

    public Аxe(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("The axe is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("The axe is swinged.");
        enchantment.applyEffect();
    }

    @Override
    public void unwield() {
        System.out.println("The axe is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}