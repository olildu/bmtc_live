package app.chalo.premiumbus.ui.stopdetails;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType;", "", "NotAvailable", "ShowError", "Available", "Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType$Available;", "Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType$NotAvailable;", "Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType$ShowError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PBBusStopImageType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType$Available;", "Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Available extends PBBusStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7931a;

        public Available(List list) {
            this.f7931a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Available) && Intrinsics.d(this.f7931a, ((Available) obj).f7931a);
        }

        public final int hashCode() {
            return this.f7931a.hashCode();
        }

        public final String toString() {
            return r1.d("Available(imageUrls=", ")", this.f7931a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType$NotAvailable;", "Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAvailable extends PBBusStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f7932a = new NotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType$ShowError;", "Lapp/chalo/premiumbus/ui/stopdetails/PBBusStopImageType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowError extends PBBusStopImageType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowError f7933a = new ShowError();
    }
}
