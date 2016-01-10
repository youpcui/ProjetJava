package ycui.projet.pgp.operate;

public interface IPersonOperate {
	public static final String WORKERHEAD = "Employ��(e)(s)\t\tNom\t\tAge\tSalaire\n";
	public static final String STUDENTHEAD = "Etudiant(e)(s)\t\tNom\t\tAge\tNotes\n";
	public static final String RESULTHEAD = "\n------------------------R��sultat------------------------\n";
	public static final String RESULTEND = "--------------------------------------------------------\n";

	/**
	 * Ajouter les donn��es.
	 */
	public void add();

	/**
	 * Modifier les donn��es.
	 */
	public void update();

	/**
	 * Rechercher tous les donn��es.
	 */
	public void findAll();

	/**
	 * Rechercher une donn��e par id 
	 */
	public void findById();

	/**
	 * REchercher une donn��e par mot cl��
	 */
	public void findByKey();

	/**
	 * Supprimer une donn��e
	 */
	public void delete();
}
