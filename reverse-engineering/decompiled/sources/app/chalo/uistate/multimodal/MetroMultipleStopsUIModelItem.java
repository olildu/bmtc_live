package app.chalo.uistate.multimodal;

import app.chalo.uistate.base.ChaloColorToken;
import defpackage.nf1;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/MetroMultipleStopsUIModelItem;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroMultipleStopsUIModelItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10045a;
    public final ChaloColorToken b;
    public final String c;
    public final String d;

    public MetroMultipleStopsUIModelItem(String lineName, ChaloColorToken chaloColorToken, String fromStop, String toStop) {
        Intrinsics.i(lineName, "lineName");
        Intrinsics.i(fromStop, "fromStop");
        Intrinsics.i(toStop, "toStop");
        this.f10045a = lineName;
        this.b = chaloColorToken;
        this.c = fromStop;
        this.d = toStop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroMultipleStopsUIModelItem)) {
            return false;
        }
        MetroMultipleStopsUIModelItem metroMultipleStopsUIModelItem = (MetroMultipleStopsUIModelItem) obj;
        return Intrinsics.d(this.f10045a, metroMultipleStopsUIModelItem.f10045a) && Intrinsics.d(this.b, metroMultipleStopsUIModelItem.b) && Intrinsics.d(this.c, metroMultipleStopsUIModelItem.c) && Intrinsics.d(this.d, metroMultipleStopsUIModelItem.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(z40.b(this.b, this.f10045a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetroMultipleStopsUIModelItem(lineName=");
        sb.append(this.f10045a);
        sb.append(", lineColor=");
        sb.append(this.b);
        sb.append(", fromStop=");
        return r30.i(sb, this.c, ", toStop=", this.d, ")");
    }
}
