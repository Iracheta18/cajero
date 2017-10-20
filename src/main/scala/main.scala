object Main extends App {
  var x = 0;
  var sesion = new Session(1);
  do {
    var user = scala.io.StdIn.readLine().toInt;

    var sesion = new Session(user);
    x = sesion.checkuser;
  }while(x == 0)

  do{
    println("Contraseña:\t");
    var pass = scala.io.StdIn.readLine();
    x = sesion.checkpass(pass);
  }while(x == 0)

  println("Escoga una transaccion: ");
  println("1.- ");
  println("2.- ");
  println("3.- ");
  var opc = scala.io.StdIn.readLine().toInt;
  opc match{
    case 1 => println("Funcion 1");
    case 2 => println("Funcion 2");
    case 3 => println("Funcion 3");
  }
}