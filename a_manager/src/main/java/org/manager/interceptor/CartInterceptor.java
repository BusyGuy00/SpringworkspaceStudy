package org.manager.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.manager.domain.MemberVO;
import org.springframework.web.servlet.HandlerInterceptor;

public class CartInterceptor implements HandlerInterceptor {

//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		HttpSession session = request.getSession();
//		
//		MemberVO mvo = (MemberVO)session.getAttribute("member");
//		
//		if(mvo == null) {
//			response.sendRedirect("/product/list");
//			return false;
//		} else {
//			return true;
//		}
//	
//	}

}
