class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    publicfunction__construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    publicfunctionPrintDataCar(){
        echo"License: $this->license, conductor:{$this->driver->name}, document: {$this->driver->document}";
    }
}