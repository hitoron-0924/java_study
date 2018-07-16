

class VirtualDog{
    String name;
    int maxEnergy;
    int energy;
}


class VirtualPetGame{
    public static void main(String[] args){
        VirtualDog taro = new VirtualDog();
        taro.name = "taro";
        taro.maxEnergy = 100;
        taro.energy = 50;
        VirtualDog jiro = new VirtualDog();
        jiro.name = "jiro";
        jiro.maxEnergy = 200;
        jiro.energy = 50;
        
        System.out.println("Start HP is "+taro.energy);
        System.out.println("name is "+taro.name+" max_HP is "+taro.maxEnergy);
        System.out.println("name is "+jiro.name+" max_HP is "+jiro.maxEnergy);

    }
}