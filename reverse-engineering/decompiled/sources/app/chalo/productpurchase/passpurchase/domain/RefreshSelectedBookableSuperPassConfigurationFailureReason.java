package app.chalo.productpurchase.passpurchase.domain;

import app.chalo.productbooking.common.domain.CompleteProductConfigFetchFailedReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason;", "", "FetchFailed", "CachingFailed", "SelectedConfigNotFound", "Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason$CachingFailed;", "Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason$FetchFailed;", "Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason$SelectedConfigNotFound;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RefreshSelectedBookableSuperPassConfigurationFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason$CachingFailed;", "Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CachingFailed extends RefreshSelectedBookableSuperPassConfigurationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CachingFailed f8336a = new CachingFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CachingFailed);
        }

        public final int hashCode() {
            return -416674559;
        }

        public final String toString() {
            return "CachingFailed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason$FetchFailed;", "Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchFailed extends RefreshSelectedBookableSuperPassConfigurationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CompleteProductConfigFetchFailedReason f8337a;

        public FetchFailed(CompleteProductConfigFetchFailedReason reason) {
            Intrinsics.i(reason, "reason");
            this.f8337a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchFailed) && Intrinsics.d(this.f8337a, ((FetchFailed) obj).f8337a);
        }

        public final int hashCode() {
            return this.f8337a.hashCode();
        }

        public final String toString() {
            return "FetchFailed(reason=" + this.f8337a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason$SelectedConfigNotFound;", "Lapp/chalo/productpurchase/passpurchase/domain/RefreshSelectedBookableSuperPassConfigurationFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedConfigNotFound extends RefreshSelectedBookableSuperPassConfigurationFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectedConfigNotFound f8338a = new SelectedConfigNotFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectedConfigNotFound);
        }

        public final int hashCode() {
            return 729159367;
        }

        public final String toString() {
            return "SelectedConfigNotFound";
        }
    }
}
