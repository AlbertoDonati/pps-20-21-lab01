package lab01.tdd;

import java.util.Optional;

public class StrategyImpl implements SelectStrategy{

    public SelectStrategy myStrategy;
    public CircularListImpl myListInStrategy;


    @Override
    public boolean apply(int element) {
        return myStrategy.apply(element);
    }

    /*
   public boolean evenStrategy (final Optional number){
       if(Optional.of(myListInStrategy.next()) == number){
           return true;
       } else
           return false;
    }

   public Optional<Integer> multipleStrategy (final Optional myNumberToMultiply){
        if(Optional.of(myListInStrategy.next()) % myNumberToMultiply) == 0)
            return myListInStrategy.next();
    }

    public Optional<Integer> equalsStrategy (final Optional myNumberNextEqual){
          if(Optional.of(myListInStrategy.next()) == myNumberNextEqual)
                return myListInStrategy.next();
    }
    */

}
