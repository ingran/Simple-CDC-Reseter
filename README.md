# Simple-CDC-Reseter
Simple CDC Reseter for Leonardo/Micro boards and derivatives

Since the boards do not have a dedicated chip to handle serial communication, it means that the serial port is virtual -- it's a software routine, both on your operating system, and on the board itself. Just as your computer creates an instance of the serial port driver when you plug in any Arduino, the Leonardo/Micro creates a serial instance whenever it runs its bootloader. The board is an instance of USB's *Connected Device Class* (*CDC*) driver.

More info: [https://www.arduino.cc/en/Guide/ArduinoLeonardoMicro](https://www.arduino.cc/en/Guide/ArduinoLeonardoMicro)

## Usage

Simple-CDC_Reseter helps to Reset the board using the following command:

`java -jar Simple-CDC-Reseter.jar *<port_to_reset>*`

Where *<port_to_reset>* is the port to reset.

Linux Example: `java -jar Simple-CDC-Reseter.jar /dev/ttyACM0`

Simple-CDC-Rester can be used with [AVRDUDE](http://www.nongnu.org/avrdude/).

Linux Example:

```
#!/bin/bash
java -jar Simple-CDC-Reseter.jar /dev/ttyACM0
# Waiting for a second before to start execution of the programmer
sleep 1
# AVRDUDE call
avrdude ...
```

**Project ready to open and build with Netbeans**
