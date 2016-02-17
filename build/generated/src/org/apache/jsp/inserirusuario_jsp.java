package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.bean.Usuario;
import controller.Login;

public final class inserirusuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String codUsuario=""; 

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
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
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" language=\"JavaScript\" src=\"js/webvalida.js\"></script>\n");
      out.write("        <title>Locadora Senac</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("            <h3>Inserir Usuarios</h3>\n");
      out.write("             <form name=\"frmInserirUsuario\" method='post'>\n");
      out.write("                <input type='hidden' name='table' value='Usuario'>\n");
      out.write("                <input type='hidden' name='acao' value='gravar'>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Nome:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type='text' name='nome' value=''>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Nome Completo:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type='text' name='nomecompleto' value=''>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Email:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type='text' name='email' value=''>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            Senha:\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type='password' name='senha' value=''>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan='2' aling='center'>\n");
      out.write("                            <input type='button' onclick=\"GravarAlterarTabela(document.frmInserirUsuario)\" value='Gravar'>&nbsp;\n");
      out.write("                            <input type='reset' value='Redefinir'>\n");
      out.write("                            <a href='/servletweb?acao=ListarUsuario'>Listar Usuarios</a><br>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </center> \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
