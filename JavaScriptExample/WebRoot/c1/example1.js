//��ͼ������
var helper = {};
helper.formatDate = function(date){
	alert(date);
	alert("this is the formatDate method");
}
//������
/*
var Controller = {};
//ʹ�������ڲ�������װһ��������
(Controller.users = function(){
	var nameClick = function(){
		
	};
})(jQuery);

*/

//��ģ�黯������������
var Person = function(name,sex){
	this.name = name;
	this.sex = sex;
}

//����һ����
var alice = new Person('alice','��');
//alert(alice.name);					//��ӡalice
//alert(alice instanceof Person);  	//��ӡtrue

//��ģ���
var Class = function(){
	var kclass = function(){
		this.init.apply(this,arguments);
	};
	kclass.prototype.init = function(){
		alert("KClass");
	};
	return kclass;
}

var Person = new Class;
Person.prototype.init = function(name,sex){
	alert(name)
	alert(sex)
}

var person = new Person('alice','sex');