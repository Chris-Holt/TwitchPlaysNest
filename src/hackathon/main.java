package hackathon;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

public class main {

	public static void main(String[] args) throws NickAlreadyInUseException, IOException, IrcException{
		// TODO Auto-generated method stub
		apicalls bot = new apicalls();
		
		bot.setVerbose(true);
		bot.connect("irc.twitch.tv",6667,"REDACTED"); 
		bot.joinChannel("#twitchplaysnest");
	}

}
