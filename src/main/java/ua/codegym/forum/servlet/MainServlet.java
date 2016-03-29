package ua.codegym.forum.servlet;

import java.io.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    res.getWriter().println("Hello!");
  }

}
