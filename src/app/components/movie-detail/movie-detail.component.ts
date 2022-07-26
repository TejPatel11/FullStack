import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {MovieService} from "../../services/movie.service";

@Component({
  selector: 'app-movie-detail',
  templateUrl: './movie-detail.component.html',
  styleUrls: ['./movie-detail.component.css']
})
export class MovieDetailComponent implements OnInit {

  movie = {
    id:0,
    title: "",
    duration:0,
    genre:"",
    rating:""
  }
  constructor(private route:ActivatedRoute,
              private movieService:MovieService) { }

  ngOnInit(): void {
    let currentId = this.route.snapshot.paramMap.get("id");
    this.readMovie(currentId);
  }
  readMovie(id: any): void {
    console.log("readMovie() called");
    this.movieService.read(id)
      .subscribe( {
        next: (movie) => {
          this.movie = movie;
          console.log(movie);
        },
        error: (error) => {
          console.log(error);
        }});
  }


}
