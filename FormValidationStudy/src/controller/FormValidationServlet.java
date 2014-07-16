package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormValidationServlet")
public class FormValidationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		ArrayList<String> challanList = new ArrayList<String>();

		String uname = request.getParameter("username");
		String ageString = request.getParameter("age");

		if (uname.equals("")) {
			challanList.add("User Name is empty ");
		}

		if (ageString.equals("")) {
			challanList.add("Age  is Empty");
		} else {
			try {
				int age = Integer.parseInt(ageString);

				if (age < 0) {
					challanList
							.add("Are you nuts ? Are age negative kaise ho sakta hai ??");
				} else {

					if (age < 20) {
						challanList
								.add("Oye chotu jaa park mein jaa karr khel !");
					}

					if (age > 60) {
						challanList.add("Uncle ji,namaste ! Yo are too old  ");
					}

				}

			} catch (NumberFormatException e) {
				challanList.add("You entered invalid age ");
			}

		}

		if (challanList.isEmpty()) {
			request.getRequestDispatcher("success.jsp").forward(request,
					response);
		} else {
			 		.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
