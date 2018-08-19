package Builder;

public class ObiectulMeu{

    int x;
    int y;
    int z;
    int w;
    int q;
    int k;
    
    public static class Builder{
        
        private ObiectulMeu o;
        
        public Builder setX(int x){
            o.x = x;
            return this;
        }
        
        public Builder setY(int y){
            o.y = y;
            return this;
        }
        
        public Builder setZ(int z){
            o.z = z;
            return this;
        }
        
        public Builder setW(int w){
            o.w = w;
            return this;
        }
        
        public Builder setQ(int q){
            o.q = q;
            return this;
        }
        
        public Builder setK(int k){
            o.k = k;
            return this;
        }
        
        /*
         * build returneaza o instanta a obiectului in sine
         */
        public ObiectulMeu build(){
            return o;
        }
    }
}