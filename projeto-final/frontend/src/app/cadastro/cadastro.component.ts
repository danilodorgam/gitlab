import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router'

import { DiasDaSemana } from './../dias-da-semana.enum';
import { Pessoa } from './../Objetos/pessoa';
import { CadastroService } from '../service/cadastro.service';


@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  id: any
  pessoa: Pessoa = new Pessoa();
  textoBotao: string = 'Salvar';
  formInvalido = false;
  cargos = [
    {
    "id": 1,
    "nome": "Analista de Sistemas Jr."
  },
  {
    "id": 2,
    "nome": "Analista de Sistemas Pl."
  },
  {
    "id": 3,
    "nome": "Analista de Sistemas Sr."
  }
]

  constructor(
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private cadastroService: CadastroService
  ) { }

  ngOnInit(): void {
    
    this.activatedRoute.params.subscribe(parametros =>{
      if(parametros['id']){
        this.textoBotao = 'Editar'
        this.id = parametros['id']
        this.cadastroService.buscarItemID(this.id).subscribe(p =>{
          this.pessoa = p
        })
      }
    })
  }


  editar = () =>{
    this.cadastroService.editar(this.pessoa).subscribe(
      success => this.navegar('listar'),
      error => console.log("Deu ruim"),
      () => console.log('Requisição completa'))
      
  }

  navegar = (rota: any) =>{
    this.router.navigate([rota])
  }

  onSubmit(form:any){

    if(form.valid == false){
      this.formInvalido = true
    }else{
      if(this.textoBotao == 'Salvar'){
        this.cadastroService.adicionar(this.pessoa).subscribe(
          success => this.navegar('listar'),
          error => console.log("Deu ruim"),
          () => console.log('Requisição completa'))
      }else{
        this.editar()
      }
    }
  }

}
