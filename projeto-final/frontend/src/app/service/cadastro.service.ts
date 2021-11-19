import { Pessoa } from './../Objetos/pessoa';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {
  private readonly API = `${environment.API}pessoa`

  constructor(private $http: HttpClient) { }

  listar(){
    return this.$http.get<Pessoa[]>(`${this.API}`)
  }

  excluirItem(id: any){
    return this.$http.delete(`${this.API}/${id}`)
  }

  adicionar(p: Pessoa){
    return this.$http.post(this.API, p)
  }

  editar(p: Pessoa){
    return this.$http.put(`${this.API}/${p.id}`, p)
  }

  buscarItemID(id:any){
    return this.$http.get<Pessoa>(`${this.API}/${id}`)
  }

}
