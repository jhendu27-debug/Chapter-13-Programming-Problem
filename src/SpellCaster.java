public class SpellCaster {

    public void castSpell(String spellName) throws SpellException {

        double result = Math.random();

        if (result < 0.33) {
            System.out.println(spellName + " was successfully cast!");
            System.out.println("The spell worked perfectly.");
        }
        else if (result < 0.66) {
            throw new ManaLeakException(
                    spellName + " caused a mana leak!"
            );
        }
        else {
            throw new FizzleException(
                    spellName + " fizzled out!"
            );
        }
    }
}