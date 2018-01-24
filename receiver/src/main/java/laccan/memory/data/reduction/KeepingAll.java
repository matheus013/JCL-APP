package laccan.memory.data.reduction;

import laccan.devices.MicazMsg;
import laccan.memory.Container;

import java.util.ArrayList;

public class KeepingAll extends Container{
public KeepingAll(){
	this.content = new ArrayList<MicazMsg>();
}
	@Override
	public void add(MicazMsg msg) {
		// TODO Auto-generated method stub
		content.add(msg);
		
	}

}
