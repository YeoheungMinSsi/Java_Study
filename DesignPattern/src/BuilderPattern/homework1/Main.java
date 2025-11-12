package BuilderPattern.homework1;

public class Main {
    public static void main(String[] args) {
        String query = new SelectQueryBuilder()
                .select("id", "name")
                .from("users")
                .where("age > 18")
                .orderBy("create_at", "DESC")
                .limit(10)
                .build();

        System.out.println(query);
    }
}
