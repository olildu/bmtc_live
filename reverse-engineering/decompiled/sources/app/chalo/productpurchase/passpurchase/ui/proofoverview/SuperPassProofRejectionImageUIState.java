package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofRejectionImageUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofRejectionImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperProofImageUIState f8492a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final BorderUISpec d;
    public final ImageUISize e;
    public final ImageUIState f;

    public SuperPassProofRejectionImageUIState(SuperProofImageUIState superProofImageUIState) {
        float f = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        float f2 = ChaloThemeHelper.a().b;
        float f3 = ChaloThemeHelper.a().d;
        BorderUISpec borderUISpec = new BorderUISpec(f2, ChaloColorToken.GreyC2.f9805a, new UIShape.Rectangle(f3, f3, f3, f3));
        ImageUISize imageUISize = new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().m), Dp.m7276boximpl(ChaloThemeHelper.a().p));
        ImageUIState imageUIState = new ImageUIState(IconType.IC_PROOF_REJECTION, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        this.f8492a = superProofImageUIState;
        this.b = ChaloColorToken.White.f9870a;
        this.c = rectangle;
        this.d = borderUISpec;
        this.e = imageUISize;
        this.f = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofRejectionImageUIState)) {
            return false;
        }
        SuperPassProofRejectionImageUIState superPassProofRejectionImageUIState = (SuperPassProofRejectionImageUIState) obj;
        return Intrinsics.d(this.f8492a, superPassProofRejectionImageUIState.f8492a) && Intrinsics.d(this.b, superPassProofRejectionImageUIState.b) && Intrinsics.d(this.c, superPassProofRejectionImageUIState.c) && Intrinsics.d(this.d, superPassProofRejectionImageUIState.d) && Intrinsics.d(this.e, superPassProofRejectionImageUIState.e) && Intrinsics.d(this.f, superPassProofRejectionImageUIState.f);
    }

    public final int hashCode() {
        SuperProofImageUIState superProofImageUIState = this.f8492a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + pk0.b(this.c, z40.b(this.b, (superProofImageUIState == null ? 0 : superProofImageUIState.hashCode()) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SuperPassProofRejectionImageUIState(img=" + this.f8492a + ", background=" + this.b + ", shape=" + this.c + ", border=" + this.d + ", size=" + this.e + ", rejectionImage=" + this.f + ")";
    }
}
