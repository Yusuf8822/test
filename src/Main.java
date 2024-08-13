import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        ///////////////////  UzCard data base  /////////////////////////
        int pinkod = 1111;
        String cardNumber = "8600 4905 7489 2358";
        double balance = 2000000;
        int a;
        boolean sms = false;
        String tarix = " ";
        ////////////////////////////////////////////////////////////////

        System.out.println("1. Uzbek tili");
        System.out.println("2. Русский язык");
        System.out.println("3. English language");
        System.out.print("Tanglang: ");
        byte til = scanner.nextByte();

        switch (til) {

            case 1: {

                while (true) {

                    int kod;
                    System.out.print("Pin kodni kiriting: ");
                    kod = scanner.nextInt();

                    if (kod == pinkod) {
                        break;
                    }
                    System.out.println("Pin kod xato, qayta kiriting!");
                }

                while (true) {

                    System.out.println(" ----------- ATM ------------");
                    System.out.println(" 1. Balance");
                    System.out.println(" 2. Pul yechish");
                    System.out.println(" 3. SMS xabarnoma");
                    System.out.println(" 4. Pin kodni o'zgartirish");
                    System.out.println(" 5. Valyuta ayirboshlash");
                    System.out.println(" 6. Mobile operatorlarga to'lov");
                    System.out.println(" 7. Chiqimlar tarixi");
                    System.out.println(" 0. Chiqish");
                    System.out.print(" Menu tanlang: ");
                    byte menu = scanner.nextByte(); // 1

                    switch (menu) {
                        case 1: {
                            System.out.println("---------------- Balance ------------------");
                            System.out.println("Sizning balansingiz = " + balance);
                            break;
                        }
                        case 2: {
                            System.out.println("---------------- Pul yechib olish ------------------");
                            System.out.print("Summani kiriting: ");
                            double summa = scanner.nextDouble();

                            if (balance > summa) {
                                balance -= summa;
                            }

                            System.out.println("---------------------------");
                            System.out.println("Yechib olingan sum: " + summa);
                            System.out.println("Balans: " + balance);
                            System.out.println(LocalDateTime.now());
                            System.out.println("---------------------------");

                            tarix += "Summa=";
                            tarix += String.valueOf((summa / 100) + summa);
                            tarix += "--,--sana=";
                            tarix += LocalDateTime.now();
                            tarix += " ";

                            break;
                        }
                        case 3: {
                            if (sms == false) {
                                System.out.print("SMS xabarnomani ulash uchun tel kiriting: +998 ");
                                int b = scanner.nextInt();
                                System.out.println("SMS kodni kiriting: ");
                                int code = scanner.nextInt();
                                sms = true;
                            } else {
                                System.out.print("Sms xabarnomani o'chirish uchun tel kiriting: +998(");
                                int raqam = scanner.nextInt();
                                System.out.print("Sms kodni kiriting: ");
                                int smsKod = scanner.nextInt();
                                System.out.println("Sms xabarnoma o'chirildi!");
                                sms = false;
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("--------------- Pinkod almashtirish -------------------");
                            System.out.print("Yangi Pin kod kiriting: ");
                            int newpincode = scanner.nextInt();

                            while (true) {
                                System.out.print("Pin kodni tasdiqlang : ");
                                pinkod = scanner.nextInt();

                                if (pinkod != newpincode) {
                                    System.out.println("Xato, qayta urining");

                                } else {
                                    System.out.println("Bu sizni yangi pin kodiz: " + newpincode);
                                    pinkod = newpincode;
                                    break;
                                }
                            }
                            break;

                        }
                        case 5: {
                            System.out.println("---------------- Valuta ayirboshlash ------------------");
                            System.out.println("1. Dollar $");
                            System.out.println("2. Euro €");
                            System.out.println("3. Rubl ₱");
                            System.out.print("Valutani tanglang: ");
                            byte valuta = scanner.nextByte();

                            switch (valuta) {
                                case 1: {
                                    while (true) {
                                        System.out.print("Dollar kiriting: ");
                                        int dollar = scanner.nextInt();

                                        int summa = dollar * 12585;

                                        if (balance >= summa) {
                                            System.out.println(summa + " sum bo'ldi");
                                            balance -= summa;
                                            break;
                                        }
                                        System.out.println("Balansigizda yetarlicha mablag' yoq");
                                    }
                                    break;
                                }
                                case 2: {
                                    while (true) {
                                        System.out.print("Euro kiriting: ");
                                        int euro = scanner.nextInt();

                                        int summa1 = euro * 13537;

                                        if (balance >= summa1) {
                                            System.out.println(summa1 + " sum bo'ldi");
                                            balance -= summa1;
                                            break;
                                        }
                                        System.out.println("Balansigizda yetarlicha mablag' yoq");
                                    }
                                    break;
                                }
                                case 3: {
                                    while (true) {
                                        System.out.print("Rubl kiriting: ");
                                        int rub = scanner.nextInt();

                                        int summa2 = rub * 142;

                                        if (balance >= summa2) {
                                            System.out.println(summa2 + " sum bo'ldi");
                                            balance -= summa2;
                                            break;
                                        }
                                        System.out.println("Balansigizda yetarlicha mablag' yoq");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                        case 6: {
                            System.out.println("---------------- Mobile operatorlarga to'lov ------------------");
                            System.out.println("1. Beeline");
                            System.out.println("2. Ucell");
                            System.out.println("3. Uztelecom");
                            System.out.println("4. Mobiuz");
                            System.out.print("Mobile operatorlarni tanlang: ");
                            int mobile = scanner.nextInt();

                            switch (mobile) {
                                case 1: {
                                    while (true) {
                                        System.out.print("Telefon raqamingizni kiriting: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 90 || code == 91) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Pul kiriting: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println("Hisobingizga " + pul + " sum o'tkazildi");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("Bunday pulni olmaymiz");
                                            } else if (balance < pul) {
                                                System.out.println("Xisobingizda yetarlicha mablag' yo'q");
                                            }
                                        }
                                        System.out.println("Xato. Qayta kiriting");
                                    }
                                    break;
                                }
                                case 2: {
                                    while (true) {
                                        System.out.print("Telefon raqamingizni kiriting: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 93 || code == 94) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Pul kiriting: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println("Hisobingizga " + pul + " sum o'tkazildi");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("Bunday pulni olmaymiz");
                                            } else if (balance < pul) {
                                                System.out.println("Xisobingizda yetarlicha mablag' yo'q");
                                            }
                                        }
                                        System.out.println("Xato. Qayta kiriting");
                                    }
                                    break;
                                }
                                case 3: {
                                    while (true) {
                                        System.out.print("Telefon raqamingizni kiriting: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 95 || code == 99 || code == 77) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Pul kiriting: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println("Hisobingizga " + pul + " sum o'tkazildi");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("Bunday pulni olmaymiz");
                                            } else if (balance < pul) {
                                                System.out.println("Xisobingizda yetarlicha mablag' yo'q");
                                            }
                                        }
                                        System.out.println("Xato. Qayta kiriting");
                                    }
                                    break;
                                }
                                case 4: {
                                    while (true) {
                                        System.out.print("Telefon raqamingizni kiriting: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 97 || code == 95) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Pul kiriting: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println("Hisobingizga " + pul + " sum o'tkazildi");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("Bunday pulni olmaymiz");
                                            } else if (balance < pul) {
                                                System.out.println("Xisobingizda yetarlicha mablag' yo'q");
                                            }
                                        }
                                        System.out.println("Xato. Qayta kiriting");
                                    }
                                    break;
                                }
                            }
                            break;
                        }

                        case 7: {
                            System.out.println("Chiqimlar tarixi");
                            for (int i = 0; i < tarix.length(); i++) {
                                if (tarix.charAt(i) == ' ') {
                                    System.out.println();
                                }
                                System.out.print(tarix.charAt(i));
                            }
                            break;
                        }
                        case 0: {
                            System.out.println("Yana sizni kutib qolamiz");
                            System.out.println("Komissiya: " + (balance / 50));
                            System.exit(1);
                            break;
                        }
                        default: {
                            System.out.println("Bunday menu yo'q");
                            break;
                        }
                    }

                    System.out.println("Yana amaliyot bajarasizmi?");
                    System.out.println("1.Xa");
                    System.out.println("2.Yo'q");
                    System.out.print("Tanlang: ");
                    int tanlash = scanner.nextInt();

                    if (tanlash == 2) {
                        System.out.println("Yana sizni kutib qolamiz");
                        System.out.println("Komissiya" + balance / 50);
                        break;
                    }
                }
            }
            case 2:{
            }
            while (true) {

                int kod;
                System.out.print("Введите парол: ");
                kod = scanner.nextInt();

                if (kod == pinkod) {
                    break;
                }
                System.out.println("Ошибка в пин коде, введите заново!");
            }

            while (true) {

                System.out.println(" ----------- АТМ ------------");
                System.out.println(" 1. Баланс");
                System.out.println(" 2. Снять денги");
                System.out.println(" 3. СМС-уведомления");
                System.out.println(" 4. Сменить пин код");
                System.out.println(" 5. Обмен валюты");
                System.out.println(" 6. Оплата сотовым оператором");
                System.out.println(" 7. История расходов");
                System.out.println(" 0. Выход");
                System.out.print(" Выберите меню: ");
                byte menu = scanner.nextByte(); // 1

                switch (menu) {
                    case 1: {
                        System.out.println("---------------- Баланс ------------------");
                        System.out.println("Ваш баланс = " + balance);
                        break;
                    }
                    case 2: {
                        System.out.println("---------------- Снять денги ------------------");
                        System.out.print("Введите сумму: ");
                        double summa = scanner.nextDouble();

                        if (balance > summa) {
                            balance -= summa;
                        }

                        System.out.println("---------------------------");
                        System.out.println("Снятая сумма: " + summa);
                        System.out.println("Баланс: " + balance);
                        System.out.println(LocalDateTime.now());
                        System.out.println("---------------------------");

                        tarix += "Сумма=";
                        tarix += String.valueOf((summa / 100) + summa);
                        tarix += "--,--дата =";
                        tarix += LocalDateTime.now();
                        tarix += " ";

                        break;
                    }
                    case 3: {
                        if (sms == false) {
                            System.out.print("Введите номер телефона для получения СМС-доступа: +998 ");
                            int b = scanner.nextInt();
                            System.out.print("Введите смс пинкод: ");
                            int code = scanner.nextInt();
                            sms = true;
                        } else {
                            System.out.print("Введите номер телефона для отключения СМС-доступа: +998(");
                            int raqam = scanner.nextInt();
                            System.out.print("Введите смс код: ");
                            int smsKod = scanner.nextInt();
                            System.out.println("Смс уведомления отключена!");
                            sms = false;
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("--------------- Сменить пинкод -------------------");
                        System.out.print("Введите новый пинкод: ");
                        int newpincode = scanner.nextInt();

                        while (true) {
                            System.out.print("Подтвердите пинкод : ");
                            pinkod = scanner.nextInt();

                            if (pinkod != newpincode) {
                                System.out.println("Ошибка, повторите");

                            } else {
                                System.out.println("Ваш новый пин код: " + newpincode);
                                pinkod = newpincode;
                                break;
                            }
                        }
                        break;

                    }
                    case 5: {
                        System.out.println("---------------- Обмен валюты ------------------");
                        System.out.println("1. Доллар $");
                        System.out.println("2. Евро €");
                        System.out.println("3. Рубл ₱");
                        System.out.print("Выберите валюту: ");
                        byte valuta = scanner.nextByte();

                        switch (valuta) {
                            case 1: {
                                while (true) {
                                    System.out.print("Введите доллар: ");
                                    int dollar = scanner.nextInt();

                                    int summa = dollar * 12585;

                                    if (balance >= summa) {
                                        System.out.println(summa + " сум");
                                        balance -= summa;
                                        break;
                                    }
                                    System.out.println("На вашем балансе недостсточно средств");
                                }
                                break;
                            }
                            case 2: {
                                while (true) {
                                    System.out.print("Введите еуро: ");
                                    int euro = scanner.nextInt();

                                    int summa1 = euro * 13537;

                                    if (balance >= summa1) {
                                        System.out.println(summa1 + " сум");
                                        balance -= summa1;
                                        break;
                                    }
                                    System.out.println("На вашем балансе недостсточно средств");
                                }
                                break;
                            }
                            case 3: {
                                while (true) {
                                    System.out.print("Введите рубл: ");
                                    int rub = scanner.nextInt();

                                    int summa2 = rub * 142;

                                    if (balance >= summa2) {
                                        System.out.println(summa2 + " сум");
                                        balance -= summa2;
                                        break;
                                    }
                                    System.out.println("На вашем балансе недостсточно средств");
                                }
                                break;
                            }
                        }
                    }
                    break;
                    case 6: {
                        System.out.println("---------------- Оплата сотовым оператором ------------------");
                        System.out.println("1. Беелайн");
                        System.out.println("2. Юселл");
                        System.out.println("3. Узтелеком");
                        System.out.println("4. Мобиуз");
                        System.out.print("Выберите сотовым оператором: ");
                        int mobile = scanner.nextInt();

                        switch (mobile) {
                            case 1: {
                                while (true) {
                                    System.out.print("Введите телефон номер: +998 ");
                                    int tel = scanner.nextInt();
                                    int code = (tel / 10000000);
                                    if (code == 90 || code == 91) {
                                        System.out.println("Мин: 1.000 сум");
                                        System.out.println("Макс: 200.000 сум");
                                        System.out.print("Введите сумму: ");
                                        int pul = scanner.nextInt();
                                        if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                            Thread.sleep(8000);
                                            System.out.println("На ваш счет зачислено" + pul);
                                            balance -= pul;
                                            break;
                                        } else if (pul > 200000 || pul < 1000) {
                                            System.out.println("Мы не берем такие денги");
                                        } else if (balance < pul) {
                                            System.out.println("На вашем балансе недостсточно средств");
                                        }
                                    }
                                    System.out.println("Ошибка.Введите заново");
                                }
                                break;
                            }
                            case 2: {
                                while (true) {
                                    System.out.print("Введите телефон номер: +998 ");
                                    int tel = scanner.nextInt();
                                    int code = (tel / 10000000);
                                    if (code == 93 || code == 99) {
                                        System.out.println("Мин: 1.000 сум");
                                        System.out.println("Макс: 200.000 сум");
                                        System.out.print("Введите сумму: ");
                                        int pul = scanner.nextInt();
                                        if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                            Thread.sleep(8000);
                                            System.out.println("На ваш счет зачислено" + pul);
                                            balance -= pul;
                                            break;
                                        } else if (pul > 200000 || pul < 1000) {
                                            System.out.println("Мы не берем такие денги");
                                        } else if (balance < pul) {
                                            System.out.println("На вашем балансе недостсточно средств");
                                        }
                                    }
                                    System.out.println("Ошибка.Введите заново");
                                }
                                break;
                            }
                            case 3: {
                                while (true) {
                                    System.out.print("Введите телефон номер: +998 ");
                                    int tel = scanner.nextInt();
                                    int code = (tel / 10000000);
                                    if (code == 98 || code == 94) {
                                        System.out.println("Мин: 1.000 сум");
                                        System.out.println("Макс: 200.000 сум");
                                        System.out.print("Введите сумму: ");
                                        int pul = scanner.nextInt();
                                        if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                            Thread.sleep(8000);
                                            System.out.println("На ваш счет зачислено" + pul);
                                            balance -= pul;
                                            break;
                                        } else if (pul > 200000 || pul < 1000) {
                                            System.out.println("Мы не берем такие денги");
                                        } else if (balance < pul) {
                                            System.out.println("На вашем балансе недостсточно средств");
                                        }
                                    }
                                    System.out.println("Ошибка.Введите заново");
                                }
                                break;
                            }
                            case 4: {
                                while (true) {
                                    System.out.print("Введите телефон номер: +998 ");
                                    int tel = scanner.nextInt();
                                    int code = (tel / 10000000);
                                    if (code == 97 || code == 95) {

                                        int pul = scanner.nextInt();
                                        if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                            Thread.sleep(8000);
                                            System.out.println("Hisobingizga " + pul + " sum o'tkazildi");
                                            balance -= pul;
                                            break;
                                        } else if (pul > 200000 || pul < 1000) {
                                            System.out.println("Мы не берем такие денги");
                                        } else if (balance < pul) {
                                            System.out.println("На вашем балансе недостсточно средств");
                                        }
                                    }
                                    System.out.println("Ошибка.Введите заново");
                                }
                                break;
                            }
                        }
                        break;
                    }

                    case 7: {
                        System.out.println("История расходов");
                        for (int i = 0; i < tarix.length(); i++) {
                            if (tarix.charAt(i) == ' ') {
                                System.out.println();
                            }
                            System.out.print(tarix.charAt(i));
                        }
                        break;
                    }

                    case 0: {
                        System.out.println("Мы будем ждать вас снова");
                        System.out.println("Комиссия: " + (balance / 50));
                        System.exit(1);
                        break;
                    }

                    default: {
                        System.out.println("Нету такое меню");
                        break;
                    }
                }

                System.out.println("Хотели бы вы снрва попрактиковаться ?");
                System.out.println("1. Да");
                System.out.println("2. Нет");
                System.out.print("Выберите: ");
                int tanlash = scanner.nextInt();

                if (tanlash == 2) {
                    System.out.println("Мы будем ждать вас снова");
                    System.out.println("Комиссия: " + (balance / 50));
                    break;
                }
            }
            case 3:{
                while (true) {

                    int kod;
                    System.out.print("Pin kodni kiriting: ");
                    kod = scanner.nextInt();

                    if (kod == pinkod) {
                        break;
                    }
                    System.out.println("Pin kod xato, qayta kiriting!");
                }

                while (true) {

                    System.out.println(" ----------- ATM ------------");
                    System.out.println(" 1. Balance");
                    System.out.println(" 2. Withdraw money");
                    System.out.println(" 3. SMS notification");
                    System.out.println(" 4. Change pin code");
                    System.out.println(" 5. Currency exchage");
                    System.out.println(" 6. Payment to mobile operators");
                    System.out.println(" 7. Expense history");
                    System.out.println(" 0. Exit");
                    System.out.print(" Choose menu: ");
                    byte menu = scanner.nextByte(); // 1

                    switch (menu) {
                        case 1: {
                            System.out.println("---------------- Balance ------------------");
                            System.out.println("Your balance = " + balance);
                            break;
                        }
                        case 2: {
                            System.out.println("---------------- Withdraw maney ------------------");
                            System.out.print("Enter amount: ");
                            double summa = scanner.nextDouble();

                            if (balance > summa) {
                                balance -= summa;
                            }

                            System.out.println("---------------------------");
                            System.out.println("Amount withdraw: " + summa);
                            System.out.println("Balance: " + balance);
                            System.out.println(LocalDateTime.now());
                            System.out.println("---------------------------");

                            tarix += "Amount = ";
                            tarix += String.valueOf((summa / 100) + summa);
                            tarix += "--,--data = ";
                            tarix += LocalDateTime.now();
                            tarix += " ";

                            break;
                        }
                        case 3: {
                            if (sms == false) {
                                System.out.print("Enter the phone number to connect the SMS notification: +998 ");
                                int b = scanner.nextInt();
                                System.out.print("Enter sms code: ");
                                int code = scanner.nextInt();
                                sms = true;
                            } else {
                                System.out.print("Enter the phone number to disconnect the SMS notification: +998(");
                                int raqam = scanner.nextInt();
                                System.out.print("Enter sms code: ");
                                int smsKod = scanner.nextInt();
                                System.out.println("Sms notification turned off");
                                sms = false;
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("--------------- Chane pin code -------------------");
                            System.out.print("Enter a new pin code: ");
                            int newpincode = scanner.nextInt();

                            while (true) {
                                System.out.print("Confirm the new pin code: ");
                                pinkod = scanner.nextInt();

                                if (pinkod != newpincode) {
                                    System.out.println("Error. Do it again");

                                } else {
                                    System.out.println("This is your pin code: " + newpincode);
                                    pinkod = newpincode;
                                    break;
                                }
                            }
                            break;

                        }
                        case 5: {
                            System.out.println("---------------- Currency exchanging ------------------");
                            System.out.println("1. Dollar $");
                            System.out.println("2. Euro €");
                            System.out.println("3. Rubl ₱");
                            System.out.print("Choose currency: ");
                            byte valuta = scanner.nextByte();

                            switch (valuta) {
                                case 1: {
                                    while (true) {
                                        System.out.print("Enter dollars: ");
                                        int dollar = scanner.nextInt();

                                        int summa = dollar * 12585;

                                        if (balance >= summa) {
                                            System.out.println("I was " + summa + " sum");
                                            balance -= summa;
                                            break;
                                        }
                                        System.out.println("You don't have enough funds in your balance");
                                    }
                                    break;
                                }
                                case 2: {
                                    while (true) {
                                        System.out.print("Enter Euro: ");
                                        int euro = scanner.nextInt();

                                        int summa1 = euro * 13537;

                                        if (balance >= summa1) {
                                            System.out.println("It was "+ summa1 + " sum");
                                            balance -= summa1;
                                            break;
                                        }
                                        System.out.println("You don't have enough funds in your balance");
                                    }
                                    break;
                                }
                                case 3: {
                                    while (true) {
                                        System.out.print("Enter Rubl: ");
                                        int rub = scanner.nextInt();

                                        int summa2 = rub * 142;

                                        if (balance >= summa2) {
                                            System.out.println("It was " + summa2 + " sum");
                                            balance -= summa2;
                                            break;
                                        }
                                        System.out.println("You don't have enough funds in your balance");
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                        case 6: {
                            System.out.println("---------------- Payment to mobile operators ------------------");
                            System.out.println("1. Beeline");
                            System.out.println("2. Ucell");
                            System.out.println("3. Uztelecom");
                            System.out.println("4. Mobiuz");
                            System.out.print("Choose mobile operators: ");
                            int mobile = scanner.nextInt();

                            switch (mobile) {
                                case 1: {
                                    while (true) {
                                        System.out.print("Enter your phone number: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 90 || code == 91) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Enter money: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println(pul + " sums have been transferred to your account");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("We do not take that kind of money");
                                            } else if (balance < pul) {
                                                System.out.println("You don't have enough funds in your balance");
                                            }
                                        }
                                        System.out.println("Error. Try it again");
                                    }
                                    break;
                                }
                                case 2: {
                                    while (true) {
                                        System.out.print("Enter your phone number: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 93 || code == 99) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Enter money: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println(pul + " sums have been transferred to your account");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("We do not take that kind of money");
                                            } else if (balance < pul) {
                                                System.out.println("You don't have enough funds in your balance");
                                            }
                                        }
                                        System.out.println("Error. Try it again");
                                    }
                                    break;
                                }
                                case 3: {
                                    while (true) {
                                        System.out.print("Enter your phone number: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 98 || code == 94) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Enter money: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println(pul + " sums have been transferred to your account");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("We do not take that kind of money");
                                            } else if (balance < pul) {
                                                System.out.println("You don't have enough funds in your balance");
                                            }
                                        }
                                        System.out.println("Error. Try it again");
                                    }
                                    break;
                                }
                                case 4: {
                                    while (true) {
                                        System.out.print("Enter your phone number: +998 ");
                                        int tel = scanner.nextInt();
                                        int code = (tel / 10000000);
                                        if (code == 97 || code == 95) {
                                            System.out.println("Min: 1.000 sum");
                                            System.out.println("Max: 200.000 sum");
                                            System.out.print("Enter money: ");
                                            int pul = scanner.nextInt();
                                            if (pul >= 1000 && pul <= 200000 && balance >= pul) {
                                                Thread.sleep(8000);
                                                System.out.println(pul + " sums have been transferred to your account");
                                                balance -= pul;
                                                break;
                                            } else if (pul > 200000 || pul < 1000) {
                                                System.out.println("We do not take that kind of money");
                                            } else if (balance < pul) {
                                                System.out.println("You don't have enough funds in your balance");
                                            }
                                        }
                                        System.out.println("Error. Try it again");
                                    }
                                    break;
                                }
                            }
                            break;
                        }

                        case 7: {
                            System.out.println("-------------- Expense history ------------------");
                            for (int i = 0; i < tarix.length(); i++) {
                                if (tarix.charAt(i) == ' ') {
                                    System.out.println();
                                }
                                System.out.print(tarix.charAt(i));
                            }
                            break;
                        }
                        case 0: {
                            System.out.println("We will miss you");
                            System.out.println("Commission: " + (balance / 50));
                            System.exit(1);
                            break;
                        }
                        default: {
                            System.out.println("We do not have that kind of menu");
                            break;
                        }
                    }

                    System.out.println("Do you want to try it again?");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    System.out.print("Choose: ");
                    int tanlash = scanner.nextInt();

                    if (tanlash == 2) {
                        System.out.println("We will miss you");
                        System.out.println("Commission: " + (balance / 50));
                        break;
                    }
                }
            }
        }
    }
}
