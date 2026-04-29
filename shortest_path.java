import java.util.*;
public class shortest_path {
    public static double shortestPath(String route){
        int x = 0, y = 0;
        for(int i=0; i<route.length(); i++){
            if(route.charAt(i) == 'E'){
                x++;
            }
            else if(route.charAt(i) == 'W'){
                x--;
            }
            else if(route.charAt(i) == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        double shortest = Math.sqrt(x*x + y*y);
        return shortest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your route(ALL CAPS): ");
        String route = sc.next();
        System.out.println("shortest path to reach the destination is: " + shortestPath(route));
        sc.close();
    }
}
