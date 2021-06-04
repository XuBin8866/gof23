package bridge.remotes;

import bridge.devices.Device;

/**
 * @author xubin
 * @date 2021/6/3 17:12
 */
public class AdvancedRemote extends BasicRemote {
	public AdvancedRemote(Device device){
		this.device=device;
	}
	
	public void mute(){
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
