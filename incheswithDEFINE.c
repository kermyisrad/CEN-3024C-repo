/*Kermith Rosa
*This program calculates the number of inches in a mile
*/

//pre-processor directives
#include <stdio.h>

//constants
#define INCHES 12
#define FEET 5280

//main function
int main() {
    //variable declaration and initialization
int inches_in_mile;

//assignment statement
inches_in_mile = INCHES * FEET;

//print the result
printf("The number of inches in a mile is %d", inches_in_mile);

//end main function

return 0;

}
