
interface triangle {
  void cal_triangle_area();
}

interface rectangle {
  void cal_rectangle_area();
}

class Shape implements triangle, rectangle
{
  float height,base;
  float lenght,breath;
  
  public void cal_triangle_area(){
    float result1 = (height*base)/2;
    System.out.println("area of triangle:"+result1);
  }
  
  public void cal_rectangle_area(){
    float result1 = (lenght*breath);
    System.out.println("area of rectangle:"+result1);
  }
}

class Program1 {
  public static void main(String[] args) {
    Shape obj = new Shape();

    obj.height = 8;
    obj.base = 5;
    obj.lenght = 8;
    obj.breath = 2;

    obj.cal_rectangle_area();
    obj.cal_triangle_area();
  }
}