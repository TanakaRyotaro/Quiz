<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.label {
	border-width: 0pt;
}
</style>
</head>
<body>
		<%
	// サーブレットから送られてきたテキストを受け取る
	String rConfirmName = (String) request.getAttribute("confirmName");
	String sConfirmName = (String) session.getAttribute("confirmName");
	String confirmPassword = (String) request.getAttribute("confirmPassword");
	String confirmName = rConfirmName != null ? rConfirmName : sConfirmName;
	%>
	<b>確認画面</b>
	<div>
		<form method='post' action='complete'>
			<span>　氏　名　：</span> <input type="text" value="<%=confirmName%>"
				name="compName" readonly="true" tabindex="-1" class="label"><br>
			<span>パスワード：</span><input type="text" value="<%=confirmPassword%>"
				name="compPassword" readonly="true" tabindex="-1" class="label"><br> 
			<button onclick="history.back()">戻る</button>
			<input type="submit" value="登録">
		</form>
	</div>
</body>
</html>