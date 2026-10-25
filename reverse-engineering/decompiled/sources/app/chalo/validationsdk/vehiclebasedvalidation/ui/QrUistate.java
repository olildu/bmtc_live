package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/QrUistate;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QrUistate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10735a;
    public final QrUiStateSpec b;

    public QrUistate(String str) {
        QrUiStateSpec qrUiStateSpec = new QrUiStateSpec();
        this.f10735a = str;
        this.b = qrUiStateSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrUistate)) {
            return false;
        }
        QrUistate qrUistate = (QrUistate) obj;
        return Intrinsics.d(this.f10735a, qrUistate.f10735a) && Intrinsics.d(this.b, qrUistate.b);
    }

    public final int hashCode() {
        return this.b.f10734a.hashCode() + (this.f10735a.hashCode() * 31);
    }

    public final String toString() {
        return "QrUistate(qrString=" + this.f10735a + ", uiSpec=" + this.b + ")";
    }
}
