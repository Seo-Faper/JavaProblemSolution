package wee1.sol2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public int solution(String dirs) {
        int answer = 0;
        char[] command = dirs.toCharArray();
        int x = 0;
        int y = 0;
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        Set<String> movement = new HashSet<String>();
        for(int i = 0; i< command.length; i++) {

            if (command[i] == 'U' && y < 5) {
                movement.add(Arrays.toString(new int[]{x,y,x+dx[0],y+dy[0]}));
                movement.add(Arrays.toString(new int[]{x+dx[0],y+dy[0],x,y}));
                y++;

            } else if (command[i] == 'D' && y > -5) {
                movement.add(Arrays.toString(new int[]{x,y,x+dx[1],y+dy[1]}));
                movement.add(Arrays.toString(new int[]{x+dx[1],y+dy[1],x,y}));
                y--;


            } else if (command[i] == 'L' && x > -5 ) {
                movement.add(Arrays.toString(new int[]{x,y,x+dx[2],y+dy[2]}));
                movement.add(Arrays.toString(new int[]{x+dx[2],y+dy[2],x,y}));
                x--;

            } else if (command[i] == 'R' && x < 5) {
                movement.add(Arrays.toString(new int[]{x,y,x+dx[3],y+dy[3]}));
                movement.add(Arrays.toString(new int[]{x+dx[3],y+dy[3],x,y}));
                x++;

            }

        }
        return movement.size()/2;

    }

}
