import { Component, OnInit } from '@angular/core';
import { PersonService} from '../../person/person.service'
import { Person } from '../../person/person.model';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})



export class PersonComponent implements OnInit {

  persons : Person[];
  loaded : boolean = false;

  constructor( private personService: PersonService,
               private router : Router,
               private route : ActivatedRoute){ }

  ngOnInit() {
    this.personService.getAllPersons().subscribe(persons => {
      console.log(persons)
      this.persons = persons;
    })
    this.loaded = true;
  }
  onReload(){
    //this code will break
    //this.router.navigate(['persons'], {relativeTo : this.route});
    //this code will work
    //this.router.navigate(['/persons'], {relativeTo : this.route});

  }
}
