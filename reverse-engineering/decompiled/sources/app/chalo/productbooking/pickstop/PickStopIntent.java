package app.chalo.productbooking.pickstop;

import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopIntent;", "", "InitialIntent", "SearchAndLoadStopListIntent", "SelectStopIntent", "ClearSearchTextFieldIntent", "BackButtonPressIntent", "Lapp/chalo/productbooking/pickstop/PickStopIntent$BackButtonPressIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent$ClearSearchTextFieldIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent$InitialIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent$SearchAndLoadStopListIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent$SelectStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PickStopIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopIntent$BackButtonPressIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackButtonPressIntent extends PickStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackButtonPressIntent f8301a = new BackButtonPressIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackButtonPressIntent);
        }

        public final int hashCode() {
            return 1345991674;
        }

        public final String toString() {
            return "BackButtonPressIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopIntent$ClearSearchTextFieldIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClearSearchTextFieldIntent extends PickStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearSearchTextFieldIntent f8302a = new ClearSearchTextFieldIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearSearchTextFieldIntent);
        }

        public final int hashCode() {
            return 1643699776;
        }

        public final String toString() {
            return "ClearSearchTextFieldIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopIntent$InitialIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitialIntent extends PickStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialIntent f8303a = new InitialIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopIntent$SearchAndLoadStopListIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchAndLoadStopListIntent extends PickStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8304a;

        public SearchAndLoadStopListIntent(String query) {
            Intrinsics.i(query, "query");
            this.f8304a = query;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchAndLoadStopListIntent) && Intrinsics.d(this.f8304a, ((SearchAndLoadStopListIntent) obj).f8304a);
        }

        public final int hashCode() {
            return this.f8304a.hashCode();
        }

        public final String toString() {
            return vo1.B("SearchAndLoadStopListIntent(query=", this.f8304a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopIntent$SelectStopIntent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectStopIntent extends PickStopIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductBookingStopDetails f8305a;

        public SelectStopIntent(ProductBookingStopDetails productBookingStopDetails) {
            this.f8305a = productBookingStopDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectStopIntent) && Intrinsics.d(this.f8305a, ((SelectStopIntent) obj).f8305a);
        }

        public final int hashCode() {
            return this.f8305a.hashCode();
        }

        public final String toString() {
            return "SelectStopIntent(stop=" + this.f8305a + ")";
        }
    }
}
