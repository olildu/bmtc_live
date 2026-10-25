package app.chalo.multimodalticket.groupticketsummary.ui.uistate;

import app.chalo.uistate.base.UiAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/uistate/GroupTicketLegFareUiSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupTicketLegFareUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.Vertical f5914a = UiAlignment.Vertical.Center.f9888a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupTicketLegFareUiSpec) && Intrinsics.d(this.f5914a, ((GroupTicketLegFareUiSpec) obj).f5914a);
    }

    public final int hashCode() {
        return this.f5914a.hashCode();
    }

    public final String toString() {
        return "GroupTicketLegFareUiSpec(itemVerticalAlignment=" + this.f5914a + ")";
    }
}
