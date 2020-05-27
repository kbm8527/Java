package p402;

import java.util.Set;

public class Button {

	OnClickListener listener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	interface OnClickListener{
		void onClick();
	}
}
