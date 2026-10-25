package app.chalo.usecase;

import app.chalo.Device;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.extensions.JsonException;
import app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapper;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.FetchOndcConfigUseCaseKt;
import app.chalo.ondc.model.api.OndcTicketConfiguration;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigCompleteDetailsListApiResponseModelKt;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigDocumentPropsApiResponseModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigForUiAppModel;
import app.chalo.productbooking.common.data.models.app.ProductsConfigListForUiAppModel;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productdatasync.repository.IProductDataSyncRepository;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.MobileTicketingConverters;
import defpackage.vo1;
import defpackage.y80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usecase/InitiateProductHistorySyncCallUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitiateProductHistorySyncCallUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IProductDataSyncRepository f10202a;
    public final StringProvider b;
    public final BasicInfoContract c;
    public final Device d;
    public final CityProvider e;
    public final CoroutineContextProvider f;
    public final ReclaimDataStoreWrapper g;
    public final UserProfileDetailsProvider h;
    public final CrashlyticsLogger i;
    public final SuperPassHistoryCallHelper j;
    public final MobileTicketingConverters k;
    public final LocalDataStore l;
    public final LocalDataStore m;
    public final GetPremiumBusCurrentCityConfigUseCase n;
    public final InstantTicketRepository o;
    public final PremiumBusRepository p;
    public final OndcRepository q;
    public final MetroRepository r;
    public final MultiModalGroupTicketRepository s;
    public final AnalyticsContract t;
    public final TicketRepository u;
    public final MTicketUtilsHelper v;
    public final MandatoryFirstHistoryCallGuard w;
    public final FetchProductConfigsForUiUseCase x;
    public final ProductBookingDataStore y;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/usecase/InitiateProductHistorySyncCallUseCase$Companion;", "", "", "HISTORY_SYNC_FAILED", "Ljava/lang/String;", "HISTORY_SYNC_SECTION_STATUS", "TAG", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public InitiateProductHistorySyncCallUseCase(IProductDataSyncRepository iProductDataSyncRepository, StringProvider stringProvider, BasicInfoContract basicInfoContract, Device device, CityProvider cityProvider, CoroutineContextProvider coroutineContextProvider, ReclaimDataStoreWrapper reclaimDataStoreWrapper, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger crashlyticsLogger, SuperPassHistoryCallHelper superPassHistoryCallHelper, MobileTicketingConverters mobileTicketingConverters, LocalDataStore localDataStore, LocalDataStore localDataStore2, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, InstantTicketRepository instantTicketRepository, PremiumBusRepository premiumBusRepository, OndcRepository ondcRepository, MetroRepository metroRepository, MultiModalGroupTicketRepository multiModalGroupTicketRepository, AnalyticsContract analyticsContract, TicketRepository ticketRepository, MTicketUtilsHelper mTicketUtilsHelper, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard, FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase, ProductBookingDataStore productBookingDataStore) {
        this.f10202a = iProductDataSyncRepository;
        this.b = stringProvider;
        this.c = basicInfoContract;
        this.d = device;
        this.e = cityProvider;
        this.f = coroutineContextProvider;
        this.g = reclaimDataStoreWrapper;
        this.h = userProfileDetailsProvider;
        this.i = crashlyticsLogger;
        this.j = superPassHistoryCallHelper;
        this.k = mobileTicketingConverters;
        this.l = localDataStore;
        this.m = localDataStore2;
        this.n = getPremiumBusCurrentCityConfigUseCase;
        this.o = instantTicketRepository;
        this.p = premiumBusRepository;
        this.q = ondcRepository;
        this.r = metroRepository;
        this.s = multiModalGroupTicketRepository;
        this.t = analyticsContract;
        this.u = ticketRepository;
        this.v = mTicketUtilsHelper;
        this.w = mandatoryFirstHistoryCallGuard;
        this.x = fetchProductConfigsForUiUseCase;
        this.y = productBookingDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, ProductsConfigListForUiAppModel productsConfigListForUiAppModel, ContinuationImpl continuationImpl) throws Exception {
        InitiateProductHistorySyncCallUseCase$processProductConfigFetch$1 initiateProductHistorySyncCallUseCase$processProductConfigFetch$1;
        Object next;
        initiateProductHistorySyncCallUseCase.getClass();
        if (continuationImpl instanceof InitiateProductHistorySyncCallUseCase$processProductConfigFetch$1) {
            initiateProductHistorySyncCallUseCase$processProductConfigFetch$1 = (InitiateProductHistorySyncCallUseCase$processProductConfigFetch$1) continuationImpl;
            int i = initiateProductHistorySyncCallUseCase$processProductConfigFetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initiateProductHistorySyncCallUseCase$processProductConfigFetch$1.label = i - Integer.MIN_VALUE;
            } else {
                initiateProductHistorySyncCallUseCase$processProductConfigFetch$1 = new InitiateProductHistorySyncCallUseCase$processProductConfigFetch$1(initiateProductHistorySyncCallUseCase, continuationImpl);
            }
        } else {
            initiateProductHistorySyncCallUseCase$processProductConfigFetch$1 = new InitiateProductHistorySyncCallUseCase$processProductConfigFetch$1(initiateProductHistorySyncCallUseCase, continuationImpl);
        }
        Object obj = initiateProductHistorySyncCallUseCase$processProductConfigFetch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initiateProductHistorySyncCallUseCase$processProductConfigFetch$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                Iterator it = productsConfigListForUiAppModel.f8226a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ProductConfigForUiAppModel productConfigForUiAppModel = (ProductConfigForUiAppModel) next;
                    String str = productConfigForUiAppModel.l;
                    String str2 = productConfigForUiAppModel.m;
                    if (Intrinsics.d(str, "mobileTicket") && (Intrinsics.d(str2, "ondcTicket") || Intrinsics.d(str2, "ondcMetroTicket"))) {
                        if (productConfigForUiAppModel.i && productConfigForUiAppModel.j) {
                            break;
                        }
                    }
                }
                ProductConfigForUiAppModel productConfigForUiAppModel2 = (ProductConfigForUiAppModel) next;
                if (productConfigForUiAppModel2 != null) {
                    Json json = ChaloJson.b;
                    OndcTicketConfiguration ondcTicketConfigurationA = FetchOndcConfigUseCaseKt.a(productConfigForUiAppModel2);
                    json.getClass();
                    String strA = json.a(OndcTicketConfiguration.INSTANCE.serializer(), ondcTicketConfigurationA);
                    ProductBookingDataStore productBookingDataStore = initiateProductHistorySyncCallUseCase.y;
                    initiateProductHistorySyncCallUseCase$processProductConfigFetch$1.label = 1;
                    if (productBookingDataStore.d(strA, initiateProductHistorySyncCallUseCase$processProductConfigFetch$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return Unit.f17538a;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
        }
        return Unit.f17538a;
    }

    public static final void b(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, List list, Source source) {
        String message;
        initiateProductHistorySyncCallUseCase.getClass();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((SectionResult) it.next()).b) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!((SectionResult) obj).b) {
                        arrayList.add(obj);
                    }
                }
                int iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    SectionResult sectionResult = (SectionResult) obj2;
                    String strM = vo1.m("section_", sectionResult.f10217a);
                    Throwable th = sectionResult.c;
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "unknown error";
                    }
                    Pair pair = new Pair(strM, message);
                    linkedHashMap.put(pair.d(), pair.e());
                }
                String message2 = "history-sync section failures=" + linkedHashMap;
                Intrinsics.i(message2, "message");
                AnalyticsContract.DefaultImpls.a(initiateProductHistorySyncCallUseCase.t, "History sync section status", source.getSourceName(), linkedHashMap, null, false, 24);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, String str, List list, Function1 function1, ContinuationImpl continuationImpl) throws Exception {
        InitiateProductHistorySyncCallUseCase$runSection$1 initiateProductHistorySyncCallUseCase$runSection$1;
        SectionResult sectionResult;
        initiateProductHistorySyncCallUseCase.getClass();
        if (continuationImpl instanceof InitiateProductHistorySyncCallUseCase$runSection$1) {
            initiateProductHistorySyncCallUseCase$runSection$1 = (InitiateProductHistorySyncCallUseCase$runSection$1) continuationImpl;
            int i = initiateProductHistorySyncCallUseCase$runSection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initiateProductHistorySyncCallUseCase$runSection$1.label = i - Integer.MIN_VALUE;
            } else {
                initiateProductHistorySyncCallUseCase$runSection$1 = new InitiateProductHistorySyncCallUseCase$runSection$1(initiateProductHistorySyncCallUseCase, continuationImpl);
            }
        } else {
            initiateProductHistorySyncCallUseCase$runSection$1 = new InitiateProductHistorySyncCallUseCase$runSection$1(initiateProductHistorySyncCallUseCase, continuationImpl);
        }
        Object obj = initiateProductHistorySyncCallUseCase$runSection$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initiateProductHistorySyncCallUseCase$runSection$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                initiateProductHistorySyncCallUseCase$runSection$1.L$0 = str;
                initiateProductHistorySyncCallUseCase$runSection$1.L$1 = list;
                initiateProductHistorySyncCallUseCase$runSection$1.label = 1;
                if (function1.invoke(initiateProductHistorySyncCallUseCase$runSection$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) initiateProductHistorySyncCallUseCase$runSection$1.L$1;
                str = (String) initiateProductHistorySyncCallUseCase$runSection$1.L$0;
                ResultKt.b(obj);
            }
            sectionResult = new SectionResult(str, true, null);
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            initiateProductHistorySyncCallUseCase.i.i(e);
            String message = "section " + str + " failed: " + e.getMessage();
            Intrinsics.i(message, "message");
            sectionResult = new SectionResult(str, false, e);
        }
        list.add(sectionResult);
        return sectionResult;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5 A[Catch: Exception -> 0x0079, TRY_ENTER, TryCatch #3 {Exception -> 0x0079, blocks: (B:33:0x0074, B:54:0x00c5, B:56:0x00ce), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb A[Catch: Exception -> 0x0069, TRY_ENTER, TryCatch #4 {Exception -> 0x0069, blocks: (B:28:0x0064, B:61:0x00eb, B:63:0x00f4), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111 A[Catch: Exception -> 0x0059, TRY_ENTER, TryCatch #5 {Exception -> 0x0059, blocks: (B:23:0x0054, B:68:0x0111, B:70:0x011a), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135 A[Catch: Exception -> 0x0049, TRY_ENTER, TryCatch #6 {Exception -> 0x0049, blocks: (B:18:0x0044, B:75:0x0135, B:77:0x013e, B:78:0x0149, B:80:0x014f, B:82:0x0159, B:85:0x015f, B:88:0x0169, B:89:0x016d), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f A[Catch: Exception -> 0x0049, TryCatch #6 {Exception -> 0x0049, blocks: (B:18:0x0044, B:75:0x0135, B:77:0x013e, B:78:0x0149, B:80:0x014f, B:82:0x0159, B:85:0x015f, B:88:0x0169, B:89:0x016d), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0159 A[Catch: Exception -> 0x0049, TryCatch #6 {Exception -> 0x0049, blocks: (B:18:0x0044, B:75:0x0135, B:77:0x013e, B:78:0x0149, B:80:0x014f, B:82:0x0159, B:85:0x015f, B:88:0x0169, B:89:0x016d), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f A[Catch: Exception -> 0x0049, TryCatch #6 {Exception -> 0x0049, blocks: (B:18:0x0044, B:75:0x0135, B:77:0x013e, B:78:0x0149, B:80:0x014f, B:82:0x0159, B:85:0x015f, B:88:0x0169, B:89:0x016d), top: B:109:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.functions.Function1, kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r2v0, types: [app.chalo.utils.MobileTicketingConverters] */
    /* JADX WARN: Type inference failed for: r5v13, types: [kotlinx.serialization.json.JsonArray] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object d(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, JsonArray jsonArray, String str, String str2, ContinuationImpl continuationImpl) {
        InitiateProductHistorySyncCallUseCase$updateMobileTicketData$1 initiateProductHistorySyncCallUseCase$updateMobileTicketData$1;
        ?? r12;
        ?? r11;
        ?? jsonArray2;
        ArrayList arrayListF;
        PremiumBusRepository premiumBusRepository;
        ?? r13;
        ?? r14;
        ?? jsonArray3;
        ArrayList arrayListE;
        ?? r15;
        ?? r16;
        ?? jsonArray4;
        ArrayList arrayList;
        JsonObject jsonObject;
        OndcMetroTicketAppModel ondcMetroTicketAppModelB;
        ?? jsonArray5;
        ?? r17;
        Exception e;
        ?? r10;
        ArrayList arrayListC;
        MetroRepository metroRepository;
        ?? r18;
        Function1 function1;
        ?? jsonArray6;
        ?? r19;
        Function1 function2;
        ?? jsonArray7;
        ArrayList arrayListB;
        InstantTicketRepository instantTicketRepository;
        Function1 function3;
        ?? r110;
        OndcRepository ondcRepository = initiateProductHistorySyncCallUseCase.q;
        CrashlyticsLogger crashlyticsLogger = initiateProductHistorySyncCallUseCase.i;
        ?? r2 = initiateProductHistorySyncCallUseCase.k;
        if (continuationImpl instanceof InitiateProductHistorySyncCallUseCase$updateMobileTicketData$1) {
            initiateProductHistorySyncCallUseCase$updateMobileTicketData$1 = (InitiateProductHistorySyncCallUseCase$updateMobileTicketData$1) continuationImpl;
            int i = initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = i - Integer.MIN_VALUE;
            } else {
                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1 = new InitiateProductHistorySyncCallUseCase$updateMobileTicketData$1(initiateProductHistorySyncCallUseCase, continuationImpl);
            }
        } else {
            initiateProductHistorySyncCallUseCase$updateMobileTicketData$1 = new InitiateProductHistorySyncCallUseCase$updateMobileTicketData$1(initiateProductHistorySyncCallUseCase, continuationImpl);
        }
        Object obj = initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            try {
                try {
                    try {
                        switch (initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label) {
                            case 0:
                                ResultKt.b(obj);
                                y80 y80Var = new y80(11);
                                if (jsonArray == 0) {
                                    try {
                                        jsonArray6 = new JsonArray(EmptyList.f17557a);
                                    } catch (Exception e2) {
                                        e = e2;
                                        r18 = jsonArray;
                                        function1 = y80Var;
                                        function1.invoke(e);
                                        crashlyticsLogger.i(e);
                                        function2 = function1;
                                        r19 = r18;
                                    }
                                } else {
                                    jsonArray6 = jsonArray;
                                }
                                ArrayList arrayListD = r2.d(jsonArray6);
                                MultiModalGroupTicketRepository multiModalGroupTicketRepository = initiateProductHistorySyncCallUseCase.s;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = jsonArray;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = y80Var;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 1;
                                r110 = jsonArray;
                                function3 = y80Var;
                                if (multiModalGroupTicketRepository.j(str, str2, arrayListD, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                r19 = r110;
                                function2 = function3;
                                if (r19 == 0) {
                                    jsonArray7 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray7 = r19;
                                }
                                arrayListB = r2.b(jsonArray7);
                                instantTicketRepository = initiateProductHistorySyncCallUseCase.o;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r19;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = function2;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 2;
                                r11 = function2;
                                r12 = r19;
                                if (instantTicketRepository.m(arrayListB, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r12 == 0) {
                                    jsonArray2 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray2 = r12;
                                }
                                arrayListF = r2.f(jsonArray2);
                                premiumBusRepository = initiateProductHistorySyncCallUseCase.p;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r12;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r11;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 3;
                                r14 = r11;
                                r13 = r12;
                                if (premiumBusRepository.I(arrayListF, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r13 == 0) {
                                    jsonArray3 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray3 = r13;
                                }
                                arrayListE = r2.e(jsonArray3);
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r13;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r14;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 4;
                                r16 = r14;
                                r15 = r13;
                                if (ondcRepository.n(arrayListE, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r15 == 0) {
                                    jsonArray4 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray4 = r15;
                                }
                                arrayList = new ArrayList();
                                for (JsonElement jsonElement : jsonArray4.f18186a) {
                                    if (jsonElement instanceof JsonObject) {
                                        jsonObject = (JsonObject) jsonElement;
                                    } else {
                                        jsonObject = null;
                                    }
                                    if (jsonObject != null) {
                                        ondcMetroTicketAppModelB = r2.c.b(jsonObject);
                                    } else {
                                        ondcMetroTicketAppModelB = null;
                                    }
                                    if (ondcMetroTicketAppModelB != null) {
                                        arrayList.add(ondcMetroTicketAppModelB);
                                    }
                                }
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r15;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r16;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 5;
                                r17 = r16;
                                jsonArray5 = r15;
                                if (ondcRepository.c(arrayList, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (jsonArray5 == 0) {
                                    try {
                                        jsonArray5 = new JsonArray(EmptyList.f17557a);
                                    } catch (Exception e3) {
                                        ?? r9 = r17;
                                        e = e3;
                                        r10 = r9;
                                        r10.invoke(e);
                                        crashlyticsLogger.i(e);
                                    }
                                }
                                arrayListC = r2.c(jsonArray5);
                                metroRepository = initiateProductHistorySyncCallUseCase.r;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r17;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = null;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 6;
                                if (metroRepository.c(arrayListC, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.f17538a;
                            case 1:
                                function1 = (Function1) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1;
                                r18 = (JsonArray) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0;
                                try {
                                    ResultKt.b(obj);
                                    function3 = function1;
                                    r110 = r18;
                                    r19 = r110;
                                    function2 = function3;
                                } catch (Exception e4) {
                                    e = e4;
                                    function1.invoke(e);
                                    crashlyticsLogger.i(e);
                                    function2 = function1;
                                    r19 = r18;
                                }
                                if (r19 == 0) {
                                    jsonArray7 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray7 = r19;
                                }
                                arrayListB = r2.b(jsonArray7);
                                instantTicketRepository = initiateProductHistorySyncCallUseCase.o;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r19;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = function2;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 2;
                                r11 = function2;
                                r12 = r19;
                                if (instantTicketRepository.m(arrayListB, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r12 == 0) {
                                    jsonArray2 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray2 = r12;
                                }
                                arrayListF = r2.f(jsonArray2);
                                premiumBusRepository = initiateProductHistorySyncCallUseCase.p;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r12;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r11;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 3;
                                r14 = r11;
                                r13 = r12;
                                if (premiumBusRepository.I(arrayListF, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r13 == 0) {
                                    jsonArray3 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray3 = r13;
                                }
                                arrayListE = r2.e(jsonArray3);
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r13;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r14;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 4;
                                r16 = r14;
                                r15 = r13;
                                if (ondcRepository.n(arrayListE, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r15 == 0) {
                                    jsonArray4 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray4 = r15;
                                }
                                arrayList = new ArrayList();
                                while (r13.hasNext()) {
                                    if (jsonElement instanceof JsonObject) {
                                        jsonObject = (JsonObject) jsonElement;
                                    } else {
                                        jsonObject = null;
                                    }
                                    if (jsonObject != null) {
                                        ondcMetroTicketAppModelB = r2.c.b(jsonObject);
                                    } else {
                                        ondcMetroTicketAppModelB = null;
                                    }
                                    if (ondcMetroTicketAppModelB != null) {
                                        arrayList.add(ondcMetroTicketAppModelB);
                                    }
                                }
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r15;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r16;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 5;
                                r17 = r16;
                                jsonArray5 = r15;
                                if (ondcRepository.c(arrayList, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (jsonArray5 == 0) {
                                    jsonArray5 = new JsonArray(EmptyList.f17557a);
                                }
                                arrayListC = r2.c(jsonArray5);
                                metroRepository = initiateProductHistorySyncCallUseCase.r;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r17;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = null;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 6;
                                if (metroRepository.c(arrayListC, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.f17538a;
                            case 2:
                                Function1 function4 = (Function1) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1;
                                JsonArray jsonArray8 = (JsonArray) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0;
                                ResultKt.b(obj);
                                r11 = function4;
                                r12 = jsonArray8;
                                if (r12 == 0) {
                                    jsonArray2 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray2 = r12;
                                }
                                arrayListF = r2.f(jsonArray2);
                                premiumBusRepository = initiateProductHistorySyncCallUseCase.p;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r12;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r11;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 3;
                                r14 = r11;
                                r13 = r12;
                                if (premiumBusRepository.I(arrayListF, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r13 == 0) {
                                    jsonArray3 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray3 = r13;
                                }
                                arrayListE = r2.e(jsonArray3);
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r13;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r14;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 4;
                                r16 = r14;
                                r15 = r13;
                                if (ondcRepository.n(arrayListE, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r15 == 0) {
                                    jsonArray4 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray4 = r15;
                                }
                                arrayList = new ArrayList();
                                while (r13.hasNext()) {
                                    if (jsonElement instanceof JsonObject) {
                                        jsonObject = (JsonObject) jsonElement;
                                    } else {
                                        jsonObject = null;
                                    }
                                    if (jsonObject != null) {
                                        ondcMetroTicketAppModelB = r2.c.b(jsonObject);
                                    } else {
                                        ondcMetroTicketAppModelB = null;
                                    }
                                    if (ondcMetroTicketAppModelB != null) {
                                        arrayList.add(ondcMetroTicketAppModelB);
                                    }
                                }
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r15;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r16;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 5;
                                r17 = r16;
                                jsonArray5 = r15;
                                if (ondcRepository.c(arrayList, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (jsonArray5 == 0) {
                                    jsonArray5 = new JsonArray(EmptyList.f17557a);
                                }
                                arrayListC = r2.c(jsonArray5);
                                metroRepository = initiateProductHistorySyncCallUseCase.r;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r17;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = null;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 6;
                                if (metroRepository.c(arrayListC, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.f17538a;
                            case 3:
                                Function1 function5 = (Function1) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1;
                                JsonArray jsonArray9 = (JsonArray) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0;
                                ResultKt.b(obj);
                                r14 = function5;
                                r13 = jsonArray9;
                                if (r13 == 0) {
                                    jsonArray3 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray3 = r13;
                                }
                                arrayListE = r2.e(jsonArray3);
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r13;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r14;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 4;
                                r16 = r14;
                                r15 = r13;
                                if (ondcRepository.n(arrayListE, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (r15 == 0) {
                                    jsonArray4 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray4 = r15;
                                }
                                arrayList = new ArrayList();
                                while (r13.hasNext()) {
                                    if (jsonElement instanceof JsonObject) {
                                        jsonObject = (JsonObject) jsonElement;
                                    } else {
                                        jsonObject = null;
                                    }
                                    if (jsonObject != null) {
                                        ondcMetroTicketAppModelB = r2.c.b(jsonObject);
                                    } else {
                                        ondcMetroTicketAppModelB = null;
                                    }
                                    if (ondcMetroTicketAppModelB != null) {
                                        arrayList.add(ondcMetroTicketAppModelB);
                                    }
                                }
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r15;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r16;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 5;
                                r17 = r16;
                                jsonArray5 = r15;
                                if (ondcRepository.c(arrayList, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (jsonArray5 == 0) {
                                    jsonArray5 = new JsonArray(EmptyList.f17557a);
                                }
                                arrayListC = r2.c(jsonArray5);
                                metroRepository = initiateProductHistorySyncCallUseCase.r;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r17;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = null;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 6;
                                if (metroRepository.c(arrayListC, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.f17538a;
                            case 4:
                                Function1 function6 = (Function1) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1;
                                JsonArray jsonArray10 = (JsonArray) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0;
                                ResultKt.b(obj);
                                r16 = function6;
                                r15 = jsonArray10;
                                if (r15 == 0) {
                                    jsonArray4 = new JsonArray(EmptyList.f17557a);
                                } else {
                                    jsonArray4 = r15;
                                }
                                arrayList = new ArrayList();
                                while (r13.hasNext()) {
                                    if (jsonElement instanceof JsonObject) {
                                        jsonObject = (JsonObject) jsonElement;
                                    } else {
                                        jsonObject = null;
                                    }
                                    if (jsonObject != null) {
                                        ondcMetroTicketAppModelB = r2.c.b(jsonObject);
                                    } else {
                                        ondcMetroTicketAppModelB = null;
                                    }
                                    if (ondcMetroTicketAppModelB != null) {
                                        arrayList.add(ondcMetroTicketAppModelB);
                                    }
                                }
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r15;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = r16;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 5;
                                r17 = r16;
                                jsonArray5 = r15;
                                if (ondcRepository.c(arrayList, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                if (jsonArray5 == 0) {
                                    jsonArray5 = new JsonArray(EmptyList.f17557a);
                                }
                                arrayListC = r2.c(jsonArray5);
                                metroRepository = initiateProductHistorySyncCallUseCase.r;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r17;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = null;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 6;
                                if (metroRepository.c(arrayListC, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.f17538a;
                            case 5:
                                Function1 function7 = (Function1) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1;
                                JsonArray jsonArray11 = (JsonArray) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0;
                                ResultKt.b(obj);
                                r17 = function7;
                                jsonArray5 = jsonArray11;
                                if (jsonArray5 == 0) {
                                    jsonArray5 = new JsonArray(EmptyList.f17557a);
                                }
                                arrayListC = r2.c(jsonArray5);
                                metroRepository = initiateProductHistorySyncCallUseCase.r;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0 = r17;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$1 = null;
                                initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.label = 6;
                                if (metroRepository.c(arrayListC, initiateProductHistorySyncCallUseCase$updateMobileTicketData$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return Unit.f17538a;
                            case 6:
                                r10 = (Function1) initiateProductHistorySyncCallUseCase$updateMobileTicketData$1.L$0;
                                try {
                                    ResultKt.b(obj);
                                    break;
                                } catch (Exception e5) {
                                    e = e5;
                                    r10.invoke(e);
                                    crashlyticsLogger.i(e);
                                }
                                return Unit.f17538a;
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Exception e6) {
                        jsonArray.invoke(e6);
                        crashlyticsLogger.i(e6);
                        r11 = jsonArray;
                        r12 = str;
                    }
                } catch (Exception e7) {
                    jsonArray.invoke(e7);
                    crashlyticsLogger.i(e7);
                    r14 = jsonArray;
                    r13 = str;
                }
            } catch (Exception e8) {
                jsonArray.invoke(e8);
                crashlyticsLogger.i(e8);
                r16 = jsonArray;
                r15 = str;
            }
        } catch (Exception e9) {
            jsonArray.invoke(e9);
            crashlyticsLogger.i(e9);
            r17 = jsonArray;
            jsonArray5 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object e(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, boolean z, String str, String str2, ContinuationImpl continuationImpl) {
        InitiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1 initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1;
        JsonException jsonException;
        Object objA;
        ReclaimDataStoreWrapper reclaimDataStoreWrapper = initiateProductHistorySyncCallUseCase.g;
        if (continuationImpl instanceof InitiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1) {
            initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1 = (InitiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1) continuationImpl;
            int i = initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1 = new InitiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1(initiateProductHistorySyncCallUseCase, continuationImpl);
            }
        } else {
            initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1 = new InitiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1(initiateProductHistorySyncCallUseCase, continuationImpl);
        }
        Object obj = initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (str != null) {
                    initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$0 = str;
                    initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$1 = str2;
                    initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.label = 1;
                    objA = reclaimDataStoreWrapper.a(z, str, str2, initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1);
                    if (objA == coroutineSingletons) {
                        initiateProductHistorySyncCallUseCase = objA;
                        return coroutineSingletons;
                    }
                }
                return Unit.f17538a;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsonException = (JsonException) initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$0;
                ResultKt.b(obj);
                jsonException.printStackTrace();
                return Unit.f17538a;
            }
            str2 = (String) initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$1;
            str = (String) initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$0;
            ResultKt.b(obj);
            initiateProductHistorySyncCallUseCase = initiateProductHistorySyncCallUseCase;
            initiateProductHistorySyncCallUseCase = objA;
        } catch (JsonException e) {
            initiateProductHistorySyncCallUseCase.i.i(e);
            initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$0 = e;
            initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.L$1 = null;
            initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1.label = 2;
            if (reclaimDataStoreWrapper.a(false, str, str2, initiateProductHistorySyncCallUseCase$updatePassReclaimProperties$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            jsonException = e;
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, JsonObject jsonObject, ContinuationImpl continuationImpl) throws Exception {
        InitiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1 initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1;
        initiateProductHistorySyncCallUseCase.getClass();
        if (continuationImpl instanceof InitiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1) {
            initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1 = (InitiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1) continuationImpl;
            int i = initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1.label = i - Integer.MIN_VALUE;
            } else {
                initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1 = new InitiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1(initiateProductHistorySyncCallUseCase, continuationImpl);
            }
        } else {
            initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1 = new InitiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1(initiateProductHistorySyncCallUseCase, continuationImpl);
        }
        Object obj = initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                List<ProductConfigDocumentPropsApiResponseModel> listK = initiateProductHistorySyncCallUseCase.k.k(jsonObject);
                if (!listK.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (ProductConfigDocumentPropsApiResponseModel productConfigDocumentPropsApiResponseModel : listK) {
                        String strA = ProductConfigCompleteDetailsListApiResponseModelKt.a(productConfigDocumentPropsApiResponseModel);
                        Pair pair = strA != null ? new Pair(strA, ProductConfigCompleteDetailsListApiResponseModelKt.b(productConfigDocumentPropsApiResponseModel)) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        LocalDataStore localDataStore = initiateProductHistorySyncCallUseCase.l;
                        initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1.label = 1;
                        if (localDataStore.i(arrayList, initiateProductHistorySyncCallUseCase$updateProofDocumentPropsStore$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            initiateProductHistorySyncCallUseCase.i.i(e);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:27:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0167  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x016c -> B:45:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x018f -> B:45:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0197 -> B:55:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01f0 -> B:76:0x01f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(app.chalo.usecase.InitiateProductHistorySyncCallUseCase r18, kotlinx.serialization.json.JsonArray r19, kotlinx.serialization.json.JsonArray r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.InitiateProductHistorySyncCallUseCase.g(app.chalo.usecase.InitiateProductHistorySyncCallUseCase, kotlinx.serialization.json.JsonArray, kotlinx.serialization.json.JsonArray, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object h(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, Source source, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            source = Source.PRODUCT_HISTORY_SYNC_USECASE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        initiateProductHistorySyncCallUseCase.getClass();
        return CoroutineScopeKt.c(new InitiateProductHistorySyncCallUseCase$invoke$2(initiateProductHistorySyncCallUseCase, z, source, null), continuationImpl);
    }
}
