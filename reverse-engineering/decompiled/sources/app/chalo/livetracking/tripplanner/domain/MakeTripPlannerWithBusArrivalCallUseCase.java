package app.chalo.livetracking.tripplanner.domain;

import app.chalo.livetracking.tripplanner.data.exceptions.TripPlannerCallFailedException;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerRequestAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModel;
import app.chalo.livetracking.tripplanner.data.repository.TripPlannerRepository;
import app.chalo.location.LatLng;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerWithBusArrivalCallUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeTripPlannerWithBusArrivalCallUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripPlannerRepository f4707a;

    public MakeTripPlannerWithBusArrivalCallUseCase(TripPlannerRepository tripPlannerRepository) {
        this.f4707a = tripPlannerRepository;
    }

    public static TripPlannerLegAppModel b(TripPlannerLegAppModel tripPlannerLegAppModel, String str, String str2) {
        if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Auto) {
            TripPlannerLegAppModel.Auto auto = (TripPlannerLegAppModel.Auto) tripPlannerLegAppModel;
            if (str == null) {
                str = auto.n;
            }
            if (str2 == null) {
                str2 = auto.l;
            }
            return TripPlannerLegAppModel.Auto.h(auto, str2, str);
        }
        if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
            TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
            if (str == null) {
                str = bus.m;
            }
            if (str2 == null) {
                str2 = bus.n;
            }
            return TripPlannerLegAppModel.Bus.h(bus, str, str2);
        }
        if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Taxi) {
            TripPlannerLegAppModel.Taxi taxi = (TripPlannerLegAppModel.Taxi) tripPlannerLegAppModel;
            if (str == null) {
                str = taxi.n;
            }
            if (str2 == null) {
                str2 = taxi.l;
            }
            return TripPlannerLegAppModel.Taxi.h(taxi, str2, str);
        }
        if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Walk) {
            TripPlannerLegAppModel.Walk walk = (TripPlannerLegAppModel.Walk) tripPlannerLegAppModel;
            if (str == null) {
                str = walk.m;
            }
            if (str2 == null) {
                str2 = walk.n;
            }
            return TripPlannerLegAppModel.Walk.h(walk, str, str2);
        }
        if ((tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Railway) || Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.MonoRail.INSTANCE) || (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) || Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.Ferry.INSTANCE)) {
            return tripPlannerLegAppModel;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List] */
    public static ArrayList c(List list) {
        List<TripPlannerItineraryAppResponseModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel : list2) {
            ?? E0 = tripPlannerItineraryAppResponseModel.f;
            if (!E0.isEmpty()) {
                E0 = CollectionsKt.E0((Collection) E0);
                E0.set(0, b((TripPlannerLegAppModel) E0.get(0), "", null));
                E0.set(CollectionsKt.K(E0), b((TripPlannerLegAppModel) E0.get(CollectionsKt.K(E0)), null, ""));
            }
            arrayList.add(TripPlannerItineraryAppResponseModel.a(tripPlannerItineraryAppResponseModel, E0));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(LatLng latLng, LatLng latLng2, long j, ChaloTransitMode chaloTransitMode, String str, String str2, ContinuationImpl continuationImpl) {
        MakeTripPlannerWithBusArrivalCallUseCase$invoke$1 makeTripPlannerWithBusArrivalCallUseCase$invoke$1;
        if (continuationImpl instanceof MakeTripPlannerWithBusArrivalCallUseCase$invoke$1) {
            makeTripPlannerWithBusArrivalCallUseCase$invoke$1 = (MakeTripPlannerWithBusArrivalCallUseCase$invoke$1) continuationImpl;
            int i = makeTripPlannerWithBusArrivalCallUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeTripPlannerWithBusArrivalCallUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                makeTripPlannerWithBusArrivalCallUseCase$invoke$1 = new MakeTripPlannerWithBusArrivalCallUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            makeTripPlannerWithBusArrivalCallUseCase$invoke$1 = new MakeTripPlannerWithBusArrivalCallUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = makeTripPlannerWithBusArrivalCallUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = makeTripPlannerWithBusArrivalCallUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                TripPlannerRequestAppModel tripPlannerRequestAppModel = new TripPlannerRequestAppModel(latLng, latLng2, chaloTransitMode, j, str, str2);
                TripPlannerRepository tripPlannerRepository = this.f4707a;
                makeTripPlannerWithBusArrivalCallUseCase$invoke$1.label = 1;
                objA = tripPlannerRepository.a(tripPlannerRequestAppModel, makeTripPlannerWithBusArrivalCallUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            TripPlannerResultAppResponseModel tripPlannerResultAppResponseModel = (TripPlannerResultAppResponseModel) objA;
            return new ChaloUseCaseResult.Success(new TripPlannerResultAppResponseModel(c(tripPlannerResultAppResponseModel.f4682a), c(tripPlannerResultAppResponseModel.b)));
        } catch (TripPlannerCallFailedException unused) {
            return new ChaloUseCaseResult.Failure(new MakeTripPlannerCallFailureReason.ServerError());
        } catch (ChaloLocalException unused2) {
            return new ChaloUseCaseResult.Failure(MakeTripPlannerCallFailureReason.LocalError.f4703a);
        } catch (NetworkSuccessResponseParseException unused3) {
            return new ChaloUseCaseResult.Failure(MakeTripPlannerCallFailureReason.ParsingError.f4704a);
        } catch (Exception unused4) {
            return new ChaloUseCaseResult.Failure(MakeTripPlannerCallFailureReason.UnknownError.f4705a);
        }
    }
}
