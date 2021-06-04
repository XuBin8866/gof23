package bridge;

import bridge.devices.Device;
import bridge.devices.Radio;
import bridge.devices.TV;
import bridge.remotes.AdvancedRemote;
import bridge.remotes.BasicRemote;

/**
 * @author xubin
 * @date 2021/6/3 17:13
 */
public class Demo {
	public static void main(String[] args) {
		testDevice(new TV());
		testDevice(new Radio());
	}
	
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
