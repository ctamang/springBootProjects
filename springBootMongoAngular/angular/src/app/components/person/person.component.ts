import { Component, OnInit } from '@angular/core';
import { PersonService} from '../../services/person.service'
import { Person } from '../../models/person/person';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})



export class PersonComponent implements OnInit {

  persons : Person[];
  loaded : boolean = false;

  constructor( private personService: PersonService) { }

  ngOnInit() {
    this.personService.getAllPersons().subscribe(persons => {
      console.log(persons)
      this.persons = persons;
    })
    this.loaded = true;
  }

}
