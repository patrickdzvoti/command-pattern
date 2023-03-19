package com.pattern.command.commandpattern.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.execute.impl.LightOnCommandImpl;
import com.pattern.command.commandpattern.model.Light;
import com.pattern.command.commandpattern.model.RemoteControlModel;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Patrick Dzvoti
 * Initial 14/03/2023 - 00:48
 */

class LightOnCommandTest {

	private final Command command =
		LightOnCommandImpl.builder().light(Light.builder().build()).build();

	private final RemoteControlModel remoteControlModel =
		RemoteControlModel.builder().command(command).build();

	@Test
	void testButtonPressed() {
		assertEquals(remoteControlModel.buttonWasPressed(),"Set light on");
	}
}
