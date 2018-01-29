import { Address } from "../common/address.model";
import { Hobby } from "../common/hobby.model";
import { Course } from "../common/course.model";

export class Person {
    id : string;
    firstName: string;
    lastName: string;
    profession : string;
    dateOfBirth : string;
    salary : number;
    address : Address;
    hobby : Hobby[]; 
    course : Course;

    constructor(firstName: string,
        lastName: string,
        profession : string,
        dateOfBirth : string,
        salary : number,
        address : Address,
        hobby : Hobby[],
        course : Course){
            this.firstName = firstName;
            this.lastName = lastName;
            this.profession = profession;
            this.dateOfBirth = dateOfBirth;
            this.salary = salary;
            this.address = address;
            this.hobby = hobby;
            this.course = course;
        }

        getId() : string{
            return this.id;
        }
        setId(id : string){
            this.id = id;
        }
}