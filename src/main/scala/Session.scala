class Session(var user: Int) {

  var passsword = "";

  def checkuser : Int = {
    var x = 1;
    if (user == 713433) {
      println("Ususario Valido");
      x = 1;
    } else {
      println("Credenciales no validas");
      println("Introduzca un usuario valido.");
      x = 0;
    }
    return x;
  }

  def checkpass(pass : String) : Int = {
    var x = 0;
    if(pass == "Jelelo123"){
      println("Contraseña correcta");
      x = 1;
    }else{
      println("contraseña incorrecta");
      println("introduzca la contraseña correcta");
      x = 0;
    }
    return x;
  }

}
