package app.chalo.multimodalticket.ui.uistates;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/PassengerSelectionItemsContainerUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerSelectionItemsContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PassengerSelectionItemsContainerUISpecs f5969a;
    public final List b;

    public PassengerSelectionItemsContainerUIState(List passengerSelectionItemUIStateList) {
        PassengerSelectionItemsContainerUISpecs passengerSelectionItemsContainerUISpecs = new PassengerSelectionItemsContainerUISpecs();
        Intrinsics.i(passengerSelectionItemUIStateList, "passengerSelectionItemUIStateList");
        this.f5969a = passengerSelectionItemsContainerUISpecs;
        this.b = passengerSelectionItemUIStateList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerSelectionItemsContainerUIState)) {
            return false;
        }
        PassengerSelectionItemsContainerUIState passengerSelectionItemsContainerUIState = (PassengerSelectionItemsContainerUIState) obj;
        return Intrinsics.d(this.f5969a, passengerSelectionItemsContainerUIState.f5969a) && Intrinsics.d(this.b, passengerSelectionItemsContainerUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5969a.hashCode() * 31);
    }

    public final String toString() {
        return "PassengerSelectionItemsContainerUIState(specs=" + this.f5969a + ", passengerSelectionItemUIStateList=" + this.b + ")";
    }
}
