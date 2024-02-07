#include <stdio.h>
#include <stdlib.h>

int main(){
    int numero1;
    printf("Digite um numero: ");
    scanf("%d", &numero1);

    if(numero1%2==0){
      printf("O numero digitado e par");

    } else{
        printf("O numero digitado e impar");

    }
}