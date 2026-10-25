package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/ActivationPassContainerUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivationPassContainerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivationPassContainerUISpecs f8053a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.StyledTextUIState e;
    public final TextUIState.ChaloTextUIState f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ActivationPassContainerUIState(TextUIState.ChaloTextUIState passTitleUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        ActivationPassContainerUISpecs activationPassContainerUISpecs = new ActivationPassContainerUISpecs();
        ImageUIState imageUIState = new ImageUIState(IconType.IC_PASS_ACTIVATION_BACKGROUND_BRUSH, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(75)), Dp.m7276boximpl(Dp.m7278constructorimpl(140))), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        Intrinsics.i(passTitleUIState, "passTitleUIState");
        this.f8053a = activationPassContainerUISpecs;
        this.b = imageUIState;
        this.c = passTitleUIState;
        this.d = chaloTextUIState;
        this.e = styledTextUIState;
        this.f = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivationPassContainerUIState)) {
            return false;
        }
        ActivationPassContainerUIState activationPassContainerUIState = (ActivationPassContainerUIState) obj;
        return Intrinsics.d(this.f8053a, activationPassContainerUIState.f8053a) && Intrinsics.d(this.b, activationPassContainerUIState.b) && Intrinsics.d(this.c, activationPassContainerUIState.c) && Intrinsics.d(this.d, activationPassContainerUIState.d) && Intrinsics.d(this.e, activationPassContainerUIState.e) && Intrinsics.d(this.f, activationPassContainerUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f8053a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        int iF = r30.f(this.d, r30.f(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31), 31);
        TextUIState.StyledTextUIState styledTextUIState = this.e;
        int iHashCode2 = (iF + (styledTextUIState == null ? 0 : styledTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.f;
        return iHashCode2 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivationPassContainerUIState(specs=");
        sb.append(this.f8053a);
        sb.append(", passBackgroundBrushImageUIState=");
        sb.append(this.b);
        sb.append(", passTitleUIState=");
        r30.p(sb, this.c, ", passInfoUIState=", this.d, ", numberOfRidesTextUIState=");
        sb.append(this.e);
        sb.append(", validTillTextUIState=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
