package app.chalo.productpurchase.utils;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/utils/SuperPassNotificationHelper;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassNotificationHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassNotificationHelper f8705a;
    public static final Object b;
    public static final Object c;
    public static final Object d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SuperPassApplicationStatus.values().length];
            try {
                iArr[SuperPassApplicationStatus.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassApplicationStatus.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        final SuperPassNotificationHelper superPassNotificationHelper = new SuperPassNotificationHelper();
        f8705a = superPassNotificationHelper;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        b = LazyKt.a(lazyThreadSafetyMode, new Function0<ProductPurchaseRepository>() { // from class: app.chalo.productpurchase.utils.SuperPassNotificationHelper$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f8706a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(ProductPurchaseRepository.class), null, null);
            }
        });
        c = LazyKt.a(lazyThreadSafetyMode, new Function0<BookingHelper>() { // from class: app.chalo.productpurchase.utils.SuperPassNotificationHelper$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f8707a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BookingHelper.class), null, null);
            }
        });
        d = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.productpurchase.utils.SuperPassNotificationHelper$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f8708a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
    }

    public static SuperPassTripReceipt b(JsonElement jsonElement, long j) {
        List list;
        Object objB;
        if (jsonElement != null) {
            JsonObject jsonObjectG = JsonElementKt.g(jsonElement);
            long jQ = JsonElementExtensionsKt.q(jsonObjectG, "punchTime", -1L);
            if (jQ >= j) {
                if (JsonElementExtensionsKt.l("specialFeatures", jsonElement)) {
                    ChaloJson chaloJson = ChaloJson.f6455a;
                    String string = JsonElementExtensionsKt.d(jsonObjectG, "specialFeatures").toString();
                    try {
                        Json json = ChaloJson.b;
                        json.getClass();
                        objB = json.b(string, new ArrayListSerializer(StringSerializer.f18170a));
                    } catch (Exception unused) {
                        objB = null;
                    }
                    list = (List) objB;
                    if (list == null) {
                        list = EmptyList.f17557a;
                    }
                } else {
                    list = EmptyList.f17557a;
                }
                List list2 = list;
                String strJ = JsonElementExtensionsKt.j(jsonObjectG, "productType");
                String strJ2 = JsonElementExtensionsKt.j(jsonObjectG, "productSubType");
                if (Intrinsics.d(strJ, "superPass") && (Intrinsics.d(strJ2, "magicPass") || Intrinsics.d(strJ2, "rideBasedPass"))) {
                    String strJ3 = JsonElementExtensionsKt.j(jsonObjectG, "passId");
                    String strJ4 = JsonElementExtensionsKt.j(jsonObjectG, "productType");
                    String strJ5 = JsonElementExtensionsKt.j(jsonObjectG, "productSubType");
                    String strS = JsonElementExtensionsKt.s(jsonObjectG, "vehicleNo", "");
                    String strS2 = JsonElementExtensionsKt.s(jsonObjectG, "conductorId", "");
                    String strS3 = JsonElementExtensionsKt.s(jsonObjectG, "startStop", "");
                    String strS4 = JsonElementExtensionsKt.s(jsonObjectG, "endStop", "");
                    String strS5 = JsonElementExtensionsKt.s(jsonObjectG, "routeName", "");
                    String strS6 = JsonElementExtensionsKt.s(jsonObjectG, "via", "");
                    RouteNamingSchemeType.Companion companion = RouteNamingSchemeType.INSTANCE;
                    String strS7 = JsonElementExtensionsKt.s(jsonObjectG, "routeNamingScheme", "");
                    companion.getClass();
                    return new SuperPassTripReceipt(strJ3, strJ4, strJ5, j, jQ, strS, strS2, strS3, strS4, strS5, list2, strS6, RouteNamingSchemeType.Companion.a(strS7));
                }
            }
        }
        return null;
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final Object a(JsonObject jsonObject, CityAppModel cityAppModel, ContinuationImpl continuationImpl) {
        SuperPassNotificationHelper$getBookablePassConfigFromPayload$1 superPassNotificationHelper$getBookablePassConfigFromPayload$1;
        int iC;
        String str;
        if (continuationImpl instanceof SuperPassNotificationHelper$getBookablePassConfigFromPayload$1) {
            superPassNotificationHelper$getBookablePassConfigFromPayload$1 = (SuperPassNotificationHelper$getBookablePassConfigFromPayload$1) continuationImpl;
            int i = superPassNotificationHelper$getBookablePassConfigFromPayload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassNotificationHelper$getBookablePassConfigFromPayload$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassNotificationHelper$getBookablePassConfigFromPayload$1 = new SuperPassNotificationHelper$getBookablePassConfigFromPayload$1(this, continuationImpl);
            }
        } else {
            superPassNotificationHelper$getBookablePassConfigFromPayload$1 = new SuperPassNotificationHelper$getBookablePassConfigFromPayload$1(this, continuationImpl);
        }
        Object obj = superPassNotificationHelper$getBookablePassConfigFromPayload$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassNotificationHelper$getBookablePassConfigFromPayload$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                if (StringsKt.x(JsonElementExtensionsKt.j(jsonObject, "city"), cityAppModel.f8854a, true)) {
                    String strJ = JsonElementExtensionsKt.j(jsonObject, "configId");
                    String strJ2 = JsonElementExtensionsKt.j(jsonObject, "categoryId");
                    iC = JsonElementExtensionsKt.c(jsonObject, "fmId");
                    ProductPurchaseRepository productPurchaseRepository = (ProductPurchaseRepository) b.getValue();
                    superPassNotificationHelper$getBookablePassConfigFromPayload$1.L$0 = strJ2;
                    superPassNotificationHelper$getBookablePassConfigFromPayload$1.I$0 = iC;
                    superPassNotificationHelper$getBookablePassConfigFromPayload$1.label = 1;
                    Object objH = productPurchaseRepository.h(strJ, superPassNotificationHelper$getBookablePassConfigFromPayload$1);
                    if (objH == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = objH;
                    str = strJ2;
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iC = superPassNotificationHelper$getBookablePassConfigFromPayload$1.I$0;
            str = (String) superPassNotificationHelper$getBookablePassConfigFromPayload$1.L$0;
            ResultKt.b(obj);
            ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = obj instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel ? (ProductConfigResponseAppModel.SuperPassConfigAppModel) obj : null;
            if (superPassConfigAppModel != null) {
                ?? r0 = c;
                ((BookingHelper) r0.getValue()).getClass();
                HashMap mapC = BookingHelper.c(superPassConfigAppModel);
                ((BookingHelper) r0.getValue()).getClass();
                Map map = (Map) BookingHelper.b(null, mapC).get(str);
                if (map != null && !map.isEmpty()) {
                    return map.get(new Integer(iC));
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
