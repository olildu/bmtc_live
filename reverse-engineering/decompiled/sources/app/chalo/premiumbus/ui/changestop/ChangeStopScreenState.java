package app.chalo.premiumbus.ui.changestop;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState;", "", "Loading", "StopSelection", "Confirming", InitializationStatus.SUCCESS, "Failure", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Confirming;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Failure;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Loading;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$StopSelection;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Success;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChangeStopScreenState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Confirming;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Confirming extends ChangeStopScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Confirming f7518a = new Confirming();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirming);
        }

        public final int hashCode() {
            return 686916136;
        }

        public final String toString() {
            return "Confirming";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Failure;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends ChangeStopScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChangeStopFailureType f7519a;
        public final String b;

        public Failure(ChangeStopFailureType type, String str) {
            Intrinsics.i(type, "type");
            this.f7519a = type;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.f7519a == failure.f7519a && Intrinsics.d(this.b, failure.b);
        }

        public final int hashCode() {
            int iHashCode = this.f7519a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Failure(type=" + this.f7519a + ", errorMessage=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Loading;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends ChangeStopScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f7520a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 696493558;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$StopSelection;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelection extends ChangeStopScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StopSelection f7521a = new StopSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StopSelection);
        }

        public final int hashCode() {
            return -1905836828;
        }

        public final String toString() {
            return "StopSelection";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState$Success;", "Lapp/chalo/premiumbus/ui/changestop/ChangeStopScreenState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends ChangeStopScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f7522a = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return -1507326787;
        }

        public final String toString() {
            return InitializationStatus.SUCCESS;
        }
    }
}
