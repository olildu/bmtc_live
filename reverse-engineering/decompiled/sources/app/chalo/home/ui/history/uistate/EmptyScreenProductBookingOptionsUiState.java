package app.chalo.home.ui.history.uistate;

import app.chalo.uistate.components.ProductGridContainerSpec;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState;", "", "ProductGridContainer", "ProductCard", "Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState$ProductCard;", "Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState$ProductGridContainer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EmptyScreenProductBookingOptionsUiState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState$ProductCard;", "Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductCard extends EmptyScreenProductBookingOptionsUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageWithTextUiState f3467a;

        public ProductCard(ImageWithTextUiState imageWithTextUiState) {
            this.f3467a = imageWithTextUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductCard) && Intrinsics.d(this.f3467a, ((ProductCard) obj).f3467a);
        }

        public final int hashCode() {
            return this.f3467a.hashCode();
        }

        public final String toString() {
            return "ProductCard(item=" + this.f3467a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState$ProductGridContainer;", "Lapp/chalo/home/ui/history/uistate/EmptyScreenProductBookingOptionsUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductGridContainer extends EmptyScreenProductBookingOptionsUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductGridContainerSpec f3468a;
        public final ArrayList b;

        public ProductGridContainer(ProductGridContainerSpec productGridContainerSpec, ArrayList arrayList) {
            this.f3468a = productGridContainerSpec;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductGridContainer)) {
                return false;
            }
            ProductGridContainer productGridContainer = (ProductGridContainer) obj;
            return this.f3468a.equals(productGridContainer.f3468a) && this.b.equals(productGridContainer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3468a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductGridContainer(spec=" + this.f3468a + ", itemList=" + this.b + ")";
        }
    }
}
