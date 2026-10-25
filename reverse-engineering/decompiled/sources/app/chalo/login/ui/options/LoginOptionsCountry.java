package app.chalo.login.ui.options;

import app.chalo.config.ChaloPhoneNumberCountry;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsCountry;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOptionsCountry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPhoneNumberCountry f5303a;
    public final String b;
    public final String c;

    public LoginOptionsCountry(ChaloPhoneNumberCountry country, String name, String callingCode) {
        Intrinsics.i(country, "country");
        Intrinsics.i(name, "name");
        Intrinsics.i(callingCode, "callingCode");
        this.f5303a = country;
        this.b = name;
        this.c = callingCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOptionsCountry)) {
            return false;
        }
        LoginOptionsCountry loginOptionsCountry = (LoginOptionsCountry) obj;
        return this.f5303a == loginOptionsCountry.f5303a && Intrinsics.d(this.b, loginOptionsCountry.b) && Intrinsics.d(this.c, loginOptionsCountry.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f5303a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginOptionsCountry(country=");
        sb.append(this.f5303a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", callingCode=");
        return vo1.p(sb, this.c, ")");
    }
}
