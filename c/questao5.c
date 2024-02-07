#include <stdio.h>
#include <stdlib.h>

int main(){

    float nota1, nota2, nota3,somanota;
    printf("Digite as tres notas: ");
    scanf("%f%f%f",&nota1,&nota2,&nota3);
    somanota = (nota1+nota2+nota3)/3;
    printf("A media geral das notas e: %.2f", somanota);
}