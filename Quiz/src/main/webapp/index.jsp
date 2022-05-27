<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
		<%
	// サーブレットから送られてきたテキストを受け取る
	String textName = (String) request.getAttribute("textName");
	String errMsg = (String) request.getAttribute("errMsg");
	%>
	<b>入力画面</b>
	<div>
		<font color="red"><%=errMsg != null ? errMsg : ""%></font>
	</div>
	<div>
		<form method='post' action='confirm'>
			 <span>　氏　名　：</span> <input type="text"placeholder="20文字以内で入力してください" name="inputName"><br>
			  <span>パスワード：</span><input type="text" placeholder="半角英数字8文字以上12文字以内で入力してください" name="inputPassword"><br>
			 <input type="submit" value="確認">
		</form>
	</div>
</body>
</html>