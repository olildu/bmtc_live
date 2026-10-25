package app.chalo.ncmc.ui.pendingrecharge;

import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent;", "", "Initialize", "UpdateNcmcCardClicked", "UvikTapResultIntent", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent$Initialize;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent$UpdateNcmcCardClicked;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent$UvikTapResultIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PendingRechargeViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent$Initialize;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initialize extends PendingRechargeViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6421a;

        public Initialize(List unsyncedRecharges) {
            Intrinsics.i(unsyncedRecharges, "unsyncedRecharges");
            this.f6421a = unsyncedRecharges;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Initialize) && Intrinsics.d(this.f6421a, ((Initialize) obj).f6421a);
        }

        public final int hashCode() {
            return this.f6421a.hashCode();
        }

        public final String toString() {
            return r1.d("Initialize(unsyncedRecharges=", ")", this.f6421a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent$UpdateNcmcCardClicked;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateNcmcCardClicked extends PendingRechargeViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateNcmcCardClicked f6422a = new UpdateNcmcCardClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent$UvikTapResultIntent;", "Lapp/chalo/ncmc/ui/pendingrecharge/PendingRechargeViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UvikTapResultIntent extends PendingRechargeViewIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UvikTapResultIntent);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "UvikTapResultIntent(result=null)";
        }
    }
}
