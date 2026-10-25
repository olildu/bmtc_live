package app.chalo.titoridedetail.data.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState;", "", "Fetching", "VehicleDataNotAvailable", "LiveEta", "Error", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$Error;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$Fetching;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$LiveEta;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$VehicleDataNotAvailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TITOStopInfoEtaState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$Error;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends TITOStopInfoEtaState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9688a;

        public Error(String errorMessage) {
            Intrinsics.i(errorMessage, "errorMessage");
            this.f9688a = errorMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f9688a, ((Error) obj).f9688a);
        }

        public final int hashCode() {
            return this.f9688a.hashCode();
        }

        public final String toString() {
            return vo1.B("Error(errorMessage=", this.f9688a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$Fetching;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fetching extends TITOStopInfoEtaState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fetching f9689a = new Fetching();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$LiveEta;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveEta extends TITOStopInfoEtaState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9690a;
        public final String b;

        public LiveEta(long j, String str) {
            this.f9690a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveEta)) {
                return false;
            }
            LiveEta liveEta = (LiveEta) obj;
            return this.f9690a == liveEta.f9690a && Intrinsics.d(this.b, liveEta.b);
        }

        public final int hashCode() {
            long j = this.f9690a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.b;
            return i + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "LiveEta(stopEtaInSec=" + this.f9690a + ", etaStringInMin=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState$VehicleDataNotAvailable;", "Lapp/chalo/titoridedetail/data/ui/TITOStopInfoEtaState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VehicleDataNotAvailable extends TITOStopInfoEtaState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VehicleDataNotAvailable f9691a = new VehicleDataNotAvailable();
    }
}
