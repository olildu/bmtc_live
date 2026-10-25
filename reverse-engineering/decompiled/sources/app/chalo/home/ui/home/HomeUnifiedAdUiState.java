package app.chalo.home.ui.home;

import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeUnifiedAdUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HomeUnifiedAdUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3581a;
    public final boolean b;
    public final int c;
    public final int d;

    public HomeUnifiedAdUiState(int i, int i2, boolean z, boolean z2) {
        this.f3581a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeUnifiedAdUiState)) {
            return false;
        }
        HomeUnifiedAdUiState homeUnifiedAdUiState = (HomeUnifiedAdUiState) obj;
        return this.f3581a == homeUnifiedAdUiState.f3581a && this.b == homeUnifiedAdUiState.b && this.c == homeUnifiedAdUiState.c && this.d == homeUnifiedAdUiState.d;
    }

    public final int hashCode() {
        return ((((((this.f3581a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return xs.h(this.c, this.d, ", heightDp=", ")", nf1.r("HomeUnifiedAdUiState(isVisible=", ", isRendered=", ", widthDp=", this.f3581a, this.b));
    }
}
