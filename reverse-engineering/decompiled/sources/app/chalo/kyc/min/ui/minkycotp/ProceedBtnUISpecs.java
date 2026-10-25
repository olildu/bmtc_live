package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/ProceedBtnUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProceedBtnUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiAlignment.BiasAlignment f4170a;
    public final ChaloPadding b;
    public final float c;

    public ProceedBtnUISpecs(float f) {
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        this.f4170a = UiAlignment.BiasAlignment.BottomCenter.f9875a;
        this.b = chaloPadding;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProceedBtnUISpecs)) {
            return false;
        }
        ProceedBtnUISpecs proceedBtnUISpecs = (ProceedBtnUISpecs) obj;
        return Intrinsics.d(this.f4170a, proceedBtnUISpecs.f4170a) && Intrinsics.d(this.b, proceedBtnUISpecs.b) && Float.compare(this.c, proceedBtnUISpecs.c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + r30.c(this.b, this.f4170a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProceedBtnUISpecs(alignment=");
        sb.append(this.f4170a);
        sb.append(", padding=");
        sb.append(this.b);
        sb.append(", alphaValue=");
        return py.g(sb, ")", this.c);
    }
}
