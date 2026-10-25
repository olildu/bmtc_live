package app.chalo.sos;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/SendSosConfirmationDialogUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendSosConfirmationDialogUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9398a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final float e;
    public final ChaloColorToken f;
    public final UIShape g;
    public final ChaloColorToken h;
    public final UIShape i;
    public final ChaloPadding j;

    public SendSosConfirmationDialogUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding2 = new ChaloPadding(f, f2, f2, f);
        float f3 = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding3 = new ChaloPadding(f3, f3, f3, f3);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, ChaloThemeHelper.a().h, 6);
        float f4 = ChaloThemeHelper.a().g;
        UIShape msgBackgroundShape = ChaloThemeHelper.d.g;
        float f5 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding5 = new ChaloPadding(f5, f5, f5, f5);
        Intrinsics.i(msgBackgroundShape, "backgroundShape");
        Intrinsics.i(msgBackgroundShape, "msgBackgroundShape");
        this.f9398a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
        this.d = chaloPadding4;
        this.e = f4;
        this.f = ChaloColorToken.White.f9870a;
        this.g = msgBackgroundShape;
        this.h = ChaloColorToken.LightOrange.f9816a;
        this.i = msgBackgroundShape;
        this.j = chaloPadding5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSosConfirmationDialogUISpecs)) {
            return false;
        }
        SendSosConfirmationDialogUISpecs sendSosConfirmationDialogUISpecs = (SendSosConfirmationDialogUISpecs) obj;
        return Intrinsics.d(this.f9398a, sendSosConfirmationDialogUISpecs.f9398a) && Intrinsics.d(this.b, sendSosConfirmationDialogUISpecs.b) && Intrinsics.d(this.c, sendSosConfirmationDialogUISpecs.c) && Intrinsics.d(this.d, sendSosConfirmationDialogUISpecs.d) && Dp.m7283equalsimpl0(this.e, sendSosConfirmationDialogUISpecs.e) && Intrinsics.d(this.f, sendSosConfirmationDialogUISpecs.f) && Intrinsics.d(this.g, sendSosConfirmationDialogUISpecs.g) && Intrinsics.d(this.h, sendSosConfirmationDialogUISpecs.h) && Intrinsics.d(this.i, sendSosConfirmationDialogUISpecs.i) && Intrinsics.d(this.j, sendSosConfirmationDialogUISpecs.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + pk0.b(this.i, z40.b(this.h, pk0.b(this.g, z40.b(this.f, uf0.a(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f9398a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sbM = pk0.m("SendSosConfirmationDialogUISpecs(paddingAroundTitle=", this.f9398a, ", internalPadding=", this.b, ", paddingAroundCloseBtn=");
        r30.o(sbM, this.c, ", paddingAroundMsg=", this.d, ", spaceBetweenBtns=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", backgroundColor=");
        sbM.append(this.f);
        sbM.append(", backgroundShape=");
        sbM.append(this.g);
        sbM.append(", msgBackgroundColor=");
        sbM.append(this.h);
        sbM.append(", msgBackgroundShape=");
        sbM.append(this.i);
        sbM.append(", msgContentPadding=");
        sbM.append(this.j);
        sbM.append(")");
        return sbM.toString();
    }
}
