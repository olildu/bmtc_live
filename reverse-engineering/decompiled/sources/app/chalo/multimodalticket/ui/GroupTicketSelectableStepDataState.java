package app.chalo.multimodalticket.ui;

import app.chalo.data.ProductBookingBranding;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketSelectableStepDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketSelectableStepDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5948a;
    public final GroupTicketSelectableStepAppModel b;

    static {
        ProductBookingBranding.Companion companion = ProductBookingBranding.INSTANCE;
    }

    public GroupTicketSelectableStepDataState(boolean z, GroupTicketSelectableStepAppModel selectableStepAppModel) {
        Intrinsics.i(selectableStepAppModel, "selectableStepAppModel");
        this.f5948a = z;
        this.b = selectableStepAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupTicketSelectableStepDataState)) {
            return false;
        }
        GroupTicketSelectableStepDataState groupTicketSelectableStepDataState = (GroupTicketSelectableStepDataState) obj;
        return this.f5948a == groupTicketSelectableStepDataState.f5948a && Intrinsics.d(this.b, groupTicketSelectableStepDataState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f5948a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "GroupTicketSelectableStepDataState(isSelected=" + this.f5948a + ", selectableStepAppModel=" + this.b + ")";
    }
}
