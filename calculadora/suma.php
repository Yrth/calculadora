		<?php 
			$valor1 = $_POST['T1']; 
			$valor2 = $_POST['T2']; 
			$aux=file_get_contents("plantilla.html");
			if($_POST["Suma"]){
				$res = $valor1 + $valor2; 
			}
			elseif ($_POST["Resta"]) {
				$res = $valor1 - $valor2;
			}
			elseif ($_POST["Mul"]) {
				$res = $valor1 * $valor2;
			}
			elseif ($_POST["Div"]) {
				$res = $valor1 / $valor2;
			}
			$aux = str_replace("##resultado##","$res",$aux);
			echo $aux;
		?> 