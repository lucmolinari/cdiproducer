package com.lucianomolinari.cdiproducer.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileSimpleDao implements SimpleDao {

	private final String baseDir;

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public FileSimpleDao(final String baseDir) {
		this.baseDir = baseDir;
	}

	public void doSomething() {
		logger.info("Invoking doSomething() with baseDir {}", baseDir);
	}

}