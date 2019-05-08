import java.util.ArrayList;
public class Pilha{
  private ArrayList <Object> elms;
  //onde Object é um tipo de pilha que possui elementos elms.
  
  public Pilha(){
    elms = new ArrayList  <Object>();
  }
  
  public Object Pop(){
    return elms.remove(elms.size()-1);
    //esta removendo o ultimo dos elementos elms e retornando o mesmo.
  }

  public void Push (Object elm){
    elms.add(elm);
    //add(objeto) adiciona no fim de uma lista
    //elm é outro elementos que vai ser adicionado em elms
  }

  public Object Topo(){
    return elms.get(elms.size()-1);
    //está retornando o elementos que esta no topo ou seja o que esta onde vemos o tamanho do vetor elms
  }

  public boolean Vazia(){
    if(elms.size()==0){
      return true;
    }else{
      return false;
    }
    //verifica se o tamanho do vetor elms esta igual a zero pq ai quer dizer que esta vazio
  }

  public int Tamanho(){
    return elms.size();
  }


}