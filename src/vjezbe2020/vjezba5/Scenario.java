package vjezbe2020.vjezba5;

import vjezbe2020.vjezba5.products.Material;
import vjezbe2020.vjezba5.products.packs.GlovesPack;
import vjezbe2020.vjezba5.products.packs.PillsPack;
import vjezbe2020.vjezba5.products.packs.SafetyMaskPack;

public class Scenario {

    public void run(){

        var group = new Group("Teva");
        var company1 = new Company("Pliva", group);
        group.addCompany(company1);

        var branch1 = new Branch(company1, "branch1", new Location("location1"));
        company1.addBranch(branch1);
        branch1.addProduct(new GlovesPack("glovesName1", "1", 30, "white"));
        branch1.addProduct(new GlovesPack("glovesName1", "1", 30, "white"));
        branch1.addProduct(new GlovesPack("glovesName2", "2", 50, "black"));
        branch1.addProduct(new GlovesPack("glovesName2", "2", 50, "black"));
        branch1.addProduct(new GlovesPack("glovesName3", "3", 30, "black"));

        var branch2 = new Branch(company1, "branch2", new Location("location2"));
        company1.addBranch(branch2);
        branch2.addProduct(new SafetyMaskPack("safetyMask1", "4", 30));
        branch2.addProduct(new SafetyMaskPack("safetyMask1", "4", 30));
        branch2.addProduct(new PillsPack("Voltaren", "5", 20));
        branch2.addProduct(new PillsPack("Lupocet", "6", 15));
        branch2.addProduct(new Material("Aloa vera", "7"));


        var branch3 = new Branch(company1, "branch3", new Location("location3"));
        company1.addBranch(branch3);
        branch3.addProduct(new PillsPack("Voltaren", "5", 20));
        branch3.addProduct(new SafetyMaskPack("safetyMask1", "4", 30));
        branch3.addProduct(new PillsPack("Lupocet", "6", 15));
        branch3.addProduct(new Material("Aloa vera,", "7"));
        branch3.addProduct(new Material("Parafin,", "8"));
        branch3.addProduct(new GlovesPack("glovesName3", "3", 30, "black"));
        branch3.addProduct(new GlovesPack("glovesName3", "3", 50, "black"));


        var company2 = new Company("Belupo", group);
        group.addCompany(company2);

        var branch4 = new Branch(company2, "branch2", new Location("location4"));
        company2.addBranch(branch4);
        branch4.addProduct(new PillsPack("Voltaren", "5", 20));
        branch4.addProduct(new Material("Aloa vera,", "7"));
        branch4.addProduct(new GlovesPack("glovesName3", "3", 30, "white"));
        branch4.addProduct(new GlovesPack("glovesName3", "10", 50, "black"));


        var branch5 = new Branch(company2, "branch5", new Location("location5"));
        company2.addBranch(branch5);
        branch5.addProduct(new PillsPack("Voltaren", "5", 20));
        branch5.addProduct(new Material("Aloa vera,", "7"));
        branch5.addProduct(new GlovesPack("glovesName3", "3", 30, "white"));
        branch5.addProduct(new GlovesPack("glovesName3", "10", 50, "white"));
        branch5.addProduct(new SafetyMaskPack("safetyMask1", "4", 30));
        branch5.addProduct(new PillsPack("Voltaren", "5", 20));
        branch5.addProduct(new PillsPack("Lupocet", "6", 15));

        company2.closeBranch(branch3, branch4);
        group.doStockTaking();
    }

}
