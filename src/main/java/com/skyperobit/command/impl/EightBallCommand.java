package com.skyperobit.command.impl;

import java.util.ArrayList;
import java.util.List;

import com.samczsun.skype4j.chat.Chat;
import com.skyperobit.command.Command;

public class EightBallCommand extends Command {

	@Override
	public void execute(String argString, Chat chat)
	{
		List<String> fortunes = new ArrayList<>();
		fortunes.add("IT IS CERTAIN");
		fortunes.add("IT IS DECIDEDLY SO");
		fortunes.add("WITHOUT A DOUBT");
		fortunes.add("YES, DEFINITELY");
		fortunes.add("YOU MAY RELY ON IT");
		fortunes.add("AS I SEE IT, YES");
		fortunes.add("MOST LIKELY");
		fortunes.add("OUTLOOK GOOD");
		fortunes.add("YES");
		fortunes.add("SIGNS POINT TO YES");
		fortunes.add("REPLY HAZY TRY AGAIN");
		fortunes.add("ASK AGAIN LATER");
		fortunes.add("BETTER NOT TELL YOU NOW");
		fortunes.add("CANNOT PREDICT NOW");
		fortunes.add("CONCENTRATE AND ASK AGAIN");
		fortunes.add("DON'T COUNT ON IT");
		fortunes.add("MY REPLY IS NO");
		fortunes.add("MY SOURCES SAY NO");
		fortunes.add("OUTLOOK NOT SO GOOD");
		fortunes.add("VERY DOUBTFUL");
		
		int index = (int)(Math.random()*20);
		
		sendMessage(chat, fortunes.get(index), "8ball");
	}
}
