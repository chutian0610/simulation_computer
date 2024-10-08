package info.victorchu.computer.simulation.circuit.encoder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import info.victorchu.computer.simulation.circuit.CircuitComponentUtils;
import info.victorchu.computer.simulation.circuit.Potential;
import info.victorchu.computer.simulation.circuit.Potentials;

public class LogicalEncoderTest {
    @Test
    public void input01() {
        LogicalEncoder encoder = new LogicalEncoder(1);
        Potential[] result = CircuitComponentUtils.compute(encoder, Potentials.fromTextB("01"));
        Assertions.assertEquals("0", Potentials.toTextB(result));
    }

    @Test
    public void input10() {
        LogicalEncoder encoder = new LogicalEncoder(1);
        Potential[] result = CircuitComponentUtils.compute(encoder, Potentials.fromTextB("10"));
        Assertions.assertEquals("1", Potentials.toTextB(result));
    }
    @Test
    public void input0001(){
        LogicalEncoder encoder = new LogicalEncoder(2);
        Potential[] result= CircuitComponentUtils.compute(encoder, Potentials.fromTextB("0001"));
        Assertions.assertEquals("00", Potentials.toTextB(result));
    }
    @Test
    public void input0010(){
        LogicalEncoder encoder = new LogicalEncoder(2);
        Potential[] result= CircuitComponentUtils.compute(encoder, Potentials.fromTextB("0010"));
        Assertions.assertEquals("01", Potentials.toTextB(result));
    }
    @Test
    public void input0100(){
        LogicalEncoder encoder = new LogicalEncoder(2);
        Potential[] result= CircuitComponentUtils.compute(encoder, Potentials.fromTextB("0100"));
        Assertions.assertEquals("10", Potentials.toTextB(result));
    }
    @Test
    public void input1000(){
        LogicalEncoder encoder = new LogicalEncoder(2);
        Potential[] result= CircuitComponentUtils.compute(encoder, Potentials.fromTextB("1000"));
        Assertions.assertEquals("11", Potentials.toTextB(result));
    }
}
