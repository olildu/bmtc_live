package app.chalo.multimodalticket.ui.uistates;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DashedDividerUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/uistates/FareBreakupSectionUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareBreakupSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FareBreakupSectionUISpecs f5960a;
    public final UiEventHandler$Companion$fromLambda$1 b;
    public final List c;
    public final FareBreakupItemUIState d;
    public final DashedDividerUIState e;

    public FareBreakupSectionUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, List fareBreakupItemUIStateList, FareBreakupItemUIState fareBreakupItemUIState, DashedDividerUIState dashedDividerUIState) {
        FareBreakupSectionUISpecs fareBreakupSectionUISpecs = new FareBreakupSectionUISpecs();
        Intrinsics.i(fareBreakupItemUIStateList, "fareBreakupItemUIStateList");
        this.f5960a = fareBreakupSectionUISpecs;
        this.b = uiEventHandler$Companion$fromLambda$1;
        this.c = fareBreakupItemUIStateList;
        this.d = fareBreakupItemUIState;
        this.e = dashedDividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupSectionUIState)) {
            return false;
        }
        FareBreakupSectionUIState fareBreakupSectionUIState = (FareBreakupSectionUIState) obj;
        return Intrinsics.d(this.f5960a, fareBreakupSectionUIState.f5960a) && Intrinsics.d(this.b, fareBreakupSectionUIState.b) && Intrinsics.d(this.c, fareBreakupSectionUIState.c) && Intrinsics.d(this.d, fareBreakupSectionUIState.d) && Intrinsics.d(this.e, fareBreakupSectionUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f5960a.hashCode() * 31;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + r30.b((iHashCode + (uiEventHandler$Companion$fromLambda$1 == null ? 0 : uiEventHandler$Companion$fromLambda$1.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "FareBreakupSectionUIState(specs=" + this.f5960a + ", dismissEventHandler=" + this.b + ", fareBreakupItemUIStateList=" + this.c + ", totalFareUIState=" + this.d + ", dashedDividerUIState=" + this.e + ")";
    }
}
