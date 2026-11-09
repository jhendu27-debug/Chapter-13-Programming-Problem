import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SpellCaster caster = new SpellCaster();

        ArrayList<String> spells = new ArrayList<>();

        spells.add("Fireball");
        spells.add("Ice Blast");
        spells.add("Lightning Bolt");
        spells.add("Shadow Strike");
        spells.add("Healing Light");

        for (String spell : spells) {

            try {
                caster.castSpell(spell);
            }
            catch (ManaLeakException e) {
                System.out.println("Mana Warning: " + e.getMessage());
            }
            catch (FizzleException e) {
                System.out.println("Fizzle Warning: " + e.getMessage());
            }
            catch (SpellException e) {
                System.out.println("General Spell Error: " + e.getMessage());
            }

            System.out.println("----------------------");
        }
    }
}