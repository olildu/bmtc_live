package app.chalo.sos.official;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/official/OfficialSosContactRow;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfficialSosContactRow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9449a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public OfficialSosContactRow(String str, String rowId, String str2, String str3, String str4) {
        Intrinsics.i(rowId, "rowId");
        this.f9449a = str;
        this.b = rowId;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfficialSosContactRow)) {
            return false;
        }
        OfficialSosContactRow officialSosContactRow = (OfficialSosContactRow) obj;
        return Intrinsics.d(this.f9449a, officialSosContactRow.f9449a) && Intrinsics.d(this.b, officialSosContactRow.b) && Intrinsics.d(this.c, officialSosContactRow.c) && Intrinsics.d(this.d, officialSosContactRow.d) && Intrinsics.d(this.e, officialSosContactRow.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f9449a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return vo1.p(dd.e("OfficialSosContactRow(entryId=", this.f9449a, ", rowId=", this.b, ", label="), this.c, ", phoneNumber=<redacted>, normalizedPhoneNumber=<redacted>)");
    }
}
