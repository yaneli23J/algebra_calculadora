public

import java.util.Scanner;

public class Calculadora {

    double A[][];
    double m[][];
    int N;

 public void input(){
Scanner s=new Scanner(System.in);
System.out.println("Ingrese el orden de la matriz (N° Filas = N° Columnas)");
N=s.nextInt();
A = new double[N][];
for(int i=0;i<N;i++){
A[i]=new double[N];
}

System.out.println("Ingrese la matriz a calcular:");
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
int k=s.nextInt();
A[i][j]=k;
}
}
}
public double determinant(double A[][],int N){
double res;
if(N == 1) {
res = A[0][0];
}
else if (N == 2){
res = A[0][0]*A[1][1] - A[1][0]*A[0][1];
}
else{
res=0;
for(int j1=0;j1<N;j1++){
m = new double[N-1][];
for(int k=0;k<(N-1);k++){
m[k] = new double[N-1];
for(int i=1;i<N;i++){
int j2=0;
for(int j=0;j<N;j++){
if(j == j1)
continue;
m[i-1][j2] = A[i][j];
j2++;
}
}
res += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1] * determinant(m,N-1);
}
}
}
return res;
}
public static void main(String[] args) {
System.out.println("CALCULADORA DE MATRICES");
int m1, n1;
int m2, n2;
double auxN;
int op;
int i = 0, j = 0, k = 0;

Scanner teclado = new Scanner(System.in);
System.out.println("Seleccione la operacion a realizar");
System.out.println("1. Suma");
System.out.println("2. Resta");
System.out.println("3. Multiplicacion");
System.out.println("4. Determinantes");
System.out.println("5. Inversa de una matriz");
op = teclado.nextInt();
while (op < 1 || op > 5) {
System.out.println("Opcion no valida, intente nuevamente");
op = teclado.nextInt();
}
System.out.println();
System.out.println("Nota, los elementos de las matrices deben ser ingresados fila por fila, por ejemplo en una matriz 3x3:");
System.out.println("a1 a2 a3");
System.out.println("a4 a5 a6");
System.out.println("a7 a8 a9");
System.out.println();
if (op == 1) {
System.out.println("Para sumar matrices ambas deben ser del mismo orden");
System.out.println("Ingrese el orden de las matrices");

m1 = teclado.nextInt();
n1 = teclado.nextInt();
double A[][] = new double[m1][n1];
double B[][] = new double[m1][n1];
System.out.println("Ingrese la primera matriz");
while (i < m1) {
while (j < n1) {
auxN = teclado.nextDouble();
A[i][j] = auxN;
j++;
}
j = 0;
i++;
}
i = 0;
System.out.println("Ingrese la segunda matriz");
while (i < m1) {
while (j < n1) {
auxN = teclado.nextDouble();
B[i][j] = auxN;
j++;
}
j = 0;
i++;
}
i = 0;
j = 0;
System.out.println("La matriz resultante es: ");
while (i < m1) {
while (j < n1) {
System.out.print(A[i][j] + B[i][j] + " ");
j++;
}
System.out.println();
j = 0;
i++;
}
} else if (op == 2) {
System.out.println("Para restar matrices ambas deben ser del mismo orden");
System.out.println("Ingrese el orden de las matrices");

m1 = teclado.nextInt();
n1 = teclado.nextInt();
double A[][] = new double[m1][n1];
double B[][] = new double[m1][n1];
System.out.println("Ingrese la primera matriz");
while (i < m1) {
while (j < n1) {
auxN = teclado.nextDouble();
A[i][j] = auxN;
j++;
}
j = 0;
i++;
}
i = 0;
System.out.println("Ingrese la segunda matriz");
while (i < m1) {
while (j < n1) {
auxN = teclado.nextDouble();
B[i][j] = auxN;
j++;
}
j = 0;
i++;
}
i = 0;
j = 0;
System.out.println("La matriz resultante es: ");
while (i < m1) {
while (j < n1) {
System.out.print((A[i][j] - B[i][j]) + " ");
j++;
}
System.out.println();
j = 0;
i++;
}
}
else if (op == 3) {
System.out.println("Para multiplicar dos matrices el numero de columnas de la primera debe ser igual al numero de filas de la segunda");

System.out.println("Ingrese el orden de la primera matriz");
m1 = teclado.nextInt();
n1 = teclado.nextInt();
System.out.println("Ingrese el orden de la segunda matriz");
m2 = teclado.nextInt();
n2 = teclado.nextInt();
while (n1 != m2) {
System.out.println("No se pueden multiplicar estas matrices, ingrese una opcion valida");

System.out.println("Ingrese el orden de la primera matriz");
m1 = teclado.nextInt();
n1 = teclado.nextInt();
System.out.println("Ingrese el orden de la segunda matriz");
m2 = teclado.nextInt();
n2 = teclado.nextInt();
}
double A[][] = new double[m1][n1];
double B[][] = new double[m2][n2];
double prod = 0;
System.out.println("Ingrese la primera matriz");
while (i < m1) {
while (j < n1) {
auxN = teclado.nextDouble();
A[i][j] = auxN;
j++;
}
j = 0;
i++;
}
i = 0;
System.out.println("Ingrese la segunda matriz");
while (i < m2) {
while (j < n2) {
auxN = teclado.nextDouble();
B[i][j] = auxN;
j++;
}
j = 0;
i++;
}
i = 0;
j = 0;
System.out.println("La matriz resultante es: ");
while (i < m1) {
while (k < n2) {
while (j < n1) {
prod = prod + (A[i][j] * B[j][k]);
j++;
}
System.out.print(prod + " ");
j = 0;
prod = 0;
k++;
}
System.out.println();
k = 0;
i++;
}
}
else if(op==4 || op==5){

System.out.println("Para sacar determinantes la matriz debe ser cuadrada");
double determinante;
Calculadora Matriz_A = new Calculadora();
Matriz_A.input();
if(op==4){
determinante = Matriz_A.determinant(Matriz_A.A,Matriz_A.N);
System.out.println("El valor de la determinante es " + determinante);
}
else {
determinante = Matriz_A.determinant(Matriz_A.A,Matriz_A.N);
if(determinante==0) {
System.out.println("Matriz singular, no existe la inversa");
}
else {

}
}
}
teclado.close();
}
}{

}
