package app.chalo.productbooking.pickstop;

import defpackage.gf;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType;", "", "StopList", "NoList", "Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType$NoList;", "Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType$StopList;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PickStopScreenLayoutUiType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType$NoList;", "Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoList extends PickStopScreenLayoutUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoResultUiState f8306a;

        public NoList(NoResultUiState noResultUiState) {
            this.f8306a = noResultUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoList) && Intrinsics.d(this.f8306a, ((NoList) obj).f8306a);
        }

        public final int hashCode() {
            return this.f8306a.hashCode();
        }

        public final String toString() {
            return "NoList(state=" + this.f8306a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType$StopList;", "Lapp/chalo/productbooking/pickstop/PickStopScreenLayoutUiType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopList extends PickStopScreenLayoutUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f8307a;

        public StopList(ArrayList arrayList) {
            this.f8307a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopList) && this.f8307a.equals(((StopList) obj).f8307a);
        }

        public final int hashCode() {
            return this.f8307a.hashCode();
        }

        public final String toString() {
            return gf.i("StopList(list=", ")", this.f8307a);
        }
    }
}
