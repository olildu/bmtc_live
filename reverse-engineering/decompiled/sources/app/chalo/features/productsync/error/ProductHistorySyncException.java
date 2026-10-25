package app.chalo.features.productsync.error;

import androidx.core.app.NotificationCompat;
import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\b\t\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/features/productsync/error/ProductHistorySyncException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "ProductConfigNotAvailable", "MTicketDetailsNotAvailable", "BackingProductConfigFailed", "Lapp/chalo/features/productsync/error/ProductHistorySyncException$BackingProductConfigFailed;", "Lapp/chalo/features/productsync/error/ProductHistorySyncException$MTicketDetailsNotAvailable;", "Lapp/chalo/features/productsync/error/ProductHistorySyncException$ProductConfigNotAvailable;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductHistorySyncException extends Exception {
    private final String msg;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/features/productsync/error/ProductHistorySyncException$BackingProductConfigFailed;", "Lapp/chalo/features/productsync/error/ProductHistorySyncException;", "", "errorCode", "I", "getErrorCode", "()I", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackingProductConfigFailed extends ProductHistorySyncException {
        private final int errorCode;

        public BackingProductConfigFailed(int i) {
            super(vo1.j(i, "product config not available: "));
            this.errorCode = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BackingProductConfigFailed) && this.errorCode == ((BackingProductConfigFailed) obj).errorCode;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return b3.d(this.errorCode, "BackingProductConfigFailed(errorCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/features/productsync/error/ProductHistorySyncException$MTicketDetailsNotAvailable;", "Lapp/chalo/features/productsync/error/ProductHistorySyncException;", "", "errorMsg", "Ljava/lang/String;", "getErrorMsg", "()Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MTicketDetailsNotAvailable extends ProductHistorySyncException {
        private final String errorMsg;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MTicketDetailsNotAvailable) && Intrinsics.d(this.errorMsg, ((MTicketDetailsNotAvailable) obj).errorMsg);
        }

        public final int hashCode() {
            return this.errorMsg.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return vo1.B("MTicketDetailsNotAvailable(errorMsg=", this.errorMsg, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/features/productsync/error/ProductHistorySyncException$ProductConfigNotAvailable;", "Lapp/chalo/features/productsync/error/ProductHistorySyncException;", "", "errorMsg", "Ljava/lang/String;", "getErrorMsg", "()Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductConfigNotAvailable extends ProductHistorySyncException {
        private final String errorMsg;

        public ProductConfigNotAvailable() {
            super("Product config map should not be null");
            this.errorMsg = "Product config map should not be null";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductConfigNotAvailable) && Intrinsics.d(this.errorMsg, ((ProductConfigNotAvailable) obj).errorMsg);
        }

        public final int hashCode() {
            return this.errorMsg.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return vo1.B("ProductConfigNotAvailable(errorMsg=", this.errorMsg, ")");
        }
    }

    public ProductHistorySyncException(String str) {
        super(str);
        this.msg = str;
    }
}
