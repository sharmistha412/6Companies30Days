//Sharmistha Das
//NIT Silchar
#include <bits/stdc++.h>
using namespace std;


int main()
{
    priority_queue<int, vector<int>, greater<int>> pq;
    int k=10;
    for(int i=0;i<1e6;i++){
        int n;
        cin>>n;
        pq.push(n);

        if(pq.size() > k) pq.pop();
    }

    vector<int> ans;

    while(!pq.empty()){
        ans.push_back(pq.top());
        pq.pop();
    }

    for(auto x:ans){
        cout<<x<<" ";
    }    
    
}
