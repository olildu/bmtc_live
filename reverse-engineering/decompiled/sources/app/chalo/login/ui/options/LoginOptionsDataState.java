package app.chalo.login.ui.options;

import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.constants.Source;
import app.chalo.login.data.models.app.LoginAfterCitySelectionRemoteConfigModel;
import app.chalo.login.ui.LoginLoadingPurpose;
import defpackage.b3;
import defpackage.r30;
import defpackage.t10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsDataState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOptionsDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5304a;
    public final CountryPhoneNumberConfig b;
    public final String c;
    public final boolean d;
    public final LoginLoadingPurpose e;
    public final boolean f;
    public final String g;
    public final Source h;
    public final LoginAfterCitySelectionRemoteConfigModel i;
    public final boolean j;
    public final List k;
    public final boolean l;
    public final boolean m;

    public LoginOptionsDataState(String str, CountryPhoneNumberConfig countryPhoneNumberConfig, String str2, boolean z, LoginLoadingPurpose loadingPurpose, boolean z2, String str3, Source source, LoginAfterCitySelectionRemoteConfigModel loginABTestConfig, boolean z3, List supportedLoginOptionsCountryList, boolean z4, boolean z5) {
        Intrinsics.i(loadingPurpose, "loadingPurpose");
        Intrinsics.i(loginABTestConfig, "loginABTestConfig");
        Intrinsics.i(supportedLoginOptionsCountryList, "supportedLoginOptionsCountryList");
        this.f5304a = str;
        this.b = countryPhoneNumberConfig;
        this.c = str2;
        this.d = z;
        this.e = loadingPurpose;
        this.f = z2;
        this.g = str3;
        this.h = source;
        this.i = loginABTestConfig;
        this.j = z3;
        this.k = supportedLoginOptionsCountryList;
        this.l = z4;
        this.m = z5;
    }

    public static LoginOptionsDataState a(LoginOptionsDataState loginOptionsDataState, String str, CountryPhoneNumberConfig countryPhoneNumberConfig, String str2, boolean z, LoginLoadingPurpose loginLoadingPurpose, boolean z2, String str3, Source source, LoginAfterCitySelectionRemoteConfigModel loginAfterCitySelectionRemoteConfigModel, ArrayList arrayList, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            str = loginOptionsDataState.f5304a;
        }
        String phoneNumberEntered = str;
        CountryPhoneNumberConfig countryPhoneNumberConfig2 = (i & 2) != 0 ? loginOptionsDataState.b : countryPhoneNumberConfig;
        String str4 = (i & 4) != 0 ? loginOptionsDataState.c : str2;
        boolean z5 = (i & 8) != 0 ? loginOptionsDataState.d : z;
        LoginLoadingPurpose loadingPurpose = (i & 16) != 0 ? loginOptionsDataState.e : loginLoadingPurpose;
        boolean z6 = (i & 32) != 0 ? loginOptionsDataState.f : z2;
        String str5 = (i & 64) != 0 ? loginOptionsDataState.g : str3;
        Source source2 = (i & 128) != 0 ? loginOptionsDataState.h : source;
        LoginAfterCitySelectionRemoteConfigModel loginABTestConfig = (i & 256) != 0 ? loginOptionsDataState.i : loginAfterCitySelectionRemoteConfigModel;
        loginOptionsDataState.getClass();
        loginOptionsDataState.getClass();
        boolean z7 = (i & 2048) != 0 ? loginOptionsDataState.j : true;
        List supportedLoginOptionsCountryList = (i & 4096) != 0 ? loginOptionsDataState.k : arrayList;
        boolean z8 = (i & 8192) != 0 ? loginOptionsDataState.l : z3;
        boolean z9 = (i & 16384) != 0 ? loginOptionsDataState.m : z4;
        loginOptionsDataState.getClass();
        Intrinsics.i(phoneNumberEntered, "phoneNumberEntered");
        Intrinsics.i(loadingPurpose, "loadingPurpose");
        Intrinsics.i(loginABTestConfig, "loginABTestConfig");
        Intrinsics.i(supportedLoginOptionsCountryList, "supportedLoginOptionsCountryList");
        return new LoginOptionsDataState(phoneNumberEntered, countryPhoneNumberConfig2, str4, z5, loadingPurpose, z6, str5, source2, loginABTestConfig, z7, supportedLoginOptionsCountryList, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOptionsDataState)) {
            return false;
        }
        LoginOptionsDataState loginOptionsDataState = (LoginOptionsDataState) obj;
        return this.f5304a.equals(loginOptionsDataState.f5304a) && Intrinsics.d(this.b, loginOptionsDataState.b) && Intrinsics.d(this.c, loginOptionsDataState.c) && this.d == loginOptionsDataState.d && this.e == loginOptionsDataState.e && this.f == loginOptionsDataState.f && Intrinsics.d(this.g, loginOptionsDataState.g) && this.h == loginOptionsDataState.h && Intrinsics.d(this.i, loginOptionsDataState.i) && this.j == loginOptionsDataState.j && Intrinsics.d(this.k, loginOptionsDataState.k) && this.l == loginOptionsDataState.l && this.m == loginOptionsDataState.m;
    }

    public final int hashCode() {
        int iHashCode = this.f5304a.hashCode() * 31;
        CountryPhoneNumberConfig countryPhoneNumberConfig = this.b;
        int iHashCode2 = (iHashCode + (countryPhoneNumberConfig == null ? 0 : countryPhoneNumberConfig.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (((this.e.hashCode() + ((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Source source = this.h;
        return ((r30.b((((((((this.i.hashCode() + ((iHashCode4 + (source != null ? source.hashCode() : 0)) * 31)) * 31) + 1237) * 31) + 1237) * 31) + (this.j ? 1231 : 1237)) * 31, 31, this.k) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginOptionsDataState(phoneNumberEntered=");
        sb.append(this.f5304a);
        sb.append(", countryPhoneNumberConfig=");
        sb.append(this.b);
        sb.append(", numberEnterError=");
        t10.s(this.c, ", isLoading=", ", loadingPurpose=", sb, this.d);
        sb.append(this.e);
        sb.append(", isContinueBtnEnabled=");
        sb.append(this.f);
        sb.append(", uidForTruecaller=");
        sb.append(this.g);
        sb.append(", source=");
        sb.append(this.h);
        sb.append(", loginABTestConfig=");
        sb.append(this.i);
        sb.append(", isSkipBtnVisible=false, isTrucallerLoginVisible=false, isUserLoginFirstTime=");
        sb.append(this.j);
        sb.append(", supportedLoginOptionsCountryList=");
        sb.append(this.k);
        sb.append(", showSupportedCountryListDialogue=");
        sb.append(this.l);
        sb.append(", isPhoneNumberInFocus=");
        return b3.g(")", sb, this.m);
    }
}
