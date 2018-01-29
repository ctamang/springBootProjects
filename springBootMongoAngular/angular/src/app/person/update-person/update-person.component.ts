import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-person',
  templateUrl: './update-person.component.html',
  styleUrls: ['./update-person.component.css']
})
export class UpdatePersonComponent implements OnInit {

  constructor(private router : Router) { }

  ngOnInit() {
    
  }

  updatePerson(){
    this.router.navigate(['/updatePerson']);
  }

}
