package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState;", "", "Image", "Gif", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState$Gif;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState$Image;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BusRealtimeIndicatorUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState$Gif;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gif extends BusRealtimeIndicatorUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GifImageUIState f4908a;

        public Gif(GifImageUIState gifImageUIState) {
            this.f4908a = gifImageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Gif) && Intrinsics.d(this.f4908a, ((Gif) obj).f4908a);
        }

        public final int hashCode() {
            return this.f4908a.hashCode();
        }

        public final String toString() {
            return "Gif(gif=" + this.f4908a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState$Image;", "Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/BusRealtimeIndicatorUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image extends BusRealtimeIndicatorUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f4909a;

        public Image(ImageUIState imageUIState) {
            this.f4909a = imageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && Intrinsics.d(this.f4909a, ((Image) obj).f4909a);
        }

        public final int hashCode() {
            return this.f4909a.hashCode();
        }

        public final String toString() {
            return "Image(img=" + this.f4909a + ")";
        }
    }
}
