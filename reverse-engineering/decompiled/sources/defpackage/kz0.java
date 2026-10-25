package defpackage;

import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationDataState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenType;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QrScreenBottomSheetType;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerDataState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kz0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18266a;

    public /* synthetic */ kz0(int i) {
        this.f18266a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18266a) {
            case 0:
                QRScannerDataState it = (QRScannerDataState) obj;
                Intrinsics.i(it, "it");
                return QRScannerDataState.a(it, null, null, null, null, null, null, null, null, false, true, null, null, null, 15359);
            case 1:
                return QRScannerDataState.a((QRScannerDataState) obj, null, null, null, null, null, null, null, null, false, false, null, null, null, 15359);
            case 2:
                QRValidationDataState it2 = (QRValidationDataState) obj;
                Intrinsics.i(it2, "it");
                return QRValidationDataState.a(it2, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 130943);
            case 3:
                QRValidationDataState it3 = (QRValidationDataState) obj;
                Intrinsics.i(it3, "it");
                return QRValidationDataState.a(it3, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, QrScreenBottomSheetType.NONE, null, false, false, 122879);
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.i(entry, "entry");
                return entry.getValue() + " " + entry.getKey();
            case 5:
                QRValidationDataState it4 = (QRValidationDataState) obj;
                Intrinsics.i(it4, "it");
                return QRValidationDataState.a(it4, null, false, QRValidationScreenType.QR_AND_PRODUCT_DETAILS, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 131067);
            case 6:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 131069);
            case 7:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 131069);
            case 8:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, true, 65535);
            case 9:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 65535);
            case 10:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 65535);
            case 11:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, QRValidationScreenType.ZOOMED_QR, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 131067);
            case 12:
                return QRValidationDataState.a((QRValidationDataState) obj, null, false, null, null, 0L, 0L, null, null, null, null, false, false, null, null, null, false, false, 130943);
            case 13:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 14:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 15:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("quick_pay_receipt_table");
                return Unit.f17538a;
            case 17:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("quick_pay_receipt_table");
                return Unit.f17538a;
            case 18:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("quick_pay_table");
                return Unit.f17538a;
            case 19:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("quick_pay_table");
                return Unit.f17538a;
            case 20:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("quick_pay_table");
                return Unit.f17538a;
            case 21:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("quick_pay_table");
                return Unit.f17538a;
            case 22:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("quick_pay_table");
                return Unit.f17538a;
            case 23:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("quick_pay_table");
                return Unit.f17538a;
            case 24:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("quick_pay_table");
                return Unit.f17538a;
            case 25:
                Function1 emit10 = (Function1) obj;
                Intrinsics.i(emit10, "emit");
                emit10.invoke("quick_pay_table");
                return Unit.f17538a;
            case 26:
                Function1 emit11 = (Function1) obj;
                Intrinsics.i(emit11, "emit");
                emit11.invoke("quick_pay_table");
                return Unit.f17538a;
            case 27:
                QuickpayTripAmountDataState it5 = (QuickpayTripAmountDataState) obj;
                Intrinsics.i(it5, "it");
                return QuickpayTripAmountDataState.a(it5, null, null, null, 0L, false, false, null, 0L, false, null, 1007);
            case 28:
                QuickpayTripAmountDataState it6 = (QuickpayTripAmountDataState) obj;
                Intrinsics.i(it6, "it");
                return QuickpayTripAmountDataState.a(it6, TripAmountState.WALLET_ERROR, null, null, 0L, false, false, null, 0L, false, null, 1006);
            default:
                QuickpayTripAmountDataState it7 = (QuickpayTripAmountDataState) obj;
                Intrinsics.i(it7, "it");
                return QuickpayTripAmountDataState.a(it7, null, null, null, 0L, false, false, null, 0L, false, null, 1007);
        }
    }
}
