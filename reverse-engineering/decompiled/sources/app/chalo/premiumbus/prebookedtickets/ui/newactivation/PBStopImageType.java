package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType;", "", "FetchInProgress", "FetchFailed", "NoImagesAvailable", "ImagesAvailable", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$FetchFailed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$FetchInProgress;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$ImagesAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$NoImagesAvailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBStopImageType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$FetchFailed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchFailed extends PBStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FetchFailed f7398a = new FetchFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FetchFailed);
        }

        public final int hashCode() {
            return -2041970623;
        }

        public final String toString() {
            return "FetchFailed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$FetchInProgress;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchInProgress extends PBStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FetchInProgress f7399a = new FetchInProgress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FetchInProgress);
        }

        public final int hashCode() {
            return -485750666;
        }

        public final String toString() {
            return "FetchInProgress";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$ImagesAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImagesAvailable extends PBStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7400a;

        public ImagesAvailable(List imagesUrlList) {
            Intrinsics.i(imagesUrlList, "imagesUrlList");
            this.f7400a = imagesUrlList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImagesAvailable) && Intrinsics.d(this.f7400a, ((ImagesAvailable) obj).f7400a);
        }

        public final int hashCode() {
            return this.f7400a.hashCode();
        }

        public final String toString() {
            return r1.d("ImagesAvailable(imagesUrlList=", ")", this.f7400a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType$NoImagesAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/PBStopImageType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoImagesAvailable extends PBStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoImagesAvailable f7401a = new NoImagesAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoImagesAvailable);
        }

        public final int hashCode() {
            return 350291034;
        }

        public final String toString() {
            return "NoImagesAvailable";
        }
    }
}
