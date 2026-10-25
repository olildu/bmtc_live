package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassPassengerSelectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f8452a;
    public final TextUIState b;
    public final List c;
    public final SuperPassPassengerSelectionUISpec d;

    public SuperPassPassengerSelectionUIState(ToolbarUIState toolBar, TextUIState title, List passengersList) {
        SuperPassPassengerSelectionUISpec superPassPassengerSelectionUISpec = new SuperPassPassengerSelectionUISpec();
        Intrinsics.i(toolBar, "toolBar");
        Intrinsics.i(title, "title");
        Intrinsics.i(passengersList, "passengersList");
        this.f8452a = toolBar;
        this.b = title;
        this.c = passengersList;
        this.d = superPassPassengerSelectionUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassPassengerSelectionUIState)) {
            return false;
        }
        SuperPassPassengerSelectionUIState superPassPassengerSelectionUIState = (SuperPassPassengerSelectionUIState) obj;
        return Intrinsics.d(this.f8452a, superPassPassengerSelectionUIState.f8452a) && Intrinsics.d(this.b, superPassPassengerSelectionUIState.b) && Intrinsics.d(this.c, superPassPassengerSelectionUIState.c) && Intrinsics.d(this.d, superPassPassengerSelectionUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.b(pk0.c(this.b, this.f8452a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "SuperPassPassengerSelectionUIState(toolBar=" + this.f8452a + ", title=" + this.b + ", passengersList=" + this.c + ", spec=" + this.d + ")";
    }
}
