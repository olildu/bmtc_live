package app.chalo.resultstatemanager;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/resultstatemanager/ResultStateData;", "T", "", "Cancelled", InitializationStatus.SUCCESS, "Lapp/chalo/resultstatemanager/ResultStateData$Cancelled;", "Lapp/chalo/resultstatemanager/ResultStateData$Success;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ResultStateData<T> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/resultstatemanager/ResultStateData$Cancelled;", "T", "Lapp/chalo/resultstatemanager/ResultStateData;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancelled<T> extends ResultStateData<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/resultstatemanager/ResultStateData$Success;", "T", "Lapp/chalo/resultstatemanager/ResultStateData;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<T> extends ResultStateData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9039a;

        public Success(Object obj) {
            this.f9039a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f9039a, ((Success) obj).f9039a);
        }

        public final int hashCode() {
            Object obj = this.f9039a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return n21.f(this.f9039a, "Success(data=", ")");
        }
    }
}
