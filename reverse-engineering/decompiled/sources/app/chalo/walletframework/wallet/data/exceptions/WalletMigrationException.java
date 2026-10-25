package app.chalo.walletframework.wallet.data.exceptions;

import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/walletframework/wallet/data/exceptions/WalletMigrationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "errorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WalletMigrationException extends Exception {
    private final GenericChaloErrorResponse errorResponse;

    public WalletMigrationException(GenericChaloErrorResponse genericChaloErrorResponse) {
        super(genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
        this.errorResponse = genericChaloErrorResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletMigrationException) && Intrinsics.d(this.errorResponse, ((WalletMigrationException) obj).errorResponse);
    }

    public final int hashCode() {
        GenericChaloErrorResponse genericChaloErrorResponse = this.errorResponse;
        if (genericChaloErrorResponse == null) {
            return 0;
        }
        return genericChaloErrorResponse.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "WalletMigrationException(errorResponse=" + this.errorResponse + ")";
    }
}
