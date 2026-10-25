package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.py;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsFooterUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsFooterUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7584a;
    public final ChaloPadding b;
    public final float c;

    public PremiumBusFareDetailsFooterUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().h;
        this.f7584a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsFooterUISpecs)) {
            return false;
        }
        PremiumBusFareDetailsFooterUISpecs premiumBusFareDetailsFooterUISpecs = (PremiumBusFareDetailsFooterUISpecs) obj;
        return Intrinsics.d(this.f7584a, premiumBusFareDetailsFooterUISpecs.f7584a) && Intrinsics.d(this.b, premiumBusFareDetailsFooterUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusFareDetailsFooterUISpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.c(this.b, this.f7584a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(py.i(this.b, this.f7584a, "PremiumBusFareDetailsFooterUISpecs(backgroundColor=", ", contentPadding=", ", spaceBetweenBlocks="), Dp.m7289toStringimpl(this.c), ")");
    }
}
