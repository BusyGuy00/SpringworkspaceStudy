/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2023-08-08 08:27:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/board/../includes/footer.jsp", Long.valueOf(1690356967331L));
    _jspx_dependants.put("jar:file:/D:/springworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/controller/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/board/../includes/header.jsp", Long.valueOf(1690936845277L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1689216495297L));
    _jspx_dependants.put("jar:file:/D:/springworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/controller/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>SB Admin 2 - Tables</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom fonts for this template -->\r\n");
      out.write("    <link href=\"/resources/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("        rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"/resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this page -->\r\n");
      out.write("    <link href=\"/resources/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Wrapper -->\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar - Brand -->\r\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\r\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                    <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">SB Admin <sup>2</sup></div>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Dashboard -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                    <span>Dashboard</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Heading -->\r\n");
      out.write("            <div class=\"sidebar-heading\">\r\n");
      out.write("                Interface\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-cog\"></i>\r\n");
      out.write("                    <span>게시글 보기</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Components:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"/board/list2\">게시글 보기</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"/board/register\">글 등록</a>\r\n");
      out.write("                        <!-- 갤러리 게시판 링크 추가  -->\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"/galleryboard/list\">갤러리 게시글</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"/galleryboard/register\">갤러리 글 등록</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-wrench\"></i>\r\n");
      out.write("                    <span>Utilities</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\r\n");
      out.write("                    data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Custom Utilities:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-color.html\">Colors</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-border.html\">Borders</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-animation.html\">Animations</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Heading -->\r\n");
      out.write("            <div class=\"sidebar-heading\">\r\n");
      out.write("                Addons\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapsePages\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-folder\"></i>\r\n");
      out.write("                    <span>Pages</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                        <h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"login.html\">Login</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"register.html\">Register</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"forgot-password.html\">Forgot Password</a>\r\n");
      out.write("                        <div class=\"collapse-divider\"></div>\r\n");
      out.write("                        <h6 class=\"collapse-header\">Other Pages:</h6>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"404.html\">404 Page</a>\r\n");
      out.write("                        <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Charts -->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\r\n");
      out.write("                    <span>Charts</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - Tables -->\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("                    <i class=\"fas fa-fw fa-table\"></i>\r\n");
      out.write("                    <span>Tables</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <!-- Divider -->\r\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("        <!-- Content Wrapper -->\r\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Main Content -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <!-- Begin Page Content -->\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                <!-- 꾸미기 -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>수정하기</h2>\r\n");
      out.write("	<form method=\"post\" class=\"modify\" action=\"/board/modify\">\r\n");
      out.write("		<table>\r\n");
      out.write("			<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			<input type=\"hidden\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>제목</td>\r\n");
      out.write("				<td><input type=\"text\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required/> </td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>글쓴이</td>\r\n");
      out.write("				<td><input type=\"text\" name=\"writer\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly/> </td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>내용</td>\r\n");
      out.write("				<td><textarea rows=\"\" cols=\"\" name=\"content\" required >\r\n");
      out.write("					");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("					</textarea> \r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\">\r\n");
      out.write("					<button type=\"submit\">등록</button>\r\n");
      out.write("					<button type=\"reset\">취소</button>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<!-- 수정하기가 post로 되어 있어서 수정 완료후 원래 있던 페이지로 넘길 수 가 없어 추가  -->\r\n");
      out.write("			<input type=\"hidden\" name=\"pageNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("			<input type=\"hidden\" name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.amount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("			<input type=\"hidden\" name=\"type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("			<input type=\"hidden\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cri.keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("			<!-- 첨부파일 이미지 영역 -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-12\">\r\n");
      out.write("				<div class=\"panel panel-default\">\r\n");
      out.write("					<div class=\"panel-heading\">\r\n");
      out.write("						파일들\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"paner-body\">\r\n");
      out.write("					<!--   -->\r\n");
      out.write("						<div class=\"uploadDiv\">\r\n");
      out.write("							<input type=\"file\" name=\"uploadfile\" multiple />\r\n");
      out.write("						</div>\r\n");
      out.write("						<!--  -->\r\n");
      out.write("						<div class=\"uploadResult\">\r\n");
      out.write("							<ul></ul>\r\n");
      out.write("						</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("					<!-- 첨부파일 이미지 영역 끝 -->\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("	<!-- 꾸미기  -->\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!--  사진 보이기 -->\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document).ready(function () {\r\n");
      out.write("			//바로 실행 시키기 위한 function으로 ready됐을때 바로 실행 된다.\r\n");
      out.write("			//스스로 실행되는 함수\r\n");
      out.write("			(function() {\r\n");
      out.write("				let bno = '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("				$.getJSON(\"/board/getAttachList\", {bno:bno},\r\n");
      out.write("				function(arr) {\r\n");
      out.write("					console.log(arr);\r\n");
      out.write("					//이미지 나타내기\r\n");
      out.write("					let str=\"\";\r\n");
      out.write("					$(arr).each(function(i, attach) {\r\n");
      out.write("						let fileCallpath = \r\n");
      out.write("						encodeURIComponent(attach.uploadPath+\"/s_\"+attach.uuid+\"_\"+attach.fileName);\r\n");
      out.write("						str += \"<li data-path='\"+attach.uploadPath+\"' data-uuid='\"+attach.uuid+\"'\"\r\n");
      out.write("						str += \"data-filename='\"+attach.fileName+\"' data-type='\"+attach.fileType+\"'>\"\r\n");
      out.write("						str += \"<div><img src='/display?fileName=\"+fileCallpath+\"' />\";\r\n");
      out.write("						str += \"<button class='btn' data-type='image' data-file='\"+fileCallpath+\"'>삭제</button>\"\r\n");
      out.write("						str += \"</div></li>\"\r\n");
      out.write("\r\n");
      out.write("					})\r\n");
      out.write("						$(\".uploadResult ul\").html(str);\r\n");
      out.write("					})	//end getJSON\r\n");
      out.write("			})();\r\n");
      out.write("			//삭제 버튼 클릭시 화면상에서 사라지도록 하기 \r\n");
      out.write("			$(\".uploadResult\").on(\"click\",\"button\",function(){\r\n");
      out.write("				console.log(\"delete file\");\r\n");
      out.write("				if(confirm(\"파일을 삭제 하시겠습니까?\")){\r\n");
      out.write("					let targetLi = $(this).closest(\"li\");\r\n");
      out.write("					targetLi.remove();\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("				//요소의 변경이 있으면 콜백함수 실행\r\n");
      out.write("			$(\"input[type='file']\").change(function() {\r\n");
      out.write("				//가상의 폼을 생성(폼태그)\r\n");
      out.write("				let formData = new FormData();\r\n");
      out.write("				let inputFile = $(\"input[name='uploadfile']\")\r\n");
      out.write("				let files = inputFile[0].files;\r\n");
      out.write("				for(let i=0; i<files.length; i++){\r\n");
      out.write("					formData.append(\"uploadFile\", files[i]);\r\n");
      out.write("				}\r\n");
      out.write("				let csrfHeaderName = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.headerName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("				let csrfTokenValue = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url: '/uploadAjaxAction',\r\n");
      out.write("					processData: false,\r\n");
      out.write("					contentType: false,\r\n");
      out.write("					data: formData,\r\n");
      out.write("					beforeSend:function(xhr){\r\n");
      out.write("						xhr.setRequestHeader(csrfHeaderName, csrfTokenValue);\r\n");
      out.write("					},\r\n");
      out.write("					type: 'POST',\r\n");
      out.write("					dataType: 'json',\r\n");
      out.write("					success : function (result) {\r\n");
      out.write("						console.log(result);\r\n");
      out.write("						showUploadResult(result);\r\n");
      out.write("					}\r\n");
      out.write("				})\r\n");
      out.write("			})\r\n");
      out.write("			function showUploadResult(uploadResultArr) {\r\n");
      out.write("				//결과 배열이 null이거나 길이가 0이면 함수 종료\r\n");
      out.write("				if(!uploadResultArr || uploadResultArr.length==0 ){return;}\r\n");
      out.write("				let uploadul = $(\".uploadResult ul\");\r\n");
      out.write("				let str = \"\";\r\n");
      out.write("				$(uploadResultArr).each(function(i, obj){\r\n");
      out.write("					console.log(obj);\r\n");
      out.write("					let fileCallpath = encodeURIComponent(obj.uploadPath+\"/s_\"+obj.uuid+\"_\"+obj.fileName);\r\n");
      out.write("					console.log(fileCallpath);\r\n");
      out.write("					str += \"<li data-path='\"+obj.uploadPath+\"' data-filename='\"+obj.fileName+\"'\"\r\n");
      out.write("					+\"data-uuid='\"+obj.uuid+\"' data-type='\"+obj.image+\"'>\"\r\n");
      out.write("					+\"<img src='/display?fileName=\"+fileCallpath+\"'/>\"\r\n");
      out.write("					+\"<button class='btn' data-file=\\'\"+fileCallpath+\"\\' data-type='image'>\"\r\n");
      out.write("					+\"삭제</button>\"\r\n");
      out.write("					+\"</li>\"\r\n");
      out.write("				})\r\n");
      out.write("				uploadul.append(str);\r\n");
      out.write("			}\r\n");
      out.write("			//전송 버튼 누를때 파일 관련 데이터도 같이 전송 \r\n");
      out.write("			$(\"button[type='submit']\").on(\"click\",function(e){\r\n");
      out.write("				//연결된 이벤트 제거 (submit전송 제거)\r\n");
      out.write("				e.preventDefault();\r\n");
      out.write("				//폼선택 formObj할당\r\n");
      out.write("				let formObj = $(\"form.modify\")\r\n");
      out.write("				console.log(\"submmit클릭\");\r\n");
      out.write("				let str = \"\";\r\n");
      out.write("				$(\".uploadResult ul li\").each(function(i, obj){\r\n");
      out.write("					let jobj = $(obj);\r\n");
      out.write("					str += \"<input type='hidden' name='attachList[\"+i+\"].fileName' value='\"+jobj.data(\"filename\")+\"'/>\"\r\n");
      out.write("					str += \"<input type='hidden' name='attachList[\"+i+\"].uuid' value='\"+jobj.data(\"uuid\")+\"'/>\"\r\n");
      out.write("					str += \"<input type='hidden' name='attachList[\"+i+\"].uploadPath' value='\"+jobj.data(\"path\")+\"'/>\"\r\n");
      out.write("					str += \"<input type='hidden' name='attachList[\"+i+\"].fileType' value='\"+jobj.data(\"type\")+\"'/>\"\r\n");
      out.write("				})\r\n");
      out.write("				//폼에 데이터 추가 append()메소드 submit()전송하기 \r\n");
      out.write("				formObj.append(str).submit();\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("		//사진 보이기\r\n");
      out.write("		</script>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write(" <!-- Footer -->\r\n");
      out.write("            <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                <div class=\"container my-auto\">\r\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                        <span>Copyright &copy; Your Website 2020</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Scroll to Top Button-->\r\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Logout Modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("        aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript-->\r\n");
      out.write("    <script src=\"/resources/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"/resources/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom scripts for all pages-->\r\n");
      out.write("    <script src=\"/resources/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level plugins -->\r\n");
      out.write("    <script src=\"/resources/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level custom scripts -->\r\n");
      out.write("    <script src=\"/resources/js/demo/datatables-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/board/modify.jsp(86,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
