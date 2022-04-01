package com.github.lochnessdragon;

public class ArgParser {
	public ArgParser() {}

	public void usage() {
		System.out.println("CFCLI");
		System.out.println(" Lookup and download author info and mods");
	}
	
	public void parse(String[] args) {
		if(args.length < 1) {
			usage();
			return;
		}
	}
}