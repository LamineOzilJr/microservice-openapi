import { Component } from '@angular/core';
import {HttpClientModule} from "@angular/common/http";
import {ClassesService} from "../../lib/openapi";

@Component({
  selector: 'app-classes',
  standalone: true,
  imports: [HttpClientModule],
  providers: [ClassesService],
  templateUrl: './classes.component.html',
  styleUrl: './classes.component.css'
})
export class ClassesComponent {
  classes: any;
  constructor(private classesService:ClassesService) {

    this.classesService.getClasse(1)
      .subscribe({
        next: datas => {
          console.log(datas)
        },
        error: err => {
          console.log(err)
        }
      });
  }

}
