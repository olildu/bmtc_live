package app.chalo.electricitybill.ui.paymenthistory.model;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillPaymentHistoryAppModel;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillPaymentHistoryUiModelKt {
    public static final ElectricityBillPaymentHistoryUiModel a(ElectricityBillPaymentHistoryAppModel electricityBillPaymentHistoryAppModel, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract) {
        Integer num;
        String str;
        Long l;
        ElectricityBillPaymentStatus next;
        String str2;
        Intrinsics.i(electricityBillPaymentHistoryAppModel, "<this>");
        String str3 = electricityBillPaymentHistoryAppModel.f2540a;
        if (str3 != null && (num = electricityBillPaymentHistoryAppModel.b) != null) {
            String strA = currencyFeature.a(num.intValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            Long l2 = electricityBillPaymentHistoryAppModel.c;
            if (l2 != null) {
                String strG = timeUtilsContract.g(l2.longValue());
                Long l3 = electricityBillPaymentHistoryAppModel.d;
                if (l3 != null) {
                    String strG2 = timeUtilsContract.g(l3.longValue());
                    String str4 = electricityBillPaymentHistoryAppModel.e;
                    if (str4 != null && (str = electricityBillPaymentHistoryAppModel.f) != null && (l = electricityBillPaymentHistoryAppModel.g) != null) {
                        String strG3 = timeUtilsContract.g(l.longValue());
                        String str5 = electricityBillPaymentHistoryAppModel.h;
                        if (str5 != null) {
                            Iterator<ElectricityBillPaymentStatus> it = ElectricityBillPaymentStatus.getEntries().iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!Intrinsics.d(next.getLabel(), electricityBillPaymentHistoryAppModel.i));
                            ElectricityBillPaymentStatus electricityBillPaymentStatus = next;
                            if (electricityBillPaymentStatus != null && (str2 = electricityBillPaymentHistoryAppModel.j) != null) {
                                return new ElectricityBillPaymentHistoryUiModel(str3, strA, strG, strG2, str4, str, strG3, str5, electricityBillPaymentStatus, str2);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
