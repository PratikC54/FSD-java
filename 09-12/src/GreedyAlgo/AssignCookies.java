package GreedyAlgo;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int gindex=0,sindex=0;
        while(gindex<g.length && sindex<s.length) {
            if(g[gindex]<=s[sindex]) {
                count++;
                gindex++;
            }
            sindex++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
}
