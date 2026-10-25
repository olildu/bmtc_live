package app.chalo.premiumbus.ui.productselection;

import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "", "InitializationIntent", "ProductTypeSelectedIntent", "ReportProblemClickedIntent", "FirstElementScrolledToTopIntent", "ToolBarEditBtnClickIntent", "OnBackClickIntent", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$FirstElementScrolledToTopIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$OnBackClickIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$ProductTypeSelectedIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$ReportProblemClickedIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$ToolBarEditBtnClickIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusProductSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$FirstElementScrolledToTopIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirstElementScrolledToTopIntent extends PremiumBusProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7694a;

        public FirstElementScrolledToTopIntent(boolean z) {
            this.f7694a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FirstElementScrolledToTopIntent) && this.f7694a == ((FirstElementScrolledToTopIntent) obj).f7694a;
        }

        public final int hashCode() {
            return this.f7694a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("FirstElementScrolledToTopIntent(isAtTop=", ")", this.f7694a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductSelectionConfig f7695a;
        public final PremiumBusProductPurchaseFlowType b;

        public InitializationIntent(PremiumBusProductSelectionConfig premiumBusProductSelectionConfig, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType) {
            Intrinsics.i(premiumBusProductSelectionConfig, "premiumBusProductSelectionConfig");
            this.f7695a = premiumBusProductSelectionConfig;
            this.b = premiumBusProductPurchaseFlowType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7695a, initializationIntent.f7695a) && Intrinsics.d(this.b, initializationIntent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7695a.hashCode() * 31;
            PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = this.b;
            return iHashCode + (premiumBusProductPurchaseFlowType == null ? 0 : premiumBusProductPurchaseFlowType.hashCode());
        }

        public final String toString() {
            return "InitializationIntent(premiumBusProductSelectionConfig=" + this.f7695a + ", premiumBusProductPurchaseFlowType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$OnBackClickIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackClickIntent extends PremiumBusProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackClickIntent f7696a = new OnBackClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$ProductTypeSelectedIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductTypeSelectedIntent extends PremiumBusProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7697a;
        public final String b;
        public final String c;

        public ProductTypeSelectedIntent(String productId, String productType, String productSubType) {
            Intrinsics.i(productId, "productId");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            this.f7697a = productId;
            this.b = productType;
            this.c = productSubType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductTypeSelectedIntent)) {
                return false;
            }
            ProductTypeSelectedIntent productTypeSelectedIntent = (ProductTypeSelectedIntent) obj;
            return Intrinsics.d(this.f7697a, productTypeSelectedIntent.f7697a) && Intrinsics.d(this.b, productTypeSelectedIntent.b) && Intrinsics.d(this.c, productTypeSelectedIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f7697a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("ProductTypeSelectedIntent(productId=", this.f7697a, ", productType=", this.b, ", productSubType="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$ReportProblemClickedIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReportProblemClickedIntent extends PremiumBusProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReportProblemClickedIntent f7698a = new ReportProblemClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent$ToolBarEditBtnClickIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ToolBarEditBtnClickIntent extends PremiumBusProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToolBarEditBtnClickIntent f7699a = new ToolBarEditBtnClickIntent();
    }
}
