/*
 * JSP generated by Resin-3.0.22 (built Mon, 13 Nov 2006 09:32:38 PST)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _index__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.Application _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = com.caucho.jsp.QJspFactory.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=utf-8");
    request.setCharacterEncoding("UTF-8");
    com.caucho.jstl.el.FormatDateTag _jsp_FormatDateTag_0 = null;
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      _caucho_expr_0.print(out, pageContext, false);
      out.write(_jsp_string1, 0, _jsp_string1.length);
      pageContext.requestSetOrRemove("base", "");
      out.write(_jsp_string2, 0, _jsp_string2.length);
      pageContext.sessionSetOrRemove("lang", "i18n/Page");
      out.write(_jsp_string2, 0, _jsp_string2.length);
      pageContext.sessionSetOrRemove("bundle", "i18n/Credit_card");
      out.write(_jsp_string3, 0, _jsp_string3.length);
      java.util.Date now;
      now = (java.util.Date) pageContext.getAttribute("now");
      if (now == null) {
        now = new java.util.Date();
        pageContext.setAttribute("now", now);
      }
      out.write(_jsp_string4, 0, _jsp_string4.length);
      if (_jsp_FormatDateTag_0 == null) {
        _jsp_FormatDateTag_0 = new com.caucho.jstl.el.FormatDateTag();
        _jsp_FormatDateTag_0.setPageContext(pageContext);
        _jsp_FormatDateTag_0.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_FormatDateTag_0.setType(_caucho_expr_1);
      }

      _jsp_FormatDateTag_0.setValue(_caucho_expr_2);
      _jsp_FormatDateTag_0.doEndTag();
      out.write(_jsp_string5, 0, _jsp_string5.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      if (_jsp_FormatDateTag_0 != null)
        _jsp_FormatDateTag_0.release();
      com.caucho.jsp.QJspFactory.freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.make.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != -3988812337524854005L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.make.Dependency depend;
      depend = (com.caucho.make.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("index.jsp"), -2766054777606266799L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/style.jsp"), 5025591737830600425L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/tags.jsp"), -3608291857756734149L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/head.jsp"), 2490554217794192025L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("common/tail.jsp"), 6812337794366760204L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(mergePath.lookup("C:/Home/Resin/resin-3.0.22/lib/resin.jar"), 8088847092149864614L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, new com.caucho.make.ClassDependency(com.caucho.jstl.el.FormatDateTag.class, 1354023731864347364L));
  }
  private final static com.caucho.el.Expr _caucho_expr_0 =
    new com.caucho.el.IdExpr("base");
  private final static com.caucho.el.Expr _caucho_expr_1 =
    new com.caucho.el.StringLiteral("both");
  private final static com.caucho.el.Expr _caucho_expr_2 =
    new com.caucho.el.IdExpr("now");

  private final static char []_jsp_string2;
  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string5;
  private final static char []_jsp_string4;
  static {
    _jsp_string2 = "\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n<title>\u6613\u751f\u652f\u4ed8\u6536\u94f6\u53f0</title>\r\n<link href=\"".toCharArray();
    _jsp_string1 = "/css/shouyintai.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n</head>\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string3 = "\r\n\r\n<script language=\"javascript\" src=\"/js/jquery/jquery-1.4.4.js\"></script>\r\n<script language=\"javascript\" src=\"/js/jquery/jquery.validate.min.js\"></script>\r\n\r\n\r\n\r\n<style type=\"text/css\">\r\n\r\n.sj_inpt{\r\n\r\n	border:solid 1px #d2d2d2; width:180px; line-height:18px; height:18px; float:left;\r\n\r\n}\r\n.zjfk{\r\n	background: url(/images/syt_dlyhfk.gif); width:144px; height:26px; line-height:26px; text-align:center; color:#fff; border:none;\r\n}\r\n\r\n\r\n</style>\r\n\r\n<body>\r\n\r\n<div class=\"main\">\r\n\r\n  \r\n<div class=\"top\">\r\n        	<div class=\"logo\"><img src=\"images/ht_logo.jpg\" width=\"284\" height=\"91\" /></div>\r\n            <div class=\"top_rightfont\">\u60a8\u597d\uff1a\u6b22\u8fce\u4f7f\u7528\u6613\u751f\u652f\u4ed8\u6536\u94f6\u53f0!</div>\r\n</div>\r\n\r\n  <div class=\"syt_content\">\r\n\r\n    <div  style=\"background: url(images/zfht_h1.gif) repeat-x; border-bottom:solid 1px #d2d2d2; height:31px; float:left; width:928px; font-size:14px;padding-left:20px; line-height:31px; margin-bottom:10px; color:#fff; font-weight:bold;\">\u60a8\u6b63\u5728\u4f7f\u7528\u76f4\u63a5\u4ed8\u6b3e\u4ea4\u6613</div>\r\n    <form id=\"sub\" name=\"sub\" action=\"/urlPay.do\" method=\"post\">\r\n    <input type=\"hidden\" name=\"input_charset\" value=\"utf-8\"/>\r\n    <table width=\"80%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"padding:5px; float:left;\">    \r\n                  <tr>\r\n\r\n                    <td width=\"19%\" height=\"40\" align=\"right\">\u6536\u6b3e\u5ba2\u6237\u53f7:</td>\r\n\r\n                    <td width=\"44%\" style=\"padding:5px;\"><input type=\"text\" id=\"partner\" name=\"partner\" value=\"\" class=\"sj_inpt\"/></td>\r\n\r\n                     <td width=\"52%\" rowspan=\"5\"><p><strong>\u5c0a\u656c\u7684\u5ba2\u6237\uff1a</strong></p>\r\n\r\n                      <p>  \u4e3a\u4e86\u9632\u6b62\u77ed\u4fe1\u3001\u7535\u8bdd\u3001\u90ae\u4ef6\u548c\u5047\u7f51\u7ad9\u7b49\u8bc8\u9a97\u6d3b\u52a8\uff0c\u4fdd\u62a4\u60a8\u8d26\u6237\u8d44\u91d1\u5b89\u5168\uff0c\u7279\u522b\u63d0\u793a\u5982\u4e0b\uff1a<br />\r\n\r\n                        1.\u672c\u901a\u9053\u4e3a\u76f4\u63a5\u4ed8\u6b3e\u901a\u9053,\u8bf7\u52ff\u7ed9\u964c\u751f\u4eba\u4ed8\u6b3e;<br />\r\n                        \r\n                        2.\u8bf7\u60a8\u8ba4\u6e05\u6613\u751f\u652f\u4ed8\u7f51\u7ad9\u7f51\u5740\uff1a\r\n                        \r\n                          <strong>https://cashier.bhecard.com</strong>\uff0c\u5bf9\u5916\u8054\u7cfb\u90ae\u7bb1\uff1a<strong>yszfkfyx@hnair.com</strong> <br/>\r\n                        \r\n                        3.\u8bf7\u52a1\u5fc5\u4e0e\u6536\u6b3e\u5ba2\u6237\u786e\u8ba4\u597d\u8ba2\u5355\u548c\u8d27\u6b3e\u540e\uff0c\u518d\u4ed8\u6b3e\r\n                      </p>\r\n                    <br /></td>\r\n\r\n\r\n                  </tr>\r\n\r\n                  <tr>\r\n\r\n                    <td height=\"40\" align=\"right\">\u6536\u6b3e\u5ba2\u6237\u90ae\u7bb1:</td>\r\n\r\n                    <td style=\"padding:5px;\"><input type=\"text\" id=\"seller_email\" name=\"seller_email\" value=\"\" class=\"sj_inpt\"/></td>\r\n\r\n                    <td>&nbsp;</td>\r\n\r\n                  </tr>\r\n\r\n                  <tr>\r\n\r\n                    <td height=\"40\" align=\"right\">\u4ed8\u6b3e\u91d1\u989d(\u5143):</td>\r\n\r\n                    <td style=\"padding:5px;\"><input type=\"text\" id=\"total_fee\" name=\"total_fee\" value=\"\" class=\"sj_inpt\"/></td>\r\n\r\n                    <td>&nbsp;</td>\r\n\r\n                  </tr>\r\n\r\n                  <tr>\r\n\r\n                    <td height=\"40\" align=\"right\">\u4ed8\u6b3e\u8bf4\u660e:</td>\r\n\r\n                    <td style=\"padding:5px;\"><input type=\"text\" id=\"subject\" name=\"subject\" value=\"\" class=\"sj_inpt\"/></td>\r\n\r\n                    <td>&nbsp;</td>\r\n\r\n                  </tr>\r\n\r\n                  <tr>\r\n\r\n                    <td height=\"40\" align=\"right\">\u5546\u54c1\u63cf\u8ff0:</td>\r\n\r\n                    <td style=\"padding:5px;\"><input type=\"text\" id=\"body\" name=\"body\" value=\"\" class=\"sj_inpt\"/></td>\r\n\r\n                    <td>&nbsp;</td>\r\n\r\n                  </tr>\r\n\r\n                  <tr>\r\n\r\n                    <td height=\"40\">&nbsp;</td>\r\n\r\n                    <td style=\"padding:5px;\">\r\n                   <input type=\"submit\" name=\"buttons\" id=\"buttons\" value=\"\u786e\u8ba4\u4ed8\u6b3e\" class=\"zjfk\" />\r\n                   \r\n                     </td>\r\n\r\n                    <td>&nbsp;</td>\r\n\r\n                  </tr>\r\n\r\n    </table>\r\n   \r\n<script>\r\n $(document).ready(function() { 	\r\n            jQuery.validator.addMethod(\"total_fee\",function(a,b){return this.optional(b)||/^\\d+(\\.\\d{0,2})?$/i.test(a)},\"\u8f93\u5165\u6709\u6548\u91d1\u989d\");\r\n            $(\"#sub\").validate({\r\n                rules: {\r\n                    total_fee:{required:true,total_fee:true,min:0.01,max:99999999},\r\n                    partner:{required:true},\r\n                    seller_email:{required:true,email:true},\r\n                    subject:{required:true,maxlength:128},\r\n                    body:{required:true,maxlength:512}\r\n                },\r\n                messages: {\r\n                    partner:{required:\"<font color=red>\u8bf7\u8f93\u5165\u6536\u6b3e\u4eba\u5ba2\u6237\u53f7</font>\"},\r\n                    seller_email:{required:\"<font color=red>\u8bf7\u8f93\u5165\u6536\u6b3e\u4eba\u90ae\u7bb1\u8d26\u6237</font>\",email:\"<font color=red>\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u6536\u6b3e\u4eba\u90ae\u7bb1\u8d26\u6237</font>\"},\r\n                    total_fee:{required:\"<font color=red>\u8bf7\u8f93\u5165\u4ed8\u6b3e\u91d1\u989d</font>\",total_fee:\"<font color=red>\u65e0\u6548\u91d1\u989d</font>\",min:'<font color=red>\u91d1\u989d\u503c\u5fc5\u987b\u5927\u4e8e{0}</font>',max:'<font color=red>\u91d1\u989d\u503c\u5fc5\u987b\u5c0f\u4e8e{0}</font>'},		            \r\n                    body:{required:\"<font color=red>\u8bf7\u8f93\u5165\u4ed8\u6b3e\u6458\u8981</font>\",maxlength:\"<font color=red>\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc7{0}</font>\"},\r\n                    subject:{required:\"<font color=red>\u8bf7\u8f93\u5165\u4ed8\u6b3e\u8bf4\u660e</font>\",maxlength:\"<font color=red>\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc7{0}</font>\"}\r\n                   \r\n                }\r\n            });\r\n        });\r\n</script>\r\n  </div>\r\n</form>\r\n \r\n\r\n<div class=\"foot\">\u5173\u4e8e\u6613\u751f\u652f\u4ed8 | \u7ecf\u9500\u5546\u4f53\u7cfb | \u4f53\u9a8c\u8ba1\u5212 | \u5b98\u65b9\u535a\u5ba2 | \u8bda\u5f81\u82f1\u624d | \u8054\u7cfb\u6211\u4eec | International Business | About EasyPay<br />\r\n          <br />\r\n        \u6613\u751f\u652f\u4ed8\u7248\u6743\u6240\u6709 ICP\u8bc1\uff1a\u6d25ICP\u590711001957\u53f7</div>\r\n </div>\r\n".toCharArray();
    _jsp_string5 = "  -->\r\n\r\n</body>\r\n\r\n</html>\r\n".toCharArray();
    _jsp_string4 = "\r\n<!-- ".toCharArray();
  }
}