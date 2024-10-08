package info.victorchu.computer.simulation.circuit.decoder;

import info.victorchu.computer.simulation.circuit.CircuitComponentUtils;
import info.victorchu.computer.simulation.circuit.Potential;
import info.victorchu.computer.simulation.circuit.Potentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author victorchu
 */
class Decoder2Test {
    static Decoder2 decoder = new Decoder2();

    @BeforeEach
    void init() {
        decoder.reset();
    }
    @Test
    public void input00(){
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromTextB("00"));
        Assertions.assertEquals("0001", Potentials.toTextB(result));
    }
    @Test
    public void input01(){
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromTextB("01"));
        Assertions.assertEquals("0010", Potentials.toTextB(result));
    }
    @Test
    public void input10(){
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromTextB("10"));
        Assertions.assertEquals("0100", Potentials.toTextB(result));

    }
    @Test
    public void input11(){
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromTextB("11"));
        Assertions.assertEquals("1000", Potentials.toTextB(result));
    }
}