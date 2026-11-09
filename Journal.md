# Journal

# Phase 1 

I created the custom SpellException class and the two subclasses,
ManaLeakException and FizzleException. I also created the SpellCaster
class to randomly determine if a spell succeeds or fails.

I learned that checked exceptions must be handled with try-catch
or declared with throws. Unchecked exceptions do not require
the programmer to handle them.

# Phase 2 

I added an ArrayList containing five different spells and used
a loop to cast each one. I placed the try-catch inside the loop
so one failed spell would not stop the others from running.

If the try-catch was outside the loop, one exception could stop
the remaining spells from being attempted.

# Phase 3 

I added file writing using PrintWriter and FileWriter.
Every spell attempt is now recorded in spell_log.txt,
including successful spells and failed spells.

I used try-with-resources because it automatically closes
the file after writing. This helps prevent resource leaks
and keeps the code simple.

# Phase 4 

I added the readLog method to read the spell history
from spell_log.txt. I also tested reading a file that
does not exist.

I learned that FileNotFoundException is a checked
exception, so Java requires us to handle it or declare it.
I used try-with-resources to close the reader automatically.

# Phase 5 

I tested the completed program and verified that all five
spells were attempted. The program handled successful casts,
mana leaks, and fizzles without crashing.

I also tested the log file and confirmed that it displayed
the casting history. Testing a missing file helped me
understand how Java handles file errors.

This assignment helped me understand checked exceptions,
try-catch blocks, and reading and writing files in Java.