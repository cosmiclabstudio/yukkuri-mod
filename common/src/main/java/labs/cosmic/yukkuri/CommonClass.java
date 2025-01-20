package labs.cosmic.yukkuri;

import labs.cosmic.yukkuri.platform.Services;


public class CommonClass {
    public static void init() {
        if (Services.PLATFORM.isModLoaded("examplemod")) {
            Constants.LOG.info("Take it easy!");
        }
    }
}