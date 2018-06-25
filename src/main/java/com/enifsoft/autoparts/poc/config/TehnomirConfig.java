package com.enifsoft.autoparts.poc.config;

import org.springframework.stereotype.Component;

@Component
public class TehnomirConfig {

    private static final String URL = "https://tehnomir.com.ua/ws/xml.php";
    private static final String LOGIN = "Autounion";
    private static final String PASS = "Tvy188";

    private static final String AMP = "&";
    private static final String EQ = "=";
    private static final String LOGIN_PARAM = "usr_login".concat(EQ).concat(LOGIN);
    private static final String PASS_PARAM = "usr_passwd".concat(EQ).concat(PASS);

    public String getUrlByAction(String action, String... parameters) {
        StringBuilder url = new StringBuilder();
        url.append(URL).append("?").append("act=").append(action).append(AMP)
                .append(LOGIN_PARAM).append(AMP).append(PASS_PARAM);
        if (parameters != null && parameters.length % 2 == 0) {
            for (int i = 0; i < parameters.length; i += 2) {
                String key = parameters[i];
                String value = parameters[i + 1];
                if (value != null && !value.isEmpty())
                    url.append(AMP).append(key).append(EQ).append(value);
            }
        } else {
            System.err.println("PARAMETERS ERROR:\nWrong parameters quantity!\nParameters should look like \"KEY\",\"VALUE\"");
        }
        return url.toString();
    }

}
