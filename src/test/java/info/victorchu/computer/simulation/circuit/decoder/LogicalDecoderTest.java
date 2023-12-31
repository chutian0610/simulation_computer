package info.victorchu.computer.simulation.circuit.decoder;

import info.victorchu.computer.simulation.circuit.CircuitComponentUtils;
import info.victorchu.computer.simulation.circuit.Potential;
import info.victorchu.computer.simulation.circuit.Potentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author victorchu
 */
class LogicalDecoderTest {

    @Test
    public void input0(){
        LogicalDecoder decoder = new LogicalDecoder(1);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potential.low());
        Assertions.assertArrayEquals(result, Potentials.fromText("01"));
    }
    @Test
    public void input1(){
        LogicalDecoder decoder = new LogicalDecoder(1);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potential.high());
        Assertions.assertArrayEquals(result, Potentials.fromText("10"));
    }

    @Test
    public void input00(){
        LogicalDecoder decoder = new LogicalDecoder(2);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("00"));
        Assertions.assertEquals("0001", Potentials.toText(result));
    }
    @Test
    public void input01(){
        LogicalDecoder decoder = new LogicalDecoder(2);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("01"));
        Assertions.assertEquals("0010", Potentials.toText(result));
    }
    @Test
    public void input10(){
        LogicalDecoder decoder = new LogicalDecoder(2);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("10"));
        Assertions.assertEquals("0100", Potentials.toText(result));

    }
    @Test
    public void input11(){
        LogicalDecoder decoder = new LogicalDecoder(2);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("11"));
        Assertions.assertEquals("1000", Potentials.toText(result));
    }
    @Test
    public void input000(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("000"));
        Assertions.assertEquals("0000 0001", Potentials.toText(result,4));
    }
    @Test
    public void input001(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("001"));
        Assertions.assertEquals("0000 0010", Potentials.toText(result,4));
    }
    @Test
    public void input010(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("010"));
        Assertions.assertEquals("0000 0100", Potentials.toText(result,4));
    }
    @Test
    public void input011(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("011"));
        Assertions.assertEquals("0000 1000", Potentials.toText(result,4));
    }
    @Test
    public void input100(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("100"));
        Assertions.assertEquals("0001 0000", Potentials.toText(result,4));
    }
    @Test
    public void input101(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("101"));
        Assertions.assertEquals("0010 0000", Potentials.toText(result,4));
    }
    @Test
    public void input110(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("110"));
        Assertions.assertEquals("0100 0000", Potentials.toText(result,4));
    }
    @Test
    public void input111(){
        LogicalDecoder decoder = new LogicalDecoder(3);
        Potential[] result= CircuitComponentUtils.compute(decoder, Potentials.fromText("111"));
        Assertions.assertEquals("1000 0000", Potentials.toText(result,4));
    }
}