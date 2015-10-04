package com.orhanobut.logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Orhan Obut
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class LoggerTest {

  @Test
  public void testInit() {
    Settings settings = SLogger.init();
    assertThat(settings).isInstanceOf(Settings.class);

    settings = SLogger.init("TAG");
    assertThat(settings).isInstanceOf(Settings.class);
  }

  @Test
  public void testT() {
    Settings settings = SLogger.t("tag").getSettings();

    assertThat(settings.getMethodCount()).isEqualTo(2);

    settings = SLogger.t(10).getSettings();
    assertThat(settings.getMethodCount()).isEqualTo(2);

    settings = SLogger.t("tag", 5).getSettings();
    assertThat(settings.getMethodCount()).isEqualTo(2);

    SLogger.init().setMethodCount(0);
    settings = SLogger.t("tag").getSettings();
    assertThat(settings.getMethodCount()).isEqualTo(0);
  }

}
