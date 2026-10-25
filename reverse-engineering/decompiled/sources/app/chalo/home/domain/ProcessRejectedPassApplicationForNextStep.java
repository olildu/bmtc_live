package app.chalo.home.domain;

import app.chalo.models.BookableSuperPassConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep;", "", "ProductDisabled", "ProceedForReapplication", "Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep$ProceedForReapplication;", "Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep$ProductDisabled;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProcessRejectedPassApplicationForNextStep {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep$ProceedForReapplication;", "Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedForReapplication extends ProcessRejectedPassApplicationForNextStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f3064a;

        public ProceedForReapplication(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f3064a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedForReapplication) && Intrinsics.d(this.f3064a, ((ProceedForReapplication) obj).f3064a);
        }

        public final int hashCode() {
            return this.f3064a.hashCode();
        }

        public final String toString() {
            return "ProceedForReapplication(bookablePassConfig=" + this.f3064a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep$ProductDisabled;", "Lapp/chalo/home/domain/ProcessRejectedPassApplicationForNextStep;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductDisabled extends ProcessRejectedPassApplicationForNextStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductDisabled f3065a = new ProductDisabled();
    }
}
