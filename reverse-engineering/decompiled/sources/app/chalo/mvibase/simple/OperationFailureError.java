package app.chalo.mvibase.simple;

import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/mvibase/simple/OperationFailureError;", "USE_CASE_SPECIFIC_ERROR", "", "DataFetchOperationFailure", "UseCaseSpecificError", "Lapp/chalo/mvibase/simple/OperationFailureError$DataFetchOperationFailure;", "Lapp/chalo/mvibase/simple/OperationFailureError$UseCaseSpecificError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OperationFailureError<USE_CASE_SPECIFIC_ERROR> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mvibase/simple/OperationFailureError$DataFetchOperationFailure;", "USE_CASE_SPECIFIC_ERROR", "Lapp/chalo/mvibase/simple/OperationFailureError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataFetchOperationFailure<USE_CASE_SPECIFIC_ERROR> extends OperationFailureError<USE_CASE_SPECIFIC_ERROR> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataFetchOperationErrorReason f5998a;

        public DataFetchOperationFailure(DataFetchOperationErrorReason dataFetchOperationFailureReason) {
            Intrinsics.i(dataFetchOperationFailureReason, "dataFetchOperationFailureReason");
            this.f5998a = dataFetchOperationFailureReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataFetchOperationFailure) && this.f5998a == ((DataFetchOperationFailure) obj).f5998a;
        }

        public final int hashCode() {
            return this.f5998a.hashCode();
        }

        public final String toString() {
            return "DataFetchOperationFailure(dataFetchOperationFailureReason=" + this.f5998a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mvibase/simple/OperationFailureError$UseCaseSpecificError;", "USE_CASE_SPECIFIC_ERROR", "Lapp/chalo/mvibase/simple/OperationFailureError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UseCaseSpecificError<USE_CASE_SPECIFIC_ERROR> extends OperationFailureError<USE_CASE_SPECIFIC_ERROR> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f5999a;

        public UseCaseSpecificError(Object obj) {
            this.f5999a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UseCaseSpecificError) && Intrinsics.d(this.f5999a, ((UseCaseSpecificError) obj).f5999a);
        }

        public final int hashCode() {
            Object obj = this.f5999a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return n21.f(this.f5999a, "UseCaseSpecificError(useCaseSpecificError=", ")");
        }
    }
}
