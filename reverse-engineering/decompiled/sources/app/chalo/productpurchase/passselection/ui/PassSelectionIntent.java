package app.chalo.productpurchase.passselection.ui;

import app.chalo.constants.Source;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "", "InitializationIntent", "SubCategorySelectedIntent", "BackClickedIntent", "PassFareMappingSelectedIntent", "CategoryPageSelectedIntent", "FAQClickedIntent", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$BackClickedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$CategoryPageSelectedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$FAQClickedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$PassFareMappingSelectedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$SubCategorySelectedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$BackClickedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClickedIntent extends PassSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f8534a = new BackClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClickedIntent);
        }

        public final int hashCode() {
            return 620402104;
        }

        public final String toString() {
            return "BackClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$CategoryPageSelectedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryPageSelectedIntent extends PassSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8535a;
        public final int b;

        public CategoryPageSelectedIntent(String str, int i) {
            this.f8535a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryPageSelectedIntent)) {
                return false;
            }
            CategoryPageSelectedIntent categoryPageSelectedIntent = (CategoryPageSelectedIntent) obj;
            return Intrinsics.d(this.f8535a, categoryPageSelectedIntent.f8535a) && this.b == categoryPageSelectedIntent.b;
        }

        public final int hashCode() {
            return (this.f8535a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "CategoryPageSelectedIntent(categoryId=", this.f8535a, ", position=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$FAQClickedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FAQClickedIntent extends PassSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8536a;

        public FAQClickedIntent(String faqImageUrl) {
            Intrinsics.i(faqImageUrl, "faqImageUrl");
            this.f8536a = faqImageUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FAQClickedIntent) && Intrinsics.d(this.f8536a, ((FAQClickedIntent) obj).f8536a);
        }

        public final int hashCode() {
            return this.f8536a.hashCode();
        }

        public final String toString() {
            return vo1.B("FAQClickedIntent(faqImageUrl=", this.f8536a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PassSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f8537a;
        public final Source b;
        public final String c;
        public final SuperPassPurchaseStopsInfo d;
        public final PostPassPurchaseSuccessFlowType e;
        public final boolean f;

        public InitializationIntent(Source source, Source previousScreenSource, String productId, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postSuccessFlow, boolean z) {
            Intrinsics.i(source, "source");
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            Intrinsics.i(productId, "productId");
            Intrinsics.i(postSuccessFlow, "postSuccessFlow");
            this.f8537a = source;
            this.b = previousScreenSource;
            this.c = productId;
            this.d = superPassPurchaseStopsInfo;
            this.e = postSuccessFlow;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f8537a == initializationIntent.f8537a && this.b == initializationIntent.b && Intrinsics.d(this.c, initializationIntent.c) && Intrinsics.d(this.d, initializationIntent.d) && this.e == initializationIntent.e && this.f == initializationIntent.f;
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.f(this.b, this.f8537a.hashCode() * 31, 31), 31, this.c);
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo = this.d;
            return ((this.e.hashCode() + ((iE + (superPassPurchaseStopsInfo == null ? 0 : superPassPurchaseStopsInfo.hashCode())) * 31)) * 31) + (this.f ? 1231 : 1237);
        }

        public final String toString() {
            return "InitializationIntent(source=" + this.f8537a + ", previousScreenSource=" + this.b + ", productId=" + this.c + ", stopsInfo=" + this.d + ", postSuccessFlow=" + this.e + ", isPremiumPassLandingFlow=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$PassFareMappingSelectedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassFareMappingSelectedIntent extends PassSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableSuperPassConfiguration f8538a;

        public PassFareMappingSelectedIntent(BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            this.f8538a = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassFareMappingSelectedIntent) && Intrinsics.d(this.f8538a, ((PassFareMappingSelectedIntent) obj).f8538a);
        }

        public final int hashCode() {
            return this.f8538a.hashCode();
        }

        public final String toString() {
            return "PassFareMappingSelectedIntent(config=" + this.f8538a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent$SubCategorySelectedIntent;", "Lapp/chalo/productpurchase/passselection/ui/PassSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubCategorySelectedIntent extends PassSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8539a;

        public SubCategorySelectedIntent(String subCategoryId) {
            Intrinsics.i(subCategoryId, "subCategoryId");
            this.f8539a = subCategoryId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubCategorySelectedIntent) && Intrinsics.d(this.f8539a, ((SubCategorySelectedIntent) obj).f8539a);
        }

        public final int hashCode() {
            return this.f8539a.hashCode();
        }

        public final String toString() {
            return vo1.B("SubCategorySelectedIntent(subCategoryId=", this.f8539a, ")");
        }
    }
}
