class Singers {

    private String singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numOfAlbumsPublished;

    public Singers() {
        this.singerId = "";
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numOfAlbumsPublished = 0;
    }

    public Singers(String singerId) {
        this.singerId = singerId;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numOfAlbumsPublished = 0;
    }

    public Singers(String singerId, String singerName) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = "";
        this.dateOfBirth = "";
        this.numOfAlbumsPublished = 0;
    }

    public Singers(String singerId, String singerName, String singerAddress) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = "";
        this.numOfAlbumsPublished = 0;
    }

    public Singers(String singerId, String singerName, String singerAddress, String dateOfBirth) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = 0;
    }

    public Singers(String singerId, String singerName, String singerAddress, String dateOfBirth, int numAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = numAlbumsPublished;
    }

    public String getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumOfAlbumsPublished() {
        return numOfAlbumsPublished;
    }

    public void setSingerId(String singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumOfAlbumsPublished(int NumOfAlbumsPublished) {
        this.numOfAlbumsPublished = NumOfAlbumsPublished;
    }

    public void setSingerData(String singerId, String singerName, String singerAddress, String dateOfBirth, int NumOfAlbumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbumsPublished = NumOfAlbumsPublished;
    }

    public static void main(String[] args) {
        Singers singer1 = new Singers();

        System.out.println("Default values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumOfAlbumsPublished());

        singer1.setSingerId("ST1111110");
        singer1.setSingerName("Adele");
        singer1.setSingerAddress("115 Melody Lane");
        singer1.setDateOfBirth("1988-05-05");
        singer1.setNumOfAlbumsPublished(4);

        System.out.println("\nUpdated values:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getNumOfAlbumsPublished());
    }
}
