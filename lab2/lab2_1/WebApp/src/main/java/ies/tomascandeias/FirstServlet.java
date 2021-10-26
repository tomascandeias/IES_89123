package ies.tomascandeias;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FirstServlet", urlPatterns = {"/args"})
public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = -1915463532411657451L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//Do some work
		PrintWriter pw = response.getWriter();

		Enumeration<String> enumeration = request.getParameterNames();
		Map<String, ArrayList<String>> params = new HashMap<>();
		ArrayList<String> tmp;

		while (enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();

			String[] values = request.getParameterValues(name);
			if (values.length > 0) params.put(name, new ArrayList<String>());
			for (String s : values) {
				tmp = params.get(name);
				tmp.add(s);
				params.put(name, tmp);
			}
		}
		String html = "<style>" +
				"table, th, td {\n" +
				"  border:1px solid black;\n" +
				"}\n" +
				"</style><table style=\"width:100%\"><tr><th>Name</th><th>Value</th></tr>";
		for (Map.Entry<String, ArrayList<String>> entry : params.entrySet()){
			String key = entry.getKey();
			tmp = entry.getValue();

			for(String v : tmp){
				html += "<tr><td>" + key + "</td><td>" + v + "</td>";
			}
			html += "</tr>";
		}
		html += "</table>";
		pw.println(html);

		pw.close();
	}
}
