package app.chalo.utils;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/ChaloCountryDetails;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloCountryDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10416a;
    public final String b;
    public final String c;
    public final List d;

    public ChaloCountryDetails(String str, String str2, String str3, List list) {
        this.f10416a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloCountryDetails)) {
            return false;
        }
        ChaloCountryDetails chaloCountryDetails = (ChaloCountryDetails) obj;
        return Intrinsics.d(this.f10416a, chaloCountryDetails.f10416a) && Intrinsics.d(this.b, chaloCountryDetails.b) && Intrinsics.d(this.c, chaloCountryDetails.c) && Intrinsics.d(this.d, chaloCountryDetails.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f10416a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return uf0.p(this.c, ", supportedPhoneNumberLength=", ")", dd.e("ChaloCountryDetails(id=", this.f10416a, ", name=", this.b, ", callingCode="), this.d);
    }
}
