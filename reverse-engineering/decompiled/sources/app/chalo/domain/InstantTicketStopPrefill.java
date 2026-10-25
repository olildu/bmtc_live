package app.chalo.domain;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/InstantTicketStopPrefill;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketStopPrefill {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2503a;
    public final String b;
    public final String c;

    public InstantTicketStopPrefill(String fromStopJson, String toStopJson, String str) {
        Intrinsics.i(fromStopJson, "fromStopJson");
        Intrinsics.i(toStopJson, "toStopJson");
        this.f2503a = fromStopJson;
        this.b = toStopJson;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketStopPrefill)) {
            return false;
        }
        InstantTicketStopPrefill instantTicketStopPrefill = (InstantTicketStopPrefill) obj;
        return Intrinsics.d(this.f2503a, instantTicketStopPrefill.f2503a) && Intrinsics.d(this.b, instantTicketStopPrefill.b) && Intrinsics.d(this.c, instantTicketStopPrefill.c);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2503a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(dd.e("InstantTicketStopPrefill(fromStopJson=", this.f2503a, ", toStopJson=", this.b, ", routeId="), this.c, ")");
    }
}
