package app.chalo.ads;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitState;", "", "NotInitialized", "Initializing", "Initialized", "Failed", "Lapp/chalo/ads/AdsterSdkInitState$Failed;", "Lapp/chalo/ads/AdsterSdkInitState$Initialized;", "Lapp/chalo/ads/AdsterSdkInitState$Initializing;", "Lapp/chalo/ads/AdsterSdkInitState$NotInitialized;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AdsterSdkInitState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitState$Failed;", "Lapp/chalo/ads/AdsterSdkInitState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed implements AdsterSdkInitState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f723a;

        public Failed(Throwable th) {
            this.f723a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.d(this.f723a, ((Failed) obj).f723a);
        }

        public final int hashCode() {
            return this.f723a.hashCode();
        }

        public final String toString() {
            return "Failed(error=" + this.f723a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitState$Initialized;", "Lapp/chalo/ads/AdsterSdkInitState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initialized implements AdsterSdkInitState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f724a;

        public Initialized(List list) {
            this.f724a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initialized) && Intrinsics.d(this.f724a, ((Initialized) obj).f724a);
        }

        public final int hashCode() {
            return this.f724a.hashCode();
        }

        public final String toString() {
            return r1.d("Initialized(adapterStatus=", ")", this.f724a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitState$Initializing;", "Lapp/chalo/ads/AdsterSdkInitState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initializing implements AdsterSdkInitState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initializing f725a = new Initializing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initializing);
        }

        public final int hashCode() {
            return 420070409;
        }

        public final String toString() {
            return "Initializing";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterSdkInitState$NotInitialized;", "Lapp/chalo/ads/AdsterSdkInitState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotInitialized implements AdsterSdkInitState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotInitialized f726a = new NotInitialized();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotInitialized);
        }

        public final int hashCode() {
            return 601109181;
        }

        public final String toString() {
            return "NotInitialized";
        }
    }
}
