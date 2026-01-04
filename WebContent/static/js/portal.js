PrimeFaces.locales['pt'] = {
	closeText : 'Fechar',
	prevText : 'Anterior',
	nextText : 'Próximo',
	currentText : 'Começo',
	monthNames : [ 'Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho',
			'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro' ],
	monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago',
			'Set', 'Out', 'Nov', 'Dez' ],
	dayNames : [ 'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta',
			'Sábado' ],
	dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sáb' ],
	dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' ],
	weekHeader : 'Semana',
	firstDay : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Só Horas',
	timeText : 'Tempo',
	hourText : 'Hora',
	minuteText : 'Minuto',
	secondText : 'Segundo',
	currentText : 'Data Atual',
	ampm : false,
	month : 'Mês',
	week : 'Semana',
	day : 'Dia',
	allDayText : 'Todo Dia'
};


$(window).load(function () {
    $(document).delegate(".checkall", "click", function(event) {
    		var checkboxes = $(this).closest('form').find(':checkbox');
          
          if($(this).is(':checked')) {
              checkboxes.prop('checked', true);
          } else {
              checkboxes.prop('checked', false);
          }
    });
    
   /* $(document).delegate(".myGroup", "click", function(event) {
		var checkboxes = $(this).closest('form').find(':radio');
      
	    if (radio.name.lastIndexOf(":") != -1 ) {
	        jQuery('input[type="radio"]').each(function() {
	            var currentFull = jQuery(this).attr('name');
	            var currentName = currentFull.substring(currentFull.lastIndexOf(":")+1);
	 
	            if (currentName.substring(0, id.length)==id)
	                jQuery(this).attr('checked', false);
	        });
	    } else {
	        jQuery('input[type="radio"][id^="'+id+'"]').each(function() {
	            jQuery(this).attr('checked', false);
	        });
	    }
	    radio.checked = true;
});*/
    
});
/*
function uncheckSameCheckbox(checkbox, id) {
    if (checkbox.name.lastIndexOf(":") != -1   ) {
        jQuery('input[type="checkbox"]').each(function() {
            var currentFull = jQuery(this).attr('name');
            var currentName = currentFull.substring(currentFull.lastIndexOf(":")+1);
 
            if (currentName.substring(0, id.length)==id)
                jQuery(this).attr('checked', false);
        });
    } else {
        jQuery('input[type="checkbox"][id^="'+id+'"]').each(function() {
            jQuery(this).attr('checked', false);
        });
    }
    checkbox.checked = true;
}
*/

function alteraOpcao(radio) {
	$("#opcaoId").val(radio.defaultValue);
	/*#426fd9;*/
	
	
	if(radio.defaultValue == "1"){
		$('.Opcao1').each(function (i){
			  $(this).css("background","#426fd9");
			  $(this).css("color","white");
		});
		
		$('.Opcao2').each(function (i){
			  $(this).css("background","white");
			  $(this).css("color","black");
		});
		
	}
	else{
		$('.Opcao1').each(function (i){
			  $(this).css("background","white");
			  $(this).css("color","black");
		});
		
		$('.Opcao2').each(function (i){
			  $(this).css("background","#426fd9");
			  $(this).css("color","white");
		});
	}
	
	
	
}