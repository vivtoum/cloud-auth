function resizeWindow(){
	//设置内容块高度
	var windowHeight = $.PT.common.getWindowHeight();
	var windowWidth = $.PT.common.getWindowWidth();
	
	var topHeight = $("#top").height();
	var bottomHeight = $("#top").height();
	
	$("#content").width(windowWidth);
	$("#content").height(windowHeight - topHeight - bottomHeight);
	var content = $("#content").height();
	$("#content .easyui-layout").height($("#content").height());
	
	$("#content .easyui-layout .layout-panel").height($("#content .easyui-layout").height());
	var panel = $("#content .layout-panel").height();
	$("#content .easyui-layout .layout-panel-west .panel-body").height($("#content .easyui-layout .layout-panel-west").height() - $("#content .easyui-layout .layout-panel-west .panel-header").height() - 14);
	
	$("#content .easyui-layout .layout-panel-center .panel-body").height($("#content .easyui-layout .layout-panel-center").height() - 2);
	
	$("#content .layout-expand-west").height($("#content .layout-panel-center").height());
	$("#content .layout-expand-west .panel-body").height($("#content .layout-panel-center").height() - $("#content .layout-expand-west .panel-header").height());
	
	$("#content #index").height($("#content #tabs .tabs-panels").height() - 20);
//		$("#content .easyui-layout").css("margin-left",((windowWidth - $("#content .easyui-layout").width()) / 2) +"px");
};

$(document).ready(function(){
	//初始化菜单
	$("#menus").initMenu({
		url:contentPath+"function/functionList",
		//点击菜单需要新增页签
		click:function(menuId,title,action){
			$("#tabs").showTab(menuId,title,contentPath+action);
			$("#msgDiv").hide();
		},
		fields : {
			id : "functionId",
			parentId : "parentId",
			action : "url",
			title : "functionName",
			iconCls : "iconCls"
		},
		//点击菜单需要新增页签
		click:function(menuId,title,action){
			var name = $("#tabs").showTab(menuId,title,contentPath+action);
			$("#tabs iframe[name='"+name+"']").load(function(){
				var buttons = $("div[buttons]",window.frames[name].document);
				if(buttons.length > 0){
					$(this).contents().find("div[buttons]").buttons(window.frames[name].document);
				}
				
				$(this).contents().find("body").css({"margin-left":"0","margin-right":"0","margin-top":"0","margin-bottom":"0"});
		    });
			
			$("#msgDiv").hide();
		}
	});
	
	$("#closeTab").click(function(){
		var tabLength = $('#tabs').tabs('tabs').length;
		for(var i = tabLength ; i > 0 ; i --){
			$('#tabs').tabs('close', i);
		}
	});
	
	setTimeout(function(){
		//处理首页可能不显示问题
		$('#tabs').tabs('add',{title: "tt",content: "",closable: true});
		$('#tabs').tabs('close',"tt");
	},1);
	
	//窗口大小改变
	window.onresize = function () {
		resizeWindow();
	};
	resizeWindow();
	
});
/**
 * 左侧菜单栏折叠回调
 * **/
function westCollapseCallback(){
	resizeWindow();
}
// 系统登出
function logout() {
	$.confirm('确认退出系统？',function(c){  
         if(c){  
        	 $.PT.common.post(contentPath+'/user/logout', null, function(data, flag) {
     			if (flag && data == 1) {
     				window.location.href = contentPath;
     			}
     		});
         }
	});
}
function updatePass() {
	var $win;
	$win = $('#dlg').window( {
		title : '修改密码',
		width : 420,
		height : 250,
		top : ($.PT.common.getWindowHeight() - 220) * 0.5,
		left : ($.PT.common.getWindowWidth() - 450) * 0.5,
		shadow : true,
		modal : true,
		iconCls : 'icon-edit',
		closed : true,
		minimizable : false,
		maximizable : false,
		collapsible : false
	});
	$('#dlg').show();
	$win.window('open');
}
function updatedPass(){
	if (!$("#passForm").form('validate')) {
		return;
	}
	if($("#oldPassword").val() == $("#password").val()){
		$.error("新密码和原密码不能一致！");
		return;
	}
	$.PT.common.post($("#passForm").attr("action"),{"oldPassword":$("#oldPassword").val(),"password":$("#password").val()},function(data,flag){
		if(flag){
			$('#dlg').window('close');
			$.alert("密码修改成功，请重新登录！",function(){
				$.PT.common.post(contentPath+'/user/logout', null, function(data, flag) {
	     			if (flag && data == 1) {
	     				window.location.href = contentPath;
	     			}
	     		});
			});
		}
	});
}
