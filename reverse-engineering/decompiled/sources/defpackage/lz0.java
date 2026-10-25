package defpackage;

import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lz0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18358a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ QRScannerDataState c;

    public /* synthetic */ lz0(Function1 function1, QRScannerDataState qRScannerDataState, int i) {
        this.f18358a = i;
        this.b = function1;
        this.c = qRScannerDataState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18358a) {
            case 0:
                this.b.invoke(new QRScannerViewIntent.OnSummaryBtnClickedIntent(this.c.f10720a));
                break;
            default:
                this.b.invoke(new QRScannerViewIntent.OnSummaryBtnClickedIntent(this.c.f10720a));
                break;
        }
        return Unit.f17538a;
    }
}
