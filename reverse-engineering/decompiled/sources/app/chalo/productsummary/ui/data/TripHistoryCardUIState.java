package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/TripHistoryCardUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripHistoryCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8762a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final TextWithLeftAndRightIconUIState d;
    public final UiEventHandler e;

    public TripHistoryCardUIState(UIShape.Rectangle cardShape, TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        Intrinsics.i(cardShape, "cardShape");
        this.f8762a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = cardShape;
        this.d = textWithLeftAndRightIconUIState;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripHistoryCardUIState)) {
            return false;
        }
        TripHistoryCardUIState tripHistoryCardUIState = (TripHistoryCardUIState) obj;
        return Intrinsics.d(this.f8762a, tripHistoryCardUIState.f8762a) && Intrinsics.d(this.b, tripHistoryCardUIState.b) && Intrinsics.d(this.c, tripHistoryCardUIState.c) && Intrinsics.d(this.d, tripHistoryCardUIState.d) && Intrinsics.d(this.e, tripHistoryCardUIState.e);
    }

    public final int hashCode() {
        int iB = pk0.b(this.c, z40.b(this.b, this.f8762a.hashCode() * 31, 31), 31);
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = this.d;
        return this.e.hashCode() + ((iB + (textWithLeftAndRightIconUIState == null ? 0 : textWithLeftAndRightIconUIState.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbL = gf.l(this.f8762a, this.b, "TripHistoryCardUIState(contentPadding=", ", backgroundColor=", ", cardShape=");
        sbL.append(this.c);
        sbL.append(", cardContentUIState=");
        sbL.append(this.d);
        sbL.append(", eventHandler=");
        sbL.append(this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
