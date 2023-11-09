/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-11-09 03:06:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.kh.product.Product;
import com.kh.product.ProductDAO;

public final class ProductList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.product.ProductDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.kh.product.Product");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>제품목록</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>제품목록</h1>\r\n");
      out.write("	<table border=\"1\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<th>제품 ID</th>\r\n");
      out.write("			<th>제품명</th>\r\n");
      out.write("			<th>카테고리</th>\r\n");
      out.write("			<th>가격</th>\r\n");
      out.write("			<th>수량</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

			ProductDAO productDAO = new ProductDAO();	
			List<Product> products = productDAO.getAllProducts();
			
			for(Product p : products){
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td> <a href =\"productDetail.jsp?productId=");
      out.print(p.getProductId());
      out.write('"');
      out.write('>');
      out.print(p.getProductId());
      out.write("</a></td>\r\n");
      out.write("					<td> ");
      out.print(p.getProductName() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(p.getCategory() );
      out.write("\r\n");
      out.write("					<td>");
      out.print(p.getPrice() );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(p.getStockQuantity() );
      out.write("</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");
 
			}
		
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("<ul>\r\n");
      out.write("	< %\r\n");
      out.write("		//제품목록을 ArrayList에 저장\r\n");
      out.write("		//ArrayList<Product> products =new ArrayList<>();\r\n");
      out.write("		//products.add(new Product(1,\"노트북\",\"전자제품\",899.99,10));\r\n");
      out.write("		//products.add(new Product(2,\"냉장고\",\"가전제품\",799.99,10));\r\n");
      out.write("		\r\n");
      out.write("		ArrayList<Product> products = (ArrayList<Product>)request.getAttribute(\"products\");\r\n");
      out.write("		//for 문을 활용해서 제품목록을 반복해서 표현할 수 있음\r\n");
      out.write("		for(Product p:products){\r\n");
      out.write("		% >\r\n");
      out.write("			<li>\r\n");
      out.write("			< %= p.getProductName() %>의 가격< %=p.getPrice() %><li>\r\n");
      out.write("			< % \r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("	%>\r\n");
      out.write("	</ul>\r\n");
      out.write("\r\n");
      out.write(" -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
