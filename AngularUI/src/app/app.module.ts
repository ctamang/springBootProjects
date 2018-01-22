import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { PersonListComponent } from './components/person/personList.component';
import { HttpClient } from '@angular/common/http/src/client';
import { HttpClientModule } from '@angular/common/http/src/module';
import { PersonService } from './service/person/person.service';


@NgModule({
  declarations: [
    AppComponent,
    PersonListComponent
  ],
  imports: [
    BrowserModule,
    PersonListComponent,
    HttpClientModule
  ],
  providers: [PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
