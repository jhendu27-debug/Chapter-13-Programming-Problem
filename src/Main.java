public class Main {

    public static void main(String[] args) {

        SpellCaster caster = new SpellCaster();

        try {
            caster.castSpell("Fireball");
        }
        catch (ManaLeakException e) {
            System.out.println("Warning: " + e.getMessage());
        }
        catch (FizzleException e) {
            System.out.println("Warning: " + e.getMessage());
        }
        catch (SpellException e) {
            System.out.println("Spell error: " + e.getMessage());
        }
    }
}