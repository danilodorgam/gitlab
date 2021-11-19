import { Component, OnInit } from '@angular/core';
import { Pessoa } from './../Objetos/pessoa';
import { CadastroService } from '../service/cadastro.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  prod: any
  pessoas: Array<Pessoa> = []
  carregarLoading: boolean = false
  constructor(private cadastroService: CadastroService, private router: Router) { }

  ngOnInit(): void {

    this.cadastroService.listar().subscribe(prods =>{
     // setTimeout(() =>{
        this.carregarLoading  = true
        this.pessoas = prods
     // },100)
    }) 
  }

  excluirItem = (id: any) =>{
    this.cadastroService.excluirItem(id).subscribe(
      success => console.log("Deletou"),
      error => console.log("Deu ruim"),
      () => console.log('Requisição completa')
      )
      this.ngOnInit();
  }

  editar = (id:any) =>{
    this.router.navigate(['cadastro', id])
  }


}
