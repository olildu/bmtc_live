package app.chalo.productpurchase.passselection.ui;

import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState;", "", "PWidgetUIState", "BookableConfigItemUIState", "Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState$BookableConfigItemUIState;", "Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState$PWidgetUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassCategorySectionItemUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState$BookableConfigItemUIState;", "Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookableConfigItemUIState extends PassCategorySectionItemUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookableConfigItemUISpec f8525a = new BookableConfigItemUISpec();
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final TextUIState d;
        public final OfferTagUIState e;
        public final TextUIState f;
        public final TextUIState g;
        public final TextUIState h;
        public final ArrayList i;
        public final UiEventHandler j;
        public final float k;
        public final List l;

        public BookableConfigItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, OfferTagUIState offerTagUIState, TextUIState.ChaloTextUIState chaloTextUIState4, TextUIState.ChaloTextUIState chaloTextUIState5, TextUIState.ChaloTextUIState chaloTextUIState6, ArrayList arrayList, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, float f, ArrayList arrayList2) {
            this.b = chaloTextUIState;
            this.c = chaloTextUIState2;
            this.d = chaloTextUIState3;
            this.e = offerTagUIState;
            this.f = chaloTextUIState4;
            this.g = chaloTextUIState5;
            this.h = chaloTextUIState6;
            this.i = arrayList;
            this.j = uiEventHandler$Companion$fromLambda$1;
            this.k = f;
            this.l = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookableConfigItemUIState)) {
                return false;
            }
            BookableConfigItemUIState bookableConfigItemUIState = (BookableConfigItemUIState) obj;
            return Intrinsics.d(this.f8525a, bookableConfigItemUIState.f8525a) && Intrinsics.d(this.b, bookableConfigItemUIState.b) && Intrinsics.d(this.c, bookableConfigItemUIState.c) && Intrinsics.d(this.d, bookableConfigItemUIState.d) && Intrinsics.d(this.e, bookableConfigItemUIState.e) && Intrinsics.d(this.f, bookableConfigItemUIState.f) && Intrinsics.d(this.g, bookableConfigItemUIState.g) && Intrinsics.d(this.h, bookableConfigItemUIState.h) && Intrinsics.d(this.i, bookableConfigItemUIState.i) && Intrinsics.d(this.j, bookableConfigItemUIState.j) && Float.compare(this.k, bookableConfigItemUIState.k) == 0 && Intrinsics.d(this.l, bookableConfigItemUIState.l);
        }

        public final int hashCode() {
            int iF = r30.f(this.c, r30.f(this.b, this.f8525a.hashCode() * 31, 31), 31);
            TextUIState textUIState = this.d;
            int iHashCode = (iF + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            OfferTagUIState offerTagUIState = this.e;
            int iHashCode2 = (iHashCode + (offerTagUIState == null ? 0 : offerTagUIState.hashCode())) * 31;
            TextUIState textUIState2 = this.f;
            int iHashCode3 = (iHashCode2 + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
            TextUIState textUIState3 = this.g;
            int iHashCode4 = (iHashCode3 + (textUIState3 == null ? 0 : textUIState3.hashCode())) * 31;
            TextUIState textUIState4 = this.h;
            int iE = xs.e(this.i, (iHashCode4 + (textUIState4 == null ? 0 : textUIState4.hashCode())) * 31, 31);
            UiEventHandler uiEventHandler = this.j;
            int iA = r30.a(this.k, (iE + (uiEventHandler == null ? 0 : uiEventHandler.hashCode())) * 31, 31);
            List list = this.l;
            return iA + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "BookableConfigItemUIState(spec=" + this.f8525a + ", durationName=" + this.b + ", fare=" + this.c + ", discountedFare=" + this.d + ", offerCopy=" + this.e + ", additionalInfo=" + this.f + ", desc=" + this.g + ", durationInfo=" + this.h + ", specialFeature=" + this.i + ", eventHandler=" + this.j + ", alpha=" + this.k + ", tagInfoUiState=" + this.l + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState$PWidgetUIState;", "Lapp/chalo/productpurchase/passselection/ui/PassCategorySectionItemUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PWidgetUIState extends PassCategorySectionItemUIState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PWidgetUIState);
        }

        public final int hashCode() {
            return 1227476745;
        }

        public final String toString() {
            return "PWidgetUIState(id=bookablePassConfigItem)";
        }
    }
}
