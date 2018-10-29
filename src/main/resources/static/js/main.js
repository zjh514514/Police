 var vm = new Vue({
        el: '#app',
        data: {
            police:  [{
                name: 'Zhangsan',
                policeid: 01
            },
                {
                    name: 'Lucy',
                    policeid: 26
                },
                {
                    name: 'Tom',
                    policeid: 22
                },
                {
                    name: 'Jesen',
                    policeid: 36
                }]
        },
        mounted:function(){
            this.getPolice();

        },
        methods: {
            //获取初始学生数据
            getPolice: function () {
                console.log("police data post success")
                var _self = this
                $.ajax({
                    url: 'http://localhost:8080/police/userquery',
                    type: 'get',
                    dataType: 'json',
                    success: function (res) {
                        _self.police = res
                        console.log(_self.police)
                    },
                    error: function () {
                        console.log("police data get error")
                    },
                    complete : function(XMLHttpRequest,status){ //请求完成后最终执行参数
                        if(status=='timeout'){//超时,status还有success,error等值的情况
                            alert("超时");
                        }
                    }
                })
            }

        }
    });
