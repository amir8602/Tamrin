package ir.digipay;
import java.util.ArrayList;
import java.util.List;

public class Repository <E extends HaveId> {
    private List<E> list = new ArrayList<E>();


    public void save (E e){
        list.add(e);
    }


    public E findById(Long id){
        for (E e : list) {
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }



    public void remove(E e){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(e)){
                list.remove(i);
            }
        }
    }


    List<E> getAll(){
        return list;
    }


    E update(E e , Long id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(e)){
                list.remove(i);
                list.add(i , e);
                return e;
            }
        }
        return null;
    }


}