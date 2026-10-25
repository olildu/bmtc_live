package app.chalo.uistate.error;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.gf;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/ErrorBannerUiSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ErrorBannerUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10019a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final UiAlignment.Vertical d;
    public final float e;

    public ErrorBannerUiSpec(ChaloPadding chaloPadding, UIShape itemShape, int i) {
        chaloPadding = (i & 1) != 0 ? new ChaloPadding(0.0f, 0.0f, 3) : chaloPadding;
        ChaloColorToken chaloColorToken = (i & 2) != 0 ? ChaloColorToken.White.f9870a : ChaloColorToken.RedBase.f9846a;
        if ((i & 4) != 0) {
            float fM7278constructorimpl = Dp.m7278constructorimpl(10);
            itemShape = new UIShape.Rectangle(fM7278constructorimpl, fM7278constructorimpl, fM7278constructorimpl, fM7278constructorimpl);
        }
        float f = ChaloThemeHelper.a().f;
        Intrinsics.i(itemShape, "itemShape");
        this.f10019a = chaloPadding;
        this.b = chaloColorToken;
        this.c = itemShape;
        this.d = UiAlignment.Vertical.Center.f9888a;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorBannerUiSpec)) {
            return false;
        }
        ErrorBannerUiSpec errorBannerUiSpec = (ErrorBannerUiSpec) obj;
        return Intrinsics.d(this.f10019a, errorBannerUiSpec.f10019a) && Intrinsics.d(this.b, errorBannerUiSpec.b) && Intrinsics.d(this.c, errorBannerUiSpec.c) && Intrinsics.d(this.d, errorBannerUiSpec.d) && Dp.m7283equalsimpl0(this.e, errorBannerUiSpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.e(this.d, pk0.b(this.c, z40.b(this.b, this.f10019a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sbL = gf.l(this.f10019a, this.b, "ErrorBannerUiSpec(internalPadding=", ", backgroundColor=", ", itemShape=");
        sbL.append(this.c);
        sbL.append(", verticalAlignment=");
        sbL.append(this.d);
        sbL.append(", spaceBetweenImageAndText=");
        return vo1.p(sbL, strM7289toStringimpl, ")");
    }
}
