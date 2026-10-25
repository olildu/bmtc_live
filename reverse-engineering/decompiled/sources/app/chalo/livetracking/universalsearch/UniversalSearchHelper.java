package app.chalo.livetracking.universalsearch;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.livetracking.universalsearch.data.model.app.PlacesInfoDataAppModel;
import app.chalo.livetracking.universalsearch.domain.FetchLatLngForPlaceWithPlaceIdUseCase;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.recent.database.repository.recent.PlacesRecentRepository;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.StopRecentRepository;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/UniversalSearchHelper;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UniversalSearchHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentRepositoryProvider f4960a;
    public final CityProvider b;
    public final ChaloTimeProvider c;
    public final FetchLatLngForPlaceWithPlaceIdUseCase d;

    public UniversalSearchHelper(RecentRepositoryProvider recentRepositoryProvider, CityProvider cityProvider, ChaloTimeProvider chaloTimeProvider, FetchLatLngForPlaceWithPlaceIdUseCase fetchLatLngForPlaceWithPlaceIdUseCase) {
        this.f4960a = recentRepositoryProvider;
        this.b = cityProvider;
        this.c = chaloTimeProvider;
        this.d = fetchLatLngForPlaceWithPlaceIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        UniversalSearchHelper$markPlaceAsFavourite$1 universalSearchHelper$markPlaceAsFavourite$1;
        if (continuationImpl instanceof UniversalSearchHelper$markPlaceAsFavourite$1) {
            universalSearchHelper$markPlaceAsFavourite$1 = (UniversalSearchHelper$markPlaceAsFavourite$1) continuationImpl;
            int i = universalSearchHelper$markPlaceAsFavourite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchHelper$markPlaceAsFavourite$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchHelper$markPlaceAsFavourite$1 = new UniversalSearchHelper$markPlaceAsFavourite$1(this, continuationImpl);
            }
        } else {
            universalSearchHelper$markPlaceAsFavourite$1 = new UniversalSearchHelper$markPlaceAsFavourite$1(this, continuationImpl);
        }
        Object obj = universalSearchHelper$markPlaceAsFavourite$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchHelper$markPlaceAsFavourite$1.label;
        Unit unit = Unit.f17538a;
        RecentRepositoryProvider recentRepositoryProvider = this.f4960a;
        if (i2 == 0) {
            ResultKt.b(obj);
            PlacesRecentRepository placesRecentRepositoryF = recentRepositoryProvider.f();
            universalSearchHelper$markPlaceAsFavourite$1.L$0 = str;
            universalSearchHelper$markPlaceAsFavourite$1.L$1 = str2;
            universalSearchHelper$markPlaceAsFavourite$1.L$2 = str3;
            universalSearchHelper$markPlaceAsFavourite$1.label = 1;
            if (placesRecentRepositoryF.d(str2, str3, universalSearchHelper$markPlaceAsFavourite$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        str3 = (String) universalSearchHelper$markPlaceAsFavourite$1.L$2;
        str2 = (String) universalSearchHelper$markPlaceAsFavourite$1.L$1;
        str = (String) universalSearchHelper$markPlaceAsFavourite$1.L$0;
        ResultKt.b(obj);
        if (str != null && str.length() != 0) {
            PlacesRecentRepository placesRecentRepositoryF2 = recentRepositoryProvider.f();
            universalSearchHelper$markPlaceAsFavourite$1.L$0 = null;
            universalSearchHelper$markPlaceAsFavourite$1.L$1 = null;
            universalSearchHelper$markPlaceAsFavourite$1.L$2 = null;
            universalSearchHelper$markPlaceAsFavourite$1.label = 2;
            if (placesRecentRepositoryF2.c(str, str2, str3, universalSearchHelper$markPlaceAsFavourite$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        UniversalSearchHelper$markStopAsFavourite$1 universalSearchHelper$markStopAsFavourite$1;
        if (continuationImpl instanceof UniversalSearchHelper$markStopAsFavourite$1) {
            universalSearchHelper$markStopAsFavourite$1 = (UniversalSearchHelper$markStopAsFavourite$1) continuationImpl;
            int i = universalSearchHelper$markStopAsFavourite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchHelper$markStopAsFavourite$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchHelper$markStopAsFavourite$1 = new UniversalSearchHelper$markStopAsFavourite$1(this, continuationImpl);
            }
        } else {
            universalSearchHelper$markStopAsFavourite$1 = new UniversalSearchHelper$markStopAsFavourite$1(this, continuationImpl);
        }
        Object obj = universalSearchHelper$markStopAsFavourite$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchHelper$markStopAsFavourite$1.label;
        Unit unit = Unit.f17538a;
        RecentRepositoryProvider recentRepositoryProvider = this.f4960a;
        if (i2 == 0) {
            ResultKt.b(obj);
            StopRecentRepository stopRecentRepositoryE = recentRepositoryProvider.e();
            universalSearchHelper$markStopAsFavourite$1.L$0 = str;
            universalSearchHelper$markStopAsFavourite$1.L$1 = str2;
            universalSearchHelper$markStopAsFavourite$1.L$2 = str3;
            universalSearchHelper$markStopAsFavourite$1.label = 1;
            if (stopRecentRepositoryE.d(str2, str3, universalSearchHelper$markStopAsFavourite$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        str3 = (String) universalSearchHelper$markStopAsFavourite$1.L$2;
        str2 = (String) universalSearchHelper$markStopAsFavourite$1.L$1;
        str = (String) universalSearchHelper$markStopAsFavourite$1.L$0;
        ResultKt.b(obj);
        if (str != null && str.length() != 0) {
            StopRecentRepository stopRecentRepositoryE2 = recentRepositoryProvider.e();
            universalSearchHelper$markStopAsFavourite$1.L$0 = null;
            universalSearchHelper$markStopAsFavourite$1.L$1 = null;
            universalSearchHelper$markStopAsFavourite$1.L$2 = null;
            universalSearchHelper$markStopAsFavourite$1.label = 2;
            if (stopRecentRepositoryE2.c(str, str2, str3, universalSearchHelper$markStopAsFavourite$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(PlacesInfoDataAppModel placesInfoDataAppModel, ContinuationImpl continuationImpl) {
        UniversalSearchHelper$savePlaceInfoDataToDB$1 universalSearchHelper$savePlaceInfoDataToDB$1;
        LatLng latLng;
        PlacesInfoDataAppModel placesInfoDataAppModel2;
        Long l;
        RecentPlaceAppModel recentPlaceAppModel;
        PlacesRecentRepository placesRecentRepositoryF;
        String strB;
        PlacesInfoDataAppModel placesInfoDataAppModel3 = placesInfoDataAppModel;
        if (continuationImpl instanceof UniversalSearchHelper$savePlaceInfoDataToDB$1) {
            universalSearchHelper$savePlaceInfoDataToDB$1 = (UniversalSearchHelper$savePlaceInfoDataToDB$1) continuationImpl;
            int i = universalSearchHelper$savePlaceInfoDataToDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchHelper$savePlaceInfoDataToDB$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchHelper$savePlaceInfoDataToDB$1 = new UniversalSearchHelper$savePlaceInfoDataToDB$1(this, continuationImpl);
            }
        } else {
            universalSearchHelper$savePlaceInfoDataToDB$1 = new UniversalSearchHelper$savePlaceInfoDataToDB$1(this, continuationImpl);
        }
        Object objA = universalSearchHelper$savePlaceInfoDataToDB$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchHelper$savePlaceInfoDataToDB$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String str = placesInfoDataAppModel3.b;
            String str2 = placesInfoDataAppModel3.c;
            universalSearchHelper$savePlaceInfoDataToDB$1.L$0 = placesInfoDataAppModel3;
            universalSearchHelper$savePlaceInfoDataToDB$1.label = 1;
            objA = this.d.a(str, str2, universalSearchHelper$savePlaceInfoDataToDB$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            placesInfoDataAppModel3 = (PlacesInfoDataAppModel) universalSearchHelper$savePlaceInfoDataToDB$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RecentPlaceAppModel recentPlaceAppModel2 = (RecentPlaceAppModel) universalSearchHelper$savePlaceInfoDataToDB$1.L$0;
                ResultKt.b(objA);
                return recentPlaceAppModel2;
            }
            LatLng latLng2 = (LatLng) universalSearchHelper$savePlaceInfoDataToDB$1.L$1;
            placesInfoDataAppModel2 = (PlacesInfoDataAppModel) universalSearchHelper$savePlaceInfoDataToDB$1.L$0;
            ResultKt.b(objA);
            latLng = latLng2;
        }
        l = (Long) objA;
        if (l != null) {
            long jLongValue = l.longValue();
            String str3 = placesInfoDataAppModel2.b;
            String str4 = placesInfoDataAppModel2.f4993a;
            String str5 = placesInfoDataAppModel2.c;
            strB = CityProviderKt.b(this.b);
            if (strB == null) {
                strB = "";
            }
            recentPlaceAppModel = new RecentPlaceAppModel(str3, str5, str4, strB, str4, latLng, RecentsSpecialStatus.NONE, jLongValue, (String) null, 512);
        } else {
            recentPlaceAppModel = null;
        }
        if (recentPlaceAppModel != null) {
            placesRecentRepositoryF = this.f4960a.f();
            universalSearchHelper$savePlaceInfoDataToDB$1.L$0 = recentPlaceAppModel;
            universalSearchHelper$savePlaceInfoDataToDB$1.L$1 = null;
            universalSearchHelper$savePlaceInfoDataToDB$1.label = 3;
            if (placesRecentRepositoryF.g(recentPlaceAppModel, true, universalSearchHelper$savePlaceInfoDataToDB$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return recentPlaceAppModel;
        LatLng latLng3 = (LatLng) objA;
        if (latLng3 == null || (latLng3.f5134a == 0.0d && latLng3.b == 0.0d)) {
            return null;
        }
        universalSearchHelper$savePlaceInfoDataToDB$1.L$0 = placesInfoDataAppModel3;
        universalSearchHelper$savePlaceInfoDataToDB$1.L$1 = latLng3;
        universalSearchHelper$savePlaceInfoDataToDB$1.label = 2;
        Object objB = this.c.b(universalSearchHelper$savePlaceInfoDataToDB$1);
        if (objB != coroutineSingletons) {
            latLng = latLng3;
            objA = objB;
            placesInfoDataAppModel2 = placesInfoDataAppModel3;
            l = (Long) objA;
            if (l != null) {
                long jLongValue2 = l.longValue();
                String str6 = placesInfoDataAppModel2.b;
                String str7 = placesInfoDataAppModel2.f4993a;
                String str8 = placesInfoDataAppModel2.c;
                strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    strB = "";
                }
                recentPlaceAppModel = new RecentPlaceAppModel(str6, str8, str7, strB, str7, latLng, RecentsSpecialStatus.NONE, jLongValue2, (String) null, 512);
            } else {
                recentPlaceAppModel = null;
            }
            if (recentPlaceAppModel != null) {
                placesRecentRepositoryF = this.f4960a.f();
                universalSearchHelper$savePlaceInfoDataToDB$1.L$0 = recentPlaceAppModel;
                universalSearchHelper$savePlaceInfoDataToDB$1.L$1 = null;
                universalSearchHelper$savePlaceInfoDataToDB$1.label = 3;
                if (placesRecentRepositoryF.g(recentPlaceAppModel, true, universalSearchHelper$savePlaceInfoDataToDB$1) == coroutineSingletons) {
                }
            }
            return recentPlaceAppModel;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(StopAppModel stopAppModel, ContinuationImpl continuationImpl) {
        UniversalSearchHelper$saveStopDataToDB$1 universalSearchHelper$saveStopDataToDB$1;
        StopAppModel stopAppModel2;
        RecentStopAppModel recentStopAppModel;
        if (continuationImpl instanceof UniversalSearchHelper$saveStopDataToDB$1) {
            universalSearchHelper$saveStopDataToDB$1 = (UniversalSearchHelper$saveStopDataToDB$1) continuationImpl;
            int i = universalSearchHelper$saveStopDataToDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchHelper$saveStopDataToDB$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchHelper$saveStopDataToDB$1 = new UniversalSearchHelper$saveStopDataToDB$1(this, continuationImpl);
            }
        } else {
            universalSearchHelper$saveStopDataToDB$1 = new UniversalSearchHelper$saveStopDataToDB$1(this, continuationImpl);
        }
        Object obj = universalSearchHelper$saveStopDataToDB$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchHelper$saveStopDataToDB$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            universalSearchHelper$saveStopDataToDB$1.L$0 = stopAppModel;
            universalSearchHelper$saveStopDataToDB$1.label = 1;
            Object objB = this.c.b(universalSearchHelper$saveStopDataToDB$1);
            if (objB != coroutineSingletons) {
                stopAppModel2 = stopAppModel;
                obj = objB;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RecentStopAppModel recentStopAppModel2 = (RecentStopAppModel) universalSearchHelper$saveStopDataToDB$1.L$0;
            ResultKt.b(obj);
            return recentStopAppModel2;
        }
        StopAppModel stopAppModel3 = (StopAppModel) universalSearchHelper$saveStopDataToDB$1.L$0;
        ResultKt.b(obj);
        stopAppModel2 = stopAppModel3;
        Long l = (Long) obj;
        if (l != null) {
            long jLongValue = l.longValue();
            String str = stopAppModel2.f1727a;
            String strB = CityProviderKt.b(this.b);
            if (strB == null) {
                strB = "";
            }
            recentStopAppModel = new RecentStopAppModel(str, strB, stopAppModel2, RecentsSpecialStatus.NONE, jLongValue, 1, null);
        } else {
            recentStopAppModel = null;
        }
        if (recentStopAppModel != null) {
            StopRecentRepository stopRecentRepositoryE = this.f4960a.e();
            universalSearchHelper$saveStopDataToDB$1.L$0 = recentStopAppModel;
            universalSearchHelper$saveStopDataToDB$1.label = 2;
            if (stopRecentRepositoryE.e(recentStopAppModel, true, universalSearchHelper$saveStopDataToDB$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return recentStopAppModel;
    }
}
