package com.github.lochnessdragon;

import org.apache.commons.cli.Options;
import de.codeshelf.consoleui.prompt.ConsolePrompt;
import de.codeshelf.consoleui.prompt.PromtResultItemIF;
import de.codeshelf.consoleui.prompt.builder.PromptBuilder;
import jline.TerminalFactory;
import org.fusesource.jansi.AnsiConsole;
import java.io.IOException;
import java.util.HashMap;

// CMD line args like this
// author <name>
//  returns info about author
// project <id>
//  returns info about project
// download <id> [--mv-version=1.18]
//  downloads a project and checks its hash
// download-pack <filename> [--mc-version=1.18]
//  downloads a list of mods

public class CFCLI {

	public static void main(String[] args) {
		ICFAPIProvider cfAPI = new CFAPIProvider();
		
		CFAuthor lochnessdragon = cfAPI.getAuthor("lochnessdragon");
		System.out.println("Author #" + author.getId() + ": " + lochnessdragon.getName());
		System.out.println("Projects:");
		for(ICFProject project : author.projects) {
			System.out.println(" - " + project.getId() + ": " + project.getName());
		}
	}	
}
