const addBtn = document.querySelector("#addBtn");
const createBtn= document.querySelector("#createBtn");
const xmlData = document.querySelector("#xmlData");

addBtn.addEventListener('click', function(){
	if(xmlData.children.length > 0){
		let length = xmlData.children[0].children;
		let tr = document.createElement('tr');
		tr.className = "newtr";
		xmlData.appendChild(tr);
		let newtr = document.querySelector('.newtr');
		for(let i=0; i<length.length; i++){
			let td = document.createElement('td');
			let input = document.createElement('input');
			input.type = "text";
			input.name = length[i].className;
			input.placeholder = "입력란";
			td.appendChild(input);
			tr.appendChild(td);
		}	
	}
	else{
		let tr = document.createElement('tr');
		tr.className = "newtr";
		xmlData.appendChild(tr);
		let newtr = document.querySelector('.newtr');
		for(let i=0; i<4; i++){
			let td = document.createElement('td');
			let input = document.createElement('input');
			input.type = "text";
			switch(i){
			case 0 :
				input.name = "custId";
				break;
			case 1 :
				input.name = "custName";
				break;
			case 2 :
				input.name = "custAge";
				break;
			case 3 :
				input.name = "custEmail";
			}			
			input.placeholder = "입력란";
			td.appendChild(input);
			tr.appendChild(td);
		}
	}
});

createBtn.addEventListener('click', function(){
	let newtr = document.querySelectorAll('.newtr');
	newtr.forEach(function(tr){
		let td = tr.children;
		let custId = "";
		let custName = "";
		let custAge = "";
		let custEmail = "";
		
		for(let i=0; i<td.length; i++){
			switch(i){
			case 0 :
				custId = td[i].firstChild.value;
				break;
			case 1 :
				custName = td[i].firstChild.value;
				break;
			case 2 :
				custAge = td[i].firstChild.value;
				break;
			case 3 :
				custEmail = td[i].firstChild.value;
				break;
			}
		}		
		$.ajax({
			url : 'create_data',
			type : 'post',
			data : {'custId' : custId, 'custName' : custName, 'custAge' : custAge, 'custEmail' : custEmail}
		})
	})
	
	$.ajax({
		url : 'sendWrite',
		success : function(){
			location.reload();
		}
	})
});