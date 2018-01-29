import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/Forms';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { PersonService } from './person/person.service';
import { PostPersonComponent } from './person/post-person/post-person.component';
import { PersonComponent } from './person/person/person.component';
import { Route } from '@angular/compiler/src/core';
import { HomeComponent } from './home/home.component';
import { Routes } from '@angular/router/src/config';
import { RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { GetAllPersonsComponent } from './person/get-all-persons/get-all-persons.component';
import { UpdatePersonComponent } from './person/update-person/update-person.component'

const appRoutes : Routes= [
  { path : 'persons', component : GetAllPersonsComponent },
  { path : '', component : HomeComponent },
  { path : 'savePerson' , component : PostPersonComponent},
  { path : 'updatePerson', component : UpdatePersonComponent}
];
@NgModule({
  declarations: [
    AppComponent,
    PersonComponent,
    PostPersonComponent,
    HomeComponent,
    NavbarComponent,
    GetAllPersonsComponent,
    UpdatePersonComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)

  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
