/*Kermith Rosa
*This program calculates the number of inches in a mile
*/

//pre-processor directives
#include <stdio.h>

//main function
int main() {
    //variable declaration and initialization
int inches_in_foot = 12;
int feet_in_mile = 5280;
int inches_in_mile;

//assignment statement
inches_in_mile = inches_in_foot * feet_in_mile;

//print the result
printf("The number of inches in a mile is %d", inches_in_mile);

//end main function

return 0;

}
