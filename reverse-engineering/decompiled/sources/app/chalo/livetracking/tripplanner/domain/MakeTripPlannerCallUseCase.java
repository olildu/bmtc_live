package app.chalo.livetracking.tripplanner.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.livetracking.tripplanner.data.exceptions.TripPlannerCallFailedException;
import app.chalo.livetracking.tripplanner.data.models.api.request.MakeTripPlannerRequestData;
import app.chalo.livetracking.tripplanner.data.models.api.request.TripPlannerItineraryType;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerResultAppResponseModel;
import app.chalo.livetracking.tripplanner.data.repository.TripPlannerRepository;
import app.chalo.location.LatLng;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.MillisAfterTimeFormatType;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/MakeTripPlannerCallUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeTripPlannerCallUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripPlannerRepository f4706a;
    public final GetTimeInMillisAfterXTimeUseCase b;
    public final GetDistinctIdUseCase c;
    public final LanguageFeature d;
    public final BasicInfoContract e;
    public final CityProvider f;
    public final TimeUtilsContract g;

    public MakeTripPlannerCallUseCase(TripPlannerRepository tripPlannerRepository, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, GetDistinctIdUseCase getDistinctIdUseCase, LanguageFeature languageFeature, BasicInfoContract basicInfoContract, CityProvider cityProvider, TimeUtilsContract timeUtilsContract) {
        this.f4706a = tripPlannerRepository;
        this.b = getTimeInMillisAfterXTimeUseCase;
        this.c = getDistinctIdUseCase;
        this.d = languageFeature;
        this.e = basicInfoContract;
        this.f = cityProvider;
        this.g = timeUtilsContract;
    }

    public static TripPlannerLegAppModel d(TripPlannerLegAppModel tripPlannerLegAppModel, String str, String str2) {
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
    public static ArrayList e(String str, String str2, List list) {
        List<TripPlannerItineraryAppResponseModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel : list2) {
            ?? E0 = tripPlannerItineraryAppResponseModel.f;
            if (!E0.isEmpty()) {
                E0 = CollectionsKt.E0((Collection) E0);
                E0.set(0, d((TripPlannerLegAppModel) E0.get(0), str, null));
                E0.set(CollectionsKt.K(E0), d((TripPlannerLegAppModel) E0.get(CollectionsKt.K(E0)), null, str2));
            }
            arrayList.add(TripPlannerItineraryAppResponseModel.a(tripPlannerItineraryAppResponseModel, E0));
        }
        return arrayList;
    }

    public final MakeTripPlannerRequestData a(LatLng latLng, LatLng latLng2, long j, TripPlannerItineraryType tripPlannerItineraryType, ChaloTransitMode chaloTransitMode, String str, String str2, boolean z) {
        String strName;
        long jA = j - this.b.a(j, 0L, MillisAfterTimeFormatType.START_OF_DAY);
        long j2 = jA >= 0 ? jA / ((long) 1000) : 0L;
        String strA = this.c.a(false);
        String str3 = strA == null ? "" : strA;
        Language language = (Language) this.d.getE().getValue();
        if (language == null || (strName = language.name()) == null) {
            strName = "ENGLISH";
        }
        String str4 = strName;
        BasicInfoContract basicInfoContract = this.e;
        int iH = basicInfoContract.h();
        String strB = CityProviderKt.b(this.f);
        String str5 = strB == null ? "" : strB;
        int f = basicInfoContract.getF();
        String g = basicInfoContract.getG();
        TimeUtilsContract timeUtilsContract = this.g;
        return new MakeTripPlannerRequestData(latLng, latLng2, chaloTransitMode, j2, str3, str4, iH, str5, f, g, timeUtilsContract.y(timeUtilsContract.b(), Long.valueOf(j)), j, tripPlannerItineraryType, str, str2, z);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(String str, LatLng latLng, String str2, LatLng latLng2, long j, TripPlannerItineraryType tripPlannerItineraryType, ChaloTransitMode chaloTransitMode, String str3, String str4, boolean z, ContinuationImpl continuationImpl) {
        MakeTripPlannerCallUseCase$invoke$1 makeTripPlannerCallUseCase$invoke$1;
        String str5;
        String str6;
        String str7;
        if (continuationImpl instanceof MakeTripPlannerCallUseCase$invoke$1) {
            makeTripPlannerCallUseCase$invoke$1 = (MakeTripPlannerCallUseCase$invoke$1) continuationImpl;
            int i = makeTripPlannerCallUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeTripPlannerCallUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                makeTripPlannerCallUseCase$invoke$1 = new MakeTripPlannerCallUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            makeTripPlannerCallUseCase$invoke$1 = new MakeTripPlannerCallUseCase$invoke$1(this, continuationImpl);
        }
        MakeTripPlannerCallUseCase$invoke$1 makeTripPlannerCallUseCase$invoke$2 = makeTripPlannerCallUseCase$invoke$1;
        Object objA = makeTripPlannerCallUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = makeTripPlannerCallUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                makeTripPlannerCallUseCase$invoke$2.L$0 = str;
                str5 = str2;
                makeTripPlannerCallUseCase$invoke$2.L$1 = str5;
                makeTripPlannerCallUseCase$invoke$2.label = 1;
                objA = a(latLng, latLng2, j, tripPlannerItineraryType, chaloTransitMode, str3, str4, z);
                if (objA != coroutineSingletons) {
                    str6 = str;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                String str8 = (String) makeTripPlannerCallUseCase$invoke$2.L$1;
                str6 = (String) makeTripPlannerCallUseCase$invoke$2.L$0;
                ResultKt.b(objA);
                str5 = str8;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str7 = (String) makeTripPlannerCallUseCase$invoke$2.L$1;
                str6 = (String) makeTripPlannerCallUseCase$invoke$2.L$0;
                ResultKt.b(objA);
            }
            TripPlannerResultAppResponseModel tripPlannerResultAppResponseModel = (TripPlannerResultAppResponseModel) objA;
            if (str6 == null) {
                str6 = "Origin";
            }
            if (str7 == null) {
                str7 = "Destination";
            }
            ArrayList arrayListE = e(str6, str7, tripPlannerResultAppResponseModel.f4682a);
            List nearbyStopsResults = tripPlannerResultAppResponseModel.b;
            Intrinsics.i(nearbyStopsResults, "nearbyStopsResults");
            return new ChaloUseCaseResult.Success(new TripPlannerResultAppResponseModel(arrayListE, nearbyStopsResults));
            TripPlannerRepository tripPlannerRepository = this.f4706a;
            makeTripPlannerCallUseCase$invoke$2.L$0 = str6;
            makeTripPlannerCallUseCase$invoke$2.L$1 = str5;
            makeTripPlannerCallUseCase$invoke$2.label = 2;
            objA = tripPlannerRepository.b((MakeTripPlannerRequestData) objA, makeTripPlannerCallUseCase$invoke$2);
            if (objA != coroutineSingletons) {
                str7 = str5;
                TripPlannerResultAppResponseModel tripPlannerResultAppResponseModel2 = (TripPlannerResultAppResponseModel) objA;
                if (str6 == null) {
                    str6 = "Origin";
                }
                if (str7 == null) {
                    str7 = "Destination";
                }
                ArrayList arrayListE2 = e(str6, str7, tripPlannerResultAppResponseModel2.f4682a);
                List nearbyStopsResults2 = tripPlannerResultAppResponseModel2.b;
                Intrinsics.i(nearbyStopsResults2, "nearbyStopsResults");
                return new ChaloUseCaseResult.Success(new TripPlannerResultAppResponseModel(arrayListE2, nearbyStopsResults2));
            }
            return coroutineSingletons;
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
