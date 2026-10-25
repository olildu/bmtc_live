package app.chalo.productpurchase.passpurchase.ui.proofupload;

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
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassProofTutorialUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofTutorialUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f8500a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public SuperPassProofTutorialUIState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ImageUIState imageUIState = new ImageUIState(IconType.IC_WATCH_VIDEO, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7278constructorimpl(ChaloThemeHelper.a().h - ChaloThemeHelper.a().c)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().f + ChaloThemeHelper.a().c);
        this.f8500a = imageUIState;
        this.b = chaloTextUIState;
        this.c = fM7278constructorimpl;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofTutorialUIState)) {
            return false;
        }
        SuperPassProofTutorialUIState superPassProofTutorialUIState = (SuperPassProofTutorialUIState) obj;
        return Intrinsics.d(this.f8500a, superPassProofTutorialUIState.f8500a) && Intrinsics.d(this.b, superPassProofTutorialUIState.b) && Dp.m7283equalsimpl0(this.c, superPassProofTutorialUIState.c) && Intrinsics.d(this.d, superPassProofTutorialUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, r30.f(this.b, this.f8500a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbN = pk0.n("SuperPassProofTutorialUIState(icon=", this.f8500a, ", text=", this.b, ", spaceBetween=");
        sbN.append(strM7289toStringimpl);
        sbN.append(", eventHandler=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
