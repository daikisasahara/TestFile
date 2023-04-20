package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet( "/form_controller" )
public class Form_controller extends HttpServlet{
	
	
	protected void doGet( HttpServletRequest req , HttpServletResponse res ) 
			throws ServletException , IOException
	{
		
		res.setContentType( "text/html; charset=UTF-8" );
		
		// 受けたリクエストを utf-8 に変換 
		// → データベース( LOGIN_USER )にインサートした際のデータベース上の文字化けを防ぐ
		req.setCharacterEncoding( "utf-8" ) ;
		
		
		String name = req.getParameter( "name" ) ;
		int age = Integer.parseInt( req.getParameter( "age" ) ) ;
		String gender = req.getParameter( "gender" ) ;
		
		if( "man".equals( gender ) ) {
			
			gender = "男性" ;
		}
		else {
			gender = "女性" ;
		}
		
		
		req.setAttribute( "name" , name ) ;
		req.setAttribute( "age" , age ) ;
		req.setAttribute( "gender" , gender ) ;
		
		
		req.getRequestDispatcher( "result.jsp" ).forward( req , res ) ;
		
		
	}
	
	
	
	
	
}
