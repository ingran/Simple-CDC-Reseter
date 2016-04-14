/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdc.reseter;

import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author RDCH106
 */
public class CDCReseter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("No arguments were given.");
        }
        else {
            if(args.length == 1){
                try {
                    touchForCDCReset(args[0]);
                } catch (SerialException ex) {
                    Logger.getLogger(CDCReseter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
               System.out.println("Try with only one argument."); 
            }
        }
        
        
    }
    
    
    public static boolean touchForCDCReset(String iname) throws SerialException {
    SerialPort serialPort = new SerialPort(iname);
    try {
      serialPort.openPort();
      serialPort.setParams(1200, 8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
      serialPort.setDTR(false);
      serialPort.closePort();
      return true;
    } catch (SerialPortException e) {
      throw new SerialException("Error touching serial port "+iname, e);
    } finally {
      if (serialPort.isOpened()) {
        try {
          serialPort.closePort();
        } catch (SerialPortException e) {
          // noop
        }
      }
    }
  }
    
}
