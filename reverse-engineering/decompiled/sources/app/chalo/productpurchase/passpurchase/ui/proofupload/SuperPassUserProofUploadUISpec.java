package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassUserProofUploadUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8510a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public SuperPassUserProofUploadUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        ChaloPadding chaloPadding5 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 1);
        this.f8510a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
        this.e = chaloPadding5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassUserProofUploadUISpec)) {
            return false;
        }
        SuperPassUserProofUploadUISpec superPassUserProofUploadUISpec = (SuperPassUserProofUploadUISpec) obj;
        return Intrinsics.d(this.f8510a, superPassUserProofUploadUISpec.f8510a) && Intrinsics.d(this.b, superPassUserProofUploadUISpec.b) && Intrinsics.d(this.c, superPassUserProofUploadUISpec.c) && Intrinsics.d(this.d, superPassUserProofUploadUISpec.d) && Intrinsics.d(this.e, superPassUserProofUploadUISpec.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f8510a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("SuperPassUserProofUploadUISpec(internalPadding=", this.f8510a, ", paddingAroundDesc=", this.b, ", tutorialPadding=");
        r30.o(sbM, this.c, ", paddingAroundContent=", this.d, ", paddingAroundPlaceholder=");
        return py.e(sbM, this.e, ")");
    }
}
