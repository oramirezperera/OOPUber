class Account{
    public $id;
    public $document;
    public $name;
    public $email;
    public $password;

    publicfunction__construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
}