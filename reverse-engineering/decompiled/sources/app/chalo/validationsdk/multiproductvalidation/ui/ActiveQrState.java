package app.chalo.validationsdk.multiproductvalidation.ui;

import defpackage.b3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/ActiveQrState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActiveQrState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10681a;
    public final boolean b;
    public final boolean c;

    public ActiveQrState(List qrData, boolean z, boolean z2) {
        Intrinsics.i(qrData, "qrData");
        this.f10681a = qrData;
        this.b = z;
        this.c = z2;
    }

    public static ActiveQrState a(ActiveQrState activeQrState, boolean z) {
        List qrData = activeQrState.f10681a;
        activeQrState.getClass();
        Intrinsics.i(qrData, "qrData");
        return new ActiveQrState(qrData, z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveQrState)) {
            return false;
        }
        ActiveQrState activeQrState = (ActiveQrState) obj;
        return Intrinsics.d(this.f10681a, activeQrState.f10681a) && this.b == activeQrState.b && this.c == activeQrState.c;
    }

    public final int hashCode() {
        return (((this.f10681a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveQrState(qrData=");
        sb.append(this.f10681a);
        sb.append(", isZoomed=");
        sb.append(this.b);
        sb.append(", isInitialValue=");
        return b3.g(")", sb, this.c);
    }

    public ActiveQrState() {
        this(EmptyList.f17557a, false, true);
    }
}
