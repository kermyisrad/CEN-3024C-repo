/*Kermith Rosa
This program calculates the area of a trapezoid */

//pre processor directives
#include <stdio.h>

//main function
int main() {

//declare variables
float a, b, height, area;

//ask the user for input
printf("what is the value of a?");
scanf("%f", &a);

printf("what is the value of b?");
scanf("%f", &b);

printf("what is the height?");
scanf("%f", &height);

//calculate the result
area = (float) 1/2 * (a+b) * height;

//print output
printf("the area of your trapezoid is %.2f.", area);
//end of main
return 0;

}
