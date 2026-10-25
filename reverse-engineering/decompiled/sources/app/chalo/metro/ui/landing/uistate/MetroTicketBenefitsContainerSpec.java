package app.chalo.metro.ui.landing.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroTicketBenefitsContainerSpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroTicketBenefitsContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5529a;
    public final float b;
    public final float c;

    public MetroTicketBenefitsContainerSpec() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().i;
        float f4 = ChaloThemeHelper.a().i;
        this.f5529a = chaloPadding;
        this.b = f3;
        this.c = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketBenefitsContainerSpec)) {
            return false;
        }
        MetroTicketBenefitsContainerSpec metroTicketBenefitsContainerSpec = (MetroTicketBenefitsContainerSpec) obj;
        return Intrinsics.d(this.f5529a, metroTicketBenefitsContainerSpec.f5529a) && Dp.m7283equalsimpl0(this.b, metroTicketBenefitsContainerSpec.b) && Dp.m7283equalsimpl0(this.c, metroTicketBenefitsContainerSpec.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + uf0.a(this.b, this.f5529a.hashCode() * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return vo1.p(t10.n("MetroTicketBenefitsContainerSpec(contentPadding=", this.f5529a, ", titleAndBenefitsListSpacing=", strM7289toStringimpl, ", benefitListAndBannerSpacing="), Dp.m7289toStringimpl(this.c), ")");
    }
}
