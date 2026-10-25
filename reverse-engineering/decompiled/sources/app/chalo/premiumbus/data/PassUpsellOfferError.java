package app.chalo.premiumbus.data;

import app.chalo.productbooking.common.domain.CompleteProductConfigFetchFailedReason;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOfferError;", "", "FetchFailed", "CachingFailed", "NothingBookable", "Lapp/chalo/premiumbus/data/PassUpsellOfferError$CachingFailed;", "Lapp/chalo/premiumbus/data/PassUpsellOfferError$FetchFailed;", "Lapp/chalo/premiumbus/data/PassUpsellOfferError$NothingBookable;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassUpsellOfferError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOfferError$CachingFailed;", "Lapp/chalo/premiumbus/data/PassUpsellOfferError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CachingFailed extends PassUpsellOfferError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CachingFailed f6950a = new CachingFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CachingFailed);
        }

        public final int hashCode() {
            return 1414069363;
        }

        public final String toString() {
            return "CachingFailed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOfferError$FetchFailed;", "Lapp/chalo/premiumbus/data/PassUpsellOfferError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchFailed extends PassUpsellOfferError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CompleteProductConfigFetchFailedReason f6951a;

        public FetchFailed(CompleteProductConfigFetchFailedReason reason) {
            Intrinsics.i(reason, "reason");
            this.f6951a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchFailed) && Intrinsics.d(this.f6951a, ((FetchFailed) obj).f6951a);
        }

        public final int hashCode() {
            return this.f6951a.hashCode();
        }

        public final String toString() {
            return "FetchFailed(reason=" + this.f6951a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOfferError$NothingBookable;", "Lapp/chalo/premiumbus/data/PassUpsellOfferError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NothingBookable extends PassUpsellOfferError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NothingBookable f6952a = new NothingBookable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NothingBookable);
        }

        public final int hashCode() {
            return -1031967609;
        }

        public final String toString() {
            return "NothingBookable";
        }
    }
}
