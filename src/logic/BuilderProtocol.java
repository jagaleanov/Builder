/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author jgale
 */
public class BuilderProtocol {
    
    private String protocol = "";
    private String address = "";
    private double speed = 0;
    private int slaves = 0;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getSlaves() {
        return slaves;
    }

    public void setSlaves(int slaves) {
        this.slaves = slaves;
    }
    
    public String toString()
    {
        return "El protocolo es" + this.getProtocol() + " ubicadoi en "+this.getAddress()+" con una velocidad de " + this.getSpeed()+" y "+this.getSlaves() + " esclavos.";
    }
    
}
