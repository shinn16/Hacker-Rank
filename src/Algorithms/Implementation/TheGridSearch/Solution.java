package Algorithms.Implementation.TheGridSearch;

import java.util.Scanner;

/**
 * Solution class
 *
 * @author Patrick Shinn
 * @version 4/20/17
 */
public class Solution {
    public static void main(String[] args) {
    }
}

/* JavaScript
process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var t = parseInt(readLine());
    for(var a0 = 0; a0 < t; a0++){
        var R_temp = readLine().split(' ');
        var R = parseInt(R_temp[0]);
        var C = parseInt(R_temp[1]);
        var G = [];
        for(var G_i = 0; G_i < R; G_i++){
           G[G_i] = readLine();
        }
        var r_temp = readLine().split(' ');
        var r = parseInt(r_temp[0]);
        var c = parseInt(r_temp[1]);
        var P = [];
        for(var P_i = 0; P_i < r; P_i++){
           P[P_i] = readLine();
        }


        // -------------- Code below this point -----------
        var patt_len = P.length;
        var offset   = (G[0].length - P[0].length)+1;
        var pattern  = '';
        var regex;
        var result;
        var i;
        var str = '';

     	// Simply concatenate grid using . as separaor
        // make sure u use some kind of separator or
        // it won't work, you can use anything but
        // numbers here as separator
        str = G.join('.');

        // Here I build RegEx pattern
        for(i = 0; i < patt_len; i++)
        {
            if(i !== (patt_len - 1)){
                pattern += '(' + P[i] + ').{' + offset + '}';
            } else {
                pattern += '(' + P[i] + ')';
            }
        }

        // And in end we run it on our strig
        // and see if we have match or not
        regex = new RegExp(pattern);
        result = str.match(regex);
        console.log(result !== null ? 'YES' : 'NO');
    }

}
 */