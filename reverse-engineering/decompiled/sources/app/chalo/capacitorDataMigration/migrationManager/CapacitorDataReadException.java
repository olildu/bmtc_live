package app.chalo.capacitorDataMigration.migrationManager;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lapp/chalo/capacitorDataMigration/migrationManager/CapacitorDataReadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "fileUrl", "Ljava/lang/String;", "getFileUrl", "()Ljava/lang/String;", "error", "getError", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class CapacitorDataReadException extends Exception {
    private final String error;
    private final String fileUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CapacitorDataReadException)) {
            return false;
        }
        CapacitorDataReadException capacitorDataReadException = (CapacitorDataReadException) obj;
        return Intrinsics.d(this.fileUrl, capacitorDataReadException.fileUrl) && Intrinsics.d(this.error, capacitorDataReadException.error);
    }

    public final int hashCode() {
        return this.error.hashCode() + (this.fileUrl.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return vo1.o("CapacitorDataReadException(fileUrl=", this.fileUrl, ", error=", this.error, ")");
    }
}
