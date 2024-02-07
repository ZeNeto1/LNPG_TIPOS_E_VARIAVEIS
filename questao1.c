#include <stdio.h>
#include <stdlib.h>

int main() {
  int numero1, numero2;
  printf("Digite um numero:");
  scanf("%d", &numero1);
  printf("Digite outro numero:");
  scanf("%d", &numero2);
  printf("A soma entre os numeros e: %d\n", numero1 + numero2);
  printf("A subtracao entre os numeros e: %d\n", numero1 - numero2);
  printf("A multiplicacao entre os numeros e: %d\n", numero1 * numero2);
  printf("A divisao entre os numeros e: %d\n", numero1 / numero2);
  return 0;
}