package app.chalo.superpass.data.remote;

import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/superpass/data/remote/SyncActivationsAndFetchSuperPassTripReceiptsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException", "Lapp/chalo/superpass/data/remote/SyncActivationsAndFetchSuperPassTripReceiptsException$SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SyncActivationsAndFetchSuperPassTripReceiptsException extends Exception {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/superpass/data/remote/SyncActivationsAndFetchSuperPassTripReceiptsException$SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException;", "Lapp/chalo/superpass/data/remote/SyncActivationsAndFetchSuperPassTripReceiptsException;", "", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getGenericChaloErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException extends SyncActivationsAndFetchSuperPassTripReceiptsException {
        private final String errorMessage;
        private final GenericChaloErrorResponse genericChaloErrorResponse;

        public SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException(GenericChaloErrorResponse genericChaloErrorResponse, String str) {
            super(str);
            this.errorMessage = str;
            this.genericChaloErrorResponse = genericChaloErrorResponse;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException)) {
                return false;
            }
            SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException syncActivationsAndFetchSuperPassTripReceiptsFetchFailedException = (SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException) obj;
            return Intrinsics.d(this.errorMessage, syncActivationsAndFetchSuperPassTripReceiptsFetchFailedException.errorMessage) && Intrinsics.d(this.genericChaloErrorResponse, syncActivationsAndFetchSuperPassTripReceiptsFetchFailedException.genericChaloErrorResponse);
        }

        public final int hashCode() {
            String str = this.errorMessage;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            GenericChaloErrorResponse genericChaloErrorResponse = this.genericChaloErrorResponse;
            return iHashCode + (genericChaloErrorResponse != null ? genericChaloErrorResponse.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException(errorMessage=" + this.errorMessage + ", genericChaloErrorResponse=" + this.genericChaloErrorResponse + ")";
        }
    }
}
