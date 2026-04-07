class Robot {
    int width;
    int height;
    int x , y , dir ;
    public Robot(int width, int height) {
        // EAST = 0 
        // NORTH = 1
        // WEST = 2
        // SOUTH = 3
        this.x =0;
        this.y =0;
        this.dir = 0;
        this.height = height;
        this.width = width;
    }
    
    public void step(int num) {
       // start = east //dir =0;
       int peri = 2 *(width -1)+2 * (height -1 );
       num = num%peri;
       if (num == 0) num = peri;

       while(num>0){
        int nx = x, ny = y;
        if (dir == 0){
         int maxX = Math.min(x+num,width - 1);
         int rem = num - (maxX - x);
         num = rem;
         if (rem == 0) x = maxX;
         else { x = maxX; dir = 1;}
        }
        else if (dir == 2){
            int minX = Math.max(x - num , 0);
            int rem = num - (x - minX);
            num = rem;
            if (rem == 0) x = minX;
            else {x = minX ; dir = 3;}
        }
        else if (dir == 1){
            int maxY = Math.min(y+num, height - 1);
            int rem = num - (maxY - y);
            num = rem;
            if (rem == 0) y = maxY;
            else{y = maxY; dir = 2;}
        }
        else if (dir == 3){
            int minY = Math.max(y - num , 0);
            int rem = num - (y - minY);
            num = rem;
            if (rem ==0) y = minY;
            else {y = minY ; dir = 0;}
        }
       }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
        
    }
    
    public String getDir() {
        String dir_word[] ={"East","North","West","South"};
        return dir_word[dir]; 
    }
    }

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */