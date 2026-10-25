package app.chalo.login;

import android.telephony.TelephonyManager;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.crashlytics.CrashlyticsLogger;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/AndroidCountryPhoneNumberConfigProvider;", "Lapp/chalo/login/UserCountryPhoneNumberConfigProvider;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidCountryPhoneNumberConfigProvider implements UserCountryPhoneNumberConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelephonyManager f5176a;
    public final CrashlyticsLogger b;

    public AndroidCountryPhoneNumberConfigProvider(TelephonyManager telephonyManager, CrashlyticsLogger crashlyticsLogger) {
        this.f5176a = telephonyManager;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.login.UserCountryPhoneNumberConfigProvider
    public final CountryPhoneNumberConfig a(List supportedChaloCountryList) {
        TelephonyManager telephonyManager = this.f5176a;
        Intrinsics.i(supportedChaloCountryList, "supportedChaloCountryList");
        try {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null && networkCountryIso.length() != 0) {
                String upperCase = networkCountryIso.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                String iSO3Country = new Locale("", upperCase).getISO3Country();
                Intrinsics.h(iSO3Country, "getISO3Country(...)");
                CountryPhoneNumberConfig countryPhoneNumberConfigA = UserCountryPhoneNumberConfigProviderKt.a(iSO3Country, supportedChaloCountryList);
                if (countryPhoneNumberConfigA != null) {
                    return countryPhoneNumberConfigA;
                }
            }
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null && simCountryIso.length() != 0) {
                String upperCase2 = simCountryIso.toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase2, "toUpperCase(...)");
                String iSO3Country2 = new Locale("", upperCase2).getISO3Country();
                Intrinsics.h(iSO3Country2, "getISO3Country(...)");
                CountryPhoneNumberConfig countryPhoneNumberConfigA2 = UserCountryPhoneNumberConfigProviderKt.a(iSO3Country2, supportedChaloCountryList);
                if (countryPhoneNumberConfigA2 != null) {
                    return countryPhoneNumberConfigA2;
                }
            }
            CountryPhoneNumberConfig countryPhoneNumberConfigA3 = UserCountryPhoneNumberConfigProviderKt.a(Locale.getDefault().getISO3Country(), supportedChaloCountryList);
            return countryPhoneNumberConfigA3 != null ? countryPhoneNumberConfigA3 : (CountryPhoneNumberConfig) CollectionsKt.H(supportedChaloCountryList);
        } catch (Exception e) {
            this.b.i(e);
            return (CountryPhoneNumberConfig) CollectionsKt.H(supportedChaloCountryList);
        }
    }
}
