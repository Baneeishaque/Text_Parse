
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.lang3.math.NumberUtils;

class Test {

    public static void main(String[] args) {
        try {
            ArrayList<String> itms = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("infile.txt"))) {
                String str;
                while ((str = br.readLine()) != null) {
                    itms.add(str);
                }
            }
//            System.out.println(itms.size());

            ArrayList<String> fitems = new ArrayList<>();

            for (int i = 0; i < itms.size(); i++) {
                if (itms.get(i).contains(":")) {
                    fitems.add(itms.get(i).substring(itms.get(i).lastIndexOf(":") + 2));
                } else {
                    fitems.add(itms.get(i));
                }
            }
//            itms.forEach((itm) -> {
//                if (itm.contains(":")) {
//                    fitems.add(itm.substring(itm.lastIndexOf(":") + 2));
//                } else {
//                    fitems.add(itm);
//                }
//            });

//            fitems.forEach((fitem) -> {
////                System.out.println(fitem);
//                int Scheme_type;
//                int Serial = 0;
//                String scheme;
//                int count = 0;
//
//                try {
//
//                    if (NumberUtils.isCreatable(String.valueOf(fitem.charAt(0))) && NumberUtils.isCreatable(String.valueOf(fitem.charAt(1))) && NumberUtils.isCreatable(String.valueOf(fitem.charAt(2)))) {
//                        Scheme_type = 3;
//                        Serial = Integer.parseInt(fitem.substring(0, 3));
//                    } else if (NumberUtils.isCreatable(String.valueOf(fitem.charAt(0))) && NumberUtils.isCreatable(String.valueOf(fitem.charAt(1)))) {
//                        Scheme_type = 2;
//                        Serial = Integer.parseInt(fitem.substring(0, 2));
//                    } else if (NumberUtils.isCreatable(String.valueOf(fitem.charAt(0)))) {
//                        Scheme_type = 1;
//                        Serial = Integer.parseInt(fitem.substring(0, 1));
//                    } else {
//                        Scheme_type = 0;
//                    }
//
//                    switch (Scheme_type) {
//                        case 0:
//                            scheme = "E";
//                            break;
//                        case 1:
//                            if (Character.isLetter(fitem.charAt(1))) {
////                                System.out.println(fitem.charAt(1));
//                                switch (fitem.charAt(1)) {
//                                    case 'A':
//                                        scheme = "A";
//                                        if (NumberUtils.isCreatable(fitem.substring(2))) {
//                                            count = Integer.parseInt(fitem.substring(2));
//                                        } else {
//                                            count = 0;
//                                        }
////                                        System.out.println(count);
//                                        break;
//                                    case 'a':
//                                        scheme = "A";
//                                        if (NumberUtils.isCreatable(fitem.substring(2))) {
//                                            count = Integer.parseInt(fitem.substring(2));
//                                        } else {
//                                            count = 0;
//                                        }
////                                        System.out.println(count);
//                                        break;
//                                    case 'B':
//                                        scheme = "B";
////                                        System.out.println(scheme);
////                                        System.out.println(fitem.substring(2));
//                                        if (NumberUtils.isCreatable(fitem.substring(2))) {
//                                            count = Integer.parseInt(fitem.substring(2));
//                                        } else {
//                                            count = 0;
//                                        }
////                                        System.out.println(count);
//                                        break;
//                                    case 'b':
//                                        scheme = "B";
////                                        System.out.println(scheme);
////                                        System.out.println(fitem.substring(2));
//                                        if (NumberUtils.isCreatable(fitem.substring(2))) {
//                                            count = Integer.parseInt(fitem.substring(2));
//                                        } else {
//                                            count = 0;
//                                        }
////                                        System.out.println(count);
//                                        break;
//                                    case 'C':
//                                        scheme = "C";
//                                        if (NumberUtils.isCreatable(fitem.substring(2))) {
//                                            count = Integer.parseInt(fitem.substring(2));
//                                        } else {
//                                            count = 0;
//                                        }
////                                        System.out.println(count);
//                                        break;
//                                    case 'c':
//                                        scheme = "C";
//                                        if (NumberUtils.isCreatable(fitem.substring(2))) {
//                                            count = Integer.parseInt(fitem.substring(2));
//                                        } else {
//                                            count = 0;
//                                        }
////                                        System.out.println(count);
//                                        break;
//                                    default:
//                                        scheme = "E";
//                                }
//                            } else {
//                                scheme = "E";
//                            }
//                            break;
//                        case 2:
//                            if (Character.isLetter(fitem.charAt(2)) && Character.isLetter(fitem.charAt(3))) {
////                                System.out.println(fitem.substring(2, 4));
//                                switch (fitem.substring(2, 4)) {
//                                    case "AB":
//                                        scheme = "AB";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    case "ab":
//                                        scheme = "AB";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    case "BC":
//                                        scheme = "BC";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    case "bc":
//                                        scheme = "BC";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    case "AC":
//                                        scheme = "AC";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    case "ac":
//                                        scheme = "AC";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    default:
//                                        scheme = "E";
//                                }
//                            } else {
//                                scheme = "E";
//                            }
//                            break;
//                        case 3:
//                            if (Character.isLetter(fitem.charAt(3)) || fitem.charAt(3) == '*') {
//                                switch (fitem.charAt(3)) {
//                                    case '*':
//                                        scheme = "*";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
////                                    case 'l':
////                                        scheme = "L";
////                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
////                                            count = Integer.parseInt(fitem.substring(4));
////                                        } else {
////                                            count = 0;
////                                        }
////                                        break;
//                                    case 'X':
//                                        scheme = "X";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    case 'x':
//                                        scheme = "X";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
//                                    default:
//                                        scheme = "E";
//                                }
//                            } else {
//                                scheme = "E";
//                            }
//                            break;
//                        default:
//                            scheme = "E";
//                    }
//                } catch (NumberFormatException e) {
//                    scheme = "E";
//                }
//                if (!scheme.equals("E")) {
//                    if (count != 0) {
//                        System.out.println(scheme + " " + Serial + " - " + count + "");
//                    }
//                }
//
//            });
//            
            for (int i = 0; i < fitems.size(); i++) {
//                System.out.println(fitem);
                int Scheme_type;
                int Serial = 0;
                String scheme;
                int count = 0;

                try {

                    if (NumberUtils.isCreatable(String.valueOf(fitems.get(i).charAt(0))) && NumberUtils.isCreatable(String.valueOf(fitems.get(i).charAt(1))) && NumberUtils.isCreatable(String.valueOf(fitems.get(i).charAt(2)))) {
                        Scheme_type = 3;
                        Serial = Integer.parseInt(fitems.get(i).substring(0, 3));
                    } else if (NumberUtils.isCreatable(String.valueOf(fitems.get(i).charAt(0))) && NumberUtils.isCreatable(String.valueOf(fitems.get(i).charAt(1)))) {
                        Scheme_type = 2;
                        Serial = Integer.parseInt(fitems.get(i).substring(0, 2));
                    } else if (NumberUtils.isCreatable(String.valueOf(fitems.get(i).charAt(0)))) {
                        Scheme_type = 1;
                        Serial = Integer.parseInt(fitems.get(i).substring(0, 1));
                    } else {
                        Scheme_type = 0;
                    }

                    switch (Scheme_type) {
                        case 0:
                            scheme = "E";
                            break;
                        case 1:
                            if (Character.isLetter(fitems.get(i).charAt(1))) {
//                                System.out.println(fitem.charAt(1));
                                switch (fitems.get(i).charAt(1)) {
                                    case 'A':
                                        scheme = "A";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(2))) {
                                            count = Integer.parseInt(fitems.get(i).substring(2));
                                        } else {
                                            count = 0;
                                        }
//                                        System.out.println(count);
                                        break;
                                    case 'a':
                                        scheme = "A";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(2))) {
                                            count = Integer.parseInt(fitems.get(i).substring(2));
                                        } else {
                                            count = 0;
                                        }
//                                        System.out.println(count);
                                        break;
                                    case 'B':
                                        scheme = "B";
//                                        System.out.println(scheme);
//                                        System.out.println(fitem.substring(2));
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(2))) {
                                            count = Integer.parseInt(fitems.get(i).substring(2));
                                        } else {
                                            count = 0;
                                        }
//                                        System.out.println(count);
                                        break;
                                    case 'b':
                                        scheme = "B";
//                                        System.out.println(scheme);
//                                        System.out.println(fitem.substring(2));
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(2))) {
                                            count = Integer.parseInt(fitems.get(i).substring(2));
                                        } else {
                                            count = 0;
                                        }
//                                        System.out.println(count);
                                        break;
                                    case 'C':
                                        scheme = "C";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(2))) {
                                            count = Integer.parseInt(fitems.get(i).substring(2));
                                        } else {
                                            count = 0;
                                        }
//                                        System.out.println(count);
                                        break;
                                    case 'c':
                                        scheme = "C";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(2))) {
                                            count = Integer.parseInt(fitems.get(i).substring(2));
                                        } else {
                                            count = 0;
                                        }
//                                        System.out.println(count);
                                        break;
                                    default:
                                        scheme = "E";
                                }
                            } else {
                                scheme = "E";
                            }
                            break;
                        case 2:
                            if (Character.isLetter(fitems.get(i).charAt(2)) && Character.isLetter(fitems.get(i).charAt(3))) {
//                                System.out.println(fitem.substring(2, 4));
                                switch (fitems.get(i).substring(2, 4)) {
                                    case "AB":
                                        scheme = "AB";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    case "ab":
                                        scheme = "AB";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    case "BC":
                                        scheme = "BC";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    case "bc":
                                        scheme = "BC";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    case "AC":
                                        scheme = "AC";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    case "ac":
                                        scheme = "AC";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    default:
                                        scheme = "E";
                                }
                            } else {
                                scheme = "E";
                            }
                            break;
                        case 3:
                            if (Character.isLetter(fitems.get(i).charAt(3)) || fitems.get(i).charAt(3) == '*') {
                                switch (fitems.get(i).charAt(3)) {
                                    case '*':
                                        scheme = "*";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
//                                    case 'l':
//                                        scheme = "L";
//                                        if (NumberUtils.isCreatable(fitem.substring(4))) {
//                                            count = Integer.parseInt(fitem.substring(4));
//                                        } else {
//                                            count = 0;
//                                        }
//                                        break;
                                    case 'X':
                                        scheme = "X";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    case 'x':
                                        scheme = "X";
                                        if (NumberUtils.isCreatable(fitems.get(i).substring(4))) {
                                            count = Integer.parseInt(fitems.get(i).substring(4));
                                        } else {
                                            count = 0;
                                        }
                                        break;
                                    default:
                                        scheme = "E";
                                }
                            } else {
                                scheme = "E";
                            }
                            break;
                        default:
                            scheme = "E";
                    }
                } catch (NumberFormatException e) {
                    scheme = "E";
                }
                if (!scheme.equals("E")) {
                    if (count != 0) {
                        System.out.println(scheme + " " + Serial + " - " + count + "");
                    }
                }

            }

        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}
