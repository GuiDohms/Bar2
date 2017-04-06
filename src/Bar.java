
	import java.util.ArrayList;

	import persistence.*;

	public class Bar {
		private ArrayList<Client> Client;

		public Bar() {
			Client = new ArrayList<>();
		}

		public boolean entry(Client cl) {
			return Client.add(cl);
		}

		public boolean clientExit(String cpf) {
			for (int i = 0; i < Client.size(); i++) {
				if (Client.get(i).getCpf().equals(cpf)) {
					Client.remove(i);
					return true;
				}
			}
			return false;

		}

		public Client getClientCpf(String cpf) {
			for (int i = 0; i < Client.size(); i++) {
				if (Client.get(i).getCpf().equals(cpf)) {
					return Client.get(i);
				}
			}
			return null;
		}

		public int howManyClients() {
			return Client.size();
		}

		public int maleClients() {
			int num = 0;
			for (int i = 0; i < Client.size(); i++) {
				if (Client.get(i).getGender()) {
					num++;
				}
			}
			return num;
		}

		public int girlClients() {
			int num = 0;
			for (int i = 0; i < Client.size(); i++) {
				if (Client.get(i).getGender()) {
					num++;
				}
			}
			return num;
		}

		public int howManyAssociates() {
			int num = 0;
			for (int i = 0; i < Client.size(); i++) {
				if (Client.get(i) instanceof ClientAssociate) {
					num++;
				}
			}
			return num;
		}

		public int regularClient() {
			int num = 0;
			num = Client.size() - howManyAssociates();
			return num;
		}

		public int percentMulheres() {
			int pmulheres = Math.round(((float) girlClients() / (float) howManyClients()) * 100);
			return pmulheres;
		}

		public int percentHomens() {
			int phomens = Math.round(((float) maleClients() / (float) howManyClients()) * 100);
			return phomens;
		}

		public int percentSocios() {
			int pSocios = Math.round(((float) howManyAssociates() / (float) howManyClients()) * 100);
			return pSocios;
		}

		public int percentNaoSocios() {
			int pNaoSocios = Math.round(((float) regularClient() / (float) howManyClients()) * 100);
			return pNaoSocios;
		}

		@Override
		public String toString() {
			String saida = "";
			for (int i = 0; i < Client.size(); i++) {
				saida = Client.toString() + "\n";
			}
			return "Bar:" + saida;
		}

	}


