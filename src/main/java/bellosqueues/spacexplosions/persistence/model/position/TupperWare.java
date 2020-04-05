package bellosqueues.spacexplosions.persistence.model.position;

import java.util.HashMap;
import java.util.Iterator;

public class TupperWare implements Iterable<Position>{

  private HashMap<Position, Cell> hashMap;

  public TupperWare(){
    hashMap = new HashMap<>();
  }

  public void addCell(Position position){
    hashMap.put(position, new Cell(position));
  }

  public void getCell(Position pos){
    hashMap.get(pos);
  }

  @Override
  public Iterator<Position> iterator() {
    return hashMap.keySet().iterator();
  }
}
