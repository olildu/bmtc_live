package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationNoticeUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationNoticeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationNoticeUISpecs f8051a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ActivationNoticeUIState(ImageUIState iconUIState, TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        ActivationNoticeUISpecs activationNoticeUISpecs = new ActivationNoticeUISpecs();
        Intrinsics.i(iconUIState, "iconUIState");
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        this.f8051a = activationNoticeUISpecs;
        this.b = iconUIState;
        this.c = titleTextUIState;
        this.d = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationNoticeUIState)) {
            return false;
        }
        ActivationNoticeUIState activationNoticeUIState = (ActivationNoticeUIState) obj;
        return Intrinsics.d(this.f8051a, activationNoticeUIState.f8051a) && Intrinsics.d(this.b, activationNoticeUIState.b) && Intrinsics.d(this.c, activationNoticeUIState.c) && Intrinsics.d(this.d, activationNoticeUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.e(this.b, this.f8051a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ActivationNoticeUIState(specs=" + this.f8051a + ", iconUIState=" + this.b + ", titleTextUIState=" + this.c + ", messageTextUIState=" + this.d + ")";
    }
}
