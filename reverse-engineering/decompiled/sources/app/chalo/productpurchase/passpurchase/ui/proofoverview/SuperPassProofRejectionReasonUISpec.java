package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofRejectionReasonUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofRejectionReasonUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8493a;
    public final UIShape b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public SuperPassProofRejectionReasonUISpec() {
        float f = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, ChaloThemeHelper.a().f, 0.0f, 10);
        this.f8493a = ChaloColorToken.OrangeBackground.f9832a;
        this.b = rectangle;
        this.c = chaloPadding;
        this.d = chaloPadding2;
        this.e = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofRejectionReasonUISpec)) {
            return false;
        }
        SuperPassProofRejectionReasonUISpec superPassProofRejectionReasonUISpec = (SuperPassProofRejectionReasonUISpec) obj;
        return Intrinsics.d(this.f8493a, superPassProofRejectionReasonUISpec.f8493a) && Intrinsics.d(this.b, superPassProofRejectionReasonUISpec.b) && Intrinsics.d(this.c, superPassProofRejectionReasonUISpec.c) && Intrinsics.d(this.d, superPassProofRejectionReasonUISpec.d) && Intrinsics.d(this.e, superPassProofRejectionReasonUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, r30.c(this.c, pk0.b(this.b, this.f8493a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassProofRejectionReasonUISpec(background=");
        sb.append(this.f8493a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", internalPadding=");
        r30.o(sb, this.c, ", paddingAroundRejectionText=", this.d, ", paddingAroundImg=");
        return py.e(sb, this.e, ")");
    }
}
