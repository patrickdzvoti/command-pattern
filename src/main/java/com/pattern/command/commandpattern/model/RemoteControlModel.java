package com.pattern.command.commandpattern.model;

import com.pattern.command.commandpattern.execute.Command;
import lombok.Builder;

/**
 * @author Patrick Dzvoti
 * Initial 12/03/2023 - 23:59
 */


@Builder(toBuilder = true)
public class RemoteControlModel {

	private final Command[] onCommands;
	private final Command[] offCommands ;

	public RemoteControlModel(Command[] onCommands, Command[] offCommands) {
		this.onCommands = onCommands;
		this.offCommands = offCommands;
	}

//	public RemoteControlModel(){
//		onCommands = new Command[7];
//		offCommands = new Command[7];
//	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public String onButtonWasPressed(int slot) {
		return onCommands[slot].execute();
	}

	public String offButtonPressed(int slot) {
		return offCommands[slot].execute();
	}

}
