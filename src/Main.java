import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

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

        System.out.println("\n===== SPELL CASTING HISTORY =====");

        readLog("spell_log.txt");

        System.out.println("\n===== TESTING MISSING FILE =====");

        readLog("missing_grimoire.txt");
    }

    public static void readLog(String fileName) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + fileName);
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}