package com.marouane.advent.day4;

public class Day4 {


    public static int part1(String input) {
        String [] lines = input.split("\r\n");
        var count = 0;
        var lineLength = lines[0].length();
        for(int i = 0; i < lines.length; i++){

            for(int j = 0; j  < lineLength; j++){
                if(lines[i].charAt(j) != '@'){
                    continue;
                }

                var rolls= 0;

                if(j+1 < lineLength){
                    if(lines[i].charAt(j+1) == '@'){
                        rolls++;
                    }
                }
                if(j>0){
                    if(lines[i].charAt(j-1) == '@'){
                        rolls++;
                    }
                }
                if(j>0){
                    if(i>0){
                        if(lines[i-1].charAt(j-1) == '@'){
                            rolls++;
                        }
                    }
                }
                if(i>0){
                    if( lines[i-1].charAt(j) == '@'){
                        rolls++;
                    }
                    if( j+1 < lineLength){
                        if(lines[i-1].charAt(j+1) == '@'){
                            rolls++;
                        }
                    }
                }
                if(i+1 < lines.length){
                    if(lines[i+1].charAt(j) == '@'){
                        rolls++;
                    }
                    if( j+1 < lineLength){
                        if(lines[i+1].charAt(j+1) == '@'){
                            rolls++;
                        }
                    }
                    if(j>0){
                        if(lines[i+1].charAt(j-1) == '@'){
                            rolls++;
                        }
                    }
                }
                if (rolls<4){
                    count++;
                }
            }
        }
        return count;
    }

    public static void part2(String input) {
    }
}
