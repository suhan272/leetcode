class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> s= new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            boolean r=true;
            while(num>0){
                int t=num%10;
                if( t==0 ||i%t!=0 ){
                  r=false;
                  break;
                }  num=num/10;
                }
              
                 if(r){
                  s.add(i);
            }
           
            }return s;
        }
    }
