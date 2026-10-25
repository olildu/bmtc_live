package app.chalo.providers.cityprovider.impl.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/CurrencyInfo;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CurrencyInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8856a;
    public final String b;
    public final long c;

    public CurrencyInfo(String currencyId, String currencySymbol, long j) {
        Intrinsics.i(currencyId, "currencyId");
        Intrinsics.i(currencySymbol, "currencySymbol");
        this.f8856a = currencyId;
        this.b = currencySymbol;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyInfo)) {
            return false;
        }
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        return Intrinsics.d(this.f8856a, currencyInfo.f8856a) && Intrinsics.d(this.b, currencyInfo.b) && this.c == currencyInfo.c;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8856a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return uf0.m(this.c, ")", dd.e("CurrencyInfo(currencyId=", this.f8856a, ", currencySymbol=", this.b, ", currencyFactor="));
    }
}
