#include<stdio.h>


void main()
{
    int idade;
    printf("Digite a sua idade: ");
    scanf("%d", &idade);

    if(idade>=18){
        printf("Voce e maior de idade");
    }   else{
        printf("Voce nao e maior de idade");
    }
    
}