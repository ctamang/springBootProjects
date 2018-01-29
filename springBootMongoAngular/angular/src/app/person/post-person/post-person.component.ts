import { Component, OnInit } from '@angular/core';
import { PersonService} from '../../person/person.service'
import { Person } from '../../person/person.model';
import { Address } from '../../common/address.model';
import { Hobby } from '../../common/hobby.model';
import { Course } from '../../common/course.model';

@Component({
  selector: 'app-post-person',
  templateUrl: './post-person.component.html',
  styleUrls: ['./post-person.component.css']
})
export class PostPersonComponent implements OnInit {
  person : Person;
  constructor(private personService : PersonService) { }

  ngOnInit() {
  }

  savePerson(firstName, lastName, profession, dob, salary, addressLineOne, addressLineTwo, city, country, hobbyOne, hobbyTwo, hobbyThree, course){
    this.person = 
     new Person(
      firstName,
      lastName,
      profession,
      dob,
      salary,
      new Address(addressLineOne, addressLineTwo, city, country),
      [
        new Hobby(hobbyOne),
        new Hobby(hobbyTwo),
        new Hobby(hobbyThree),
      ],
      new Course(course, '')
    );
    if(!firstName || !lastName || !profession || !dob || !salary ){
      alert("please fill all the fields");
    }else{
      this.personService.addPerson(this.person).subscribe(
        p => {
          console.log(p);
        }
      )
    }    
  }
}
