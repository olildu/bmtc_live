package app.chalo.multimodalticket.ui.uistates;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/PassengerSelectionItemsContainerUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassengerSelectionItemsContainerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5968a;
    public final UiAlignment.Horizontal b;
    public final UiArrangement.HorizontalOrVertical c;

    public PassengerSelectionItemsContainerUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, ChaloThemeHelper.a().l0, 6);
        UiArrangement.HorizontalOrVertical.SpacedBy spacedBy = new UiArrangement.HorizontalOrVertical.SpacedBy(ChaloThemeHelper.a().g);
        this.f5968a = chaloPadding;
        this.b = UiAlignment.Horizontal.Center.f9884a;
        this.c = spacedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerSelectionItemsContainerUISpecs)) {
            return false;
        }
        PassengerSelectionItemsContainerUISpecs passengerSelectionItemsContainerUISpecs = (PassengerSelectionItemsContainerUISpecs) obj;
        return Intrinsics.d(this.f5968a, passengerSelectionItemsContainerUISpecs.f5968a) && Intrinsics.d(this.b, passengerSelectionItemsContainerUISpecs.b) && Intrinsics.d(this.c, passengerSelectionItemsContainerUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.d(this.b, this.f5968a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PassengerSelectionItemsContainerUISpecs(padding=" + this.f5968a + ", horizontalAlignment=" + this.b + ", passengerSelectionItemVerticalArrangement=" + this.c + ")";
    }
}
