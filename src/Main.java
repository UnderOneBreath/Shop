import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<>();

        Shop freshMart = new Shop();
        ArrayList<Product> freshMartProducts = new ArrayList<>();
        freshMart.setName("Fresh Mart");
        freshMart.setProducts(freshMartProducts);
        shops.add(freshMart);

        Shop bookHaven = new Shop();
        ArrayList<Product> bookHavenProducts = new ArrayList<>();
        bookHaven.setName("Book Haven");
        bookHaven.setProducts(bookHavenProducts);
        shops.add(bookHaven);

        Shop fashionPalace = new Shop();
        ArrayList<Product> fashionPalaceProducts = new ArrayList<>();
        fashionPalace.setName("Fashion Palace");
        fashionPalace.setProducts(fashionPalaceProducts);
        shops.add(fashionPalace);

        Shop techWorld = new Shop();
        ArrayList<Product> techWorldProducts = new ArrayList<>();
        techWorld.setName("Tech World");
        techWorld.setProducts(techWorldProducts);
        shops.add(techWorld);

        Shop sportsGear = new Shop();
        ArrayList<Product> sportsGearProducts = new ArrayList<>();
        sportsGear.setName("Sports Gear");
        sportsGear.setProducts(sportsGearProducts);
        shops.add(sportsGear);

        Product potato = new Product();
        potato.setName("Картофель \"Невский\"");
        potato.setPrice(50);
        potato.setQuantity(20);
        freshMartProducts.add(potato);
        Product milk = new Product();
        milk.setName("Молоко \"Молочная страна\"");
        milk.setPrice(80);
        milk.setQuantity(10);
        freshMartProducts.add(milk);
        Product apples = new Product();
        apples.setName("Яблоки \"Золотой спас\"");
        apples.setPrice(100);
        apples.setQuantity(15);
        freshMartProducts.add(apples);
        Product cucumbers = new Product();
        cucumbers.setName("Огурцы \"Солнечные\"");
        cucumbers.setPrice(70);
        cucumbers.setQuantity(8);
        freshMartProducts.add(cucumbers);
        Product bread = new Product();
        bread.setName("Хлеб \"Пшеничный рай\"");
        bread.setPrice(40);
        bread.setQuantity(30);
        freshMartProducts.add(bread);
        Product cheese = new Product();
        cheese.setName("Сыр \"Альпийский\"");
        cheese.setPrice(150);
        cheese.setQuantity(5);
        freshMartProducts.add(cheese);
        Product chicken = new Product();
        chicken.setName("Куриное мясо \"Здоровая ферма\"");
        chicken.setPrice(200);
        chicken.setQuantity(12);
        freshMartProducts.add(chicken);
        Product onion = new Product();
        onion.setName("Лук \"Луковая родина\"");
        onion.setPrice(60);
        onion.setQuantity(10);
        freshMartProducts.add(onion);
        Product carrot = new Product();
        carrot.setName("Морковь \"Сладкая жизнь\"");
        carrot.setPrice(80);
        carrot.setQuantity(15);
        freshMartProducts.add(carrot);
        Product buckwheat = new Product();
        buckwheat.setName("Гречка \"Золотой колос\"");
        buckwheat.setPrice(120);
        buckwheat.setQuantity(7);
        freshMartProducts.add(buckwheat);

        Product warAndPeace = new Product();
        warAndPeace.setName("Книга \"Война и мир\" (Л. Толстой)");
        warAndPeace.setPrice(500);
        warAndPeace.setQuantity(15);
        bookHavenProducts.add(warAndPeace);
        Product philosopherStone = new Product();
        philosopherStone.setName("Книга \"Гарри Поттер и философский камень\" (Дж. Роулинг)");
        philosopherStone.setPrice(600);
        philosopherStone.setQuantity(10);
        bookHavenProducts.add(philosopherStone);
        Product crimeAndPunishment = new Product();
        crimeAndPunishment.setName("Книга \"Преступление и наказание\" (Ф. Достоевский)");
        crimeAndPunishment.setPrice(450);
        crimeAndPunishment.setQuantity(20);
        bookHavenProducts.add(crimeAndPunishment);
        Product prideAndPrejudice = new Product();
        prideAndPrejudice.setName("Книга \"Гордость и предубеждение\" (Дж. Остин)");
        prideAndPrejudice.setPrice(400);
        prideAndPrejudice.setQuantity(25);
        bookHavenProducts.add(prideAndPrejudice);
        Product nineteenEightyFour = new Product();
        nineteenEightyFour.setName("Книга \"1984\" (Дж. Оруэлл)");
        nineteenEightyFour.setPrice(550);
        nineteenEightyFour.setQuantity(12);
        bookHavenProducts.add(nineteenEightyFour);
        Product annaKarenina = new Product();
        annaKarenina.setName("Книга \"Анна Каренина\" (Л. Толстой)");
        annaKarenina.setPrice(480);
        annaKarenina.setQuantity(18);
        bookHavenProducts.add(annaKarenina);
        Product masterAndMargarita = new Product();
        masterAndMargarita.setName("Книга \"Мастер и Маргарита\" (М. Булгаков)");
        masterAndMargarita.setPrice(520);
        masterAndMargarita.setQuantity(8);
        bookHavenProducts.add(masterAndMargarita);
        Product threeComrades = new Product();
        threeComrades.setName("Книга \"Три товарища\" (Э. М. Ремарк)");
        threeComrades.setPrice(470);
        threeComrades.setQuantity(14);
        bookHavenProducts.add(threeComrades);
        Product flowersForAlgernon = new Product();
        flowersForAlgernon.setName("Книга \"Цветы для Элджернона\" (Д. Киз)");
        flowersForAlgernon.setPrice(490);
        flowersForAlgernon.setQuantity(9);
        bookHavenProducts.add(flowersForAlgernon);
        Product metro2033 = new Product();
        metro2033.setName("Книга \"Метро 2033\" (Д. Глуховский)");
        metro2033.setPrice(530);
        metro2033.setQuantity(11);
        bookHavenProducts.add(metro2033);

        Product eveningGown = new Product();
        eveningGown.setName("Платье \"Вечернее сияние\"");
        eveningGown.setPrice(3000);
        eveningGown.setQuantity(5);
        fashionPalaceProducts.add(eveningGown);
        Product jeans = new Product();
        jeans.setName("Джинсы \"Стильные облака\"");
        jeans.setPrice(2000);
        jeans.setQuantity(8);
        fashionPalaceProducts.add(jeans);
        Product tShirt = new Product();
        tShirt.setName("Футболка \"Графичный образ\"");
        tShirt.setPrice(1000);
        tShirt.setQuantity(15);
        fashionPalaceProducts.add(tShirt);
        Product skirt = new Product();
        skirt.setName("Юбка \"Розовый ветер\"");
        skirt.setPrice(2500);
        skirt.setQuantity(6);
        fashionPalaceProducts.add(skirt);
        Product blazer = new Product();
        blazer.setName("Пиджак \"Бизнес-стиль\"");
        blazer.setPrice(3500);
        blazer.setQuantity(4);
        fashionPalaceProducts.add(blazer);
        Product coat = new Product();
        coat.setName("Пальто \"Городская элегантность\"");
        coat.setPrice(4000);
        coat.setQuantity(7);
        fashionPalaceProducts.add(coat);
        Product shirt = new Product();
        shirt.setName("Рубашка \"Классический стиль\"");
        shirt.setPrice(1500);
        shirt.setQuantity(10);
        fashionPalaceProducts.add(shirt);
        Product blouse = new Product();
        blouse.setName("Блузка \"Легкая весна\"");
        blouse.setPrice(1800);
        blouse.setQuantity(9);
        fashionPalaceProducts.add(blouse);
        Product pajamas = new Product();
        pajamas.setName("Пиджама \"Сладкие сны\"");
        pajamas.setPrice(2200);
        pajamas.setQuantity(3);
        fashionPalaceProducts.add(pajamas);
        Product swimsuit = new Product();
        swimsuit.setName("Пальметто \"Тропические ощущения\"");
        swimsuit.setPrice(2800);
        swimsuit.setQuantity(6);
        fashionPalaceProducts.add(swimsuit);

        Product smartphone = new Product();
        smartphone.setName("Смартфон \"TechMaster X\"");
        smartphone.setPrice(50000);
        smartphone.setQuantity(10);
        techWorldProducts.add(smartphone);
        Product laptop = new Product();
        laptop.setName("Ноутбук \"UltraBook Pro\"");
        laptop.setPrice(80000);
        laptop.setQuantity(7);
        techWorldProducts.add(laptop);
        Product tablet = new Product();
        tablet.setName("Планшет \"TabTech Elegance\"");
        tablet.setPrice(35000);
        tablet.setQuantity(12);
        techWorldProducts.add(tablet);
        Product smartwatch = new Product();
        smartwatch.setName("Умные часы \"SmartGear Watch\"");
        smartwatch.setPrice(20000);
        smartwatch.setQuantity(15);
        techWorldProducts.add(smartwatch);
        Product camera = new Product();
        camera.setName("Камера \"Capture Pro\"");
        camera.setPrice(60000);
        camera.setQuantity(8);
        techWorldProducts.add(camera);
        Product gameConsole = new Product();
        gameConsole.setName("Игровая консоль \"Gamer's Dream\"");
        gameConsole.setPrice(70000);
        gameConsole.setQuantity(6);
        techWorldProducts.add(gameConsole);
        Product headphones = new Product();
        headphones.setName("Гарнитура \"SoundMaster\"");
        headphones.setPrice(25000);
        headphones.setQuantity(10);
        techWorldProducts.add(headphones);
        Product vrHeadset = new Product();
        vrHeadset.setName("VR-очки \"VirtualXperience\"");
        vrHeadset.setPrice(40000);
        vrHeadset.setQuantity(5);
        techWorldProducts.add(vrHeadset);
        Product vacuumCleaner = new Product();
        vacuumCleaner.setName("Пылесос \"CleanMaster Pro\"");
        vacuumCleaner.setPrice(45000);
        vacuumCleaner.setQuantity(9);
        techWorldProducts.add(vacuumCleaner);
        Product speaker = new Product();
        speaker.setName("Беспроводная колонка \"SoundBlaster\"");
        speaker.setPrice(30000);
        speaker.setQuantity(11);
        techWorldProducts.add(speaker);

        Product soccerBall = new Product();
        soccerBall.setName("Футбольный мяч \"Adidas Champion\"");
        soccerBall.setPrice(2000);
        soccerBall.setQuantity(15);
        sportsGearProducts.add(soccerBall);
        Product tennisRacket = new Product();
        tennisRacket.setName("Теннисная ракетка \"Wilson Pro Staff\"");
        tennisRacket.setPrice(5000);
        tennisRacket.setQuantity(10);
        sportsGearProducts.add(tennisRacket);
        Product baseballBat = new Product();
        baseballBat.setName("Бейсбольная бита \"Easton Stealth\"");
        baseballBat.setPrice(3000);
        baseballBat.setQuantity(8);
        sportsGearProducts.add(baseballBat);
        Product bicycle = new Product();
        bicycle.setName("Велосипед \"Trek Mountain\"");
        bicycle.setPrice(25000);
        bicycle.setQuantity(5);
        sportsGearProducts.add(bicycle);
        Product basketballHoop = new Product();
        basketballHoop.setName("Баскетбольное кольцо \"Spalding NBA\"");
        basketballHoop.setPrice(8000);
        basketballHoop.setQuantity(6);
        sportsGearProducts.add(basketballHoop);
        Product skis = new Product();
        skis.setName("Лыжи \"Rossignol Alltrack\"");
        skis.setPrice(15000);
        skis.setQuantity(7);
        sportsGearProducts.add(skis);
        Product dumbbells = new Product();
        dumbbells.setName("Гантели \"Reebok Power\"");
        dumbbells.setPrice(1000);
        dumbbells.setQuantity(20);
        sportsGearProducts.add(dumbbells);
        Product treadmill = new Product();
        treadmill.setName("Тренажер \"Life Fitness Cardio\"");
        treadmill.setPrice(70000);
        treadmill.setQuantity(4);
        sportsGearProducts.add(treadmill);
        Product boxingGloves = new Product();
        boxingGloves.setName("Боксерские перчатки \"Everlast Pro\"");
        boxingGloves.setPrice(4000);
        boxingGloves.setQuantity(9);
        sportsGearProducts.add(boxingGloves);
        Product bikeHelmet = new Product();
        bikeHelmet.setName("Шлем для велосипеда \"Bell Super\"");
        bikeHelmet.setPrice(6000);
        bikeHelmet.setQuantity(11);
        sportsGearProducts.add(bikeHelmet);

        for (Shop shop : shops) {
            shop.getInfo();
        }

    }
}