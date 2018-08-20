package Library.data;

public class Library {

    public static final int MAX_PUBLICATION = 2000;
    private Publication[] publications;
    private int publicationsNumber;

    public static int getMaxPublication() {
        return MAX_PUBLICATION;
    }

    public Publication[] getPublication() {
        return publications;
    }

    public int getPublicationNumber() {
        return publicationsNumber;
    }

    public Library() {
        publications = new Publication[MAX_PUBLICATION];
    }

    public void addBook(Book book) {
        addPublication(book);

    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);

    }

    public void addPublication(Publication pub){
        if (publicationsNumber<MAX_PUBLICATION){
            publications[publicationsNumber] = pub;
            publicationsNumber++;
        }
        else{
            System.out.println("we don't have any publications in our library");
        }
    }

    public void printBook(){
        int countBook = 0;
        for (int i=0; i<publicationsNumber; i++){
            if (publications[i]instanceof Book){
                System.out.println(publications[i]);
                countBook++;
            }
        }
        if (countBook==0){
            System.out.println("We don't have any books");
        }
    }

    public void printMagazines() {
        int countMagazine = 0;
        for(int i=0; i<publicationsNumber; i++){
            if(publications[i] instanceof Magazine){
                System.out.println(publications[i]);
                countMagazine++;
            }
        }
        if (countMagazine==0){
            System.out.println("We don't have any magazines");
        }
    }
}