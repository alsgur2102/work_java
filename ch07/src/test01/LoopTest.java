package test01;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class LoopTest {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			// Ȧ���϶� Ȧ�� ���
			if (i % 2 != 0) {
				System.out.println("Ȧ��");
			}
			// ¦���϶� ¦����� ���
			if (i % 2 == 0) {
				System.out.println("¦��");
			}
		}
	}
}
