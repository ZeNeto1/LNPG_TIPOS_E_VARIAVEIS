#include <stdio.h>
#include <stdlib.h>

int main(){
   float temp;

   printf("Digite o valor da temperatura em celsius: ");
   scanf("%f", &temp);
   printf("%.1f em Celsius sao %.1f em Farenheit", temp, temp*1.8+32);

}