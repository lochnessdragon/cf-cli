package com.github.lochnessdragon;

import org.apache.commons.cli.Options;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
	public static Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		Options options = new Options();

		LOGGER.info("CurseForge CLI Tool version 0.1");
	}
}
