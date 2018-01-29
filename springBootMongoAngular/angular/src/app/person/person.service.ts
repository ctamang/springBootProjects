import { Injectable } from '@angular/core';
import { Person } from '../person/person.model'
import { Observable } from 'rxjs/Observable'
import { of} from 'rxjs/Observable/of'
import { HttpClient, HttpHeaders } from '@angular/common/http'

const httpOptions = {
  headers: new HttpHeaders({'contentType': 'appllication/json'}) 
}

@Injectable()
export class PersonService {

  personsUrl: string = 'http://localhost:8080/api/persons/';
  persons: Person[];
  data : Observable<any>;
  id : String;
  constructor(private http : HttpClient) { }


  getAllPersons(): Observable<Person[]>{
    return this.http.get<Person[]>(this.personsUrl);
  }

  addPerson(person : Person): Observable<Person>{
    return this.http.post<Person>(this.personsUrl, person, httpOptions);
  }

  deletePerson(person : Person | string) : Observable<Person>{
    const id = typeof person === 'string' ? person : person.getId();
    const url = `${this.personsUrl}${id}` 
    return this.http.delete<Person>(url, httpOptions)
  }
}
