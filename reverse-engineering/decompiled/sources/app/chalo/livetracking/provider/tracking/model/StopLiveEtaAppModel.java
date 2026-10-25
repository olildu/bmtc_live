package app.chalo.livetracking.provider.tracking.model;

import defpackage.gf;
import defpackage.r1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel;", "", "FixedEta", "EstimatedEta", "NotAvailable", "AllBusPassed", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$AllBusPassed;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$EstimatedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$FixedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$NotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopLiveEtaAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$AllBusPassed;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AllBusPassed extends StopLiveEtaAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllBusPassed f4371a = new AllBusPassed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$EstimatedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EstimatedEta extends StopLiveEtaAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f4372a;

        public EstimatedEta(ArrayList arrayList) {
            this.f4372a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EstimatedEta) && this.f4372a.equals(((EstimatedEta) obj).f4372a);
        }

        public final int hashCode() {
            return this.f4372a.hashCode();
        }

        public final String toString() {
            return gf.i("EstimatedEta(etaList=", ")", this.f4372a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$FixedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedEta extends StopLiveEtaAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f4373a;

        public FixedEta(List list) {
            this.f4373a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedEta) && Intrinsics.d(this.f4373a, ((FixedEta) obj).f4373a);
        }

        public final int hashCode() {
            return this.f4373a.hashCode();
        }

        public final String toString() {
            return r1.d("FixedEta(etaList=", ")", this.f4373a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel$NotAvailable;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaAppModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAvailable extends StopLiveEtaAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f4374a = new NotAvailable();
    }
}
