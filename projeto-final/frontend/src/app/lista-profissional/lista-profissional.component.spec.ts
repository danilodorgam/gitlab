import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaProfissionalComponent } from './lista-profissional.component';

describe('ListaProfissionalComponent', () => {
  let component: ListaProfissionalComponent;
  let fixture: ComponentFixture<ListaProfissionalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaProfissionalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaProfissionalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
