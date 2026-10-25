package app.chalo.home.domain;

import app.chalo.models.BookableSuperPassConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep;", "", "ProductDisabled", "ProductValidityExpired", "ProceedForPayment", "Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep$ProceedForPayment;", "Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep$ProductDisabled;", "Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep$ProductValidityExpired;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProcessVerifiedPassApplicationForNextStep {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep$ProceedForPayment;", "Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedForPayment extends ProcessVerifiedPassApplicationForNextStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f3066a;

        public ProceedForPayment(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f3066a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedForPayment) && Intrinsics.d(this.f3066a, ((ProceedForPayment) obj).f3066a);
        }

        public final int hashCode() {
            return this.f3066a.hashCode();
        }

        public final String toString() {
            return "ProceedForPayment(bookablePassConfig=" + this.f3066a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep$ProductDisabled;", "Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductDisabled extends ProcessVerifiedPassApplicationForNextStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductDisabled f3067a = new ProductDisabled();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep$ProductValidityExpired;", "Lapp/chalo/home/domain/ProcessVerifiedPassApplicationForNextStep;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductValidityExpired extends ProcessVerifiedPassApplicationForNextStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductValidityExpired f3068a = new ProductValidityExpired();
    }
}
