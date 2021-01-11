<?php
include_once("payment.php");

class Cash extends Payment{
    public function __construct($id, $amount){
        parent::__construct($id, $amount);
    }
}
?>