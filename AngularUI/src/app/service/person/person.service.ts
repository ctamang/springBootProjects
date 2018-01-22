import { Injectable } from '@angular/core'
import { Observable } from 'rxjs/Observable'
import { HttpClient, HttpRequest } from '@angular/common/http';

export class PersonService {
    private baseUrl = 'http://localhost:8080/api/persons';
    
     constructor(private http: HttpClient) { }
    
     getPerson(id: string): Observable<Object> {
       return this.http.get(`${this.baseUrl}/${id}`);
     }
    
     createPerson(Person: Object): Observable<Object> {
       return this.http.post(`${this.baseUrl}` + `/create`, Person);
     }
    
     updatePerson(id: string, value: any): Observable<Object> {
       return this.http.put(`${this.baseUrl}/${id}`, value);
     }
    
     deletePerson(id: string): Observable<any> {
       return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
     }
    
     getAllPersons(query = {}): Observable<any> {
       return this.http.get(`${this.baseUrl}`);
     }
    
     deleteAll(): Observable<any> {
       return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
     }
}