package app.chalo.premiumbus.ui.stopdetails;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState;", "", "Hide", "Show", "Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState$Hide;", "Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState$Show;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBStopDetailsZoomedImageState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState$Hide;", "Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hide extends PBStopDetailsZoomedImageState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Hide f7940a = new Hide();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hide);
        }

        public final int hashCode() {
            return 49003801;
        }

        public final String toString() {
            return "Hide";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState$Show;", "Lapp/chalo/premiumbus/ui/stopdetails/PBStopDetailsZoomedImageState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Show extends PBStopDetailsZoomedImageState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7941a;
        public final int b;

        public Show(List list, int i) {
            this.f7941a = list;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Show)) {
                return false;
            }
            Show show = (Show) obj;
            return Intrinsics.d(this.f7941a, show.f7941a) && this.b == show.b;
        }

        public final int hashCode() {
            return (this.f7941a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "Show(imageUrls=" + this.f7941a + ", selectedIndex=" + this.b + ")";
        }
    }
}
