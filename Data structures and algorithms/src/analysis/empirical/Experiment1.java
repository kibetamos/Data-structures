package analysis.empirical;
/**
* Conducts an experiment based on empirical analysis to compare 2 different
* algorithms for constructing long strings in Java.
*
* Goal: To measure the effect that manipulating the input size has on the
* running time of each algorithm.
*
* Steps:
 * Step I.
 * Create 2 methods in a class called Experiment1. The 2 methods should
 * implement the 2 algorithms. Each of the methods should accept as input
 * the character to be repeated and the number of times the repetition should occur.
 * Step II.
 * The first algorithm should be called "repeatUDM(char c, int n)" and
 * should implement the algorithm by using user-defined String
 * concatenation.
 * Step III.
 * The second algorithm should be called "repeatPDM(char c, int n)" and should implement
 * the algorithm by using the "java.lang.StringBuilder()"
 * in-built (pre-defined) method.
 * Step IV.
 * Create a timer using the "java.lang.System.currentTimeMillis()" in-built method to record
 * the start-time before calling the method and the end-time after the method has been
 * executed. These values can then be used to compute the elapsed time (running time) in microseconds.
 *
* @author ***Replace this with your full name and student ID***
*/
public class Experiment1 {
 /**
 * Implements the first algorithm that uses user-defined String concatenation
 * to repeat a character a number of times and then outputs the result.
 *
 * @param c the character to repeat
 * @param n the number of times to repeat the character
 *
 * @return the input character repeated the number of times specified
 */
 public static String repeatUDM(char c, int n) {
 String answer = "";

 for (int j=0; j < n; j++) {
 answer += c;
 }
 return answer;
 }

 /**
 * Implements the second algorithm that uses pre-defined String concatenation
 * (based on the java.lang.StringBuilder(char c, int n) method)
 * to repeat a character a number of times and then outputs the result.
 *
 * @param c the character to repeat
 * @param n the number of times to repeat the character
 *
 * @return the input character repeated the number of times specified
 */
 public static String repeatPDM(char c, int n) {
 StringBuilder sb = new StringBuilder( );
 for (int j=0; j < n; j++) {
 /** Note that the data structure operation in this algorithm involves
 * appending data to the back of a *queue* Abstract Data Type (ADT).
 */
 sb.append(c);
 }
 return sb.toString( );
 }
 public static void main (String[] args){
 /* using the "java.lang.System.currentTimeMillis()" option */
 long startTime = java.lang.System.currentTimeMillis();

 /* using the "java.lang.System.nanoTime()" option
 long startTime = java.lang.System.nanoTime(); */

 /* Method implementing user-defined String concatenation*/
 System.out.println(repeatPDM('*', 10000000));

 /* Method implementing the pre-defined
 java.lang.StringBuilder(char c, int n) method
 System.out.println(repeatPDM('*', 10)); */

 /* using the "java.lang.System.currentTimeMillis()" option */
 long endTime = java.lang.System.currentTimeMillis();
 

 /* using the "java.lang.System.nanoTime()" option
 long endTime = java.lang.System.nanoTime(); */
 /**
 * compute the elapsed time that can then be used as quantitative
 * evidence to compare the 2 algorithms
 */
 long elapsed = endTime - startTime;
 System.out.println("The elapsed time = " + elapsed);
 }
}