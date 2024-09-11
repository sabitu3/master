package org.enums;

public enum UserType {
    SUBSCRIBED,NON_SUBSCRIBED,GUEST;

    public static UserType getUsertype(String usertype) {
        switch (usertype.toLowerCase()) {
            case "guest":
                return UserType.GUEST;
            case "subscribed":
                return UserType.SUBSCRIBED;
            case "nonsubscribed":
                return UserType.NON_SUBSCRIBED;
        }

        return null;
    }
}
