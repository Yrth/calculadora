<?php


   $val1= $_POST["value1"];
   $val2= $_POST["value2"];
   $operador= $_POST["operator"];

   switch ($operador) {
       case "+":
           $res=(int)$val1+(int)$val2;
           break;
       case "-":
           $res=(int)$val1-(int)$val2;
           break;
       case "*":
           $res=(int)$val1*(int)$val2;
           break;
       case "/":
           $res=(int)$val1/(int)$val2;
           break;
       case "^":
           $res=(int)$val1^(int)$val2;
           break;
   }
   $string=str_replace("##bonito##","<br>"+$res,file_get_contents('vista.html'));

   
   echo $string;


?>