package Lab8;

public class MiscTest {

    public String temperature(int temp)
    {
        String answer = null;

        if (temp > 30)
            answer = "hot";

        if (temp > 20 && temp <= 30)
            answer = "warm";

        if (temp > 10 && temp <= 20)
            answer = "fine";

        if (temp <= 10)
            answer = "cold";

        return answer;
    }
}
