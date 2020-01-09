package it.univr.fsm.machine;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;

public class SubstringTest2 {

	@Test
	public void substringTest1() {
		Automaton a = Automaton.makeAutomaton("test");
		assertTrue(Automaton.substring(a, 1, 3).equals(Automaton.makeAutomaton("es")));
	}
	
	@Test
	public void substringTest2() {
		Automaton a = Automaton.makeAutomaton("test");
		assertTrue(Automaton.substring(a, 3, 1).equals(Automaton.makeAutomaton("es")));
	}
	
	@Test
	public void substringTest3() {
		Automaton a = Automaton.makeAutomaton("test");
		assertTrue(Automaton.substring(a, -10, 10).equals(a));
	}
	
	@Test
	public void substringTest4() {
		Automaton a = Automaton.makeAutomaton("test");
		assertTrue(Automaton.substring(a, 10, -10).equals(a));
	}
	
	@Test
	public void substringTest5() {
		Automaton a = Automaton.makeAutomaton("test");
		assertTrue(Automaton.substring(a, 10, 11).equals(Automaton.makeEmptyString()));
	}
	
	@Test
	public void substringTest6() {
		Automaton a = Automaton.makeAutomaton("test");
		Automaton b = Automaton.makeEmptyString();
		Automaton d = Automaton.union(a, b);
		
		Automaton expectedResult = Automaton.union(
				Automaton.makeAutomaton("es"),
				Automaton.makeEmptyString());
		
		assertTrue(Automaton.substring(d, 1, 3).equals(expectedResult));
	}
	
	@Test
	public void substringTest7() {
		Automaton a = Automaton.makeAutomaton("test");
		Automaton b = Automaton.makeAutomaton("java");
		
		Automaton d = Automaton.union(a, b);
		Automaton expectedResult = Automaton.union(
				Automaton.makeAutomaton("te"),
				Automaton.makeAutomaton("ja"));
		
		assertTrue(Automaton.substring(d, 0, 2).equals(expectedResult));
	}
	
	@Test
	public void substringTest8() {
		Automaton a = Automaton.makeAutomaton("java");
		Automaton b = Automaton.star(a);
		
		HashSet<Automaton> set = new HashSet<>();
		set.add(Automaton.makeEmptyString());
		set.add(Automaton.makeAutomaton("java"));
		set.add(Automaton.makeAutomaton("javajava"));
		set.add(Automaton.makeAutomaton("javajavaja"));
		
		Automaton expectedResult = Automaton.union(set);
		
		assertTrue(Automaton.substring(b, 0, 10).equals(expectedResult));
	}
	
	@Test
	public void substringTest9() {
		Automaton a = Automaton.makeAutomaton("test");
		Automaton b = Automaton.makeAutomaton("java");
		
		Automaton d = Automaton.union(a, b);
		Automaton e = Automaton.star(d);
		
		HashSet<Automaton> set = new HashSet<>();
		set.add(Automaton.makeEmptyString());
		set.add(Automaton.makeAutomaton("test"));
		set.add(Automaton.makeAutomaton("java"));
		set.add(Automaton.makeAutomaton("testtest"));
		set.add(Automaton.makeAutomaton("testjava"));
		set.add(Automaton.makeAutomaton("javatest"));
		set.add(Automaton.makeAutomaton("javajava"));
		
		Automaton expectedResult = Automaton.union(set);
		
		assertTrue(Automaton.substring(e, 0, 8).equals(expectedResult));
	}
	
	@Test
	public void substringTest10() {
		Automaton a = Automaton.makeAutomaton("abc");
		Automaton b = Automaton.star(a);
		Automaton c = Automaton.makeAutomaton("!");
		Automaton d = Automaton.concat(b, c);
		
		HashSet<Automaton> set = new HashSet<>();
		set.add(Automaton.makeAutomaton("!"));
		set.add(Automaton.makeAutomaton("abc!"));
		set.add(Automaton.makeAutomaton("abcabc!"));
		set.add(Automaton.makeAutomaton("abcabcab"));
		
		Automaton expectedResult = Automaton.union(set);
		
		assertTrue(Automaton.substring(d, 0, 8).equals(expectedResult));
	}
	
	@Test
	public void substringTest11() {
		HashSet<State> states = new HashSet<State>();
		HashSet<Transition> delta = new HashSet<Transition>();
		
		State q0 = new State("q0", true, false);
		State q1 = new State("q1", false, true);
		
		states.add(q0);
		states.add(q1);
		
		delta.add(new Transition(q0, q0, "a"));
		delta.add(new Transition(q0, q1, "b"));
		
		Automaton a = new Automaton(delta, states);
		
		HashSet<Automaton> set = new HashSet<>();
		set.add(Automaton.makeEmptyString());
		set.add(Automaton.makeAutomaton("b"));
		set.add(Automaton.makeAutomaton("ab"));
		set.add(Automaton.makeAutomaton("aab"));
		set.add(Automaton.makeAutomaton("aaab"));
		set.add(Automaton.makeAutomaton("aaaa"));
		
		Automaton expectedResult = Automaton.union(set);
		
		assertTrue(Automaton.substring(a, 10, 14).equals(expectedResult));
	}
	
	@Test
	public void substringTest12() {
		HashSet<State> states = new HashSet<State>();
		HashSet<Transition> delta = new HashSet<Transition>();
		
		State q0 = new State("q0", true, false);
		State q1 = new State("q1", false, false);
		State q2 = new State("q2", false, false);
		State q3 = new State("q3", false, false);
		State q4 = new State("q4", false, true);
		
		states.add(q0);
		states.add(q1);
		states.add(q2);
		states.add(q3);
		states.add(q4);
		
		delta.add(new Transition(q0, q1, "t"));
		delta.add(new Transition(q1, q2, "e"));
		delta.add(new Transition(q2, q3, "s"));
		delta.add(new Transition(q3, q4, "t")); //"test"
		
		State q = new State("q", false, false);
		states.add(q);
		delta.add(new Transition(q1, q, "o"));
		delta.add(new Transition(q, q2, "a")); //"toast"
		
		Automaton a = new Automaton(delta, states);
		Automaton b = Automaton.star(a);
		
		HashSet<Automaton> set = new HashSet<>();
		set.add(Automaton.makeEmptyString());
		set.add(Automaton.makeAutomaton("test"));
		set.add(Automaton.makeAutomaton("toast"));
		
		set.add(Automaton.makeAutomaton("testtest"));
		set.add(Automaton.makeAutomaton("testtestte"));
		set.add(Automaton.makeAutomaton("testtestto"));
		set.add(Automaton.makeAutomaton("testtoast"));
		set.add(Automaton.makeAutomaton("testtoastt"));
		
		set.add(Automaton.makeAutomaton("toasttest"));
		set.add(Automaton.makeAutomaton("toasttestt"));
		set.add(Automaton.makeAutomaton("toasttoast"));
		
		Automaton expectedResult = Automaton.union(set);
		
		assertTrue(Automaton.substring(b, 0, 10).equals(expectedResult));
	}
}
