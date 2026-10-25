package app.chalo.ncmc.uvik;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UvikSdkManager_androidKt {
    public static final UvikResult a(ActivityResult activityResult) {
        UvikTransactionStatus uvikTransactionStatus;
        Bundle extras;
        Set<String> setKeySet;
        try {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null && (setKeySet = extras.keySet()) != null) {
                for (String str : setKeySet) {
                    String message = str + "--->" + data.getStringExtra(str);
                    Intrinsics.i(message, "message");
                }
            }
            int resultCode = activityResult.getResultCode();
            if (resultCode != -1) {
                if (resultCode != 0) {
                    return new UvikResult.Failure.ResultUnavailable("Unknown result");
                }
                Intent data2 = activityResult.getData();
                return data2 != null ? new UvikResult.Failure.Result(data2.getStringExtra("responseCode"), data2.getStringExtra("responseMessage")) : new UvikResult.Failure.ResultUnavailable("Result data unavailable");
            }
            Intent data3 = activityResult.getData();
            if (data3 == null) {
                return new UvikResult.Failure.ResultUnavailable("Result data unavailable");
            }
            String stringExtra = data3.getStringExtra("status");
            UvikTransactionStatus.INSTANCE.getClass();
            UvikTransactionStatus[] uvikTransactionStatusArrValues = UvikTransactionStatus.values();
            int length = uvikTransactionStatusArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    uvikTransactionStatus = null;
                    break;
                }
                uvikTransactionStatus = uvikTransactionStatusArrValues[i];
                if (StringsKt.x(uvikTransactionStatus.name(), stringExtra, true)) {
                    break;
                }
                i++;
            }
            if (uvikTransactionStatus == null) {
                uvikTransactionStatus = UvikTransactionStatus.Unknown;
            }
            return new UvikResult.Success(uvikTransactionStatus, data3.getStringExtra("responseCode"), data3.getStringExtra("responseMessage"), data3.getStringExtra("transactionId"), data3.getStringExtra("rrn"), data3.getStringExtra("offlineBalance"), data3.getStringExtra("topUpAmt"), data3.getStringExtra("invoiceNumber"), data3.getStringExtra("dateTime"), data3.getStringExtra("maskedCardNumber"));
        } catch (Exception e) {
            return new UvikResult.Failure.ResultUnavailable(e.getMessage());
        }
    }
}
