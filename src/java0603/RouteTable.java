package java0603;

import java.util.ArrayList;
import java.util.List;

public class RouteTable {
    private int id;
    private GateWay gateWay;
    private List<Subnet> subnetList = new ArrayList<>();

    public void setGateWay(GateWay gateWay){
        this.gateWay = gateWay;
    }

    public void addSubnet(Subnet subnet) {
        subnetList.add(subnet);
        subnet.setRouteTable(this);
    }

    public void route(int id, String msg) {
        for (Subnet subnet:subnetList) {
            if(subnet.getId() == id){
                gateWay.send(msg);
            }
        }
    }
}
