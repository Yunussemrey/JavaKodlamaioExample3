package basicProje3;

public class Main {

	public static void main(String[] args) {
		
		//switch - case
		
		// kalın ve ince sesli harfler
		
		char harf='A';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		System.out.println(harf + ": Kalın sesli bir harftir.");
		break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println(harf +": İnce sesli bir harftir.");
			break;
			default:
				System.out.println(harf + ": Bu harf için kalınlık veya incelikten bahsedilemez.");
				break;
		
		
		
		
		}
		
		System.out.println("-----------------");
		
		//Çoklu diziler ile çalışmak 
		
		//Sayısal - Sözel bölüm dersleri gruplama algoritması;
		
		String[][] dersler = new String[2][5]; //2 satır 5 sütundan oluşan bi tablo yapısı
		dersler[0][0]="Sayısal Bölüm Dersler:";
		dersler[0][1]="Fizik";
		dersler[0][2]="Kimya";
		dersler[0][3]="Matematik";
		dersler[0][4]="Biyoloji";
		dersler[1][0]="Sözel Bölüm Dersleri:";
		dersler[1][1]="Coğrafya";
		dersler[1][2]="Sosyal bilimler";
		dersler[1][3]="Tarih";
		dersler[1][4]="Türk dili ve edebiyatı";
		
		for(int i=0;i<dersler.length;i++) {
			System.out.println("*********");
			for(int j=0;j<dersler[i].length;j++) {
				System.out.println(dersler[i][j]);
			}
			
			
		}
		
		
		
		

	}

}
