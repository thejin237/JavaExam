public class PersonProcess {
	public void personRank(Person[] person, int cnt) {
		for (int i = 0; i < cnt; i++) {
			int r = 1;
			for (int j = 0; j < cnt; j++) {
				if (person[i].avr < person[j].avr) {
					r++;
				}
				person[i].rank = r;
			}
		}
	}

	public void personSort(Person[] person, int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (person[i].bun > person[j].bun) {
					Person temp = person[i];
					person[i] = person[j];
					person[j] = temp;
				}
			}
		}
	}
}
