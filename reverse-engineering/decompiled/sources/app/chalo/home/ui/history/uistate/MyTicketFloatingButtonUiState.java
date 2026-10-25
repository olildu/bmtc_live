package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/MyTicketFloatingButtonUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketFloatingButtonUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MyTicketFloatingButtonSpec f3474a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public MyTicketFloatingButtonUiState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        MyTicketFloatingButtonSpec myTicketFloatingButtonSpec = new MyTicketFloatingButtonSpec();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_ICON_TICKET_WHITE, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().h), Dp.m7276boximpl(ChaloThemeHelper.a().i)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        this.f3474a = myTicketFloatingButtonSpec;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketFloatingButtonUiState)) {
            return false;
        }
        MyTicketFloatingButtonUiState myTicketFloatingButtonUiState = (MyTicketFloatingButtonUiState) obj;
        return Intrinsics.d(this.f3474a, myTicketFloatingButtonUiState.f3474a) && Intrinsics.d(this.b, myTicketFloatingButtonUiState.b) && Intrinsics.d(this.c, myTicketFloatingButtonUiState.c) && Intrinsics.d(this.d, myTicketFloatingButtonUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.e(this.b, this.f3474a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MyTicketFloatingButtonUiState(spec=" + this.f3474a + ", image=" + this.b + ", text=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
