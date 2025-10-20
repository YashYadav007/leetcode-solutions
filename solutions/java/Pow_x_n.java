class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        boolean flag = false;
        double ans=1;
        if(nn<0){
            nn=-1*nn;
            flag=true;
        }
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2;
            }
        }
        if(flag) return (double)1.0/ans;
        return ans;
    }
}