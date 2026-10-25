package app.chalo.core;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Mticket_activation_store_table;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Mticket_activation_store_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1968a;
    public final String b;
    public final long c;
    public final boolean d;

    public Mticket_activation_store_table(String city, String mticketId, long j, boolean z) {
        Intrinsics.i(city, "city");
        Intrinsics.i(mticketId, "mticketId");
        this.f1968a = city;
        this.b = mticketId;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mticket_activation_store_table)) {
            return false;
        }
        Mticket_activation_store_table mticket_activation_store_table = (Mticket_activation_store_table) obj;
        return Intrinsics.d(this.f1968a, mticket_activation_store_table.f1968a) && Intrinsics.d(this.b, mticket_activation_store_table.b) && this.c == mticket_activation_store_table.c && this.d == mticket_activation_store_table.d;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1968a.hashCode() * 31, 31, this.b);
        long j = this.c;
        return ((iE + ((int) (j ^ (j >>> 32)))) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Mticket_activation_store_table(city=", this.f1968a, ", mticketId=", this.b, ", activatedAt=");
        sbE.append(this.c);
        sbE.append(", isActivated=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
