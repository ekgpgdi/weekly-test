package java0603;

public class NatGateWay implements GateWay{
    private int id;
    private Subnet subnet;

    @Override
    public void send(String msg) {
        subnet.transfer(msg);
    }

    public NatGateWay(Subnet subnet) {
        this.subnet = subnet;
    }
}
