import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MovieListComponent} from "./components/movie-list/movie-list.component";
import {MovieDetailComponent} from "./components/movie-detail/movie-detail.component";
import {MovieCreateComponent} from "./components/movie-create/movie-create.component";

const routes: Routes = [
  {path: '', redirectTo: 'movies', pathMatch: 'full'},
  {path: 'movies', component: MovieListComponent},
  {path: 'movies/:id', component: MovieDetailComponent},
  {path: 'create', component: MovieCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
