package it.campe.filo.state.machine;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author filippo.campegiani
 */
public class StateTest {
    
    public StateTest() {
    }

    /**
     * Test of values method, of class State.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        State state = State.FOO;
        
        state = state.execute();
        System.out.println("1 ----> " + state);
        
        state = state.execute();
        System.out.println("2 ----> " + state);
        
        state = state.execute();
        System.out.println("3 ----> " + state);
        
        state = state.execute();
        System.out.println("4 ----> " + state);
        
        state = state.execute();
        System.out.println("5 ----> " + state);
        
        state = state.execute();
        System.out.println("6 ----> " + state);
    }
    
}
