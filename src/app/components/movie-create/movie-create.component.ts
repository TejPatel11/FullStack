import { Component, OnInit } from '@angular/core';
import {MovieService} from "../../services/movie.service";

@Component({
  selector: 'app-movie-create',
  templateUrl: './movie-create.component.html',
  styleUrls: ['./movie-create.component.css']
})
export class MovieCreateComponent implements OnInit {
  movie = {
    id:0,
    title:"",
    duration:0,
    genre:"",
    rating:""
  }
  constructor(private movieService : MovieService) { }

  ngOnInit(): void {
  }
  processCreate(): void {
    console.log("processCreate() called product = " + JSON.stringify(this.movie));
    this.movieService.create(this.movie)
      .subscribe( {
        next: (msg) => {
          console.log(JSON.stringify(msg));
        },
        error: (error) => {
          console.log(error);
        }});
  }
}
