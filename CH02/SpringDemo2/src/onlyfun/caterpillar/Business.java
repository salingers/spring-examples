package onlyfun.caterpillar;

public class Business {
	private IDeviceWriter writer;
	
	public void setDeviceWriter(IDeviceWriter writer) {
		this.writer = writer;
	}
	
	public IDeviceWriter getDeviceWriter() {
		return writer;
	}
	
	public void save() {
		if(writer == null) {
			throw new RuntimeException("DeviceWriter needed...");
		}
		writer.saveToDevice();
	}
}
