var a = $("#username").val();
var b = $("#password1").val();
var c = $("#password2").val();
var d = $("#name").val();
var e = $("#phonenum").val();


function getByteLen(val) {
    var len = 0;
    for (var i = 0; i < val.length; i++) {
        var n = val.charAt(i);
        if (n.match(/[^\x00-\xff]/ig) !== null) {
            len += 2;
        }
        else {
            len += 1;
        }
    }
    return len;
}
//若输入框为空，阻止表单的提交
function register() {
    // 全局变量a和b，分别获取用户框和密码框的value值
    a = $("#username").val();
    b = $("#password1").val();
    c = $("#password2").val();
    d = $("#name").val();
    e = $("#phonenum").val();

    if (!a || !b || !c || !d || !e) { //用户框value值和密码框value值都为空
        alert("请输入完整信息");
        return false; //只有返回true表单才会提交
    }else if (isNaN(a) || getByteLen(a) !== 8) { //用户框value值为空
        alert("请输入正确学号");
        return false;
    }else if (b !== c) { //用户框value值为空
        alert("请确认两次密码是否相同");
        return false;
    }else if(getByteLen(e) !== 11){
        alert("请输入正确的手机号码");
        return false;
    }else{
        $.ajax({
            type: "post",
            "url":"register",
            "data":{
                "username":a,
                "password":c,
                "name":d,
                "phonenum":e
            },
            success:function(data){
                if(data.code!==0){
                    alert(data.msg);
                }else{
                    alert("注册成功");
                    window.location="tologin";
                }
            },
            error:function(){
                alert("服务器错误");
            }
        })
    }
}