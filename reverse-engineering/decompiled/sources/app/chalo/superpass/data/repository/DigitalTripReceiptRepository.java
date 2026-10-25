package app.chalo.superpass.data.repository;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonException;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.superpass.data.dao.DigitalTripReceiptDao;
import app.chalo.superpass.data.models.DigitalTripReceiptRemoteApiRequestModel;
import app.chalo.superpass.data.models.PassActivationsApiRequestModel;
import app.chalo.superpass.data.models.PassInfoApiRequestModel;
import app.chalo.superpass.data.models.PassTripHistoryApiResponseModel;
import app.chalo.superpass.data.models.SuperPassTripReceiptApiResponseModel;
import app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;
import app.chalo.superpass.data.models.TicketActivationsApiRequestModel;
import app.chalo.superpass.data.models.entities.ProductActivationDetails;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import app.chalo.superpass.data.remote.DigitalTripReceiptRemoteDataSource;
import app.chalo.superpass.utils.MixpanelUtil;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/repository/DigitalTripReceiptRepository;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DigitalTripReceiptRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DigitalTripReceiptDao f9592a;
    public final AnalyticsContract b;
    public final CrashlyticsLogger c;
    public final BasicInfoContract d;
    public final DigitalTripReceiptRemoteDataSource e;

    public DigitalTripReceiptRepository(DigitalTripReceiptDao digitalTripReceiptDao, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, BasicInfoContract basicInfoContract, DigitalTripReceiptRemoteDataSource digitalTripReceiptRemoteDataSource) {
        this.f9592a = digitalTripReceiptDao;
        this.b = analyticsContract;
        this.c = crashlyticsLogger;
        this.d = basicInfoContract;
        this.e = digitalTripReceiptRemoteDataSource;
    }

    public static HashMap c(List list) {
        HashMap map = new HashMap();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductActivationDetails productActivationDetails = (ProductActivationDetails) it.next();
                List arrayList = (List) map.get(productActivationDetails.b);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(productActivationDetails);
                map.put(productActivationDetails.b, arrayList);
            }
        }
        return map;
    }

    public final Object a(List list, ContinuationImpl continuationImpl) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((ProductActivationDetails) it.next()).f9551a));
            }
            Object objB = this.f9592a.b(arrayList, continuationImpl);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        }
        return Unit.f17538a;
    }

    public final DigitalTripReceiptRemoteApiRequestModel b(SuperPass superPass, HashMap map, HashMap map2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            ProductActivationDetails productActivationDetails = (ProductActivationDetails) CollectionsKt.H(list);
            if (productActivationDetails != null) {
                String str = productActivationDetails.f;
                String str2 = productActivationDetails.g;
                String str3 = productActivationDetails.b;
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((ProductActivationDetails) it2.next()).f9551a));
                }
                arrayList.add(new PassActivationsApiRequestModel(str, str2, str3, arrayList3));
            }
        }
        Iterator it3 = map2.entrySet().iterator();
        while (it3.hasNext()) {
            List list3 = (List) ((Map.Entry) it3.next()).getValue();
            ProductActivationDetails productActivationDetails2 = (ProductActivationDetails) CollectionsKt.H(list3);
            if (productActivationDetails2 != null) {
                String str4 = productActivationDetails2.f;
                String str5 = productActivationDetails2.g;
                String str6 = productActivationDetails2.b;
                List list4 = list3;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Long.valueOf(((ProductActivationDetails) it4.next()).f9551a));
                }
                arrayList2.add(new TicketActivationsApiRequestModel(str4, str5, str6, arrayList4));
            }
        }
        PassInfoApiRequestModel passInfoApiRequestModel = superPass != null ? new PassInfoApiRequestModel(superPass.f9560a.f9566a) : null;
        int iH = this.d.h();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        return new DigitalTripReceiptRemoteApiRequestModel(iH, arrayList, arrayList2, passInfoApiRequestModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ProductActivationDetails productActivationDetails, ContinuationImpl continuationImpl) {
        DigitalTripReceiptRepository$insertProductActivationDetails$1 digitalTripReceiptRepository$insertProductActivationDetails$1;
        if (continuationImpl instanceof DigitalTripReceiptRepository$insertProductActivationDetails$1) {
            digitalTripReceiptRepository$insertProductActivationDetails$1 = (DigitalTripReceiptRepository$insertProductActivationDetails$1) continuationImpl;
            int i = digitalTripReceiptRepository$insertProductActivationDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptRepository$insertProductActivationDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptRepository$insertProductActivationDetails$1 = new DigitalTripReceiptRepository$insertProductActivationDetails$1(this, continuationImpl);
            }
        } else {
            digitalTripReceiptRepository$insertProductActivationDetails$1 = new DigitalTripReceiptRepository$insertProductActivationDetails$1(this, continuationImpl);
        }
        Object obj = digitalTripReceiptRepository$insertProductActivationDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRepository$insertProductActivationDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            digitalTripReceiptRepository$insertProductActivationDetails$1.label = 1;
            if (this.f9592a.e(productActivationDetails, digitalTripReceiptRepository$insertProductActivationDetails$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Boolean.TRUE;
    }

    public final void e(String str) {
        Source source = Source.NONE;
        if (str == null) {
            str = "";
        }
        AnalyticsContractImplKt.b(this.b, "product activation pass punch sync failed", source, vo1.s("error message", str), false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, SuperPass superPass, ContinuationImpl continuationImpl) {
        DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1 digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1;
        Map map;
        Source source;
        AnalyticsContract analyticsContract;
        String str2;
        if (continuationImpl instanceof DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1) {
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1 = (DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1) continuationImpl;
            int i = digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1 = new DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1(this, continuationImpl);
            }
        } else {
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1 = new DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1(this, continuationImpl);
        }
        Object obj = digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Source source2 = Source.NONE;
            if (str == null) {
                str = "";
            }
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("error message", str));
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$0 = linkedHashMapK;
            AnalyticsContract analyticsContract2 = this.b;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$1 = analyticsContract2;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$2 = "superPass trip receipt history fetch failed";
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$3 = source2;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.label = 1;
            if (mixpanelUtil.c(linkedHashMapK, superPass, digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMapK;
            source = source2;
            analyticsContract = analyticsContract2;
            str2 = "superPass trip receipt history fetch failed";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$3;
            String str3 = (String) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$2;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$1;
            Map map2 = (Map) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchFailedEvent$1.L$0;
            ResultKt.b(obj);
            source = source3;
            str2 = str3;
            map = map2;
            analyticsContract = analyticsContract3;
        }
        AnalyticsContractImplKt.b(analyticsContract, str2, source, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(SuperPass superPass, ContinuationImpl continuationImpl) {
        DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1 digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1;
        Source source;
        Map map;
        AnalyticsContract analyticsContract;
        String str;
        if (continuationImpl instanceof DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1) {
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1 = (DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1) continuationImpl;
            int i = digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1 = new DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1(this, continuationImpl);
            }
        } else {
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1 = new DigitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1(this, continuationImpl);
        }
        Object obj = digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Source source2 = Source.NONE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$0 = linkedHashMap;
            AnalyticsContract analyticsContract2 = this.b;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$1 = analyticsContract2;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$2 = "superPass trip receipt history fetched";
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$3 = source2;
            digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.label = 1;
            if (mixpanelUtil.c(linkedHashMap, superPass, digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            source = source2;
            map = linkedHashMap;
            analyticsContract = analyticsContract2;
            str = "superPass trip receipt history fetched";
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$3;
            String str2 = (String) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$2;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$1;
            Map map2 = (Map) digitalTripReceiptRepository$raiseTripReceiptHistoryFetchedEvent$1.L$0;
            ResultKt.b(obj);
            source = source3;
            map = map2;
            str = str2;
            analyticsContract = analyticsContract3;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[Catch: Exception -> 0x003c, JsonException -> 0x003f, TryCatch #2 {JsonException -> 0x003f, Exception -> 0x003c, blocks: (B:13:0x0038, B:22:0x0052, B:45:0x00cf, B:47:0x00d9, B:50:0x00e6, B:37:0x0099, B:39:0x00a3, B:44:0x00b4), top: B:55:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6 A[Catch: Exception -> 0x003c, JsonException -> 0x003f, TRY_LEAVE, TryCatch #2 {JsonException -> 0x003f, Exception -> 0x003c, blocks: (B:13:0x0038, B:22:0x0052, B:45:0x00cf, B:47:0x00d9, B:50:0x00e6, B:37:0x0099, B:39:0x00a3, B:44:0x00b4), top: B:55:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object h(ArrayList arrayList, ArrayList arrayList2, ContinuationImpl continuationImpl) {
        DigitalTripReceiptRepository$syncActivations$1 digitalTripReceiptRepository$syncActivations$1;
        SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;
        Object obj;
        SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel2;
        List list = arrayList;
        List list2 = arrayList2;
        if (continuationImpl instanceof DigitalTripReceiptRepository$syncActivations$1) {
            digitalTripReceiptRepository$syncActivations$1 = (DigitalTripReceiptRepository$syncActivations$1) continuationImpl;
            int i = digitalTripReceiptRepository$syncActivations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptRepository$syncActivations$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptRepository$syncActivations$1 = new DigitalTripReceiptRepository$syncActivations$1(this, continuationImpl);
            }
        } else {
            digitalTripReceiptRepository$syncActivations$1 = new DigitalTripReceiptRepository$syncActivations$1(this, continuationImpl);
        }
        Object objA = digitalTripReceiptRepository$syncActivations$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRepository$syncActivations$1.label;
        AnalyticsContract analyticsContract = this.b;
        Unit unit = Unit.f17538a;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                if ((list != null && !list.isEmpty()) || (list2 != null && !list2.isEmpty())) {
                    DigitalTripReceiptRemoteApiRequestModel digitalTripReceiptRemoteApiRequestModelB = b(null, c(list), c(list2));
                    digitalTripReceiptRepository$syncActivations$1.L$0 = list;
                    digitalTripReceiptRepository$syncActivations$1.L$1 = list2;
                    digitalTripReceiptRepository$syncActivations$1.label = 1;
                    objA = this.e.a(digitalTripReceiptRemoteApiRequestModelB, digitalTripReceiptRepository$syncActivations$1);
                    if (objA != obj2) {
                    }
                    return obj2;
                }
                return unit;
            }
            if (i2 == 1) {
                List list3 = (List) digitalTripReceiptRepository$syncActivations$1.L$1;
                List list4 = (List) digitalTripReceiptRepository$syncActivations$1.L$0;
                ResultKt.b(objA);
                list2 = list3;
                list = list4;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(objA);
                    return unit;
                }
                syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel2 = (SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) digitalTripReceiptRepository$syncActivations$1.L$1;
                list2 = (List) digitalTripReceiptRepository$syncActivations$1.L$0;
                ResultKt.b(objA);
            }
            syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel = syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel2;
            obj = null;
            if (!Intrinsics.d(syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.b, Boolean.TRUE)) {
                AnalyticsContractImplKt.b(analyticsContract, "product activation sync failed", Source.NONE, MapsKt.h(new Pair("productType", "mTicket")), false, 24);
                return unit;
            }
            digitalTripReceiptRepository$syncActivations$1.L$0 = obj;
            digitalTripReceiptRepository$syncActivations$1.L$1 = obj;
            digitalTripReceiptRepository$syncActivations$1.label = 3;
            if (a(list2, digitalTripReceiptRepository$syncActivations$1) == obj2) {
                return obj2;
            }
            return unit;
            syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel = (SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) objA;
            if (Intrinsics.d(syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.f9535a, Boolean.TRUE)) {
                digitalTripReceiptRepository$syncActivations$1.L$0 = list2;
                digitalTripReceiptRepository$syncActivations$1.L$1 = syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;
                digitalTripReceiptRepository$syncActivations$1.label = 2;
                if (a(list, digitalTripReceiptRepository$syncActivations$1) != obj2) {
                    syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel2 = syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel;
                    syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel = syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel2;
                    obj = null;
                    if (!Intrinsics.d(syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.b, Boolean.TRUE)) {
                        AnalyticsContractImplKt.b(analyticsContract, "product activation sync failed", Source.NONE, MapsKt.h(new Pair("productType", "mTicket")), false, 24);
                        return unit;
                    }
                    digitalTripReceiptRepository$syncActivations$1.L$0 = obj;
                    digitalTripReceiptRepository$syncActivations$1.L$1 = obj;
                    digitalTripReceiptRepository$syncActivations$1.label = 3;
                    if (a(list2, digitalTripReceiptRepository$syncActivations$1) == obj2) {
                        return unit;
                    }
                }
            } else {
                obj = null;
                AnalyticsContractImplKt.b(analyticsContract, "product activation sync failed", Source.NONE, MapsKt.h(new Pair("productType", "superPass")), false, 24);
                if (!Intrinsics.d(syncActivationsAndFetchSuperPassTripReceiptsApiResponseModel.b, Boolean.TRUE)) {
                    AnalyticsContractImplKt.b(analyticsContract, "product activation sync failed", Source.NONE, MapsKt.h(new Pair("productType", "mTicket")), false, 24);
                    return unit;
                }
                digitalTripReceiptRepository$syncActivations$1.L$0 = obj;
                digitalTripReceiptRepository$syncActivations$1.L$1 = obj;
                digitalTripReceiptRepository$syncActivations$1.label = 3;
                if (a(list2, digitalTripReceiptRepository$syncActivations$1) == obj2) {
                    return unit;
                }
            }
            return obj2;
        } catch (JsonException e) {
            AnalyticsContractImplKt.b(analyticsContract, "product activation sync exception occurred", Source.NONE, vo1.s("reason", String.valueOf(e.getMessage())), false, 24);
            this.c.i(e);
        } catch (Exception e2) {
            e(e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e5 A[Catch: Exception -> 0x00fc, JsonException -> 0x0100, TryCatch #6 {JsonException -> 0x0100, Exception -> 0x00fc, blocks: (B:67:0x015a, B:69:0x0164, B:72:0x0174, B:41:0x00db, B:43:0x00e5, B:52:0x0104), top: B:83:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0104 A[Catch: Exception -> 0x00fc, JsonException -> 0x0100, TRY_LEAVE, TryCatch #6 {JsonException -> 0x0100, Exception -> 0x00fc, blocks: (B:67:0x015a, B:69:0x0164, B:72:0x0174, B:41:0x00db, B:43:0x00e5, B:52:0x0104), top: B:83:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0121 A[Catch: Exception -> 0x004c, JsonException -> 0x004f, TryCatch #5 {JsonException -> 0x004f, Exception -> 0x004c, blocks: (B:15:0x0047, B:59:0x0132, B:54:0x011d, B:56:0x0121, B:64:0x0147), top: B:84:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132 A[Catch: Exception -> 0x004c, JsonException -> 0x004f, PHI: r0 r2 r5
      0x0132: PHI (r0v24 app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) = 
      (r0v19 app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel)
      (r0v26 app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel)
     binds: [B:57:0x012e, B:31:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r2v19 java.util.List) = (r2v16 java.util.List), (r2v20 java.util.List) binds: [B:57:0x012e, B:31:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r5v23 app.chalo.superpass.data.models.entities.SuperPass) = (r5v16 app.chalo.superpass.data.models.entities.SuperPass), (r5v26 app.chalo.superpass.data.models.entities.SuperPass) binds: [B:57:0x012e, B:31:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {JsonException -> 0x004f, Exception -> 0x004c, blocks: (B:15:0x0047, B:59:0x0132, B:54:0x011d, B:56:0x0121, B:64:0x0147), top: B:84:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143 A[PHI: r0 r2 r5
      0x0143: PHI (r0v23 app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel) = 
      (r0v19 app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel)
      (r0v24 app.chalo.superpass.data.models.SyncActivationsAndFetchSuperPassTripReceiptsApiResponseModel)
     binds: [B:65:0x0156, B:60:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r2v18 java.util.List) = (r2v16 java.util.List), (r2v19 java.util.List) binds: [B:65:0x0156, B:60:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r5v21 app.chalo.superpass.data.models.entities.SuperPass) = (r5v16 app.chalo.superpass.data.models.entities.SuperPass), (r5v23 app.chalo.superpass.data.models.entities.SuperPass) binds: [B:65:0x0156, B:60:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[Catch: Exception -> 0x004c, JsonException -> 0x004f, TRY_LEAVE, TryCatch #5 {JsonException -> 0x004f, Exception -> 0x004c, blocks: (B:15:0x0047, B:59:0x0132, B:54:0x011d, B:56:0x0121, B:64:0x0147), top: B:84:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0164 A[Catch: Exception -> 0x00fc, JsonException -> 0x0100, TryCatch #6 {JsonException -> 0x0100, Exception -> 0x00fc, blocks: (B:67:0x015a, B:69:0x0164, B:72:0x0174, B:41:0x00db, B:43:0x00e5, B:52:0x0104), top: B:83:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0174 A[Catch: Exception -> 0x00fc, JsonException -> 0x0100, TRY_LEAVE, TryCatch #6 {JsonException -> 0x0100, Exception -> 0x00fc, blocks: (B:67:0x015a, B:69:0x0164, B:72:0x0174, B:41:0x00db, B:43:0x00e5, B:52:0x0104), top: B:83:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        if (f("no history sent", r5, r3) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        if (f(r0, r5, r3) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d0, code lost:
    
        if (f(r2, r5, r3) == r4) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0064: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:101), block:B:25:0x0064 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0068: MOVE (r5 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:105), block:B:27:0x0068 */
    /* JADX WARN: Type inference failed for: r16v0, types: [app.chalo.superpass.data.repository.DigitalTripReceiptRepository] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [app.chalo.superpass.data.models.entities.SuperPass] */
    /* JADX WARN: Type inference failed for: r5v4, types: [app.chalo.superpass.data.models.entities.SuperPass] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(app.chalo.superpass.data.models.entities.SuperPass r17, java.util.ArrayList r18, java.util.ArrayList r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.superpass.data.repository.DigitalTripReceiptRepository.i(app.chalo.superpass.data.models.entities.SuperPass, java.util.ArrayList, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object j(PassTripHistoryApiResponseModel passTripHistoryApiResponseModel, ContinuationImpl continuationImpl) {
        DigitalTripReceiptRepository$updateSuperPassTripReceiptTable$1 digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1;
        List list;
        if (continuationImpl instanceof DigitalTripReceiptRepository$updateSuperPassTripReceiptTable$1) {
            digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1 = (DigitalTripReceiptRepository$updateSuperPassTripReceiptTable$1) continuationImpl;
            int i = digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.label = i - Integer.MIN_VALUE;
            } else {
                digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1 = new DigitalTripReceiptRepository$updateSuperPassTripReceiptTable$1(this, continuationImpl);
            }
        } else {
            digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1 = new DigitalTripReceiptRepository$updateSuperPassTripReceiptTable$1(this, continuationImpl);
        }
        Object obj = digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.label;
        DigitalTripReceiptDao digitalTripReceiptDao = this.f9592a;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            Intrinsics.i(passTripHistoryApiResponseModel, "passTripHistoryApiResponseModel");
            String str = passTripHistoryApiResponseModel.f9531a;
            String str2 = passTripHistoryApiResponseModel.b;
            String str3 = passTripHistoryApiResponseModel.c;
            if (str == null || str2 == null || str3 == null || !str2.equals("superPass") || !(str3.equals("rideBasedPass") || str3.equals("magicPass"))) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList();
                List<SuperPassTripReceiptApiResponseModel> list2 = passTripHistoryApiResponseModel.d;
                if (list2 != null) {
                    for (SuperPassTripReceiptApiResponseModel superPassTripReceiptApiResponseModel : list2) {
                        long j = superPassTripReceiptApiResponseModel.f9533a;
                        Long l = superPassTripReceiptApiResponseModel.b;
                        long jLongValue = l != null ? l.longValue() : -1L;
                        String str4 = superPassTripReceiptApiResponseModel.c;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = superPassTripReceiptApiResponseModel.d;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = superPassTripReceiptApiResponseModel.e;
                        String str9 = str8 == null ? "" : str8;
                        String str10 = superPassTripReceiptApiResponseModel.f;
                        String str11 = str10 == null ? "" : str10;
                        String str12 = superPassTripReceiptApiResponseModel.g;
                        String str13 = str12 == null ? "" : str12;
                        List list3 = superPassTripReceiptApiResponseModel.h;
                        if (list3 == null) {
                            list3 = EmptyList.f17557a;
                        }
                        List list4 = list3;
                        String str14 = superPassTripReceiptApiResponseModel.i;
                        RouteNamingSchemeType routeNamingSchemeType = superPassTripReceiptApiResponseModel.j;
                        if (routeNamingSchemeType == null) {
                            routeNamingSchemeType = RouteNamingSchemeType.DEFAULT;
                        }
                        arrayList.add(new SuperPassTripReceipt(str, str2, str3, j, jLongValue, str5, str7, str9, str11, str13, list4, str14, routeNamingSchemeType));
                    }
                }
                list = arrayList;
            }
            if (list != null) {
                if (str != null) {
                    digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.L$0 = list;
                    digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.label = 1;
                    if (digitalTripReceiptDao.g(str, digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1) != coroutineSingletons) {
                    }
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        list = (List) digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.L$0;
        ResultKt.b(obj);
        digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.L$0 = null;
        digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1.label = 2;
        return digitalTripReceiptDao.d(list, digitalTripReceiptRepository$updateSuperPassTripReceiptTable$1) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
