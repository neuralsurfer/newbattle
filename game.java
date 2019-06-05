

import java.util.*;
public class game{
      static SoundPlayer play = new SoundPlayer();

    public static int isWinner(shipBoard one, shipBoard two) {
        //This method will count health multiple times for each ship but it still works fine because if health is zero it wont matter and this method only needs to determine if there is zero health or not
        int countOne = 0;
        int countTwo = 0;
        
        for(int i = 0; i <one.getShipBoard().length; i++){
            for(int j = 0; j < one.getShipBoard()[0].length; j++){
                
                if(one.getShipBoard()[i][j] != null && one.getShipBoard()[i][j].getRef().getHealth() >0){
                    
                    countOne+= one.getShipBoard()[i][j].getRef().getHealth();
                }
                
                
            }
            
            
            
        }
         for(int i = 0; i <two.getShipBoard().length; i++){
            for(int j = 0; j < two.getShipBoard()[0].length; j++){
                
                if(two.getShipBoard()[i][j] != null && two.getShipBoard()[i][j].getRef().getHealth() >0){
                    
                    countTwo+= two.getShipBoard()[i][j].getRef().getHealth();
                }
                
                
            }
            
            
            
        }
        if(countTwo == 0) return 1;//Player two loses, player one wins
        if(countOne == 0) return 2;//Player one loses, player two wins
        return 0;//No winner
        
    }

    public static void setShips(shipBoard pOne, visibleSBoard one){
            int oneLen = 5;
            int tempX = 0;
            int tempY = 0;
            int rotation = 0;
            boolean check = true;
            boolean checkThree = false;
            Scanner inputOne = new Scanner(System.in);
            one.printVisibleBoard();
            while(oneLen >=2){
               
                check = true;
              
               System.out.println();
               
               
               System.out.println("Enter the row of bow the of the ship of length " + oneLen);
               tempX = inputOne.nextInt();
               tempX--;
               System.out.println("Enter the collum of the bow of the ship of length " + oneLen);
               tempY = inputOne.nextInt();
               tempY--;
               System.out.println("Enter the rotation of the ship of " + oneLen + "\n"
               +"(1 for down, 2 for left, 3 for up, 4 right)");
               
               
               rotation = inputOne.nextInt();
               rotation--;
               game.clear();
               
               int counter = tempX;
               int counterY = tempY;
               if(rotation == 0 || rotation == 1){
               for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 0 && !one.isValid(counter,tempY)){
                      
                       check = false;
                      
                    }
                   if(rotation == 1 && !one.isValid(tempX,counterY)){
                       
                       check = false;
                      
                    }
                    
                    if(rotation == 0)counter++;
                   if(rotation == 1) counterY--;
                }
            }
            else if(rotation == 2 || rotation == 3){
                
                for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 2 && !one.isValid(counter,tempY)){
                       
                       check = false;
                     
                    }
                   if(rotation == 3 && !one.isValid(tempX,counterY)){
                       
                       check = false;
                      
                    }
                   
                   if(rotation == 2)counter--;
                   if(rotation == 3) counterY++;
                }
                
                
            }
            else{
                check = false;
                
            }
            
               if(check){
                   
                   one.setVisible(tempX,tempY,oneLen,rotation); 
                   pOne.setShip(tempX,tempY,oneLen,rotation);
                   if(!checkThree && oneLen == 3){
                       checkThree = true;
                    }
                   
                    
                    else{
                    oneLen--;
                    
                   }
                }
              
              
               
                else{
                    System.out.println("\nThat isn't a valid ship index, enter a different one in\n");
                    
                    
                }
              
              
                 
                
              
               
                
               one.printVisibleBoard(); 
                
                
                
            }
        
        
        
    }
    public static void clear(){
        
        System.out.print('\u000C');
        
        
    }
    public static void nextAI() throws InterruptedException{
        String str = "AI will take its turn in:";
        String[] count = {"Three","Two","One"};
        Scanner input = new Scanner(System.in);
        System.out.println("Hit enter to end your turn");
        input.nextLine();
        System.out.print("\t");
        for(int i = 0; i < str.length();i++){
            System.out.print(str.substring(i,i+1));
            Thread.sleep(15);
            
        }
        System.out.print(" ");
        for(int i = 0; i < count.length; i++){
            System.out.print(count[i]+" ");
            Thread.sleep(250);
        }
        Thread.sleep(75);
    }
    public static void transition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hit enter to end your turn");
        String str = input.nextLine();
        System.out.print('\u000C');
        
        
        System.out.println("Pass the computer to the other player and hit enter once they have it");
        str = input.nextLine();
        System.out.print('\u000C');
    }
    // i is enemy shipBoard, j is enemey ship visible board, k is player targeting visible board
    public static int fire(int r, int c, shipBoard i,  visibleSBoard j, visibleSBoard k){
        int hit = 0;
        
        if(r > -1 && r < i.getShipBoard().length && c >-1 && c < i.getShipBoard()[0].length){
            if(i.getTile(r,c) != null && !i.getTile(r,c).isShot()){
               
                j.setVisible(r,c,"X");
                k.setVisible(r,c,"X");
                i.getTile(r,c).shoot(j,k);
                hit = 2;
            }
            else if(j.getVisible(r,c) == null){
                j.setVisible(r,c,"O");
                k.setVisible(r,c,"O");
                hit = 1;
            }
            else{
                System.out.println("\nThis tile has been shot at before\n");
            }
            
        }
        else{
            System.out.println("\nThis isn't a valid tile index\n");
            
        }
        
        return hit;
    }//Returns 2 for hit, 1 for miss, 0 for not valid index
    
    public static void fireAI(int r, int c, shipBoard e, visibleSBoard ev ){
        
       if(e.isValid(r,c)){
           ev.setVisible(r,c,"X");
           e.getTile(r,c).shoot(ev);
        }
        else{
            ev.setVisible(r,c,"O");
            
            
        }
        
    }
    
    
    public static void play(shipBoard pOne, visibleSBoard one, visibleSBoard tOne, shipBoard pTwo, visibleSBoard two, visibleSBoard tTwo) throws Exception{
        String currentPlayer = "Player One";
        Scanner input = new Scanner(System.in);
        int rInput = 1;
        boolean first = true;
        int cInput = 1;
        
        while(isWinner(pOne,pTwo) == 0){
            currentPlayer = "Player One";
        tOne.printVisibleBoard();
        one.printVisibleBoard();
        
         if(pOne.getTile(rInput,cInput) != null && pOne.getTile(rInput,cInput).getRef().getHealth()==0){
             System.out.println("\tYour ship has been sunk at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.bsunkSound();
            }
        else if(pOne.getTile(rInput,cInput) != null && pOne.getTile(rInput,cInput).isShot()){
             System.out.println("Enemy hit your ship at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.bhitSound();
            }
        
              
                 else if(pOne.getTile(rInput,cInput) == null && !first) {
             System.out.println("Enemy missed you at row: " +(rInput +1)+ ", col: "+ (1+cInput) +"\n");
             play.gmissSound();
            }
            first = false;
           
        System.out.println("Enter the row of the ship you want to fire at");
        rInput = input.nextInt();
        rInput--;
        System.out.println("Enter the column of the ship you want to fire at");
        cInput = input.nextInt();
        cInput--;
        while(fire(rInput,cInput,pTwo,two,tOne) == 0){
            
            System.out.println("Enter the row of the ship you want to fire at");
        rInput = input.nextInt();
        rInput--;
        System.out.println("Enter the column of the ship you want to fire at");
        cInput = input.nextInt();
         cInput--;
        }
        clear();
        tOne.printVisibleBoard();
        one.printVisibleBoard();
           
        
                 if(pTwo.getTile(rInput,cInput)!= null && pTwo.getTile(rInput,cInput).getRef().getHealth()==0){
             System.out.println("\tEnemy ship has been sunk at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.gsunkSound();
            }
             else if(pTwo.getTile(rInput,cInput) != null && pOne.getTile(rInput,cInput).isShot()){
             System.out.println("Hit at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.ghitSound();
            }
                 else if(pTwo.getTile(rInput,cInput) == null){
             System.out.println("Miss at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.bmissSound();
            }
            
        transition();
        if(isWinner(pOne,pTwo) == 0){
            currentPlayer = "Player Two";
            
              tTwo.printVisibleBoard();
        two.printVisibleBoard();
        
       
        
                 if(pTwo.getTile(rInput,cInput)!= null && pTwo.getTile(rInput,cInput).getRef().getHealth()==0){
             System.out.println("\tYour ship has been sunk at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.bsunkSound();
            }
             else if(pTwo.getTile(rInput,cInput) != null && pTwo.getTile(rInput,cInput).isShot()){
             System.out.println("Enemy hit your ship at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.bhitSound();
            }
           else if(pTwo.getTile(rInput,cInput) == null){
             System.out.println("Enemy missed at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.gmissSound();
            }
            
        System.out.println("Enter the row of the ship you want to fire at");
        rInput = input.nextInt();
        rInput--;
        System.out.println("Enter the column of the ship you want to fire at");
        cInput = input.nextInt();
        cInput--;
        while(fire(rInput,cInput,pOne,one,tTwo)==0){
            
            System.out.println("Enter the row of the ship you want to fire at");
        rInput = input.nextInt();
        rInput--;
        System.out.println("Enter the column of the ship you want to fire at");
        cInput = input.nextInt();
        cInput--;    
        }
         clear();
           tTwo.printVisibleBoard();
        two.printVisibleBoard(); 
        
        
                if(pOne.getTile(rInput,cInput)!= null && pOne.getTile(rInput,cInput).getRef().getHealth()==0){
             System.out.println("\tEnemy ship has been sunk at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.gsunkSound();
            } 
             else if(pOne.getTile(rInput,cInput) != null && pOne.getTile(rInput,cInput).isShot()){
             System.out.println("Hit at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.ghitSound();
            }
            else if(pOne.getTile(rInput,cInput) == null){
             System.out.println("Miss at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.bmissSound();
            }
                     
        }
        if(isWinner(pOne, pTwo) == 0) transition();
        else clear();
    }
    
    
    
    
    
    }
    public static void playAI(shipBoard pOne, visibleSBoard one, visibleSBoard tOne, shipBoard pTwo, visibleSBoard two,AI a) throws Exception{
        
          String currentPlayer = "Player One";
        Scanner input = new Scanner(System.in);
        int rInput = 1;
        int[] index;
        int cInput = 1;
        boolean first = true;
        while(isWinner(pOne,pTwo) == 0){
            currentPlayer = "Player One";
        tOne.printVisibleBoard();
        one.printVisibleBoard();
       
        
               if(pOne.getTile(rInput,cInput) != null && pOne.getTile(rInput,cInput).getRef().getHealth()==0){
             System.out.println("\tYour ship has been sunk at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.bsunkSound();
            }
             else if(pOne.getTile(rInput,cInput) != null && pOne.getTile(rInput,cInput).isShot()){
             System.out.println("Enemy hit your ship at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.bhitSound();
            }
                 else if(pOne.getTile(rInput,cInput) == null &&!first) {
             System.out.println("Enemy missed you at row: " +(rInput +1)+ ", col: "+ (1+cInput)+"\n");
             play.gmissSound();
            }
            
            first = false;
        System.out.println("Enter the row of the ship you want to fire at");
        rInput = input.nextInt();
        rInput--;
        System.out.println("Enter the column of the ship you want to fire at");
        cInput = input.nextInt();
        cInput--;
        while(fire(rInput,cInput,pTwo,two,tOne) == 0){
            
            System.out.println("Enter the row of the ship you want to fire at");
        rInput = input.nextInt();
        rInput--;
        System.out.println("Enter the column of the ship you want to fire at");
        cInput = input.nextInt();
         cInput--;   
        }
        clear();
        tOne.printVisibleBoard();
        one.printVisibleBoard();
         
         if(pTwo.getTile(rInput,cInput)!= null && pTwo.getTile(rInput,cInput).getRef().getHealth()==0){
             System.out.println("\tEnemy ship has been sunk at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.gsunkSound();
            }
         else if(pTwo.getTile(rInput,cInput) != null && pTwo.getTile(rInput,cInput).isShot()){
             System.out.println("Hit at row: " +(rInput+1) + ", col: "+ (1+cInput)+"\n");
             play.ghitSound();
            }
        
               
               else if(pTwo.getTile(rInput,cInput) == null){
             System.out.println("Miss at row: " +(rInput+1) + ", col: "+ (cInput+1)+"\n");
             play.bmissSound();
            }
        
        nextAI();
        clear();
        if(isWinner(pOne,pTwo) == 0){
            currentPlayer = "Player Two";
            index = a.fire();
            rInput = index[0];
            cInput = index[1];
        }
        
         
         
    }
        
        
        
    }
    


}    