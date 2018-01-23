import { Address } from "./address";
import { Hobby } from "./hobby";
import { Course } from "./course";

export interface Person {
    firstName: string,
    lastName: string,
    profession : string,
    salary : number,
    address : Address,
    hobby : any[], 
    course : Course;
}