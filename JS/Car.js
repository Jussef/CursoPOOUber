// JavaScript Vanilla
// function Car(license, drive) {
//     this.id;
//     this.license = license;
//     this.driver = drive;
//     this.passenger;
    
//     Car.prototype.printDataCar = function() {
//         console.log(this.driver);
//         console.log(this.driver.name);
//         console.log(this.driver.document);
//     }
// }


//ES6
class Car {
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    printDataCar = () => {
        console.log("__CAR__");
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.log("____");
    };
}
