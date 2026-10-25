package app.chalo.providers.cityprovider.impl.data.models.app;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import defpackage.z40;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/CityAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8854a;
    public final String b;
    public final LatLngBounds c;
    public final LatLng d;
    public final ArrayList e;
    public final ArrayList f;
    public final String g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final int m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;
    public final CurrencyInfo r;
    public final String s;
    public final List t;
    public final boolean u;

    public CityAppModel(String name, String chaloBaseDomain, LatLngBounds latLngBounds, LatLng latLng, ArrayList arrayList, ArrayList arrayList2, String str, List modeAndAgencyList, boolean z, boolean z2, boolean z3, String timezoneId, int i, String countryId, String countryName, String countryCallingCode, List phoneNumberPossibleLength, CurrencyInfo currencyInfo, String displayName, List polyBounds, boolean z4) {
        Intrinsics.i(name, "name");
        Intrinsics.i(chaloBaseDomain, "chaloBaseDomain");
        Intrinsics.i(modeAndAgencyList, "modeAndAgencyList");
        Intrinsics.i(timezoneId, "timezoneId");
        Intrinsics.i(countryId, "countryId");
        Intrinsics.i(countryName, "countryName");
        Intrinsics.i(countryCallingCode, "countryCallingCode");
        Intrinsics.i(phoneNumberPossibleLength, "phoneNumberPossibleLength");
        Intrinsics.i(displayName, "displayName");
        Intrinsics.i(polyBounds, "polyBounds");
        this.f8854a = name;
        this.b = chaloBaseDomain;
        this.c = latLngBounds;
        this.d = latLng;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = str;
        this.h = modeAndAgencyList;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = timezoneId;
        this.m = i;
        this.n = countryId;
        this.o = countryName;
        this.p = countryCallingCode;
        this.q = phoneNumberPossibleLength;
        this.r = currencyInfo;
        this.s = displayName;
        this.t = polyBounds;
        this.u = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityAppModel)) {
            return false;
        }
        CityAppModel cityAppModel = (CityAppModel) obj;
        return Intrinsics.d(this.f8854a, cityAppModel.f8854a) && Intrinsics.d(this.b, cityAppModel.b) && this.c.equals(cityAppModel.c) && this.d.equals(cityAppModel.d) && this.e.equals(cityAppModel.e) && this.f.equals(cityAppModel.f) && Intrinsics.d(this.g, cityAppModel.g) && Intrinsics.d(this.h, cityAppModel.h) && this.i == cityAppModel.i && this.j == cityAppModel.j && this.k == cityAppModel.k && Intrinsics.d(this.l, cityAppModel.l) && this.m == cityAppModel.m && Intrinsics.d(this.n, cityAppModel.n) && Intrinsics.d(this.o, cityAppModel.o) && Intrinsics.d(this.p, cityAppModel.p) && Intrinsics.d(this.q, cityAppModel.q) && this.r.equals(cityAppModel.r) && Intrinsics.d(this.s, cityAppModel.s) && Intrinsics.d(this.t, cityAppModel.t) && this.u == cityAppModel.u;
    }

    public final int hashCode() {
        int iE = xs.e(this.f, xs.e(this.e, i71.d(this.d, (this.c.hashCode() + nf1.e(this.f8854a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31);
        String str = this.g;
        return r30.b(nf1.e((this.r.hashCode() + r30.b(nf1.e(nf1.e(nf1.e((nf1.e((((((r30.b((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.h) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31, 31, this.l) + this.m) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31, this.s), 31, this.t) + (this.u ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CityAppModel(name=", this.f8854a, ", chaloBaseDomain=", this.b, ", bounds=");
        sbE.append(this.c);
        sbE.append(", cityCenter=");
        sbE.append(this.d);
        sbE.append(", modes=");
        sbE.append(this.e);
        sbE.append(", lineMaps=");
        sbE.append(this.f);
        sbE.append(", busMapUrl=");
        pk0.w(this.g, ", modeAndAgencyList=", ", isBetaCity=", sbE, this.h);
        z40.r(sbE, this.i, ", isComingSoonCity=", this.j, ", isCityDiscontinued=");
        pk0.x(", timezoneId=", this.l, ", minAppVersionForLogin=", sbE, this.k);
        pk0.t(this.m, ", countryId=", this.n, ", countryName=", sbE);
        cb0.t(sbE, this.o, ", countryCallingCode=", this.p, ", phoneNumberPossibleLength=");
        sbE.append(this.q);
        sbE.append(", currencyInfo=");
        sbE.append(this.r);
        sbE.append(", displayName=");
        pk0.w(this.s, ", polyBounds=", ", isMultiModalGroupTicketingEnabled=", sbE, this.t);
        return b3.g(")", sbE, this.u);
    }
}
