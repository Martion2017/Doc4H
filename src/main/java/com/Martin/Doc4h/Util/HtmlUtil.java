package com.Martin.Doc4h.Util;

public class HtmlUtil {

    public static void outPutHtml(){
        String html= "<!DOCTYPE html>\n" +
                "<html lang=\"zh-CN\">\n" +
                "\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge, Chrome=1\">\n" +
                "  <meta name=\"renderer\" content=\"webkit\">\n" +
                "  <title>Doc4H</title>\n" +
                "  <style>\n" +
                "#header {\n" +
                "    background-color:black;\n" +
                "    color:white;\n" +
                "    text-align:center;\n" +
                "    padding:15px;\n" +
                "}\n" +
                "#nav {\n" +
                "    line-height:30px;\n" +
                "    height:300px;\n" +
                "    width:250px;\n" +
                "    float:left;\n" +
                "    padding:5px; \n" +
                "}\n" +
                "#section {\n" +
                "    width:450px;\n" +
                "    float:left;\n" +
                "    padding:15px; \n" +
                "}\n" +
                "#footer {\n" +
                "    background-color:black;\n" +
                "    color:white;\n" +
                "    clear:both;\n" +
                "    text-align:center;\n" +
                "    padding:5px; \n" +
                "}\n" +
                ".menu_list{width:268px;\n" +
                "\tmargin:0;\n" +
                "\t    width:230px;\n" +
                "    float:left;\n" +
                "    padding:5px; \n" +
                "\t}\n" +
                ".menu_head{\n" +
                "\theight: 47px;\n" +
                "\tline-height: 47px;\n" +
                "\tpadding-left: 38px;\n" +
                "\tfont-size: 14px;\n" +
                "\tcolor: #525252;\n" +
                "\tcursor: pointer;\n" +
                "\tborder-left: 1px solid #e1e1e1;\n" +
                "\tborder-right: 1px solid #e1e1e1;\n" +
                "\tborder-bottom: 1px solid #e1e1e1;\n" +
                "\tborder-top: 1px solid #F1F1F1;\n" +
                "\tposition: relative;\n" +
                "\tmargin: 0px;\n" +
                "\tfont-weight: bold;\n" +
                "\tbackground: #f1f1f1 ;\n" +
                "}\n" +
                ".menu_list .current{background:#f1f1f1  }\n" +
                ".menu_body{\n" +
                "\tline-height: 38px;\n" +
                "\tborder-left: 1px solid #e1e1e1;\n" +
                "\tbackguound: #fff;\n" +
                "\tborder-right: 1px solid #e1e1e1;\n" +
                "}\n" +
                ".menu_body a{display:block;height:38px;line-height:38px;padding-left:38px;color:#777777;background:#fff;text-decoration:none;border-bottom:1px solid #e1e1e1;}\n" +
                ".menu_body a:hover{text-decoration:none;}\n" +
                "</style>\n" +
                "   \n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "  <div id = \"header\"class=\"header\">\n" +
                "    <header>\n" +
                "\t接口文档页面\n" +
                "    </header>\n" +
                "    <div id=\"wrapper\">\n" +
                "    </div>\n" +
                "  </div>\n" +
                "\n" +
                "  <!-- 代码部分begin -->\n" +
                "<div id=\"firstpane\" class=\"menu_list\">\n" +
                "\t<h3 class=\"menu_head current\" onclick=\"flow(this)\">测试类1</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"http://www.16sucai.com\">科学技术哲学</a>\n" +
                "\t\t<a href=\"#\">宗教学</a>\n" +
                "\t\t<a href=\"#\">美学</a>\n" +
                "\t\t<a href=\"#\">伦理学</a>\n" +
                "\t\t<a href=\"#\">逻辑学</a>\n" +
                "\t\t<a href=\"#\">外国哲学</a>\n" +
                "\t\t<a href=\"#\">中国哲学</a>\n" +
                "\t\t<a href=\"#\">马克思主义哲学</a>\n" +
                "\t</div>\n" +
                "\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类2</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">应用经济学</a>\n" +
                "\t\t<a href=\"#\">理论经济学</a>\n" +
                "\t\t<a href=\"#\">国民经济学</a>\n" +
                "\t\t<a href=\"#\">区域经济学</a>\n" +
                "\t\t<a href=\"#\">产业经济学</a>\n" +
                "\t\t<a href=\"#\">国际贸易学</a>\n" +
                "\t\t<a href=\"#\">劳动经济学</a>\n" +
                "\t\t<a href=\"#\">政治经济学</a>\n" +
                "\t</div>\n" +
                "\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类3</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">马克思主义基本原理</a>\n" +
                "\t\t<a href=\"#\">马克思主义发展史</a>\n" +
                "\t\t<a href=\"#\">马克思主义中国化研究</a>\n" +
                "\t\t<a href=\"#\">国外马克思主义研究</a>\n" +
                "\t\t<a href=\"#\">思想政治教育</a>\n" +
                "\t</div>\n" +
                "\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类4</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">体育人文社会学</a>\n" +
                "\t\t<a href=\"#\">体育教育训练学</a>\n" +
                "\t\t<a href=\"#\">民族传统体育学</a>\n" +
                "\t\t<a href=\"#\">发展与教育心理学</a>\n" +
                "\t\t<a href=\"#\">应用心理学</a>\n" +
                "\t\t<a href=\"#\">教育学原理</a>\n" +
                "\t\t<a href=\"#\">课程与教学论</a>\n" +
                "\t\t<a href=\"#\">比较教育学</a>\n" +
                "\t</div>\n" +
                "\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类5</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">一般力学与力学基础</a>\n" +
                "\t\t<a href=\"#\">固体力学</a>\n" +
                "\t\t<a href=\"#\">流体力学</a>\n" +
                "\t\t<a href=\"#\">工程力学</a>\n" +
                "\t\t<a href=\"#\">机械制造及其自动化</a>\n" +
                "\t\t<a href=\"#\">机械电子工程</a>\n" +
                "\t</div>\n" +
                "\t\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类5</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">一般力学与力学基础</a>\n" +
                "\t\t<a href=\"#\">固体力学</a>\n" +
                "\t\t<a href=\"#\">流体力学</a>\n" +
                "\t\t<a href=\"#\">工程力学</a>\n" +
                "\t\t<a href=\"#\">机械制造及其自动化</a>\n" +
                "\t\t<a href=\"#\">机械电子工程</a>\n" +
                "\t</div>\n" +
                "\t\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类5</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">一般力学与力学基础</a>\n" +
                "\t\t<a href=\"#\">固体力学</a>\n" +
                "\t\t<a href=\"#\">流体力学</a>\n" +
                "\t\t<a href=\"#\">工程力学</a>\n" +
                "\t\t<a href=\"#\">机械制造及其自动化</a>\n" +
                "\t\t<a href=\"#\">机械电子工程</a>\n" +
                "\t</div>\n" +
                "\t\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类5</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">一般力学与力学基础</a>\n" +
                "\t\t<a href=\"#\">固体力学</a>\n" +
                "\t\t<a href=\"#\">流体力学</a>\n" +
                "\t\t<a href=\"#\">工程力学</a>\n" +
                "\t\t<a href=\"#\">机械制造及其自动化</a>\n" +
                "\t\t<a href=\"#\">机械电子工程</a>\n" +
                "\t</div>\n" +
                "\t\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类5</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">一般力学与力学基础</a>\n" +
                "\t\t<a href=\"#\">固体力学</a>\n" +
                "\t\t<a href=\"#\">流体力学</a>\n" +
                "\t\t<a href=\"#\">工程力学</a>\n" +
                "\t\t<a href=\"#\">机械制造及其自动化</a>\n" +
                "\t\t<a href=\"#\">机械电子工程</a>\n" +
                "\t</div>\n" +
                "\t\t<h3 class=\"menu_head\" onclick=\"flow(this)\">测试类5</h3>\n" +
                "\t<div style=\"display:none\" class=\"menu_body\">\n" +
                "\t\t<a href=\"#\">一般力学与力学基础</a>\n" +
                "\t\t<a href=\"#\">固体力学</a>\n" +
                "\t\t<a href=\"#\">流体力学</a>\n" +
                "\t\t<a href=\"#\">工程力学</a>\n" +
                "\t\t<a href=\"#\">机械制造及其自动化</a>\n" +
                "\t\t<a href=\"#\">机械电子工程</a>\n" +
                "\t</div>\n" +
                "\t\n" +
                "</div>\n" +
                "    <div id=\"section\" class=\"section row\">\n" +
                "      <div class=\"section\">\n" +
                "        <h2>欢迎使用Doc4H</h2>\n" +
                "        \n" +
                "        <h4 class=\"urlchart-name\"></h4>\n" +
                "        <div class=\"urlchart\">\n" +
                "          \n" +
                "        </div>\n" +
                "       \n" +
                "        <div class=\"welcomfooter\">\n" +
                "          <span></span>\n" +
                "          <span></span>\n" +
                "          <span></span>\n" +
                "        </div>\n" +
                "       </div>\n" +
                "     \n" +
                "      <div class=\"pageitem\">\n" +
                "        <div class=\"commet\">\n" +
                "          <h2></h2>\n" +
                "          <p></p>\n" +
                "          <p>接口地址: </p>\n" +
                "          <p>请求类型: </p>\n" +
                "          <h2>入参</h2>\n" +
                "          <div class=\"reception\">\n" +
                "            <table class=\"table\">\n" +
                "              <tr>\n" +
                "                <th>参数名</th>\n" +
                "                <th>参数类型</th>\n" +
                "                <th>是否必填</th>\n" +
                "                <th>描述</th>\n" +
                "              </tr>\n" +
                "            \n" +
                "              <tr>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "              </tr>\n" +
                "           \n" +
                "            </table>\n" +
                "          </div>\n" +
                "          <h2>出参</h2>\n" +
                "          <div class=\"reception\">\n" +
                "            <table class=\"table\">\n" +
                "              <tr>\n" +
                "                <th>参数名</th>\n" +
                "                <th>参数类型</th>\n" +
                "                <th>是否必填</th>\n" +
                "                <th>描述</th>\n" +
                "              </tr>\n" +
                "             \n" +
                "              <tr>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "                <td></td>\n" +
                "              </tr>\n" +
                "            </table>\n" +
                "          </div>\n" +
                "          <p>返回示例: </p>\n" +
                "        </div>\n" +
                "        <div class=\"return\">\n" +
                "          <h2>测试</h2>\n" +
                "          <div class=\"form\">\n" +
                "            \n" +
                "            <div class=\"form-group\">\n" +
                "              <label class=\"control-label\"></label>\n" +
                "              <div class=\"inputbox\">\n" +
                "                <input type=\"text\" name=\"\" class=\"form-control\">\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            {{/each}}\n" +
                "            <div class=\"form-group\">\n" +
                "              <label class=\"control-label\">请求方式</label>\n" +
                "              <div class=\"inputbox\">\n" +
                "                <div class=\"radio-inline\">\n" +
                "                  <label>\n" +
                "                    <input type=\"radio\" checked=\"checked\" value=\"post\" name=\"sendType-\"> post\n" +
                "                  </label>\n" +
                "                </div>\n" +
                "                <div class=\"radio-inline\">\n" +
                "                  <label>\n" +
                "                    <input type=\"radio\" value=\"get\" name=\"sendType-\"> get\n" +
                "                  </label>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"userdefined\"></div>\n" +
                "            <div class=\"form-group\">\n" +
                "              <div class=\"form-btn inputbox\">\n" +
                "                <button class=\"btn btn-primary\" data-url=\"\" onclick=\"testSend(this);\">测试</button>\n" +
                "                <button class=\"btn\" onclick=\"reset(this);\">重置</button>\n" +
                "                <button class=\"btn\" onclick=\"userDefined(this);\">自定义参数</button>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <h2>返回内容</h2>\n" +
                "          <div class=\"form-content\">\n" +
                "\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "   \n" +
                "    </div>\n" +
                "  </script>\n" +
                "\n" +
                "<script>\n" +
                "\t\n" +
                "\tfunction flow(doc){\n" +
                "\t\tif(doc.nextSibling.nextSibling.style.display!=\"\"){\n" +
                "\t\t\tdoc.nextSibling.nextSibling.style.display=\"\";\n" +
                "\t\t}else{\n" +
                "\t\t\tdoc.nextSibling.nextSibling.style.display=\"none\";\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\t\n" +
                "\t</script>\n" +
                "</body>\n" +
                "\n" +
                "</html>";
    }


}
