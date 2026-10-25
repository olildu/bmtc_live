package defpackage;

import androidx.compose.runtime.ComposerKt;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.checkout.ui.screen.payment.FullScreenErrorDetails;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetType;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType;
import app.chalo.kyc.min.ui.minkycotp.KycErrorBottomSheetData;
import app.chalo.kyc.min.ui.minkycotp.KycErrorPositiveCtaType;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycScreenBottomSheetType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20112a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ yi0(String str, String str2, String str3, int i) {
        this.f20112a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20112a) {
            case 0:
                MinKycOtpDataState it = (MinKycOtpDataState) obj;
                Intrinsics.i(it, "it");
                return MinKycOtpDataState.a(it, null, new KycErrorBottomSheetData(this.b, this.c, this.d, KycErrorPositiveCtaType.USER_ALREADY_REGISTERED), null, false, false, 0L, false, null, null, null, MinKycScreenBottomSheetType.GENERAL_ERROR, null, 12267);
            case 1:
                PaymentDataState it2 = (PaymentDataState) obj;
                Intrinsics.i(it2, "it");
                return PaymentDataState.a(it2, null, false, null, false, null, null, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet(new PaymentStatusAlertDetails(this.b, this.c, null, null, this.d, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, ComposerKt.providerMapsKey)), null, false, false, false, null, false, null, 2096119);
            case 2:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet(new PaymentStatusAlertDetails(this.b, this.c, LottieType.PAYMENT_PENDING, null, this.d, PaymentStatusCTAActionType.NAVIGATE_TO_HOME, null, null, 200)), null, false, false, false, null, false, null, 2096119);
            case 3:
                return PaymentDataState.a((PaymentDataState) obj, null, false, null, false, null, null, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet(new PaymentStatusAlertDetails(this.b, this.c, LottieType.PAYMENT_FAILED_ERROR, null, this.d, PaymentStatusCTAActionType.EXIT_CHECKOUT_ACTIVITY, null, null, 200)), null, false, false, false, null, false, null, 2096119);
            case 4:
                return PaymentDataState.a((PaymentDataState) obj, null, false, new FullScreenErrorDetails(IconType.INTERNET_FAILURE, this.b, this.c, this.d), false, null, null, false, null, null, null, null, false, false, false, null, false, null, 2097145);
            case 5:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                execute.bindString(1, this.c);
                execute.bindString(2, this.d);
                return Unit.f17538a;
            case 6:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                execute2.bindString(1, this.c);
                execute2.bindString(2, this.d);
                return Unit.f17538a;
            case 7:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, this.b);
                execute3.bindString(1, this.c);
                execute3.bindString(2, this.d);
                return Unit.f17538a;
            case 8:
                SqlPreparedStatement execute4 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute4, "$this$execute");
                execute4.bindString(0, this.b);
                execute4.bindString(1, this.c);
                execute4.bindString(2, this.d);
                return Unit.f17538a;
            case 9:
                SqlPreparedStatement execute5 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute5, "$this$execute");
                execute5.bindString(0, this.b);
                execute5.bindString(1, this.c);
                execute5.bindString(2, this.d);
                return Unit.f17538a;
            default:
                SqlPreparedStatement execute6 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute6, "$this$execute");
                execute6.bindString(0, this.b);
                execute6.bindString(1, this.c);
                execute6.bindString(2, this.d);
                return Unit.f17538a;
        }
    }
}
