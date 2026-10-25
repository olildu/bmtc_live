package app.chalo.productpurchase.productselection.ui;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import defpackage.py;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState;", "", "ProductItemUIState", "RecentProductItemUIState", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState$ProductItemUIState;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState$RecentProductItemUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductSelectionSectionItemUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState$ProductItemUIState;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductItemUIState extends ProductSelectionSectionItemUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductItemUISpec f8694a;
        public final TextUIState b;
        public final ImageUIState c;
        public final ImageUrlUIState d;
        public final TextUIState.ChaloTextUIState e;
        public final TextUIState f;
        public final TextUIState g;
        public final UiEventHandler h;
        public final float i;

        public ProductItemUIState(ProductItemUISpec productItemUISpec, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, ImageUrlUIState imageUrlUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, TextUIState.ChaloTextUIState chaloTextUIState4, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, float f) {
            this.f8694a = productItemUISpec;
            this.b = chaloTextUIState;
            this.c = imageUIState;
            this.d = imageUrlUIState;
            this.e = chaloTextUIState2;
            this.f = chaloTextUIState3;
            this.g = chaloTextUIState4;
            this.h = uiEventHandler$Companion$fromLambda$1;
            this.i = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductItemUIState)) {
                return false;
            }
            ProductItemUIState productItemUIState = (ProductItemUIState) obj;
            return this.f8694a.equals(productItemUIState.f8694a) && Intrinsics.d(this.b, productItemUIState.b) && Intrinsics.d(this.c, productItemUIState.c) && Intrinsics.d(this.d, productItemUIState.d) && this.e.equals(productItemUIState.e) && Intrinsics.d(this.f, productItemUIState.f) && Intrinsics.d(this.g, productItemUIState.g) && Intrinsics.d(this.h, productItemUIState.h) && Float.compare(this.i, productItemUIState.i) == 0;
        }

        public final int hashCode() {
            int iHashCode = this.f8694a.hashCode() * 31;
            TextUIState textUIState = this.b;
            int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            ImageUIState imageUIState = this.c;
            int iHashCode3 = (iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
            ImageUrlUIState imageUrlUIState = this.d;
            int iF = r30.f(this.e, (iHashCode3 + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31, 31);
            TextUIState textUIState2 = this.f;
            int iHashCode4 = (iF + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
            TextUIState textUIState3 = this.g;
            int iHashCode5 = (iHashCode4 + (textUIState3 == null ? 0 : textUIState3.hashCode())) * 31;
            UiEventHandler uiEventHandler = this.h;
            return Float.floatToIntBits(this.i) + ((iHashCode5 + (uiEventHandler != null ? uiEventHandler.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductItemUIState(spec=");
            sb.append(this.f8694a);
            sb.append(", label=");
            sb.append(this.b);
            sb.append(", serviceTypeLogo=");
            sb.append(this.c);
            sb.append(", logoUrlImg=");
            sb.append(this.d);
            sb.append(", title=");
            sb.append(this.e);
            sb.append(", subtitle=");
            sb.append(this.f);
            sb.append(", additionalInfo=");
            sb.append(this.g);
            sb.append(", eventHandler=");
            sb.append(this.h);
            sb.append(", alpha=");
            return py.g(sb, ")", this.i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState$RecentProductItemUIState;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSectionItemUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentProductItemUIState extends ProductSelectionSectionItemUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentProductItemUISpec f8695a;
        public final TextUIState b;
        public final ImageUIState c;
        public final TextUIState.ChaloTextUIState d;
        public final ImageUIState e;
        public final TextWithSpecialFeaturesTagsUIState f;
        public final FromToStopViewUIState g;
        public final List h;
        public final TextUIState.ChaloTextUIState i;
        public final UiEventHandler$Companion$fromLambda$1 j;

        public RecentProductItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState2, TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState, FromToStopViewUIState fromToStopViewUIState, ArrayList arrayList, TextUIState.ChaloTextUIState chaloTextUIState3, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
            RecentProductItemUISpec recentProductItemUISpec = new RecentProductItemUISpec();
            imageUIState2 = (i & 16) != 0 ? null : imageUIState2;
            textWithSpecialFeaturesTagsUIState = (i & 32) != 0 ? null : textWithSpecialFeaturesTagsUIState;
            fromToStopViewUIState = (i & 64) != 0 ? null : fromToStopViewUIState;
            this.f8695a = recentProductItemUISpec;
            this.b = chaloTextUIState;
            this.c = imageUIState;
            this.d = chaloTextUIState2;
            this.e = imageUIState2;
            this.f = textWithSpecialFeaturesTagsUIState;
            this.g = fromToStopViewUIState;
            this.h = arrayList;
            this.i = chaloTextUIState3;
            this.j = uiEventHandler$Companion$fromLambda$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentProductItemUIState)) {
                return false;
            }
            RecentProductItemUIState recentProductItemUIState = (RecentProductItemUIState) obj;
            return Intrinsics.d(this.f8695a, recentProductItemUIState.f8695a) && Intrinsics.d(this.b, recentProductItemUIState.b) && Intrinsics.d(this.c, recentProductItemUIState.c) && Intrinsics.d(this.d, recentProductItemUIState.d) && Intrinsics.d(this.e, recentProductItemUIState.e) && Intrinsics.d(this.f, recentProductItemUIState.f) && Intrinsics.d(this.g, recentProductItemUIState.g) && Intrinsics.d(this.h, recentProductItemUIState.h) && Intrinsics.d(this.i, recentProductItemUIState.i) && Intrinsics.d(this.j, recentProductItemUIState.j);
        }

        public final int hashCode() {
            int iHashCode = this.f8695a.hashCode() * 31;
            TextUIState textUIState = this.b;
            int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            ImageUIState imageUIState = this.c;
            int iF = r30.f(this.d, (iHashCode2 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
            ImageUIState imageUIState2 = this.e;
            int iHashCode3 = (iF + (imageUIState2 == null ? 0 : imageUIState2.hashCode())) * 31;
            TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = this.f;
            int iHashCode4 = (iHashCode3 + (textWithSpecialFeaturesTagsUIState == null ? 0 : textWithSpecialFeaturesTagsUIState.hashCode())) * 31;
            FromToStopViewUIState fromToStopViewUIState = this.g;
            int iHashCode5 = (iHashCode4 + (fromToStopViewUIState == null ? 0 : fromToStopViewUIState.hashCode())) * 31;
            List list = this.h;
            return this.j.hashCode() + r30.f(this.i, (iHashCode5 + (list != null ? list.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            return "RecentProductItemUIState(spec=" + this.f8695a + ", fare=" + this.b + ", serviceTypeLogo=" + this.c + ", title=" + this.d + ", routeIcon=" + this.e + ", routeDetails=" + this.f + ", fromToStopViewUIState=" + this.g + ", specialFeatures=" + this.h + ", passengerDetails=" + this.i + ", eventHandler=" + this.j + ")";
        }
    }
}
