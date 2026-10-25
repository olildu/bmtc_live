package app.chalo.receipt;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductReceiptDataKt {
    public static final boolean a(ProductReceiptData productReceiptData) {
        Intrinsics.i(productReceiptData, "<this>");
        long b = productReceiptData.getB();
        return (b == 0 || b == -1) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    public static final ReceiptFareDataAppModel b(ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel) {
        ReceiptFareBreakupAppModel receiptFareBreakupAppModel;
        Double d;
        Intrinsics.i(receiptFareDataApiResponseModel, "<this>");
        String str = receiptFareDataApiResponseModel.f8921a;
        List<ReceiptFareBreakupApiResponseModel> list = receiptFareDataApiResponseModel.b;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ReceiptFareBreakupApiResponseModel receiptFareBreakupApiResponseModel : list) {
                Intrinsics.i(receiptFareBreakupApiResponseModel, "<this>");
                Integer num = receiptFareBreakupApiResponseModel.f8917a;
                if (num == null) {
                    receiptFareBreakupAppModel = null;
                } else {
                    if (num.intValue() <= 0) {
                        num = null;
                    }
                    if (num != null) {
                        int iIntValue = num.intValue();
                        String str2 = receiptFareBreakupApiResponseModel.b;
                        if (str2 == null) {
                            receiptFareBreakupAppModel = null;
                        } else {
                            if (str2.length() <= 0) {
                                str2 = null;
                            }
                            if (str2 == null || (d = receiptFareBreakupApiResponseModel.c) == null) {
                                receiptFareBreakupAppModel = null;
                            } else {
                                receiptFareBreakupAppModel = new ReceiptFareBreakupAppModel(iIntValue, str2, d.doubleValue());
                            }
                        }
                    } else {
                        receiptFareBreakupAppModel = null;
                    }
                }
                if (receiptFareBreakupAppModel != null) {
                    arrayList2.add(receiptFareBreakupAppModel);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new ReceiptFareDataAppModel(str, arrayList);
    }
}
