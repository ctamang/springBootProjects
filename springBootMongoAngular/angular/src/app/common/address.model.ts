export class Address{
    addressLineOne : string;
    addressLineTwo : string;
    city : string;
    country : string;
    constructor(addressLineOne : string, addressLineTwo : string, city : string, country : string){
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.country = country;
    }
}

