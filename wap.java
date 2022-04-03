package scr;

public class wap {
//	public static void main(String[] arg) {
//		
//		char ch = 'k';
//		
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//			System.out.println(ch + "    vowel");
//		else
//			System.out.println(ch + "    consonant");
//					
//		
//		
//	}
//
//}

public static void main(String[] args) {

    char ch = 'z';

    switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(ch + " is vowel");
            break;
        default:
            System.out.println(ch + " is consonant");
    }
}
}
