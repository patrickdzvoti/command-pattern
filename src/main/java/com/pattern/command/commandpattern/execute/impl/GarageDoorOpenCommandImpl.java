package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.GarageDoor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 00:38
 */
@Service
@RequiredArgsConstructor
@Builder
public class GarageDoorOpenCommandImpl implements Command {

	private final GarageDoor garageDoor;
	@Override
	public String execute() {
		return garageDoor.open();
	}
}
