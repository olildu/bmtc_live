package app.chalo.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/SnackBarState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SnackBarState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnackBarData f2864a;
    public final boolean b;

    public /* synthetic */ SnackBarState() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnackBarState)) {
            return false;
        }
        SnackBarState snackBarState = (SnackBarState) obj;
        return Intrinsics.d(this.f2864a, snackBarState.f2864a) && this.b == snackBarState.b;
    }

    public final int hashCode() {
        SnackBarData snackBarData = this.f2864a;
        return ((snackBarData == null ? 0 : snackBarData.hashCode()) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "SnackBarState(snackBarData=" + this.f2864a + ", isVisible=" + this.b + ")";
    }

    public SnackBarState(SnackBarData snackBarData, boolean z) {
        this.f2864a = snackBarData;
        this.b = z;
    }
}
