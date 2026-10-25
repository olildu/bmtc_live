package app.chalo.livetracking.universalsearch.data.model.ui;

import defpackage.gf;
import defpackage.vo1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem;", "", "HeaderItem", "PlacesAndStopsItem", "RouteList", "Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem$HeaderItem;", "Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem$PlacesAndStopsItem;", "Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem$RouteList;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UniversalSearchItem {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem$HeaderItem;", "Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderItem extends UniversalSearchItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5000a;

        public HeaderItem(String title) {
            Intrinsics.i(title, "title");
            this.f5000a = title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeaderItem) && Intrinsics.d(this.f5000a, ((HeaderItem) obj).f5000a);
        }

        public final int hashCode() {
            return this.f5000a.hashCode();
        }

        public final String toString() {
            return vo1.B("HeaderItem(title=", this.f5000a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem$PlacesAndStopsItem;", "Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlacesAndStopsItem extends UniversalSearchItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5001a;

        public PlacesAndStopsItem(ArrayList arrayList) {
            this.f5001a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlacesAndStopsItem) && this.f5001a.equals(((PlacesAndStopsItem) obj).f5001a);
        }

        public final int hashCode() {
            return this.f5001a.hashCode();
        }

        public final String toString() {
            return gf.i("PlacesAndStopsItem(data=", ")", this.f5001a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem$RouteList;", "Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchItem;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteList extends UniversalSearchItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5002a;

        public RouteList(ArrayList arrayList) {
            this.f5002a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteList) && this.f5002a.equals(((RouteList) obj).f5002a);
        }

        public final int hashCode() {
            return this.f5002a.hashCode();
        }

        public final String toString() {
            return gf.i("RouteList(data=", ")", this.f5002a);
        }
    }
}
