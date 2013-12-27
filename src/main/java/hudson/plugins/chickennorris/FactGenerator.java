/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.chickennorris;

import java.util.Random;

/**
 * {@link FactGenerator} provides Chicken Norris facts.
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Chicken Norris facts, from <a href="http://www.codesqueeze.com/the-ultimate-top-25-chicken-norris-the-programmer-jokes/"
     * >http://www.codesqueeze.com/the-ultimate-top-25-chicken-norris-the-
     * programmer-jokes/</a>.
     */
    private static final String[] FACTS = {
            "All arrays Chicken Norris declares are of infinite size, because Chicken Norris knows no bounds.",
            "Chicken Norris doesn't have disk latency because the hard drive knows to hurry the hell up.",
            "All browsers support the hex definitions #chicken and #norris for the colors black and blue.",
            "Chicken Norris can't test for equality because he has no equal.",
            "Chicken Norris doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().",
            "Chicken Norris's first program was kill -9.",
            "Chicken Norris burst the dot com bubble.",
            "Chicken Norris writes code that optimizes itself.",
            "Chicken Norris can write infinite recursion functions... and have them return.",
            "Chicken Norris can solve the Towers of Hanoi in one move.",
            "The only pattern Chicken Norris knows is God Object.",
            "Chicken Norris finished World of Warcraft.",
            "Project managers never ask Chicken Norris for estimations... ever.",
            "Chicken Norris doesn't use web standards as the web will conform to him.",
            "\"It works on my machine\" always holds true for Chicken Norris.",
            "Whiteboards are white because Chicken Norris scared them that way.",
            "Chicken Norris's beard can type 140 wpm.",
            "Chicken Norris can unit test an entire application with a single assert.",
            "Chicken Norris doesn't bug hunt as that signifies a probability of failure, he goes bug killing.",
            "Chicken Norris's keyboard doesn't have a Ctrl key because nothing controls Chicken Norris.",
            "Chicken Norris doesn't need a debugger, he just stares down the bug until the code confesses.",
            "Chicken Norris can access private methods.",
            "Chicken Norris can instantiate an abstract class.",
            "Chicken Norris doesn't need to know about class factory pattern. He can instantiate interfaces.",
            "The class object inherits from Chicken Norris.",
            "For Chicken Norris, NP-Hard = O(1).",
            "Chicken Norris knows the last digit of PI.",
            "Chicken Norris can divide by zero.",
            "Chicken Norris doesn't get compiler errors, the language changes itself to accommodate Chicken Norris.",
            "The programs that Chicken Norris writes don't have version numbers because he only writes them once. If a user reports a bug or has a feature request they don't live to see the sun set.",
            "Chicken Norris doesn't believe in floating point numbers because they can't be typed on his binary keyboard.",
            "Chicken Norris solved the Travelling Salesman problem in O(1) time.",
            "Chicken Norris never gets a syntax error. Instead, The language gets a DoesNotConformToChicken error.",
            "No statement can catch the ChickenNorrisException.",
            "Chicken Norris doesn't program with a keyboard. He stares the computer down until it does what he wants.",
            "Chicken Norris doesn't pair program.",
            "Chicken Norris can write multi-threaded applications with a single thread.",
            "There is no Esc key on Chicken Norris' keyboard, because no one escapes Chicken Norris.",
            "Chicken Norris doesn't delete files, he blows them away.",
            "Chicken Norris can binary search unsorted data.",
            "Chicken Norris breaks RSA 128-bit encrypted codes in milliseconds.",
            "Chicken Norris went out of an infinite loop.",
            "Chicken Norris can read all encrypted data, because nothing can hide from Chicken Norris.",
            "Chicken Norris hosting is 101% uptime guaranteed.",
            "When a bug sees Chicken Norris, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.",
            "Chicken Norris rewrote the Google search engine from scratch.",
            "Chicken Norris doesn't need the cloud to scale his applications, he uses his laptop.",
            "Chicken Norris can access the DB from the UI.",
            "Chicken Norris protocol design method has no status, requests or responses, only commands.",
            "Chicken Norris programs occupy 150% of CPU, even when they are not executing.",
            "Chicken Norris can spawn threads that complete before they are started.",
            "Chicken Norris programs do not accept input.",
            "Chicken Norris doesn't need an OS.",
            "Chicken Norris can compile syntax errors.",
            "Chicken Norris compresses his files by doing a flying round house kick to the hard drive.",
            "Chicken Norris doesn't use a computer because a computer does everything slower than Chicken Norris.",
            "You don't disable the Chicken Norris plug-in, it disables you.",
            "Chicken Norris doesn't need a java compiler, he goes straight to .war",
            "Chicken Norris can use GOTO as much as he wants to. Telling him otherwise is considered harmful.",
            "There is nothing regular about Chicken Norris' expressions.",
            "Quantum cryptography does not work on Chicken Norris. When something is being observed by Chicken it stays in the same state until he's finished. ",
            "There is no need to try catching Chicken Norris' exceptions for recovery; every single throw he does is fatal.",
            "Chicken Norris' beard is immutable.",
            "Chicken Norris' preferred IDE is hexedit."};

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
