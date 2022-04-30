package practice;

public class SmallestOfNum {

	public static void main(String[] args) {
		int a=10;int b=100;int c=200;int d=99;int e=999;
		
		// smallest of 4 num
		int k=(a<b&&a<c&&a<d)?a:(b<c&&b<d)?b:(c<d)?c:d;
		
		System.out.println(k);
		
		//smallest of 5 num
		int i=(a<b&&a<c&&a<d && a<e)?a:(b<c&&b<d && b<e)?b:(c<d && c<e)?c:(d<e)?d:e;
		System.out.println(i);
		
		//smallest of 6 num
		int f=1000;
	int i1=(a<b&&a<c&&a<d && a<e && a<f)?a:(b<c&&b<d && b<e && b<f)?b:(c<d && c<e && c<f)?c:(d<e && d<f)?d:(e<f)?e:f;
		System.out.println(i1);
		
		//smallest of 7 num
		int g=9;
		int i2=(a<b&&a<c&&a<d && a<e && a<f &&a<g)?a:
				(b<c&&b<d && b<e && b<f&&b<g)?b:
						(c<d && c<e && c<f&&c<g)?c:
								(d<e && d<f &&d<g)?d:
										(e<f && e<g)?e:(f<g)?f:g;
		System.out.println(i2);
	}

}
