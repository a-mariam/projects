import java.util.Scanner;
public class Nokia3310Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("press 1 for phone book");
        System.out.println("press 2 for Messages");
        System.out.println("press 3 for Chat");
        System.out.println("press 4 for call register");
        System.out.println("press 5 for Tones");
        System.out.println("press 6 for Settings");
        System.out.println("press 7 for Call divert");
        System.out.println("press 8 for Games");
        System.out.println("press 9 for Calculate");
        System.out.println("press 10 for Reminder");
        System.out.println("press 11 for Clock");
        System.out.println("press 12 for Profiles");
        System.out.println("press 13 for SIM services");

        String userInput = input.nextLine();
        switch ("userInput") {

            case "1":

                System.out.println("phonebook");

                System.out.println("1.Search");
                System.out.println("2.Servive Nos");
                System.out.println("3.Add name");
                System.out.println("4.Erase");
                System.out.println("5.Edit");
                System.out.println("6.Assign tone");
                System.out.println("7.Send b'card");
                System.out.println("8.Options");
                System.out.println("9.Speed dials");
                System.out.println("10.Voice tags");


                switch ("options") {
                    case "8":

                        System.out.println("options");

                        System.out.println("1.Type of view");
                        System.out.println("1.Memory status");
                        break;
                }




                    case "2.":

                        System.out.println("Messages");

                        System.out.println("1.Write message");
                        System.out.println("2.Inbox");
                        System.out.println("3.Outbox");
                        System.out.println("4.Pictures messages");
                        System.out.println("5.Tempplates");
                        System.out.println("6.Smileys");
                        System.out.println("7.Messages settings");
                        System.out.println("8.Info servie");
                        System.out.println("9.Voice mailbox number");
                        System.out.println("10.Service command editor");
                        String MessageSettings = input.nextLine();
                        switch (MessageSettings) {
                            case "7.":
                                System.out.println("1.Set1");
                                System.out.println("2.Common3");
                                System.out.println("3.Message settings");
                                break;
                        }


                        String set1 = input.nextLine();
                        switch (set1) {
                            case "1.":
                                System.out.println("1.Messages centre number");
                                System.out.println("2.Messages sent as");
                                System.out.println("3.Message validity");
                                break;
                        }
                        String common3 = input.nextLine();
                        switch (common3) {
                            case "2.":
                                System.out.println("1.Delivery reports");
                                System.out.println("2.Reply via same centre");
                                System.out.println("3.Character support");
                                break;
                        }
                           case "3":
                            System.out.println("Chat");
                             break;

                    case "4":
                        System.out.println("1.Missed calls");
                        System.out.println("2.Received calls");
                        System.out.println("3.Dialled number");
                        System.out.println("4.Erase recent call lists");
                        System.out.println("5.Show Call duration");
                        System.out.println("6.Show call cost");
                        System.out.println("7.Call cost setting");
                        System.out.println("8.Prepaid credit");


                        String ShowCallduration = input.nextLine();
                        switch (ShowCallduration) {
                            case "5":
                                System.out.println("1.last calls duration");
                                System.out.println("2.All last durations ");
                                System.out.println("3.Received call's duration");
                                System.out.println("4.Dialled call's duration");
                                System.out.println("5.Clear counters");
                                break;
                        }
                        String Showcallcost = input.nextLine();
                        switch (Showcallcost) {
                            case "6":
                                System.out.println("1.Last call cost");
                                System.out.println("2.All call's cost");
                                System.out.println("3.Clear counters");
                                break;
                        }
                        String Callcostlimit = input.nextLine();
                        switch (Callcostlimit) {
                            case "7":
                                System.out.println("1.Call cost limit");
                                System.out.println("Show cost in");
                                break;
                        }
                    case "5":
                        System.out.println("1.Ringing tone");
                        System.out.println("2.Ringing volume");
                        System.out.println("3.Incoming call alert");
                        System.out.println("4.Composer");
                        System.out.println("5.Message alert tone");
                        System.out.println("6.Keypad tone");
                        System.out.println("7.Warning and game tones");
                        System.out.println("8.Vibrating alert");
                        System.out.println("9.Screen saver");
                        break;

                    case "6":
                        System.out.println("1.Call settings");
                        System.out.println("2.Phone settings");
                        System.out.println("3.Security settings");
                        System.out.println("4.Restore factory settings");

                        String Callsettings = input.nextLine();
                        switch (Callsettings) {
                            case "1":
                                System.out.println("1.Auntomatic redial");
                                System.out.println("2.Speed dailling");
                                System.out.println("3.Call waiting options");
                                System.out.println("4.Own number sending");
                                System.out.println("5.Phone line in use");
                                System.out.println("6.Automatic answer");

                                String Phonesettings = input.nextLine();
                                switch (Phonesettings) {
                                    case "2":
                                        System.out.println("1.Language");
                                        System.out.println("2.Cell info display");
                                        System.out.println("3.Welcome note");
                                        System.out.println("4.Networking selection");
                                        System.out.println("5.Lights");
                                        System.out.println("6.Confirm SIM service actions");
                                        break;
                                }
                            case "7.":
                                System.out.println("Call divert");
                                break;

                            case "8":
                                System.out.println("Games");
                                break;

                            case "9":
                                System.out.println("Calculator");
                                break;

                            case "10":
                                System.out.println("Reminders");
                                break;

                            case "11":
                                System.out.println("1.Alarm clock");
                                System.out.println("2.Clock settings");
                                System.out.println("3.Date settings");
                                System.out.println("4.Stop watch");
                                System.out.println("5.Contdown timer");
                                System.out.println("Auto update of date and time");
                                break;

                            case "12":
                                System.out.println("Profiles");
                                break;

                            case "13":
                                System.out.println("SIM services");
                                break;
                        }
                }

        }
    }

