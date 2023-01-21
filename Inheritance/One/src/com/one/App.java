package com.one;

class App {
    public static void main(String[] args) {
        Oeuvre oe = new Oeuvre("Python","xxx");
        Livre lv = new Livre("Django Rest Framework", "rrr");
        Roman rm = new Roman("django", "xxxx");
        BD bd = new BD("Nodejs", "xxxx");

        Oeuvre []o = new Oeuvre[5];
        o[0] = oe;
        o[1] = lv;
        o[2] = rm;
        o[3] = bd;
        o[4] = bd;
    

        for (Oeuvre oeuvre : o) {
            System.out.println(oeuvre.getTitle() + " " + oeuvre.getAuteur());
        }

        System.out.println(bd.getTitle());
    }
}
