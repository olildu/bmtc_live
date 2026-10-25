package app.chalo.multimodalticket.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/TicketSelectionContainerUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketSelectionContainerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5954a;
    public final UiAlignment.Horizontal b;

    public TicketSelectionContainerUISpecs() {
        float f = ChaloThemeHelper.a().h;
        this.f5954a = new ChaloPadding(f, f, f, f);
        this.b = UiAlignment.Horizontal.Center.f9884a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSelectionContainerUISpecs)) {
            return false;
        }
        TicketSelectionContainerUISpecs ticketSelectionContainerUISpecs = (TicketSelectionContainerUISpecs) obj;
        return Intrinsics.d(this.f5954a, ticketSelectionContainerUISpecs.f5954a) && Intrinsics.d(this.b, ticketSelectionContainerUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5954a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketSelectionContainerUISpecs(padding=" + this.f5954a + ", horizontalAlignment=" + this.b + ")";
    }
}
