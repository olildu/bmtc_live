package app.chalo.kyc.min.data.exceptions;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/kyc/min/data/exceptions/SubmitKycApiException;", "", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "errorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SubmitKycApiException extends Throwable {
    private final GenericChaloErrorResponse errorResponse;
    private final String msg;

    public SubmitKycApiException(GenericChaloErrorResponse genericChaloErrorResponse, String str) {
        super(str);
        this.errorResponse = genericChaloErrorResponse;
        this.msg = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericChaloErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitKycApiException)) {
            return false;
        }
        SubmitKycApiException submitKycApiException = (SubmitKycApiException) obj;
        return Intrinsics.d(this.errorResponse, submitKycApiException.errorResponse) && Intrinsics.d(this.msg, submitKycApiException.msg);
    }

    public final int hashCode() {
        GenericChaloErrorResponse genericChaloErrorResponse = this.errorResponse;
        int iHashCode = (genericChaloErrorResponse == null ? 0 : genericChaloErrorResponse.hashCode()) * 31;
        String str = this.msg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SubmitKycApiException(errorResponse=" + this.errorResponse + ", msg=" + this.msg + ")";
    }
}
