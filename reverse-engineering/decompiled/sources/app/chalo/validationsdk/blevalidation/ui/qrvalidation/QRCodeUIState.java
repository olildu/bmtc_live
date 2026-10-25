package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.base.UiSwipeEventHandler$Companion$fromLambda$1;
import defpackage.gf;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/qrvalidation/QRCodeUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class QRCodeUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QRCodeUISpecs f10631a = new QRCodeUISpecs();
    public final String b;
    public final boolean c;
    public final UiEventHandler$Companion$fromLambda$1 d;
    public final UiSwipeEventHandler$Companion$fromLambda$1 e;

    public QRCodeUIState(String str, boolean z, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UiSwipeEventHandler$Companion$fromLambda$1 uiSwipeEventHandler$Companion$fromLambda$1) {
        this.b = str;
        this.c = z;
        this.d = uiEventHandler$Companion$fromLambda$1;
        this.e = uiSwipeEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeUIState)) {
            return false;
        }
        QRCodeUIState qRCodeUIState = (QRCodeUIState) obj;
        return Intrinsics.d(this.f10631a, qRCodeUIState.f10631a) && Intrinsics.d(this.b, qRCodeUIState.b) && this.c == qRCodeUIState.c && Intrinsics.d(this.d, qRCodeUIState.d) && Intrinsics.d(this.e, qRCodeUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gf.a(this.d, (nf1.e(Dp.m7284hashCodeimpl(this.f10631a.f10630a) * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        return "QRCodeUIState(specs=" + this.f10631a + ", qrCode=" + this.b + ", isSelected=" + this.c + ", qrClickedEventHandler=" + this.d + ", qrSwipedEventHandler=" + this.e + ")";
    }
}
