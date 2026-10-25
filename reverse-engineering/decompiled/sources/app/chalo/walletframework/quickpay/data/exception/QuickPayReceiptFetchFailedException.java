package app.chalo.walletframework.quickpay.data.exception;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/exception/QuickPayReceiptFetchFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "errorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayReceiptFetchFailedException extends Exception {
    private final GenericChaloErrorResponse errorResponse;
    private final String msg;

    public QuickPayReceiptFetchFailedException(GenericChaloErrorResponse genericChaloErrorResponse, String str) {
        super(str);
        this.errorResponse = genericChaloErrorResponse;
        this.msg = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }
}
