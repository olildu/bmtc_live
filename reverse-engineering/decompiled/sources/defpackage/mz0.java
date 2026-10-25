package defpackage;

import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationIntent;
import app.chalo.validationsdk.legacy.ProductKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mz0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18439a;
    public final /* synthetic */ QRValidationComponent b;

    public /* synthetic */ mz0(QRValidationComponent qRValidationComponent, int i) {
        this.f18439a = i;
        this.b = qRValidationComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18439a) {
            case 0:
                QRValidationComponent qRValidationComponent = this.b;
                return qRValidationComponent.o.a(qRValidationComponent.k.b.b);
            case 1:
                ChaloNavigationManagerKt.c(this.b.r);
                return Unit.f17538a;
            case 2:
                this.b.Y0(QRValidationIntent.BackPressedIntent.f10636a);
                return Unit.f17538a;
            case 3:
                this.b.Y0(QRValidationIntent.BottomSheetDismissIntent.f10637a);
                return Unit.f17538a;
            case 4:
                this.b.Y0(QRValidationIntent.QRClickedIntent.f10644a);
                return Unit.f17538a;
            case 5:
                this.b.Y0(QRValidationIntent.OnViewJourneyClicked.f10642a);
                return Unit.f17538a;
            case 6:
                ChaloNavigationManagerKt.e(this.b.r, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                return Unit.f17538a;
            case 7:
                this.b.Y0(QRValidationIntent.ViewTripReceipt.f10649a);
                return Unit.f17538a;
            case 8:
                this.b.Y0(QRValidationIntent.SwitchToBLEBtnClickedIntent.f10646a);
                return Unit.f17538a;
            case 9:
                this.b.Y0(QRValidationIntent.ValidationSuccessBottomSheetPositiveBtnClicked.f10648a);
                return Unit.f17538a;
            case 10:
                this.b.Y0(QRValidationIntent.BottomSheetDismissIntent.f10637a);
                return Unit.f17538a;
            case 11:
                ChaloNavigationManagerKt.c(this.b.r);
                return Unit.f17538a;
            case 12:
                ChaloNavigationManagerKt.c(this.b.r);
                return Unit.f17538a;
            case 13:
                this.b.Y0(QRValidationIntent.OnBookingSupportClicked.f10639a);
                return Unit.f17538a;
            case 14:
                this.b.Y0(QRValidationIntent.ReportProblemIntent.f10645a);
                return Unit.f17538a;
            case 15:
                this.b.Y0(QRValidationIntent.ViewTripReceipt.f10649a);
                return Unit.f17538a;
            case 16:
                this.b.Y0(QRValidationIntent.ReportProblemIntent.f10645a);
                return Unit.f17538a;
            case 17:
                this.b.Y0(QRValidationIntent.QRClickedIntent.f10644a);
                return Unit.f17538a;
            case 18:
                return ProductKt.a(this.b.k.b.b);
            case 19:
                ChaloNavigationManagerKt.e(this.b.r, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                return Unit.f17538a;
            case 20:
                QRValidationComponent qRValidationComponent2 = this.b;
                ChaloNavigationManager chaloNavigationManager = qRValidationComponent2.r;
                PopUpToConfig.Finish finish = new PopUpToConfig.Finish(qRValidationComponent2.k);
                Intrinsics.i(chaloNavigationManager, "<this>");
                chaloNavigationManager.b(new ChaloNavigationRequest.GoBack(finish));
                return Unit.f17538a;
            default:
                this.b.Y0(QRValidationIntent.BackPressedIntent.f10636a);
                return Unit.f17538a;
        }
    }
}
