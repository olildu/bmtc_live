package app.chalo.electricitybill.exception;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/electricitybill/exception/EBillFetchException;", "", "Lapp/chalo/electricitybill/exception/EBillFetchErrorType;", "errorType", "Lapp/chalo/electricitybill/exception/EBillFetchErrorType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lapp/chalo/electricitybill/exception/EBillFetchErrorType;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillFetchException extends Throwable {
    private final EBillFetchErrorType errorType;
    private final String msg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBillFetchException(EBillFetchErrorType errorType, String str) {
        super(str);
        Intrinsics.i(errorType, "errorType");
        this.errorType = errorType;
        this.msg = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EBillFetchErrorType getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }
}
