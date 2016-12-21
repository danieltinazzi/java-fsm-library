package it.univr.fsm.main;

import it.univr.fsm.machine.Automaton;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by andreaperazzoli on 18/12/16.
 */
public class Test1 {

    @Test
    public void reductionTest1(){

        Automaton a = Automaton.loadAutomata("/Users/andreaperazzoli/Desktop/SPY/java-fsm-library/automata/" + "automaton0002");
        Automaton ahop = a.clone();
        ahop.minimizeHopcroft();
        Automaton amoore = a.clone();
        amoore.minimizeMoore();
        Automaton abrow = a.clone();
        abrow.minimize();


        assertEquals("Hopcroft minimization is not equal Moore's one", ahop, amoore);
        assertEquals("Moore minimization is not equal Brow's one", amoore, abrow);

    }


}
