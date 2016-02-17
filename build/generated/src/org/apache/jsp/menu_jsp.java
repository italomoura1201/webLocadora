package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.bean.Usuario;
import controller.Login;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String codUsuario=""; 

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=windows-1252");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

 Login.validarSessao(request, response);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("        <title>Locadora Senac</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Menu</h2>\r\n");
      out.write("         <a href='/servletweb?acao=ListarEstados'>Cadastro de Estados</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarCidade'>Cadastro de Cidades</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarCliente'>Cadastro de Clientes</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarVeiculo'>Cadastro de Veiculos</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarCategoria'>Cadastro de Categorias</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarVeiculoCliente'>Cadastro de Veiculos Clientes</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarUsuario'>Cadastro de Usuarios</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarMarca'>Cadastro de Marcas</a><br>\r\n");
      out.write("         <a href='/servletweb?acao=ListarModelo'>Cadastro de Modelos</a><br>    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
