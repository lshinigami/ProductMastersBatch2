package medium;

public class UserDataCloudDataSource implements DataSource<UserData> {
    @Override
    public UserData getUserData() {
        return new UserData(1, "Zebra", "zebra@gmail.com");
    }
}
