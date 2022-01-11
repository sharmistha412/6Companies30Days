#include <bits/stdc++.h>
using namespace std;
class Solution{
public:
    map<string,pair<int,string>>dp;
    pair<int,string> solve(int p[], int s,int e){
        if(s+1==e)return {0,string(1,s+'A')};
        string key=to_string(s)+'#'+to_string(e);
        if(dp.count(key))return dp[key];
        int cur=INT_MAX;
        string minString;
        for(int k=s+1;k<e;k++){
            auto p1=solve(p,s,k);
            auto p2=solve(p,k,e);
            if(p1.first+p2.first+p[s]*p[e]*p[k]<cur){
                cur=p1.first+p2.first+p[s]*p[e]*p[k];
                minString='('+p1.second+p2.second+')';
            }
        }
        return dp[key]={cur,minString};
    }
    string matrixChainOrder(int p[], int n){
        // code here
        return solve(p,0,n-1).second;
    }
};