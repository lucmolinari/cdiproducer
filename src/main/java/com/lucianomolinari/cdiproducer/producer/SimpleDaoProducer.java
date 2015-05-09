package com.lucianomolinari.cdiproducer.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lucianomolinari.cdiproducer.dao.FileSimpleDao;
import com.lucianomolinari.cdiproducer.dao.SimpleDao;

public class SimpleDaoProducer {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Produces
	@ApplicationScoped
	public SimpleDao createFileDao() {
		logger.info("-->Creating fileDao");
		return new FileSimpleDao("/anyDirectory");
	}

}