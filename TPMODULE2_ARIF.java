class Komputer {
  String drive = "Laptop ini memiliki drive tipe Seagate dengan ram sebesar 8 GB dan Processor secepat 2.40 Ghz. Selain itu laptop ini juga memiliki Webcam";

  String email1() {
    return "Laptop berhasil mengirim Email ke niceyuk@gmail.com";
  }

  public String getDrive() {
    return drive;
  }

  public void setDrive(String drive) {
    this.drive = drive;
  }
};

class Laptop extends Komputer {
  String nama_game = "Laptop berhasil membuka game Dota 2";

  String email2() {
    return "Laptop berhasil mengirim Email ke aanarji@gmail.com dan ke rusmango@gmail.com";

  }
};

class TpModule {
  public static void main(String args[]) {
    Laptop laptopArif = new Laptop();

    System.out.println(laptopArif.drive);
    System.out.println(laptopArif.nama_game);
    System.out.println(laptopArif.email1());
    System.out.println(laptopArif.email2());
  }
}

class Handpone {
  String drive = "Handpone ini memiliki drive tipe Sandisk dengan ram sebesar 3 GB dan Processor secepat 2.20 Ghz. Selain itu laptop ini TIDAK memiliki Fingerprint";

  String Sms1() {
    return "Hanpone berhasil mengirim Sms ke no 62852112";
  }

  public String getDrive() {
    return drive;
  }

  public void setDrive(String drive) {
    this.drive = drive;
  }
};

class telpon extends Handpone {
  String Telpon = "Handpone berhasil Menyambungkan telpon ke no 62852112 ";

  String Sms2() {
    return "Handpone  berhasil mengirim Sms ke no 62852112 dan ke no 629292211";

  }
};

class tpmodule {
  public static void main(String args[]) {
    Laptop HandponeArif = new Laptop();

    System.out.println(HandponeArif.drive);
    System.out.println(HandponeArif.Telpon);
    System.out.println(HandponeArif.Sms1());
    System.out.println(HandponeArif.Sms2());
  }
}
