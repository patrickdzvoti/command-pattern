package com.pattern.command.commandpattern.execute.impl;

import com.pattern.command.commandpattern.execute.Command;
import com.pattern.command.commandpattern.model.GarageDoor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Patrick Dzvoti
 * Initial 19/03/2023 - 02:06
 */
class GarageDoorOpenCommandImplTest {

	private final Command command = GarageDoorOpenCommandImpl.builder()
		.garageDoor(GarageDoor.builder().build())
		.build();

	@Test
	void testGarageDoorOpenCommand() {
		assertThat(command.execute()).isEqualTo("Open garage door");
	}
}
