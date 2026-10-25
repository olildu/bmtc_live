package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationTicketContainerUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationTicketContainerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8057a;
    public final ChaloPadding b;

    public ActivationTicketContainerUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 7);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
        this.f8057a = chaloPadding;
        this.b = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationTicketContainerUISpecs)) {
            return false;
        }
        ActivationTicketContainerUISpecs activationTicketContainerUISpecs = (ActivationTicketContainerUISpecs) obj;
        return Intrinsics.d(this.f8057a, activationTicketContainerUISpecs.f8057a) && Intrinsics.d(this.b, activationTicketContainerUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8057a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivationTicketContainerUISpecs(ticketContainerPadding=" + this.f8057a + ", validTillTextPadding=" + this.b + ")";
    }
}
