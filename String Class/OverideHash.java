import java.util.Objects;

    class OverideHash {
        String name;
        int id;

        public OverideHash(String name,int id)
        {
            this.name=name;
            this.id=id;
        }

        public int hashCode()
        {
            return Objects.hash(id,name);
        }
    public static void main(String[] args) {
            OverideHash a= new OverideHash("ABC",12);
            System.out.println(a.hashCode());
    }        
    }