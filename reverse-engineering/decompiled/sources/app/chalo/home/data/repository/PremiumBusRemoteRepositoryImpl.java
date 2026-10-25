package app.chalo.home.data.repository;

import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.home.data.exceptions.FetchBannerInvalidDataException;
import app.chalo.home.data.exceptions.FetchRouteSchedulesInvalidDataException;
import app.chalo.home.data.exceptions.PremiumBusContentConfigInvalidDataException;
import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.home.data.model.api.response.BannerDataResponseApiModel;
import app.chalo.home.data.model.api.response.BannerMetaApiModel;
import app.chalo.home.data.model.api.response.BannerUiDataApiModel;
import app.chalo.home.data.model.api.response.CorridorResponseApiModel;
import app.chalo.home.data.model.api.response.CorridorRouteResponseApiModel;
import app.chalo.home.data.model.api.response.FetchBannerResponseApiModel;
import app.chalo.home.data.model.api.response.PremiumBusContentConfigApiResponseModel;
import app.chalo.home.data.model.api.response.PremiumBusContentConfigDataApiResponseModel;
import app.chalo.home.data.model.api.response.PremiumBusTutorialConfigApiResponseModel;
import app.chalo.home.data.model.api.response.RoutesResponseApiModel;
import app.chalo.home.data.model.api.response.ScheduleBlockResponseApiModel;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerMetaAppModel;
import app.chalo.home.data.model.app.response.BannerType;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.data.model.app.response.CorridorAppModel;
import app.chalo.home.data.model.app.response.CorridorRouteInfoAppModel;
import app.chalo.home.data.model.app.response.FetchBannerResponseAppModel;
import app.chalo.home.data.model.app.response.PremiumBusContentConfigAppResponseModel;
import app.chalo.home.data.model.app.response.PremiumBusTutorialConfigAppResponseModel;
import app.chalo.home.data.model.app.response.RoutesResponseAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockAppModel;
import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import app.chalo.home.data.model.app.response.ScheduleBlockType;
import app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSource;
import app.chalo.models.LocationAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.api.TripPreferencesApiResponseModel;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/repository/PremiumBusRemoteRepositoryImpl;", "Lapp/chalo/home/data/repository/PremiumBusRemoteRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusRemoteRepositoryImpl implements PremiumBusRemoteRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusFeatureRemoteDataSource f2981a;

    public PremiumBusRemoteRepositoryImpl(PremiumBusFeatureRemoteDataSource premiumBusFeatureRemoteDataSource) {
        this.f2981a = premiumBusFeatureRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    @Override // app.chalo.home.data.repository.PremiumBusRemoteRepository
    public final Object a(String str, ContinuationImpl continuationImpl) throws PremiumBusContentConfigInvalidDataException {
        PremiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1 premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1;
        ?? arrayList;
        Long l;
        String str2;
        if (continuationImpl instanceof PremiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1) {
            premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1 = (PremiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1) continuationImpl;
            int i = premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1 = new PremiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1 = new PremiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1(this, continuationImpl);
        }
        Object objA = premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1.label = 1;
            objA = this.f2981a.a(str, premiumBusRemoteRepositoryImpl$fetchPremiumBusContentConfig$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PremiumBusContentConfigApiResponseModel premiumBusContentConfigApiResponseModel = ((PremiumBusContentConfigDataApiResponseModel) objA).f2936a;
        if (premiumBusContentConfigApiResponseModel == null) {
            throw new PremiumBusContentConfigInvalidDataException();
        }
        List<PremiumBusTutorialConfigApiResponseModel> list = premiumBusContentConfigApiResponseModel.f2934a;
        if (list != null) {
            arrayList = new ArrayList();
            for (PremiumBusTutorialConfigApiResponseModel premiumBusTutorialConfigApiResponseModel : list) {
                Intrinsics.i(premiumBusTutorialConfigApiResponseModel, "<this>");
                String str3 = premiumBusTutorialConfigApiResponseModel.f2938a;
                PremiumBusTutorialConfigAppResponseModel premiumBusTutorialConfigAppResponseModel = null;
                if (str3 != null) {
                    String str4 = str3.length() > 0 ? str3 : null;
                    if (str4 != null && (l = premiumBusTutorialConfigApiResponseModel.b) != null) {
                        if (l.longValue() <= 0) {
                            l = null;
                        }
                        if (l != null) {
                            long jLongValue = l.longValue();
                            String str5 = premiumBusTutorialConfigApiResponseModel.c;
                            if (str5 != null) {
                                String str6 = str5.length() > 0 ? str5 : null;
                                if (str6 != null && (str2 = premiumBusTutorialConfigApiResponseModel.d) != null) {
                                    String str7 = str2.length() > 0 ? str2 : null;
                                    if (str7 != null) {
                                        premiumBusTutorialConfigAppResponseModel = new PremiumBusTutorialConfigAppResponseModel(jLongValue, str4, str6, str7);
                                    }
                                }
                            }
                        }
                    }
                }
                if (premiumBusTutorialConfigAppResponseModel != null) {
                    arrayList.add(premiumBusTutorialConfigAppResponseModel);
                }
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new PremiumBusContentConfigAppResponseModel(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x014c  */
    @Override // app.chalo.home.data.repository.PremiumBusRemoteRepository
    public final Object b(String str, RouteServiceType routeServiceType, LocationAppModel locationAppModel, ContinuationImpl continuationImpl) throws FetchRouteSchedulesInvalidDataException {
        PremiumBusRemoteRepositoryImpl$fetchRouteSchedules$1 premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1;
        ScheduleBlockType scheduleBlockType;
        ScheduleBlockAppModel scheduleBlockAppModel;
        String str2;
        List<CorridorRouteResponseApiModel> list;
        CorridorAppModel corridorAppModel;
        CorridorRouteInfoAppModel corridorRouteInfoAppModel;
        String str3;
        ScheduleBlockType next;
        if (continuationImpl instanceof PremiumBusRemoteRepositoryImpl$fetchRouteSchedules$1) {
            premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1 = (PremiumBusRemoteRepositoryImpl$fetchRouteSchedules$1) continuationImpl;
            int i = premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1 = new PremiumBusRemoteRepositoryImpl$fetchRouteSchedules$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1 = new PremiumBusRemoteRepositoryImpl$fetchRouteSchedules$1(this, continuationImpl);
        }
        Object objB = premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1.label = 1;
            objB = this.f2981a.b(str, routeServiceType, locationAppModel, premiumBusRemoteRepositoryImpl$fetchRouteSchedules$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        RoutesResponseApiModel routesResponseApiModel = (RoutesResponseApiModel) objB;
        Intrinsics.i(routesResponseApiModel, "<this>");
        List<ScheduleBlockResponseApiModel> list2 = routesResponseApiModel.f2940a;
        RoutesResponseAppModel routesResponseAppModel = null;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (ScheduleBlockResponseApiModel scheduleBlockResponseApiModel : list2) {
                Intrinsics.i(scheduleBlockResponseApiModel, "<this>");
                String str4 = scheduleBlockResponseApiModel.f2942a;
                if (str4 != null) {
                    ScheduleBlockType.INSTANCE.getClass();
                    Iterator<ScheduleBlockType> it = ScheduleBlockType.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.d(next.name(), str4));
                    scheduleBlockType = next;
                    if (scheduleBlockType == null) {
                        scheduleBlockType = ScheduleBlockType.UNKNOWN;
                    }
                    if (scheduleBlockType == null) {
                        scheduleBlockType = ScheduleBlockType.UNKNOWN;
                    }
                } else {
                    scheduleBlockType = ScheduleBlockType.UNKNOWN;
                }
                String str5 = scheduleBlockResponseApiModel.b;
                if (str5 == null) {
                    scheduleBlockAppModel = null;
                } else {
                    ScheduleBlockKey scheduleBlockKey = new ScheduleBlockKey(scheduleBlockType, str5);
                    List<CorridorResponseApiModel> list3 = scheduleBlockResponseApiModel.c;
                    if (list3 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (CorridorResponseApiModel corridorResponseApiModel : list3) {
                            Intrinsics.i(corridorResponseApiModel, "<this>");
                            String str6 = corridorResponseApiModel.f2926a;
                            String str7 = corridorResponseApiModel.b;
                            if (str7 == null || (str2 = corridorResponseApiModel.c) == null || (list = corridorResponseApiModel.d) == null) {
                                corridorAppModel = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (CorridorRouteResponseApiModel corridorRouteResponseApiModel : list) {
                                    Intrinsics.i(corridorRouteResponseApiModel, "<this>");
                                    String str8 = corridorRouteResponseApiModel.f2928a;
                                    if (str8 == null) {
                                        corridorRouteInfoAppModel = null;
                                    } else {
                                        String str9 = !StringsKt.F(str8) ? str8 : null;
                                        if (str9 == null || (str3 = corridorRouteResponseApiModel.b) == null) {
                                            corridorRouteInfoAppModel = null;
                                        } else {
                                            String str10 = !StringsKt.F(str3) ? str3 : null;
                                            if (str10 != null) {
                                                String str11 = corridorRouteResponseApiModel.c;
                                                String str12 = (str11 == null || StringsKt.F(str11)) ? null : str11;
                                                Long l = corridorRouteResponseApiModel.d;
                                                Long l2 = corridorRouteResponseApiModel.e;
                                                String str13 = corridorRouteResponseApiModel.f;
                                                if (str13 == null) {
                                                    corridorRouteInfoAppModel = null;
                                                } else {
                                                    String str14 = !StringsKt.F(str13) ? str13 : null;
                                                    if (str14 == null) {
                                                        corridorRouteInfoAppModel = null;
                                                    } else {
                                                        corridorRouteInfoAppModel = new CorridorRouteInfoAppModel(l, l2, str9, str10, str12, str14);
                                                    }
                                                }
                                            } else {
                                                corridorRouteInfoAppModel = null;
                                            }
                                        }
                                    }
                                    if (corridorRouteInfoAppModel != null) {
                                        arrayList3.add(corridorRouteInfoAppModel);
                                    }
                                }
                                corridorAppModel = new CorridorAppModel(str6, str7, str2, arrayList3);
                            }
                            if (corridorAppModel != null) {
                                arrayList2.add(corridorAppModel);
                            }
                        }
                        scheduleBlockAppModel = new ScheduleBlockAppModel(scheduleBlockKey, arrayList2);
                    } else {
                        scheduleBlockAppModel = null;
                    }
                }
                if (scheduleBlockAppModel != null) {
                    arrayList.add(scheduleBlockAppModel);
                }
            }
            routesResponseAppModel = new RoutesResponseAppModel(arrayList);
        }
        if (routesResponseAppModel != null) {
            return routesResponseAppModel;
        }
        throw new FetchRouteSchedulesInvalidDataException();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.home.data.repository.PremiumBusRemoteRepository
    public final Object c(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) throws FetchBannerInvalidDataException {
        PremiumBusRemoteRepositoryImpl$fetchBanner$1 premiumBusRemoteRepositoryImpl$fetchBanner$1;
        FetchBannerResponseAppModel fetchBannerResponseAppModel;
        BannerDataResponseAppModel bannerDataResponseAppModel;
        BannerType next;
        BannerUiDataAppModel bannerUiDataAppModel;
        if (continuationImpl instanceof PremiumBusRemoteRepositoryImpl$fetchBanner$1) {
            premiumBusRemoteRepositoryImpl$fetchBanner$1 = (PremiumBusRemoteRepositoryImpl$fetchBanner$1) continuationImpl;
            int i = premiumBusRemoteRepositoryImpl$fetchBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusRemoteRepositoryImpl$fetchBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusRemoteRepositoryImpl$fetchBanner$1 = new PremiumBusRemoteRepositoryImpl$fetchBanner$1(this, continuationImpl);
            }
        } else {
            premiumBusRemoteRepositoryImpl$fetchBanner$1 = new PremiumBusRemoteRepositoryImpl$fetchBanner$1(this, continuationImpl);
        }
        Object objC = premiumBusRemoteRepositoryImpl$fetchBanner$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusRemoteRepositoryImpl$fetchBanner$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            premiumBusRemoteRepositoryImpl$fetchBanner$1.label = 1;
            objC = this.f2981a.c(linkedHashMap, premiumBusRemoteRepositoryImpl$fetchBanner$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        FetchBannerResponseApiModel fetchBannerResponseApiModel = (FetchBannerResponseApiModel) objC;
        Intrinsics.i(fetchBannerResponseApiModel, "<this>");
        List<BannerDataResponseApiModel> list = fetchBannerResponseApiModel.f2930a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (BannerDataResponseApiModel bannerDataResponseApiModel : list) {
                Intrinsics.i(bannerDataResponseApiModel, "<this>");
                BannerType.Companion companion = BannerType.INSTANCE;
                String str = bannerDataResponseApiModel.f2918a;
                companion.getClass();
                Iterator<BannerType> it = BannerType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(next.getType(), str));
                BannerType bannerType = next;
                if (bannerType == null) {
                    bannerType = BannerType.NONE;
                }
                BannerMetaApiModel bannerMetaApiModel = bannerDataResponseApiModel.b;
                if (bannerMetaApiModel != null) {
                    Integer num = bannerMetaApiModel.f2920a;
                    Integer num2 = bannerMetaApiModel.b;
                    Boolean bool = bannerMetaApiModel.c;
                    String str2 = bannerMetaApiModel.d;
                    String str3 = bannerMetaApiModel.e;
                    TripPreferencesApiResponseModel tripPreferencesApiResponseModel = bannerMetaApiModel.f;
                    SuperPassTripPreferences superPassTripPreferences = tripPreferencesApiResponseModel != null ? new SuperPassTripPreferences(tripPreferencesApiResponseModel.f6884a, tripPreferencesApiResponseModel.b, tripPreferencesApiResponseModel.c, tripPreferencesApiResponseModel.d, tripPreferencesApiResponseModel.e) : null;
                    PassTierType.Companion companion2 = PassTierType.INSTANCE;
                    String str4 = bannerMetaApiModel.g;
                    companion2.getClass();
                    BannerMetaAppModel bannerMetaAppModel = new BannerMetaAppModel(num, num2, bool, str2, str3, superPassTripPreferences, PassTierType.Companion.a(str4));
                    BannerUiDataApiModel bannerUiDataApiModel = bannerDataResponseApiModel.c;
                    if (bannerUiDataApiModel == null) {
                        bannerDataResponseAppModel = null;
                    } else {
                        String str5 = bannerUiDataApiModel.f2922a;
                        if (str5 == null) {
                            bannerUiDataAppModel = null;
                        } else {
                            String str6 = bannerUiDataApiModel.b;
                            String str7 = bannerUiDataApiModel.c;
                            BannerStatus.Companion companion3 = BannerStatus.INSTANCE;
                            String str8 = bannerUiDataApiModel.d;
                            companion3.getClass();
                            bannerUiDataAppModel = new BannerUiDataAppModel(str5, str6, str7, BannerStatus.Companion.a(str8));
                        }
                        if (bannerUiDataAppModel == null) {
                            bannerDataResponseAppModel = null;
                        } else {
                            bannerDataResponseAppModel = new BannerDataResponseAppModel(bannerType, bannerMetaAppModel, bannerUiDataAppModel);
                        }
                    }
                } else {
                    bannerDataResponseAppModel = null;
                }
                if (bannerDataResponseAppModel != null) {
                    arrayList.add(bannerDataResponseAppModel);
                }
            }
            fetchBannerResponseAppModel = new FetchBannerResponseAppModel(arrayList);
        } else {
            fetchBannerResponseAppModel = null;
        }
        if (fetchBannerResponseAppModel != null) {
            return fetchBannerResponseAppModel;
        }
        throw new FetchBannerInvalidDataException();
    }
}
