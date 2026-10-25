package app.chalo.usecase;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason;", "", "ProductBookingConfigNotAvailable", "ProductBookingConfigFetchFailed", "ProductBookingConfigCachingFailed", "BookableConfigNotAvailable", "BookableConfigNotActive", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$BookableConfigNotActive;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$BookableConfigNotAvailable;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$ProductBookingConfigCachingFailed;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$ProductBookingConfigFetchFailed;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$ProductBookingConfigNotAvailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookableProductConfigForRenewFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$BookableConfigNotActive;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookableConfigNotActive extends BookableProductConfigForRenewFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10144a;

        public BookableConfigNotActive(String inactiveReason) {
            Intrinsics.i(inactiveReason, "inactiveReason");
            this.f10144a = inactiveReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookableConfigNotActive) && Intrinsics.d(this.f10144a, ((BookableConfigNotActive) obj).f10144a);
        }

        public final int hashCode() {
            return this.f10144a.hashCode();
        }

        public final String toString() {
            return vo1.B("BookableConfigNotActive(inactiveReason=", this.f10144a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$BookableConfigNotAvailable;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BookableConfigNotAvailable extends BookableProductConfigForRenewFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BookableConfigNotAvailable f10145a = new BookableConfigNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$ProductBookingConfigCachingFailed;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductBookingConfigCachingFailed extends BookableProductConfigForRenewFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductBookingConfigCachingFailed f10146a = new ProductBookingConfigCachingFailed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$ProductBookingConfigFetchFailed;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductBookingConfigFetchFailed extends BookableProductConfigForRenewFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductBookingConfigFetchFailed f10147a = new ProductBookingConfigFetchFailed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason$ProductBookingConfigNotAvailable;", "Lapp/chalo/usecase/BookableProductConfigForRenewFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductBookingConfigNotAvailable extends BookableProductConfigForRenewFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductBookingConfigNotAvailable f10148a = new ProductBookingConfigNotAvailable();
    }
}
