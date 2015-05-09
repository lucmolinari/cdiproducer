package com.lucianomolinari.cdiproducer.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lucianomolinari.cdiproducer.dao.SimpleDao;

@WebServlet(urlPatterns = "/client1")
public class ServletClient1 extends HttpServlet {

	@Inject
	private SimpleDao simpleDao;

	@Override
	protected void doGet(final HttpServletRequest arg0, final HttpServletResponse arg1) throws ServletException,
			IOException {
		simpleDao.doSomething();
	}

}