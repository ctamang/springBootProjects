import { Component, OnInit, Input } from '@angular/core';

import { PersonService } from '../../service/person/person.service';
import { Person } from '../../model/person/person';


@Component({
 selector: 'person-list',
 templateUrl: './personList.component.html',
 styleUrls: ['./personList.component.css']
})
export class PersonListComponent{

 persons:any[] = [];
 person={
     firstName:'',
     secondName:'',
     dateOfBirth:''

 }

 constructor(public personService: PersonService) { 
   this.personService.getAllPersons().subscribe(persons => {
     console.log(persons);

     this.persons = persons;
   })
 }
}