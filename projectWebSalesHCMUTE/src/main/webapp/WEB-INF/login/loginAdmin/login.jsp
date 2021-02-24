<%@ page pageEncoding="utf-8"%>
<%@ include file="/common/taglib.jsp"%>
<div class="login-wrap">
	<div class="login-html">
	<label for="tab-1" class="tab">Đăng Nhập</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Tên Đăng Nhập</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Mật Khẩu</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Lưu mật khẩu</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Đăng Nhập">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Quên mật khẩu?</a>
				</div>
			</div>
		</div>
	</div>
</div>