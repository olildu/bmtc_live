package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusDefaultOptionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusDefaultOptionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusDefaultOptionUISpecs f7843a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler c;

    public PremiumBusDefaultOptionUIState(PremiumBusDefaultOptionUISpecs specs, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler uiEventHandler) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(uiEventHandler, "uiEventHandler");
        this.f7843a = specs;
        this.b = chaloTextUIState;
        this.c = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusDefaultOptionUIState)) {
            return false;
        }
        PremiumBusDefaultOptionUIState premiumBusDefaultOptionUIState = (PremiumBusDefaultOptionUIState) obj;
        return Intrinsics.d(this.f7843a, premiumBusDefaultOptionUIState.f7843a) && Intrinsics.d(this.b, premiumBusDefaultOptionUIState.b) && Intrinsics.d(this.c, premiumBusDefaultOptionUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f7843a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PremiumBusDefaultOptionUIState(specs=" + this.f7843a + ", title=" + this.b + ", uiEventHandler=" + this.c + ")";
    }
}
