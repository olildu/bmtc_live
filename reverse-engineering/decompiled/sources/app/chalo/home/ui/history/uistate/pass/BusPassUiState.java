package app.chalo.home.ui.history.uistate.pass;

import app.chalo.home.ui.history.uistate.chalobusticket.ProductFooterContainerUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/pass/BusPassUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusPassUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusPassSpec f3514a = new BusPassSpec();
    public final List b;
    public final BusPassDetailsContainerUiState c;
    public final ProductFooterContainerUiState d;

    public BusPassUiState(List list, BusPassDetailsContainerUiState busPassDetailsContainerUiState, ProductFooterContainerUiState productFooterContainerUiState) {
        this.b = list;
        this.c = busPassDetailsContainerUiState;
        this.d = productFooterContainerUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusPassUiState)) {
            return false;
        }
        BusPassUiState busPassUiState = (BusPassUiState) obj;
        return Intrinsics.d(this.f3514a, busPassUiState.f3514a) && Intrinsics.d(this.b, busPassUiState.b) && Intrinsics.d(this.c, busPassUiState.c) && Intrinsics.d(this.d, busPassUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f3514a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        ProductFooterContainerUiState productFooterContainerUiState = this.d;
        return iHashCode2 + (productFooterContainerUiState != null ? productFooterContainerUiState.hashCode() : 0);
    }

    public final String toString() {
        return "BusPassUiState(spec=" + this.f3514a + ", passBannerState=" + this.b + ", passDetailsContainer=" + this.c + ", passFooterContainer=" + this.d + ")";
    }
}
