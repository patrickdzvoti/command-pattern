package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.GarageDoor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 01:28
 */
@RequiredArgsConstructor
@Builder
public class GarageDoorCloseCommandImpl implements Command {

	private final GarageDoor garageDoor;
	@Override
	public String execute() {
		return garageDoor.close();
	}
}
