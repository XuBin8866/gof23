package bridge.devices;

/**
 * @author xubin
 * @date 2021/6/3 17:02
 */
public interface Device {
	boolean isEnabled();
	
	void enable();
	
	void disable();
	
	int getVolume();
	
	void setVolume(int percent);
	
	int getChannel();
	
	void setChannel(int channel);
	
	void printStatus();
}
