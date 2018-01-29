import { Component, OnInit } from '@angular/core';
import { PersonService} from '../../person/person.service'
import { Person } from '../../person/person.model';
import { Router, ActivatedRoute } from '@angular/router';
import { indexDebugNode } from '@angular/core/src/debug/debug_node';

@Component({
  selector: 'app-get-all-persons',
  templateUrl: './get-all-persons.component.html',
  styleUrls: ['./get-all-persons.component.css']
})
export class GetAllPersonsComponent implements OnInit {

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

  deletePerson(person : Person){
    if(confirm('confirm?..')){
      this.personService.deletePerson(person.id).subscribe(() => { 
          this.persons.forEach((p , index) =>{
            if(person.id === p.id){
              this.persons.splice(index, 1);
            }
          });
      });
  }
  }

  updatePerson(){
    this.router.navigate(['/updatePerson']);
  }
}
