package app.chalo.uistate.textwithleftandtrailingrighticon;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textwithleftandtrailingrighticon/TextWithLeftAndRightIconUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextWithLeftAndRightIconUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f10114a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final float d;
    public final Dp e;

    public TextWithLeftAndRightIconUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2, float f, Dp dp) {
        this.f10114a = imageUIState;
        this.b = chaloTextUIState;
        this.c = imageUIState2;
        this.d = f;
        this.e = dp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithLeftAndRightIconUIState)) {
            return false;
        }
        TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) obj;
        return Intrinsics.d(this.f10114a, textWithLeftAndRightIconUIState.f10114a) && Intrinsics.d(this.b, textWithLeftAndRightIconUIState.b) && Intrinsics.d(this.c, textWithLeftAndRightIconUIState.c) && Dp.m7283equalsimpl0(this.d, textWithLeftAndRightIconUIState.d) && Intrinsics.d(this.e, textWithLeftAndRightIconUIState.e);
    }

    public final int hashCode() {
        ImageUIState imageUIState = this.f10114a;
        int iF = r30.f(this.b, (imageUIState == null ? 0 : imageUIState.hashCode()) * 31, 31);
        ImageUIState imageUIState2 = this.c;
        int iA = uf0.a(this.d, (iF + (imageUIState2 == null ? 0 : imageUIState2.hashCode())) * 31, 31);
        Dp dp = this.e;
        return iA + (dp != null ? Dp.m7284hashCodeimpl(dp.m7292unboximpl()) : 0);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = pk0.n("TextWithLeftAndRightIconUIState(leftIcon=", this.f10114a, ", textViewState=", this.b, ", rightIcon=");
        sbN.append(this.c);
        sbN.append(", spaceBtwLeftIconAndText=");
        sbN.append(strM7289toStringimpl);
        sbN.append(", spaceBtwRightIconAndText=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }

    public TextWithLeftAndRightIconUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2, float f, Dp dp, int i) {
        this((i & 1) != 0 ? null : imageUIState, chaloTextUIState, (i & 4) != 0 ? null : imageUIState2, (i & 8) != 0 ? ChaloThemeHelper.a().d : f, (i & 16) != 0 ? null : dp);
    }
}
