package cn.bdqn.controller;

import cn.bdqn.pojo.Comments;
import cn.bdqn.service.CommentService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class Product_info {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/leave",method = RequestMethod.POST)
    @ResponseBody
    public Map leave(HttpServletRequest request, HttpServletResponse response)throws Exception{
       String head=request.getParameter("hea");
       String page=request.getParameter("page");
       String comment=request.getParameter("commen");
       Comments comments=new Comments();
       comments.setComentsHead(head);
       comments.setCommentsPath(page);
       comments.setCommentsCont(comment);
        int result=commentService.insertselect(comments);
        Map<Object,Integer> map=new HashMap<>();
        if (result!=0){
            System.out.println(result);
            map.put("result",1);
        }else {
            map.put("result",2);
        }
        return map;
    }

}
