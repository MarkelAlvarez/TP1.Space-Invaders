package tp.p1.control.commands;

import tp.p1.control.Command;
import tp.p1.logic.Game;

public class ListCommand extends Command {

	public ListCommand(String name, String shortcut, String details, String help) {
		super(name, shortcut, details, help);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(Game game) {

		game.list();

		return true;
	}

	@Override
	public Command parse(String[] commandWords) {

		if (matchCommandName(commandWords[0]))
		{
			return this;
		}

		return null;
	}

}
