from car import Car

if __name__ == "__main__":
    print("hello world")
    car = Car()
    car.id = 1
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    car.passenger = 4
    print(vars(car))