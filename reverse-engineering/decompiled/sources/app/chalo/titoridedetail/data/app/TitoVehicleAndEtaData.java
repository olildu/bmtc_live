package app.chalo.titoridedetail.data.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.titoridedetail.data.ui.TITOStopInfoEtaState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData;", "", "Fetching", "RideData", "DataFetchError", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$Fetching;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$RideData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TitoVehicleAndEtaData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData;", "Error", "VehicleNotAvailable", "RouteDataNotAvailable", "TapInDataNotAvailable", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$Error;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$RouteDataNotAvailable;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$TapInDataNotAvailable;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$VehicleNotAvailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DataFetchError extends TitoVehicleAndEtaData {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$Error;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends DataFetchError {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Error(errorMessage=null)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$RouteDataNotAvailable;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RouteDataNotAvailable extends DataFetchError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RouteDataNotAvailable f9683a = new RouteDataNotAvailable();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$TapInDataNotAvailable;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TapInDataNotAvailable extends DataFetchError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TapInDataNotAvailable f9684a = new TapInDataNotAvailable();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError$VehicleNotAvailable;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$DataFetchError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VehicleNotAvailable extends DataFetchError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final VehicleNotAvailable f9685a = new VehicleNotAvailable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$Fetching;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fetching extends TitoVehicleAndEtaData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fetching f9686a = new Fetching();
    }

    public final RideData a() {
        if (this instanceof RideData) {
            return (RideData) this;
        }
        if ((this instanceof DataFetchError.Error) || equals(DataFetchError.RouteDataNotAvailable.f9683a) || equals(DataFetchError.TapInDataNotAvailable.f9684a) || equals(DataFetchError.VehicleNotAvailable.f9685a) || equals(Fetching.f9686a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData$RideData;", "Lapp/chalo/titoridedetail/data/app/TitoVehicleAndEtaData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideData extends TitoVehicleAndEtaData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StopAppModel f9687a;
        public final TITOStopInfoEtaState b;
        public final TITOStopInfoEtaState c;
        public final TitoRideDetailBusDataAppModel d;

        public RideData(StopAppModel stopAppModel, TITOStopInfoEtaState nextStopEta, TITOStopInfoEtaState dropOffStopEta, TitoRideDetailBusDataAppModel titoRideDetailBusDataAppModel) {
            Intrinsics.i(nextStopEta, "nextStopEta");
            Intrinsics.i(dropOffStopEta, "dropOffStopEta");
            this.f9687a = stopAppModel;
            this.b = nextStopEta;
            this.c = dropOffStopEta;
            this.d = titoRideDetailBusDataAppModel;
        }

        public static RideData b(RideData rideData, StopAppModel stopAppModel, TITOStopInfoEtaState nextStopEta, TITOStopInfoEtaState dropOffStopEta, TitoRideDetailBusDataAppModel titoRideDetailBusDataAppModel, int i) {
            if ((i & 1) != 0) {
                stopAppModel = rideData.f9687a;
            }
            if ((i & 2) != 0) {
                nextStopEta = rideData.b;
            }
            if ((i & 4) != 0) {
                dropOffStopEta = rideData.c;
            }
            if ((i & 8) != 0) {
                titoRideDetailBusDataAppModel = rideData.d;
            }
            Intrinsics.i(nextStopEta, "nextStopEta");
            Intrinsics.i(dropOffStopEta, "dropOffStopEta");
            return new RideData(stopAppModel, nextStopEta, dropOffStopEta, titoRideDetailBusDataAppModel);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RideData)) {
                return false;
            }
            RideData rideData = (RideData) obj;
            return Intrinsics.d(this.f9687a, rideData.f9687a) && Intrinsics.d(this.b, rideData.b) && Intrinsics.d(this.c, rideData.c) && Intrinsics.d(this.d, rideData.d);
        }

        public final int hashCode() {
            StopAppModel stopAppModel = this.f9687a;
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((stopAppModel == null ? 0 : stopAppModel.hashCode()) * 31)) * 31)) * 31;
            TitoRideDetailBusDataAppModel titoRideDetailBusDataAppModel = this.d;
            return iHashCode + (titoRideDetailBusDataAppModel != null ? titoRideDetailBusDataAppModel.hashCode() : 0);
        }

        public final String toString() {
            return "RideData(nextStopAppModel=" + this.f9687a + ", nextStopEta=" + this.b + ", dropOffStopEta=" + this.c + ", vehicleLiveData=" + this.d + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RideData(StopAppModel stopAppModel, TITOStopInfoEtaState tITOStopInfoEtaState, TITOStopInfoEtaState tITOStopInfoEtaState2, TitoRideDetailBusDataAppModel titoRideDetailBusDataAppModel, int i) {
            stopAppModel = (i & 1) != 0 ? null : stopAppModel;
            int i2 = i & 2;
            TITOStopInfoEtaState.Fetching fetching = TITOStopInfoEtaState.Fetching.f9689a;
            this(stopAppModel, i2 != 0 ? fetching : tITOStopInfoEtaState, (i & 4) != 0 ? fetching : tITOStopInfoEtaState2, (i & 8) != 0 ? null : titoRideDetailBusDataAppModel);
        }
    }
}
