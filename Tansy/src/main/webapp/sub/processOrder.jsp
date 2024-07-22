<%@page import="java.util.List"%>
<%@ page import="xyz.itwill.dto.OrdDTO"%>
<%@ page import="xyz.itwill.dao.OrdDAO"%>
<%@ page import="xyz.itwill.dto.CartDTO"%>
<%@ page import="xyz.itwill.dao.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    request.setCharacterEncoding("UTF-8");

    int clientNum = (Integer) session.getAttribute("clientNum");

    String ordererName = request.getParameter("orderer_name");
    String ordererPhone = request.getParameter("orderer_phone");
    String ordererEmail = request.getParameter("orderer_email") + "@" + request.getParameter("email_domain");

    String recipientName = request.getParameter("recipient_name");
    String recipientPhone = request.getParameter("recipient_phone");
    String postcode = request.getParameter("postcode");
    String address = request.getParameter("address");
    String detailAddress = request.getParameter("detailAddress");

    // 장바구니 정보를 가져와서 처리
    CartDAO cartDAO = CartDAO.getCartDAO();
    List<CartDTO> cartList = cartDAO.selectCartClient(clientNum);

    for (CartDTO cart : cartList) {
        OrdDTO order = new OrdDTO();
        order.setOrdclientNum(clientNum);
        order.setOrdReceiver(recipientName);
        order.setOrdZipcode(postcode);
        order.setOrdAddress1(address);
        order.setOrdAddress2(detailAddress);
        order.setOrdMobile(recipientPhone);
        order.setOrdCount(String.valueOf(cart.getCartCount()));
        order.setOrdproductNum(cart.getCartProductNum());
        // 여기에 주문 시간과 날짜를 설정해야 합니다. 예: order.setOrdTime("12:34:56"); order.setOrdDate("2022-01-01");

        OrdDAO orderDAO = OrdDAO.getOrdDAO();
        orderDAO.insertOrder(order);
    }

    response.sendRedirect("orderComplete.jsp");
%>
