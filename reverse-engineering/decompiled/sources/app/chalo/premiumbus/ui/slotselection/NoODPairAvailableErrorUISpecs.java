package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/NoODPairAvailableErrorUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoODPairAvailableErrorUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7812a;
    public final ChaloColorToken b;
    public final float c;

    public NoODPairAvailableErrorUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().n;
        this.f7812a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoODPairAvailableErrorUISpecs)) {
            return false;
        }
        NoODPairAvailableErrorUISpecs noODPairAvailableErrorUISpecs = (NoODPairAvailableErrorUISpecs) obj;
        return Intrinsics.d(this.f7812a, noODPairAvailableErrorUISpecs.f7812a) && Intrinsics.d(this.b, noODPairAvailableErrorUISpecs.b) && Dp.m7283equalsimpl0(this.c, noODPairAvailableErrorUISpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + z40.b(this.b, this.f7812a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(gf.l(this.f7812a, this.b, "NoODPairAvailableErrorUISpecs(contentPadding=", ", backgroundColorToken=", ", buttonHeight="), Dp.m7289toStringimpl(this.c), ")");
    }
}
