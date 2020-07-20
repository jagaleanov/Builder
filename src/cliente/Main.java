package cliente;

import javax.swing.JOptionPane;
import logic.BuilderProtocol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jgale
 */
public class Main {

    public static void main(String[] args) {
        
        BuilderProtocol newProtocol = new BuilderProtocol();
        

        Object[] selectionValues = {"SPI", "I2C", "RS485"};

        try {
            String protocolSelection = (String) JOptionPane.showInputDialog(
                    null,
                    "Qué protocolo desea usar?",
                    "Builder de protocolos",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    selectionValues,
                    "SPI");

            switch (protocolSelection) {
                case "SPI":
                    newProtocol.setProtocol(protocolSelection);
                    newProtocol.setAddress("spi_address");
                    newProtocol.setSpeed(0.2);
                    newProtocol.setSlaves(4);
                    break;
                case "I2C":
                    newProtocol.setProtocol(protocolSelection);
                    newProtocol.setAddress("i2c_address");
                    newProtocol.setSpeed(5.8);
                    newProtocol.setSlaves(12);
                    break;
                case "RS485":
                    newProtocol.setProtocol(protocolSelection);
                    newProtocol.setAddress("spi_address");
                    newProtocol.setSpeed(3.4);
                    newProtocol.setSlaves(1);
                    break;
                default:
            }

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Se ha creado una nueva instancia del protocolo " + newProtocol.getProtocol()+ "<br>"
                    + "Dirección: " + newProtocol.getAddress()+ "<br>"
                    + "Velocidad: " + newProtocol.getSpeed()+ "<br>"
                    + "Esclavos: " + newProtocol.getSlaves()+ "<br>"
                    + "</html>"
            );

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se ha recibido ningun dato.");
        }
    }
}
