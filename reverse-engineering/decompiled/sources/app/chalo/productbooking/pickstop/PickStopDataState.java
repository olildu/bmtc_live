package app.chalo.productbooking.pickstop;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PickStopDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTransitMode f8300a;
    public final boolean b;
    public final List c;
    public final String d;

    public PickStopDataState(ChaloTransitMode chaloTransitMode, boolean z, List currentStopList, String str) {
        Intrinsics.i(currentStopList, "currentStopList");
        this.f8300a = chaloTransitMode;
        this.b = z;
        this.c = currentStopList;
        this.d = str;
    }

    public static PickStopDataState a(PickStopDataState pickStopDataState, ChaloTransitMode chaloTransitMode, boolean z, List currentStopList, String currentQuery, int i) {
        if ((i & 1) != 0) {
            chaloTransitMode = pickStopDataState.f8300a;
        }
        if ((i & 2) != 0) {
            z = pickStopDataState.b;
        }
        if ((i & 4) != 0) {
            currentStopList = pickStopDataState.c;
        }
        if ((i & 8) != 0) {
            currentQuery = pickStopDataState.d;
        }
        pickStopDataState.getClass();
        pickStopDataState.getClass();
        Intrinsics.i(currentStopList, "currentStopList");
        Intrinsics.i(currentQuery, "currentQuery");
        return new PickStopDataState(chaloTransitMode, z, currentStopList, currentQuery);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickStopDataState)) {
            return false;
        }
        PickStopDataState pickStopDataState = (PickStopDataState) obj;
        return this.f8300a == pickStopDataState.f8300a && this.b == pickStopDataState.b && Intrinsics.d(this.c, pickStopDataState.c) && this.d.equals(pickStopDataState.d);
    }

    public final int hashCode() {
        ChaloTransitMode chaloTransitMode = this.f8300a;
        return ((this.d.hashCode() + r30.b((((chaloTransitMode == null ? 0 : chaloTransitMode.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31, 31, this.c)) * 31) + 1237;
    }

    public final String toString() {
        return "PickStopDataState(transitMode=" + this.f8300a + ", showLoader=" + this.b + ", currentStopList=" + this.c + ", currentQuery=" + this.d + ", shouldShowNoInternetSnackbar=false)";
    }
}
