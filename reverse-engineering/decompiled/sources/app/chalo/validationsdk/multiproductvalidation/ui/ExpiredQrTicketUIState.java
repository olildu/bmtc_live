package app.chalo.validationsdk.multiproductvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/ExpiredQrTicketUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExpiredQrTicketUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f10683a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState c;
    public final ImageUIState d;
    public final ChaloPadding e;
    public final ChaloColorToken f;
    public final UIShape g;
    public final float h;
    public final float i;

    public ExpiredQrTicketUIState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState2) {
        float f = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle shape = UIShape.c;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().c;
        Intrinsics.i(shape, "shape");
        this.f10683a = imageUIState;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = imageUIState2;
        this.e = chaloPadding;
        this.f = ChaloColorToken.White.f9870a;
        this.g = shape;
        this.h = f2;
        this.i = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiredQrTicketUIState)) {
            return false;
        }
        ExpiredQrTicketUIState expiredQrTicketUIState = (ExpiredQrTicketUIState) obj;
        return Intrinsics.d(this.f10683a, expiredQrTicketUIState.f10683a) && Intrinsics.d(this.b, expiredQrTicketUIState.b) && Intrinsics.d(this.c, expiredQrTicketUIState.c) && Intrinsics.d(this.d, expiredQrTicketUIState.d) && Intrinsics.d(this.e, expiredQrTicketUIState.e) && Intrinsics.d(this.f, expiredQrTicketUIState.f) && Intrinsics.d(this.g, expiredQrTicketUIState.g) && Dp.m7283equalsimpl0(this.h, expiredQrTicketUIState.h) && Dp.m7283equalsimpl0(this.i, expiredQrTicketUIState.i);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f10683a.hashCode() * 31, 31);
        TextUIState textUIState = this.c;
        return Dp.m7284hashCodeimpl(this.i) + uf0.a(this.h, pk0.b(this.g, z40.b(this.f, r30.c(this.e, r30.e(this.d, (iF + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.h);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.i);
        StringBuilder sbN = pk0.n("ExpiredQrTicketUIState(qrCode=", this.f10683a, ", title=", this.b, ", subtitle=");
        sbN.append(this.c);
        sbN.append(", warningImage=");
        sbN.append(this.d);
        sbN.append(", imagePadding=");
        sbN.append(this.e);
        sbN.append(", backgroundColor=");
        sbN.append(this.f);
        sbN.append(", shape=");
        sbN.append(this.g);
        sbN.append(", textSpacing=");
        sbN.append(strM7289toStringimpl);
        sbN.append(", spaceAfterTitle=");
        return vo1.p(sbN, strM7289toStringimpl2, ")");
    }
}
