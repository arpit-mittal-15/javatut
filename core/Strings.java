class Strings{
  public static void main(String args[]){

    String name = new String("navin");

    System.out.println("hello " + name);
    System.out.println(name.charAt(1));

    StringBuffer sb = new StringBuffer("Navin");  //can be modified. when using a normal string a new space is allocated to the string whereas if we modify string buffer it changes the original string space.
    System.out.println(sb);

  }
}