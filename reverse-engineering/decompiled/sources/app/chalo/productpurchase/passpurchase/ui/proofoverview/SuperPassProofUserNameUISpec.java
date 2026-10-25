package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofUserNameUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofUserNameUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8497a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final float g;

    public SuperPassProofUserNameUISpec(float f) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding5 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding6 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        this.f8497a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
        this.e = chaloPadding5;
        this.f = chaloPadding6;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofUserNameUISpec)) {
            return false;
        }
        SuperPassProofUserNameUISpec superPassProofUserNameUISpec = (SuperPassProofUserNameUISpec) obj;
        return Intrinsics.d(this.f8497a, superPassProofUserNameUISpec.f8497a) && Intrinsics.d(this.b, superPassProofUserNameUISpec.b) && Intrinsics.d(this.c, superPassProofUserNameUISpec.c) && Intrinsics.d(this.d, superPassProofUserNameUISpec.d) && Intrinsics.d(this.e, superPassProofUserNameUISpec.e) && Intrinsics.d(this.f, superPassProofUserNameUISpec.f) && Dp.m7283equalsimpl0(this.g, superPassProofUserNameUISpec.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f8497a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.g);
        StringBuilder sbM = pk0.m("SuperPassProofUserNameUISpec(internalPadding=", this.f8497a, ", paddingAroundSubtitle=", this.b, ", paddingAroundGeneralRejection=");
        r30.o(sbM, this.c, ", paddingAroundUsernameTitle=", this.d, ", paddingAroundProfileRejection=");
        r30.o(sbM, this.e, ", paddingAroundFullNameTextField=", this.f, ", bottomSpace=");
        return vo1.p(sbM, strM7289toStringimpl, ")");
    }
}
