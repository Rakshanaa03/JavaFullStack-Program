import { Component } from '@angular/core';

@Component({
selector: 'app-cmp1',
templateUrl: './cmp1.component.html',
styleUrl: './cmp1.component.css'
})
export class Cmp1Component {
fname="Angular Structural";
arr:any[];
flag:boolean;
selectedVal:string;

constructor(){
this.flag=true;
this.arr=["bike","car","Lorry","cycle"];
this.selectedVal="";
}

clicking(){
return this.fname=" Developer";
}

changeFlag(){
this.flag=!this.flag;
}
clicked(val:string){
this.selectedVal=val;
}
}