package Leetcode.Hashtable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Leetcode_811_Subdomain_Visit_Count {
    public static void main(String[] args){
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(cpdomains).toString());
    }

    private static ArrayList<String> subdomainVisits(String[] cpdomains){
        Hashtable<String, Integer> total = new Hashtable<>();
        ArrayList<String> ans = new ArrayList<>();
        for(String domain : cpdomains){
            String[] splited = domain.split(" ");
            int cnt = Integer.parseInt(splited[0]);
            String[] str = splited[1].split("\\.");
            ArrayList<String> sub_domain = new ArrayList<>();
            sub_domain.add(str[str.length - 1]);
            sub_domain.add(str[str.length - 2] + '.' + sub_domain.get(0));
            if(str.length == 3){
                sub_domain.add(str[str.length - 3] + '.' + sub_domain.get(1));
            }
            for(String s : sub_domain){
                if(total.containsKey(s)){
                    total.put(s, total.get(s) + cnt);
                }else{
                    total.put(s, cnt);
                }
            }

        }
        for(Map.Entry<String, Integer> entry : total.entrySet()){
            String temp = "";
            temp += entry.getValue();
            temp += ' ';
            temp += entry.getKey();
            ans.add(temp);
        }
        return ans;
    }
}
