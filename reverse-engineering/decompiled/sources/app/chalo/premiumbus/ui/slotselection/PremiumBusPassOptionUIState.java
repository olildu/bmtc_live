package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassOptionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPassOptionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusPassOptionUISpecs f7848a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final PassOptionAdditionalInfo d;
    public final UiEventHandler e;

    public PremiumBusPassOptionUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, PassOptionAdditionalInfo passOptionAdditionalInfo, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        PremiumBusPassOptionUISpecs premiumBusPassOptionUISpecs = new PremiumBusPassOptionUISpecs();
        passOptionAdditionalInfo = (i & 8) != 0 ? null : passOptionAdditionalInfo;
        uiEventHandler$Companion$fromLambda$1 = (i & 16) != 0 ? null : uiEventHandler$Companion$fromLambda$1;
        Intrinsics.i(title, "title");
        this.f7848a = premiumBusPassOptionUISpecs;
        this.b = title;
        this.c = chaloTextUIState;
        this.d = passOptionAdditionalInfo;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassOptionUIState)) {
            return false;
        }
        PremiumBusPassOptionUIState premiumBusPassOptionUIState = (PremiumBusPassOptionUIState) obj;
        return Intrinsics.d(this.f7848a, premiumBusPassOptionUIState.f7848a) && Intrinsics.d(this.b, premiumBusPassOptionUIState.b) && Intrinsics.d(this.c, premiumBusPassOptionUIState.c) && Intrinsics.d(this.d, premiumBusPassOptionUIState.d) && Intrinsics.d(this.e, premiumBusPassOptionUIState.e);
    }

    public final int hashCode() {
        int iF = r30.f(this.c, r30.f(this.b, this.f7848a.hashCode() * 31, 31), 31);
        PassOptionAdditionalInfo passOptionAdditionalInfo = this.d;
        int iHashCode = (iF + (passOptionAdditionalInfo == null ? 0 : passOptionAdditionalInfo.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.e;
        return iHashCode + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        return "PremiumBusPassOptionUIState(specs=" + this.f7848a + ", title=" + this.b + ", subTitle=" + this.c + ", additionalInfo=" + this.d + ", uiEventHandler=" + this.e + ")";
    }
}
