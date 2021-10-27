package ies.tomascandeias;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmbeddedJetty {
	public static void main(String[] args) {
		Server server = new Server(8680);

		ServletHandler servletHandler = new ServletHandler();
		server.setHandler(servletHandler);

		servletHandler.addServletWithMapping(HelloServlet.class, "/");

		try {
			server.start();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static class HelloServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			response.setContentType("text/html");
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().println("<h1>New Hello Simple Servlet</h1>");


		}
	}
}
