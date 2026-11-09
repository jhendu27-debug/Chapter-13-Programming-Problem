import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpellCaster {

    public void castSpell(String spellName) throws SpellException {

        double result = Math.random();

        if (result < 0.33) {

            System.out.println(spellName + " was successfully cast!");
            System.out.println("The spell worked perfectly.");

            logAttempt(spellName, "Successful");

        }
        else if (result < 0.66) {

            logAttempt(spellName, "ManaLeakException");

            throw new ManaLeakException(
                    spellName + " caused a mana leak!"
            );

        }
        else {

            logAttempt(spellName, "FizzleException");

            throw new FizzleException(
                    spellName + " fizzled out!"
            );
        }
    }

    private void logAttempt(String spellName, String result) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter("spell_log.txt", true))) {

            writer.println(spellName + " - " + result);

        }
        catch (IOException e) {
            System.out.println("Unable to write to spell log: "
                    + e.getMessage());
        }
    }
}