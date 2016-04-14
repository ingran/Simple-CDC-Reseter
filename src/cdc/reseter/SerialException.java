/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdc.reseter;

/**
 *
 * @author RDCH106
 */

import java.io.IOException;

@SuppressWarnings("serial")
public class SerialException extends IOException {
  public SerialException() {
    super();
  }

  public SerialException(String message) {
    super(message);
  }
  
  public SerialException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public SerialException(Throwable cause) {
    super(cause);
  }
}
