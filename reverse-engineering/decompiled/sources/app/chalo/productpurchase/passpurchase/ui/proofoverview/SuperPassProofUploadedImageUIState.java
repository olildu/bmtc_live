package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUploadedImageUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofUploadedImageUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassProofUploadedImageStageUIState f8496a;
    public final ImageUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final ImageUISize d;
    public final UIShape e;
    public final ChaloColorToken f;
    public final BorderUISpec g;

    public SuperPassProofUploadedImageUIState(SuperPassProofUploadedImageStageUIState superPassProofUploadedImageStageUIState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ImageUISize imageUISize = new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(ChaloThemeHelper.a().r + ChaloThemeHelper.a().h)), Dp.m7276boximpl(ChaloThemeHelper.a().u));
        float f = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        float f2 = ChaloThemeHelper.a().b;
        float f3 = ChaloThemeHelper.a().d;
        BorderUISpec borderUISpec = new BorderUISpec(f2, ChaloColorToken.GreyC2.f9805a, new UIShape.Rectangle(f3, f3, f3, f3));
        this.f8496a = superPassProofUploadedImageStageUIState;
        this.b = imageUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = imageUISize;
        this.e = rectangle;
        this.f = ChaloColorToken.White.f9870a;
        this.g = borderUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofUploadedImageUIState)) {
            return false;
        }
        SuperPassProofUploadedImageUIState superPassProofUploadedImageUIState = (SuperPassProofUploadedImageUIState) obj;
        return Intrinsics.d(this.f8496a, superPassProofUploadedImageUIState.f8496a) && Intrinsics.d(this.b, superPassProofUploadedImageUIState.b) && Intrinsics.d(this.c, superPassProofUploadedImageUIState.c) && Intrinsics.d(this.d, superPassProofUploadedImageUIState.d) && Intrinsics.d(this.e, superPassProofUploadedImageUIState.e) && Intrinsics.d(this.f, superPassProofUploadedImageUIState.f) && Intrinsics.d(this.g, superPassProofUploadedImageUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f8496a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        return this.g.hashCode() + z40.b(this.f, pk0.b(this.e, (this.d.hashCode() + gf.a(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperPassProofUploadedImageUIState(stage=" + this.f8496a + ", editBtn=" + this.b + ", editBtnClick=" + this.c + ", size=" + this.d + ", shape=" + this.e + ", background=" + this.f + ", border=" + this.g + ")";
    }
}
