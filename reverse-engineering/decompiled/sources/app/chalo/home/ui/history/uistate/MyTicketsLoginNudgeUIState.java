package app.chalo.home.ui.history.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/MyTicketsLoginNudgeUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MyTicketsLoginNudgeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f3476a;
    public final TextUIState b;
    public final ButtonUIState c;
    public final ChaloPadding d;

    public MyTicketsLoginNudgeUIState(ImageUIState img, TextUIState message, ButtonUIState buttonUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, ChaloThemeHelper.a().f, 6);
        Intrinsics.i(img, "img");
        Intrinsics.i(message, "message");
        this.f3476a = img;
        this.b = message;
        this.c = buttonUIState;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTicketsLoginNudgeUIState)) {
            return false;
        }
        MyTicketsLoginNudgeUIState myTicketsLoginNudgeUIState = (MyTicketsLoginNudgeUIState) obj;
        return Intrinsics.d(this.f3476a, myTicketsLoginNudgeUIState.f3476a) && Intrinsics.d(this.b, myTicketsLoginNudgeUIState.b) && Intrinsics.d(this.c, myTicketsLoginNudgeUIState.c) && Intrinsics.d(this.d, myTicketsLoginNudgeUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.d(this.c, pk0.c(this.b, this.f3476a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MyTicketsLoginNudgeUIState(img=" + this.f3476a + ", message=" + this.b + ", loginBtn=" + this.c + ", paddingAroundMsg=" + this.d + ")";
    }
}
