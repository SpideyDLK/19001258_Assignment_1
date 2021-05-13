object BookCost extends App{
  def cost(n:Double):Double={
    var c :Double=0.0;
    if(n<=50)
    {
      c = (24.95-(24.95*40/100))*n + n*3.0;
      return c;
    }
    else
    {
      c = (24.95-(24.95*40/100))*n + 50*3.0 + (n-50)*0.75;
      return c;
    }
  }

  println("Total cost of 60 copies = "+cost(60));
}
