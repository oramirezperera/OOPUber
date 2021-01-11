<?php
class Payment{
    public $id;
    public $amount;

    public function __construct($id, $amount){
        $this->id = $id;
        $this->amount = $amount;
    }
}
?>