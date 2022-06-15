public class Demo {
    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword.");
        Sword enchantedSword = new Sword(new IceEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println();

        System.out.println("The valkyrie receives an enchanted axe.");
        Аxe axe = new Аxe(new FireEnchantment());
        axe.wield();
        axe.swing();
        axe.unwield();
    }
}
