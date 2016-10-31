package hackathon;
import org.jibble.pircbot.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class apicalls extends PircBot{
	
	public apicalls(){
		this.setName("REDACTED");
	}
	public void onMessage(String channel, String sender, String login, String hostname, String message){
		if(message.equalsIgnoreCase("hotter")){
			try {
			 Robot nestingbird = new Robot();
			 nestingbird.delay(1500);
			 nestingbird.keyPress(KeyEvent.VK_U);
			 nestingbird.delay(100);
			 nestingbird.keyRelease(KeyEvent.VK_U);
	 		} catch(Exception ex){
				ex.printStackTrace();
			}
		}
		else if(message.equalsIgnoreCase("colder")){
			try {
				 Robot nestingbird = new Robot();
				 nestingbird.delay(1500);
				 nestingbird.keyPress(KeyEvent.VK_D);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_D);
		 		} catch(Exception ex){
					ex.printStackTrace();
				}
			}
		else if(message.equalsIgnoreCase("heat")){
			try {
				 Robot nestingbird = new Robot();
				 nestingbird.delay(1500);
				 nestingbird.keyPress(KeyEvent.VK_A);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_A);
				 nestingbird.delay(500);
				 nestingbird.keyPress(KeyEvent.VK_D);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_D);
				 
		 		} catch(Exception ex){
					ex.printStackTrace();
				}
			}
		else if(message.equalsIgnoreCase("cool")){
			try {
				 Robot nestingbird = new Robot();
				 nestingbird.delay(1500);
				 nestingbird.keyPress(KeyEvent.VK_A);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_A);
				 nestingbird.delay(500);
				 nestingbird.keyPress(KeyEvent.VK_C);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_C);
		 		} catch(Exception ex){
					ex.printStackTrace();
				}
			}
		else if(message.equalsIgnoreCase("heatcool")){
			try {
				Robot nestingbird = new Robot();
				 nestingbird.delay(1500);
				 nestingbird.keyPress(KeyEvent.VK_A);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_A);
				 nestingbird.delay(500);
				 nestingbird.keyPress(KeyEvent.VK_F);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_F);
		 		} catch(Exception ex){
					ex.printStackTrace();
				}
			}
		else if(message.equalsIgnoreCase("hvacoff")){
			try {
				Robot nestingbird = new Robot();
				 nestingbird.delay(1500);
				 nestingbird.keyPress(KeyEvent.VK_A);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_A);
				 nestingbird.delay(500);
				 nestingbird.keyPress(KeyEvent.VK_O);
				 nestingbird.delay(100);
				 nestingbird.keyRelease(KeyEvent.VK_O);
		 		} catch(Exception ex){
					ex.printStackTrace();
				}
			}
		else if(message.equalsIgnoreCase("fan")){
			try {
			 Robot nestingbird = new Robot();
			 nestingbird.delay(1500);
			 nestingbird.keyPress(KeyEvent.VK_R);
			 nestingbird.delay(100);
			 nestingbird.keyRelease(KeyEvent.VK_R);
			 nestingbird.delay(500);
			 nestingbird.keyPress(KeyEvent.VK_Y);
			 nestingbird.delay(100);
			 nestingbird.keyRelease(KeyEvent.VK_Y);
	 		} catch(Exception ex){
				ex.printStackTrace();
			}
		
		}
		else if(message.equalsIgnoreCase("fanoff")){
			try {
			 Robot nestingbird = new Robot();
			 nestingbird.delay(1500);
			 nestingbird.keyPress(KeyEvent.VK_R);
			 nestingbird.delay(100);
			 nestingbird.keyRelease(KeyEvent.VK_R);
			 nestingbird.delay(500);
			 nestingbird.keyPress(KeyEvent.VK_O);
			 nestingbird.delay(100);
			 nestingbird.keyRelease(KeyEvent.VK_O);
	 		} catch(Exception ex){
				ex.printStackTrace();
			}
		
		}		
	}

}
