package app.chalo.recent.model.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel;", "", "Metro", "Bus", "Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel$Bus;", "Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel$Metro;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RecentAdditionalRouteInfoModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel$Bus;", "Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bus extends RecentAdditionalRouteInfoModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Bus f8995a = new Bus();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel$Metro;", "Lapp/chalo/recent/model/app/RecentAdditionalRouteInfoModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Metro extends RecentAdditionalRouteInfoModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8996a;

        public Metro(String lineColor) {
            Intrinsics.i(lineColor, "lineColor");
            this.f8996a = lineColor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metro) && Intrinsics.d(this.f8996a, ((Metro) obj).f8996a);
        }

        public final int hashCode() {
            return this.f8996a.hashCode();
        }

        public final String toString() {
            return vo1.B("Metro(lineColor=", this.f8996a, ")");
        }
    }
}
