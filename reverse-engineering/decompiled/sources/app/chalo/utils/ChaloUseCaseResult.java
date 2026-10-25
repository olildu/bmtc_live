package app.chalo.utils;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/utils/ChaloUseCaseResult;", "SUCCESS", "FAILURE", "", InitializationStatus.SUCCESS, "Failure", "Lapp/chalo/utils/ChaloUseCaseResult$Failure;", "Lapp/chalo/utils/ChaloUseCaseResult$Success;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloUseCaseResult<SUCCESS, FAILURE> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/utils/ChaloUseCaseResult$Failure;", "SUCCESS", "FAILURE", "Lapp/chalo/utils/ChaloUseCaseResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure<SUCCESS, FAILURE> extends ChaloUseCaseResult<SUCCESS, FAILURE> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10418a;

        public Failure(Object obj) {
            this.f10418a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.d(this.f10418a, ((Failure) obj).f10418a);
        }

        public final int hashCode() {
            Object obj = this.f10418a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return n21.f(this.f10418a, "Failure(error=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/utils/ChaloUseCaseResult$Success;", "SUCCESS", "FAILURE", "Lapp/chalo/utils/ChaloUseCaseResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<SUCCESS, FAILURE> extends ChaloUseCaseResult<SUCCESS, FAILURE> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10419a;

        public Success(Object obj) {
            this.f10419a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f10419a, ((Success) obj).f10419a);
        }

        public final int hashCode() {
            Object obj = this.f10419a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return n21.f(this.f10419a, "Success(data=", ")");
        }
    }
}
