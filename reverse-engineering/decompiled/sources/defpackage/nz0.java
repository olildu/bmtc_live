package defpackage;

import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nz0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18554a;
    public final /* synthetic */ QRValidationComponent b;
    public final /* synthetic */ int c;

    public /* synthetic */ nz0(QRValidationComponent qRValidationComponent, int i, int i2) {
        this.f18554a = i2;
        this.b = qRValidationComponent;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18554a) {
            case 0:
                this.b.Y0(new QRValidationIntent.OnTicketNumberClicked(this.c));
                break;
            default:
                this.b.Y0(new QRValidationIntent.OnQrSwiped(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
