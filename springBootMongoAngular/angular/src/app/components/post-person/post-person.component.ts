import { Component, OnInit } from '@angular/core';
import { PersonService} from '../../services/person.service'
import { Person } from '../../models/person/person';
import { Address } from '../../models/person/address';

@Component({
  selector: 'app-post-person',
  templateUrl: './post-person.component.html',
  styleUrls: ['./post-person.component.css']
})
export class PostPersonComponent implements OnInit {

  constructor(private personService : PersonService) {
   }

  ngOnInit() {
    
  }
  
  addStudent(firstName, lastName, profession, dob, salary, address, hobby, course){
    if(!firstName || !lastName || !profession || !dob || !salary ){
      alert("please fill all the fields");
    }else{
      this.personService.addPerson({firstName, lastName, profession, dob, salary, address, hobby, course} as Person).subscribe(
        person => {
          console.log(person);
        }
      )
    }    
  }
}
