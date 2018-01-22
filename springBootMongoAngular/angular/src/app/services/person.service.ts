import { Injectable } from '@angular/core';
import { Person } from '../models/person/person'
import { Observable } from 'rxjs/Observable'
import { of} from 'rxjs/Observable/of'
import { HttpClient, HttpHeaders } from '@angular/common/http'

const httpOptions = {
  headers: new HttpHeaders({'contentType': 'appllication/json'}) 
}

@Injectable()
export class PersonService {

  personsUrl: string = 'http://localhost:8080/api/persons';
  persons: Person[];
  data : Observable<any>;

  constructor(private http : HttpClient) { }

  getAllPersons(): Observable<Person[]>{
    return this.http.get<Person[]>(this.personsUrl);
  }

  addPerson(person : Person): Observable<Person>{
    return this.http.post<Person>(this.personsUrl, person, httpOptions);
  }

}
