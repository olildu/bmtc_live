package app.chalo.network.exception;

import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "NoInternetException", "UnexpectedException", "ServerErrorException", "RequestCancelledException", "SecureCallUnauthorizedAndRefreshTokenServerUnreachableException", "NoUpdateInFetchedDataBasedOnEtagVersion", "Lapp/chalo/network/exception/ChaloLocalException$NoInternetException;", "Lapp/chalo/network/exception/ChaloLocalException$NoUpdateInFetchedDataBasedOnEtagVersion;", "Lapp/chalo/network/exception/ChaloLocalException$RequestCancelledException;", "Lapp/chalo/network/exception/ChaloLocalException$SecureCallUnauthorizedAndRefreshTokenServerUnreachableException;", "Lapp/chalo/network/exception/ChaloLocalException$ServerErrorException;", "Lapp/chalo/network/exception/ChaloLocalException$UnexpectedException;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloLocalException extends Exception {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException$NoInternetException;", "Lapp/chalo/network/exception/ChaloLocalException;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoInternetException extends ChaloLocalException {
        private final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternetException(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.msg = msg;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException$NoUpdateInFetchedDataBasedOnEtagVersion;", "Lapp/chalo/network/exception/ChaloLocalException;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getGenericChaloErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoUpdateInFetchedDataBasedOnEtagVersion extends ChaloLocalException {
        private final GenericChaloErrorResponse genericChaloErrorResponse;
        private final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoUpdateInFetchedDataBasedOnEtagVersion(GenericChaloErrorResponse genericChaloErrorResponse, String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.genericChaloErrorResponse = genericChaloErrorResponse;
            this.msg = msg;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException$RequestCancelledException;", "Lapp/chalo/network/exception/ChaloLocalException;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestCancelledException extends ChaloLocalException {
        private final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCancelledException(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.msg = msg;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException$SecureCallUnauthorizedAndRefreshTokenServerUnreachableException;", "Lapp/chalo/network/exception/ChaloLocalException;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getGenericChaloErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SecureCallUnauthorizedAndRefreshTokenServerUnreachableException extends ChaloLocalException {
        private final GenericChaloErrorResponse genericChaloErrorResponse;
        private final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecureCallUnauthorizedAndRefreshTokenServerUnreachableException(GenericChaloErrorResponse genericChaloErrorResponse, String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.genericChaloErrorResponse = genericChaloErrorResponse;
            this.msg = msg;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException$ServerErrorException;", "Lapp/chalo/network/exception/ChaloLocalException;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServerErrorException extends ChaloLocalException {
        private final GenericChaloErrorResponse genericChaloErrorResponse;
        private final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerErrorException(GenericChaloErrorResponse genericChaloErrorResponse, String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.genericChaloErrorResponse = genericChaloErrorResponse;
            this.msg = msg;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final GenericChaloErrorResponse getGenericChaloErrorResponse() {
            return this.genericChaloErrorResponse;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/network/exception/ChaloLocalException$UnexpectedException;", "Lapp/chalo/network/exception/ChaloLocalException;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getGenericChaloErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnexpectedException extends ChaloLocalException {
        private final GenericChaloErrorResponse genericChaloErrorResponse;
        private final String msg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedException(GenericChaloErrorResponse genericChaloErrorResponse, String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.genericChaloErrorResponse = genericChaloErrorResponse;
            this.msg = msg;
        }
    }
}
