package test01;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class LoopTest {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			// È¦¼öÀÏ¶© È¦¼ö Ãâ·Â
			if (i % 2 != 0) {
				System.out.println("È¦¼ö");
			}
			// Â¦¼öÀÏ¶© Â¦¼ö¶ó°í Ãâ·Â
			if (i % 2 == 0) {
				System.out.println("Â¦¼ö");
			}
		}
	}
}
