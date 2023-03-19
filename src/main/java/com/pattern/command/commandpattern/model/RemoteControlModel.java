package com.pattern.command.commandpattern.model;

import com.pattern.command.commandpattern.execute.Command;
import lombok.Builder;
import org.springframework.stereotype.Component;

/**
 * @author Patrick Dzvoti
 * Initial 12/03/2023 - 23:59
 */
@Component
@Builder(toBuilder = true)
public class RemoteControlModel {

	private final Command command;

	public RemoteControlModel(Command command) {
		this.command = command;
	}

	public String buttonWasPressed() {
		return command.execute();
	}


}
