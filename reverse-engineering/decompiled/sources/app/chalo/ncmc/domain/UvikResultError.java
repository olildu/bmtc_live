package app.chalo.ncmc.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/domain/UvikResultError;", "", "ResultUnavailable", "TapOperationFailure", "TransactionFailure", "Lapp/chalo/ncmc/domain/UvikResultError$ResultUnavailable;", "Lapp/chalo/ncmc/domain/UvikResultError$TapOperationFailure;", "Lapp/chalo/ncmc/domain/UvikResultError$TransactionFailure;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UvikResultError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikResultError$ResultUnavailable;", "Lapp/chalo/ncmc/domain/UvikResultError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResultUnavailable extends UvikResultError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResultUnavailable f6252a = new ResultUnavailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikResultError$TapOperationFailure;", "Lapp/chalo/ncmc/domain/UvikResultError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TapOperationFailure extends UvikResultError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6253a;
        public final String b;

        public TapOperationFailure(String str, String str2) {
            this.f6253a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapOperationFailure)) {
                return false;
            }
            TapOperationFailure tapOperationFailure = (TapOperationFailure) obj;
            return Intrinsics.d(this.f6253a, tapOperationFailure.f6253a) && Intrinsics.d(this.b, tapOperationFailure.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6253a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.o("TapOperationFailure(code=", this.f6253a, ", message=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikResultError$TransactionFailure;", "Lapp/chalo/ncmc/domain/UvikResultError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransactionFailure extends UvikResultError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6254a;

        public TransactionFailure(String status) {
            Intrinsics.i(status, "status");
            this.f6254a = status;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransactionFailure) && Intrinsics.d(this.f6254a, ((TransactionFailure) obj).f6254a);
        }

        public final int hashCode() {
            return this.f6254a.hashCode();
        }

        public final String toString() {
            return vo1.B("TransactionFailure(status=", this.f6254a, ")");
        }
    }
}
