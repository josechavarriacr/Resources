<?php
/**
 * @author Jose Chavarría
 * @license MIT
 * @link https://chavarria.cr/post/arrays
 */

class Arrays 
{
	function __construct()
	{
		$arrayGeneral = array();
		$this->Insertar();
	}

	function Insertar(){
		echo("Insertar...");
		for ($i=0; $i <5; $i++) { 
			echo '</br>'.'índice: '.$i.' valor: '.$this->arrayGeneral[]=$i;
		}
	}

	function Recorrido(){
		echo("</br></br>Recorrido...");
		for ($i=0; $i < count($this->arrayGeneral); $i++) { 
			echo '</br>'.'índice: '.$i.' valor: '.$this->arrayGeneral[$i];
		}
	}

	function Actializar($past, $var){
		echo ("</br></br>Actializar: ".$past." a ".$var);
		for ($i=0; $i < count($this->arrayGeneral); $i++) { 
			if($this->arrayGeneral[$i]==$past){
				echo '</br>'.'índice: '.$i.' valor: '.$this->arrayGeneral[$i] =$var;
			}
		}
	}
	function Buscar($var){
		echo ("</br></br>Buscar :".$var);
		for ($i=0; $i < count($this->arrayGeneral); $i++) { 
			if ($this->arrayGeneral[$i]==$var) {
				echo '</br>'.'índice: '.$i.' valor: '.$this->arrayGeneral[$i];
			} 
		}
	}
	function Eleminacion($var){
		echo ("</br></br>Eleminacion: ".$var."</br>");
		$nuevoArray = array(); $aux=0;
		for ($i=0; $i < count($this->arrayGeneral) ;$i++) { 
			if($this->arrayGeneral[$i]!=$var){
				$this->nuevoArray[$aux]=$this->arrayGeneral[$i];
				$aux++;
			}
		}
		$this->arrayGeneral = $this->nuevoArray;
	}
}

$a = new Arrays();
$a->Recorrido();
$a->Buscar(2);
$a->Actializar(2,100);
$a->Eleminacion(3);
$a->Recorrido();

?>