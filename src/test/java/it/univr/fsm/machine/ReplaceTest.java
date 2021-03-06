package it.univr.fsm.machine;

import it.univr.fsm.machine.Automaton;
import it.univr.fsm.machine.State;
import it.univr.fsm.machine.Transition;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;

public class ReplaceTest {

    @Test
    public void replaceTest001(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("arco"));
        set.add(Automaton.makeAutomaton("marco"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("co"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("chi"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("marchi"));
        r.add(Automaton.makeAutomaton("archi"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest002(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("contento"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("contento"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("arrabbiato"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("panda"));
        r.add(Automaton.makeAutomaton("arrabbiato"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest003(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("bubble"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("bb"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("nd"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("bundle"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);


    }

    @Test
    public void replaceTest004(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("bubble"));
        set.add(Automaton.makeAutomaton("bubbles"));
        set.add(Automaton.makeAutomaton("bubbons"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("bb"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("a"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("buale"));
        r.add(Automaton.makeAutomaton("buales"));
        r.add(Automaton.makeAutomaton("buaons"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest005(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("marco"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("rco"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("lto"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("malto"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest006(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("paguro"));
        set.add(Automaton.makeAutomaton("koala"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("pan"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("lan"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("landa"));
        r.add(Automaton.makeAutomaton("paguro"));
        r.add(Automaton.makeAutomaton("koala"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest007(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("paguro"));
        set.add(Automaton.makeAutomaton("koala"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("pan"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("lan"));
        replace.add(Automaton.makeAutomaton("man"));
        replace.add(Automaton.makeAutomaton("vi"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("landa"));
        r.add(Automaton.makeAutomaton("manda"));
        r.add(Automaton.makeAutomaton("vida"));
        r.add(Automaton.makeAutomaton("paguro"));
        r.add(Automaton.makeAutomaton("koala"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest008(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("paguro"));
        set.add(Automaton.makeAutomaton("koala"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("cc"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("lan"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("panda"));
        r.add(Automaton.makeAutomaton("paguro"));
        r.add(Automaton.makeAutomaton("koala"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest009(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("pa"));
        search.add(Automaton.makeAutomaton("da"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("s"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("snda"));
        r.add(Automaton.makeAutomaton("pans"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest010(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("pa"));
        search.add(Automaton.makeAutomaton("da"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("s"));
        replace.add(Automaton.makeAutomaton("ca"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("snda"));
        r.add(Automaton.makeAutomaton("pans"));
        r.add(Automaton.makeAutomaton("canda"));
        r.add(Automaton.makeAutomaton("panca"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest011(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("s"));
        replace.add(Automaton.makeAutomaton("ti"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("psnda"));
        r.add(Automaton.makeAutomaton("ptinda"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest012(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("paguro"));
        set.add(Automaton.makeAutomaton("koala"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton(""));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("un"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("unpanda"));
        r.add(Automaton.makeAutomaton("unpaguro"));
        r.add(Automaton.makeAutomaton("unkoala"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest013(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("lotus"));
        set.add(Automaton.makeAutomaton("poppy"));
        set.add(Automaton.makeAutomaton("lily"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("l"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("waterl"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("waterlotus"));
        r.add(Automaton.makeAutomaton("poppy"));
        r.add(Automaton.makeAutomaton("waterlily"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest014(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("poppy"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("poppy"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("fuffy"));
        replace.add(Automaton.makeAutomaton("totty"));
        replace.add(Automaton.makeAutomaton("mommy"));
        Automaton replaceWith = Automaton.union(replace);


        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(resultR, replaceWith);

    }

    @Test
    public void replaceTest015(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("aaa"));
        set.add(Automaton.makeAutomaton("bbb"));
        set.add(Automaton.makeAutomaton("ccc"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        search.add(Automaton.makeAutomaton("b"));
        search.add(Automaton.makeAutomaton("c"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("d"));
        replace.add(Automaton.makeAutomaton("e"));
        replace.add(Automaton.makeAutomaton("f"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("daa"));
        r.add(Automaton.makeAutomaton("eaa"));
        r.add(Automaton.makeAutomaton("faa"));
        r.add(Automaton.makeAutomaton("aaa"));
        r.add(Automaton.makeAutomaton("bbb"));
        r.add(Automaton.makeAutomaton("ccc"));
        r.add(Automaton.makeAutomaton("dbb"));
        r.add(Automaton.makeAutomaton("ebb"));
        r.add(Automaton.makeAutomaton("fbb"));
        r.add(Automaton.makeAutomaton("dcc"));
        r.add(Automaton.makeAutomaton("ecc"));
        r.add(Automaton.makeAutomaton("fcc"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest016(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("eggsandham"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton(""));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("green"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("greeneggsandham"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest017(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("paguro"));
        set.add(Automaton.makeAutomaton("koala"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("i"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("pinda"));
        r.add(Automaton.makeAutomaton("piguro"));
        r.add(Automaton.makeAutomaton("koila"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest018(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        set.add(Automaton.makeAutomaton("paguro"));
        set.add(Automaton.makeAutomaton("koala"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton(""));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("lan"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("lanpanda"));
        r.add(Automaton.makeAutomaton("lanpaguro"));
        r.add(Automaton.makeAutomaton("lankoala"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest019(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("babbabam"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("bam"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("no"));
        replace.add(Automaton.makeAutomaton("ni"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("babbano"));
        r.add(Automaton.makeAutomaton("babbani"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest020(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("cal"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("l"));
        Automaton searchFor = Automaton.union(search);

        //ciclo --> , epsilon, s, ss, sss, ssss....
        HashSet<State> states = new HashSet<>();
        HashSet<Transition> delta = new HashSet<>();
        State q0 = new State("q0", true, true);
        states.add(q0);
        delta.add(new Transition(q0, q0, "s"));
        Automaton replaceWith = new Automaton(delta, states);

        //ciclo --> ca, cas, cass, casss...
        HashSet<State> statesR = new HashSet<>();
        HashSet<Transition> deltaR = new HashSet<>();
        State q00 = new State("q0", true, false);
        State q1 = new State("q1", false, false);
        State q2 = new State("q2", false, true);
        statesR.add(q00);
        statesR.add(q1);
        statesR.add(q2);
        deltaR.add(new Transition(q00, q1, "c"));
        deltaR.add(new Transition(q1, q2, "a"));
        deltaR.add(new Transition(q2, q2, "s"));
        Automaton result = new Automaton(deltaR, statesR);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest021(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("aaa"));
        set.add(Automaton.makeAutomaton("bbb"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        search.add(Automaton.makeAutomaton("b"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("d"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("aaa"));
        r.add(Automaton.makeAutomaton("bbb"));
        r.add(Automaton.makeAutomaton("daa"));
        r.add(Automaton.makeAutomaton("dbb"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        //visualizeAutomaton.show(resultR, "result");
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest022(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("panda"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton(""));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("blue "));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("blue panda"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        //visualizeAutomaton.show(resultR, "result");
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest023(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("aaa"));
        set.add(Automaton.makeAutomaton("bbb"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("c"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("d"));
        Automaton replaceWith = Automaton.union(replace);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(resultR, a);

    }

    @Test
    public void replaceTest024(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("calm"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        Automaton searchFor = Automaton.union(search);

        //ciclo --> epsilon, a, aa, aaa, aaaa....
        HashSet<State> states = new HashSet<>();
        HashSet<Transition> delta = new HashSet<>();
        State q0 = new State("q0", true, true);
        states.add(q0);
        delta.add(new Transition(q0, q0, "a"));
        Automaton replaceWith = new Automaton(delta, states);

        //ciclo --> clm, calm, caalm, caaalm, caaaalm...
        HashSet<State> statesR = new HashSet<>();
        HashSet<Transition> deltaR = new HashSet<>();
        State q00 = new State("q0", true, false);
        State q1 = new State("q1", false, false);
        State q2 = new State("q2", false, false);
        State q3 = new State("q3", false, true);
        statesR.add(q00);
        statesR.add(q1);
        statesR.add(q2);
        statesR.add(q3);
        deltaR.add(new Transition(q00, q1, "c"));
        deltaR.add(new Transition(q1, q1, "a"));
        deltaR.add(new Transition(q1, q2, "l"));
        deltaR.add(new Transition(q2, q3, "m"));
        Automaton result = new Automaton(deltaR, statesR);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest025(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("calm"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        Automaton searchFor = Automaton.union(search);

        //ciclo --> a, aa, aaa, aaaa....
        HashSet<State> states = new HashSet<>();
        HashSet<Transition> delta = new HashSet<>();
        State q00 = new State("q0", true, false);
        State q01 = new State("q1", false, true);
        states.add(q00);
        states.add(q01);
        delta.add(new Transition(q00, q01, "a"));
        delta.add(new Transition(q01, q01, "a"));
        Automaton replaceWith = new Automaton(delta, states);

        //ciclo --> clm, calm, caalm, caaalm, caaaalm...
        HashSet<State> statesR = new HashSet<>();
        HashSet<Transition> deltaR = new HashSet<>();
        State q0 = new State("q0", true, false);
        State q1 = new State("q1", false, false);
        State q2 = new State("q2", false, false);
        State q3 = new State("q3", false, false);
        State q4 = new State("q4", false, true);
        statesR.add(q0);
        statesR.add(q1);
        statesR.add(q2);
        statesR.add(q3);
        statesR.add(q4);
        deltaR.add(new Transition(q0, q1, "c"));
        deltaR.add(new Transition(q1, q2, "a"));
        deltaR.add(new Transition(q2, q2, "a"));
        deltaR.add(new Transition(q2, q3, "l"));
        deltaR.add(new Transition(q3, q4, "m"));
        Automaton result = new Automaton(deltaR, statesR);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest026(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("aaa"));
        set.add(Automaton.makeAutomaton("bbb"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("c"));
        search.add(Automaton.makeAutomaton("b"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("d"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("aaa"));
        r.add(Automaton.makeAutomaton("bbb"));
        r.add(Automaton.makeAutomaton("dbb"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest027(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("inkjet"));
        set.add(Automaton.makeAutomaton("jetbrain"));
        set.add(Automaton.makeAutomaton("jetcola"));
        set.add(Automaton.makeAutomaton("painjet"));
        set.add(Automaton.makeAutomaton("andyjet"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("jet"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("bob"));
        replace.add(Automaton.makeAutomaton("toby"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("inkbob"));
        r.add(Automaton.makeAutomaton("bobbrain"));
        r.add(Automaton.makeAutomaton("bobcola"));
        r.add(Automaton.makeAutomaton("painbob"));
        r.add(Automaton.makeAutomaton("andybob"));
        r.add(Automaton.makeAutomaton("inktoby"));
        r.add(Automaton.makeAutomaton("tobybrain"));
        r.add(Automaton.makeAutomaton("tobycola"));
        r.add(Automaton.makeAutomaton("paintoby"));
        r.add(Automaton.makeAutomaton("andytoby"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest028(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("alphabravocharlie"));
        set.add(Automaton.makeAutomaton("charliebravoalpha"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("charlie"));
        search.add(Automaton.makeAutomaton("bravo"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton(""));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("bravoalpha"));
        r.add(Automaton.makeAutomaton("charliealpha"));
        r.add(Automaton.makeAutomaton("alphabravo"));
        r.add(Automaton.makeAutomaton("alphacharlie"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest029(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("alpha"));
        Automaton a = Automaton.union(set);

        HashSet<State> states = new HashSet<>();
        HashSet<Transition> delta = new HashSet<>();
        State q00 = new State("q0", true, false);
        State q01 = new State("q1", false, true);
        states.add(q00);
        states.add(q01);
        delta.add(new Transition(q00, q01, "a"));
        delta.add(new Transition(q01, q01, "a"));
        Automaton searchFor = new Automaton(delta, states);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton(""));
        Automaton replaceWith = Automaton.union(replace);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(resultR, Automaton.makeTopLanguage());

    }

    @Test
    public void replaceTest030(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("charliebravoalpha"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("charlie"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton(""));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("bravoalpha"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest031(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("charliebravoalpha"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("charlie"));
        search.add(Automaton.makeAutomaton("bravo"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton(""));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("bravoalpha"));
        r.add(Automaton.makeAutomaton("charliealpha"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest032(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("charliebravoalpha"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton(""));
        search.add(Automaton.makeAutomaton("bravo"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("delta"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("deltacharliebravoalpha"));
        r.add(Automaton.makeAutomaton("charliedeltaalpha"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(result, resultR);

    }


    @Test
    public void replaceTest033(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("pandapanda"));
        set.add(Automaton.makeAutomaton("pande"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("pan"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("on"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("ondapanda"));
        r.add(Automaton.makeAutomaton("onde"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }

    @Test
    public void replaceTest034(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("pearl"));
        set.add(Automaton.makeAutomaton("garnet"));
        Automaton a = Automaton.union(set);
        //visualizeAutomaton.show(a, "a");

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton(""));
        search.add(Automaton.makeAutomaton("ar"));
        search.add(Automaton.makeAutomaton("rose"));
        search.add(Automaton.makeAutomaton("et"));
        Automaton searchFor = Automaton.union(search);
        //visualizeAutomaton.show(searchFor, "searchFor2");

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("a"));
        replace.add(Automaton.makeAutomaton("en"));
        Automaton replaceWith = Automaton.union(replace);
        //visualizeAutomaton.show(replaceWith, "replacewith");


        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("pearl"));
        r.add(Automaton.makeAutomaton("garnet"));
        r.add(Automaton.makeAutomaton("apearl"));
        r.add(Automaton.makeAutomaton("agarnet"));
        r.add(Automaton.makeAutomaton("enpearl"));
        r.add(Automaton.makeAutomaton("engarnet"));
        r.add(Automaton.makeAutomaton("peal"));
        r.add(Automaton.makeAutomaton("ganet"));
        r.add(Automaton.makeAutomaton("peenl"));
        r.add(Automaton.makeAutomaton("gennet"));
        r.add(Automaton.makeAutomaton("garna"));
        r.add(Automaton.makeAutomaton("garnen"));

        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);

        Assert.assertEquals(result, resultR);
    }

    @Test
    public void replaceTest035(){

        HashSet<Automaton> set = new HashSet<>();
        set.add(Automaton.makeAutomaton("abc"));
        set.add(Automaton.makeAutomaton("def"));
        Automaton a = Automaton.union(set);

        HashSet<Automaton> search = new HashSet<>();
        search.add(Automaton.makeAutomaton("a"));
        search.add(Automaton.makeAutomaton("c"));
        search.add(Automaton.makeAutomaton("st"));
        search.add(Automaton.makeAutomaton("ef"));
        Automaton searchFor = Automaton.union(search);

        HashSet<Automaton> replace = new HashSet<>();
        replace.add(Automaton.makeAutomaton("g"));
        replace.add(Automaton.makeAutomaton("hi"));
        Automaton replaceWith = Automaton.union(replace);

        HashSet<Automaton> r = new HashSet<>();
        r.add(Automaton.makeAutomaton("abg"));
        r.add(Automaton.makeAutomaton("abhi"));
        r.add(Automaton.makeAutomaton("gbc"));
        r.add(Automaton.makeAutomaton("hibc"));
        r.add(Automaton.makeAutomaton("abc"));
        r.add(Automaton.makeAutomaton("def"));
        r.add(Automaton.makeAutomaton("dg"));
        r.add(Automaton.makeAutomaton("dhi"));
        Automaton result = Automaton.union(r);

        Automaton resultR = Automaton.replace(a, searchFor, replaceWith);
        Assert.assertEquals(result, resultR);

    }



}
