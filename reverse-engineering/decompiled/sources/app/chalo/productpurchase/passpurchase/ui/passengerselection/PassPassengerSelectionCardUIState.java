package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/PassPassengerSelectionCardUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassPassengerSelectionCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8443a;
    public final UiEventHandler$Companion$fromLambda$1 b;
    public final CardUISpec c;
    public final ChaloPadding d;
    public final float e;

    public PassPassengerSelectionCardUIState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        CardUISpec cardUISpec = new CardUISpec(UIShape.f1926a, ChaloThemeHelper.a().d, 0.0f, 4);
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        this.f8443a = chaloTextUIState;
        this.b = uiEventHandler$Companion$fromLambda$1;
        this.c = cardUISpec;
        this.d = chaloPadding;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassPassengerSelectionCardUIState)) {
            return false;
        }
        PassPassengerSelectionCardUIState passPassengerSelectionCardUIState = (PassPassengerSelectionCardUIState) obj;
        return Intrinsics.d(this.f8443a, passPassengerSelectionCardUIState.f8443a) && Intrinsics.d(this.b, passPassengerSelectionCardUIState.b) && Intrinsics.d(this.c, passPassengerSelectionCardUIState.c) && Intrinsics.d(this.d, passPassengerSelectionCardUIState.d) && Dp.m7283equalsimpl0(this.e, passPassengerSelectionCardUIState.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + r30.c(this.d, (this.c.hashCode() + gf.a(this.b, this.f8443a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("PassPassengerSelectionCardUIState(text=");
        sb.append(this.f8443a);
        sb.append(", eventHandler=");
        sb.append(this.b);
        sb.append(", itemsCardSpec=");
        sb.append(this.c);
        sb.append(", itemInternalPadding=");
        sb.append(this.d);
        sb.append(", spaceAfterItem=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
