package structural.adaptor;

public class Adaptor implements AdaptorInterface {

    ThirdPartySystem thirdPartySystem = new ThirdPartySystem();

    @Override
    public int request(int data) {

        String param = Integer.toString(data);

        String response = thirdPartySystem.request(param);

        return response.length();
    }
}
