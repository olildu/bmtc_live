package app.chalo.productpurchase.passpurchase.domain;

import androidx.autofill.HintConstants;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.BookingsRequestType;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.BookableSuperPassConfigurationKt;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.NotificationDisplayData;
import app.chalo.notification.models.SuperPassPunchEvent;
import app.chalo.productpurchase.utils.SuperPassNotificationHelper;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.ProfileRejectionReason;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.superpass.data.models.entities.RejectionStatus;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.userprofile.Gender;
import app.chalo.utils.UtilsKT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/PassPurchaseSceneResolverUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassPurchaseSceneResolverUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f8334a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/PassPurchaseSceneResolverUseCase$Companion;", "", "", "KEY_CITY", "Ljava/lang/String;", "KEY_CONFIG_ID", "KEY_CATEGORY_ID", "KEY_FARE_MAPPING_ID", "KEY_APPLICATION_STATUS", "KEY_PASS_START_DATE", "KEY_VERIFICATION_EXPIRY_TIME", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8335a;

        static {
            int[] iArr = new int[SuperPassApplicationStatus.values().length];
            try {
                iArr[SuperPassApplicationStatus.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassApplicationStatus.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassApplicationStatus.UNVERIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperPassApplicationStatus.PAYMENT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8335a = iArr;
        }
    }

    public PassPurchaseSceneResolverUseCase(SuperPassRepository superPassRepository, CityProvider cityProvider) {
        this.f8334a = superPassRepository;
        this.b = cityProvider;
    }

    public static SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification c(Source lSource, BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPassUserDetails lSuperPassUserDetails, long j, long j2) {
        Intrinsics.i(lSource, "lSource");
        Intrinsics.i(lSuperPassUserDetails, "lSuperPassUserDetails");
        BookableSuperPassConfiguration.INSTANCE.getClass();
        String strA = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
        SuperPassUserDetails.INSTANCE.getClass();
        return new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification(lSource, strA, SuperPassUserDetails.Companion.a(lSuperPassUserDetails), j, j2, PostPassPurchaseSuccessFlowType.ACTIVATION);
    }

    public static SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication e(Source lSource, BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPassUserDetails lSuperPassUserDetails, PassApplicationActionRequired lSuperPassApplicationActionRequired, PassApplicationRejectionReasons lPassApplicationRejectionReasons, long j) {
        Intrinsics.i(lSource, "lSource");
        Intrinsics.i(lSuperPassUserDetails, "lSuperPassUserDetails");
        Intrinsics.i(lSuperPassApplicationActionRequired, "lSuperPassApplicationActionRequired");
        Intrinsics.i(lPassApplicationRejectionReasons, "lPassApplicationRejectionReasons");
        BookableSuperPassConfiguration.INSTANCE.getClass();
        String strA = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
        SuperPassUserDetails.INSTANCE.getClass();
        String strA2 = SuperPassUserDetails.Companion.a(lSuperPassUserDetails);
        PassApplicationActionRequired.Companion companion = PassApplicationActionRequired.INSTANCE;
        companion.getClass();
        Json json = ChaloJson.b;
        json.getClass();
        String strA3 = json.a(companion.serializer(), lSuperPassApplicationActionRequired);
        PassApplicationRejectionReasons.Companion companion2 = PassApplicationRejectionReasons.INSTANCE;
        companion2.getClass();
        json.getClass();
        return new SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication(lSource, strA, strA2, strA3, json.a(companion2.serializer(), lPassApplicationRejectionReasons), j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    public final Object a(AppNotification.PassApplicationUpdate passApplicationUpdate, ContinuationImpl continuationImpl) throws JsonException {
        PassPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1 passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1;
        CityAppModel cityAppModel;
        JsonObject jsonObjectG;
        NotificationDisplayData notificationDisplayData;
        AppNotification.PassApplicationUpdate passApplicationUpdate2;
        String str;
        String str2;
        int i;
        JsonArray jsonArray;
        String str3;
        JsonObject jsonObject;
        int i2;
        if (continuationImpl instanceof PassPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1) {
            passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1 = (PassPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1) continuationImpl;
            int i3 = passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.label = i3 - Integer.MIN_VALUE;
            } else {
                passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1 = new PassPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1(this, continuationImpl);
            }
        } else {
            passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1 = new PassPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1(this, continuationImpl);
        }
        Object obj = passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            String str4 = null;
            NotificationDisplayData notificationDisplayData2 = new NotificationDisplayData(1, passApplicationUpdate, new HomeArgs((String) null, (String) null, 7));
            String str5 = passApplicationUpdate.c;
            if (str5 != null && str5.length() != 0) {
                str4 = str5;
            }
            if (str4 == null || (cityAppModel = (CityAppModel) this.b.getE().getValue()) == null) {
                return notificationDisplayData2;
            }
            jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str4));
            SuperPassNotificationHelper superPassNotificationHelper = SuperPassNotificationHelper.f8705a;
            passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.L$0 = passApplicationUpdate;
            passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.L$1 = notificationDisplayData2;
            passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.L$2 = jsonObjectG;
            passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.label = 1;
            Object objA = superPassNotificationHelper.a(jsonObjectG, cityAppModel, passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            notificationDisplayData = notificationDisplayData2;
            obj = objA;
            passApplicationUpdate2 = passApplicationUpdate;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            JsonObject jsonObject2 = (JsonObject) passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.L$2;
            notificationDisplayData = (NotificationDisplayData) passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.L$1;
            passApplicationUpdate2 = (AppNotification.PassApplicationUpdate) passPurchaseSceneResolverUseCase$fromPassApplicationUpdateNotification$1.L$0;
            ResultKt.b(obj);
            jsonObjectG = jsonObject2;
        }
        BookableSuperPassConfiguration bookableSuperPassConfiguration = (BookableSuperPassConfiguration) obj;
        if (bookableSuperPassConfiguration != null) {
            String str6 = "status";
            String strJ = JsonElementExtensionsKt.j(jsonObjectG, "status");
            Locale locale = Locale.ROOT;
            String upperCase = strJ.toUpperCase(locale);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            SuperPassApplicationStatus superPassApplicationStatusValueOf = SuperPassApplicationStatus.valueOf(upperCase);
            SuperPassNotificationHelper superPassNotificationHelper2 = SuperPassNotificationHelper.f8705a;
            JsonObject jsonObjectG2 = JsonElementExtensionsKt.g(jsonObjectG, "userDetails");
            String upperCase2 = JsonElementExtensionsKt.j(jsonObjectG2, HintConstants.AUTOFILL_HINT_GENDER).toUpperCase(locale);
            Intrinsics.h(upperCase2, "toUpperCase(...)");
            SuperPassUserDetails superPassUserDetails = new SuperPassUserDetails(JsonElementExtensionsKt.j(jsonObjectG2, "userId"), JsonElementExtensionsKt.j(jsonObjectG2, "mobileNo"), JsonElementExtensionsKt.j(jsonObjectG2, "userName"), Gender.valueOf(upperCase2), JsonElementExtensionsKt.j(jsonObjectG2, "dob"), JsonElementExtensionsKt.j(jsonObjectG2, "mailId"), JsonElementExtensionsKt.j(jsonObjectG2, "profilePhoto"), JsonElementExtensionsKt.q(jsonObjectG2, "dobInMillis", -1L));
            int i5 = WhenMappings.f8335a[superPassApplicationStatusValueOf.ordinal()];
            String str7 = "passStartDate";
            if (i5 == 1) {
                return new NotificationDisplayData(2, passApplicationUpdate2, c(Source.SOURCE_NOTIFICATION, bookableSuperPassConfiguration, superPassUserDetails, JsonElementExtensionsKt.q(jsonObjectG, "verificationExpiryTime", -1L), JsonElementExtensionsKt.h(jsonObjectG, "passStartDate")));
            }
            if (i5 == 2) {
                PassApplicationActionRequired passApplicationActionRequiredValueOf = PassApplicationActionRequired.valueOf(JsonElementExtensionsKt.j(jsonObjectG, "actionRequired"));
                JsonObject jsonObjectG3 = JsonElementExtensionsKt.g(jsonObjectG, "rejectionReasons");
                JsonArray jsonArrayO = JsonElementExtensionsKt.o(jsonObjectG3, "proofReasons");
                JsonArray jsonArrayO2 = JsonElementExtensionsKt.o(jsonObjectG3, "generalReasons");
                JsonArray jsonArrayO3 = JsonElementExtensionsKt.o(jsonObjectG3, "profileReasons");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String str8 = "";
                if (jsonArrayO != null) {
                    int size = jsonArrayO.f18186a.size();
                    int i6 = 0;
                    while (i6 < size) {
                        try {
                            JsonObject jsonObjectF = JsonElementExtensionsKt.f(jsonArrayO, i6);
                            i = i6;
                            try {
                                String strS = JsonElementExtensionsKt.s(jsonObjectF, "proofId", "");
                                jsonArray = jsonArrayO;
                                try {
                                    i2 = size;
                                    try {
                                        String upperCase3 = JsonElementExtensionsKt.s(jsonObjectF, "status", "VALID").toUpperCase(Locale.ROOT);
                                        Intrinsics.h(upperCase3, "toUpperCase(...)");
                                        String strS2 = JsonElementExtensionsKt.s(jsonObjectF, "proofUrl", "");
                                        ArrayList arrayList4 = new ArrayList();
                                        JsonArray jsonArrayO4 = JsonElementExtensionsKt.o(jsonObjectF, "reasons");
                                        if (jsonArrayO4 != null) {
                                            str3 = str7;
                                            try {
                                                int size2 = jsonArrayO4.f18186a.size();
                                                jsonObject = jsonObjectG;
                                                int i7 = 0;
                                                while (i7 < size2) {
                                                    int i8 = size2;
                                                    try {
                                                        arrayList4.add(JsonElementExtensionsKt.r(jsonArrayO4, i7));
                                                        i7++;
                                                        size2 = i8;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        e.printStackTrace();
                                                        ((CrashlyticsLogger) SuperPassNotificationHelper.d.getValue()).i(e);
                                                        i6 = i + 1;
                                                        jsonArrayO = jsonArray;
                                                        size = i2;
                                                        str7 = str3;
                                                        jsonObjectG = jsonObject;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                jsonObject = jsonObjectG;
                                                e.printStackTrace();
                                                ((CrashlyticsLogger) SuperPassNotificationHelper.d.getValue()).i(e);
                                                i6 = i + 1;
                                                jsonArrayO = jsonArray;
                                                size = i2;
                                                str7 = str3;
                                                jsonObjectG = jsonObject;
                                            }
                                        } else {
                                            str3 = str7;
                                            jsonObject = jsonObjectG;
                                        }
                                        arrayList.add(new ProofRejectionReason(RejectionStatus.valueOf(upperCase3), strS, strS2, arrayList4));
                                    } catch (Exception e3) {
                                        e = e3;
                                        str3 = str7;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str3 = str7;
                                    jsonObject = jsonObjectG;
                                    i2 = size;
                                    e.printStackTrace();
                                    ((CrashlyticsLogger) SuperPassNotificationHelper.d.getValue()).i(e);
                                    i6 = i + 1;
                                    jsonArrayO = jsonArray;
                                    size = i2;
                                    str7 = str3;
                                    jsonObjectG = jsonObject;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                jsonArray = jsonArrayO;
                                str3 = str7;
                                jsonObject = jsonObjectG;
                                i2 = size;
                                e.printStackTrace();
                                ((CrashlyticsLogger) SuperPassNotificationHelper.d.getValue()).i(e);
                                i6 = i + 1;
                                jsonArrayO = jsonArray;
                                size = i2;
                                str7 = str3;
                                jsonObjectG = jsonObject;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            i = i6;
                        }
                        i6 = i + 1;
                        jsonArrayO = jsonArray;
                        size = i2;
                        str7 = str3;
                        jsonObjectG = jsonObject;
                    }
                }
                String str9 = str7;
                JsonObject jsonObject3 = jsonObjectG;
                if (jsonArrayO3 != null) {
                    int size3 = jsonArrayO3.f18186a.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        try {
                            JsonObject jsonObjectF2 = JsonElementExtensionsKt.f(jsonArrayO3, i9);
                            String strS3 = JsonElementExtensionsKt.s(jsonObjectF2, "id", str8);
                            String upperCase4 = JsonElementExtensionsKt.s(jsonObjectF2, str6, "VALID").toUpperCase(Locale.ROOT);
                            Intrinsics.h(upperCase4, "toUpperCase(...)");
                            ArrayList arrayList5 = new ArrayList();
                            JsonArray jsonArrayO5 = JsonElementExtensionsKt.o(jsonObjectF2, "reasons");
                            if (jsonArrayO5 != null) {
                                str = str8;
                                try {
                                    int size4 = jsonArrayO5.f18186a.size();
                                    str2 = str6;
                                    int i10 = 0;
                                    while (i10 < size4) {
                                        int i11 = size4;
                                        try {
                                            arrayList5.add(JsonElementExtensionsKt.r(jsonArrayO5, i10));
                                            i10++;
                                            size4 = i11;
                                        } catch (Exception e7) {
                                            e = e7;
                                            e.printStackTrace();
                                            ((CrashlyticsLogger) SuperPassNotificationHelper.d.getValue()).i(e);
                                            i9++;
                                            str8 = str;
                                            str6 = str2;
                                        }
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    str2 = str6;
                                    e.printStackTrace();
                                    ((CrashlyticsLogger) SuperPassNotificationHelper.d.getValue()).i(e);
                                    i9++;
                                    str8 = str;
                                    str6 = str2;
                                }
                            } else {
                                str = str8;
                                str2 = str6;
                            }
                            arrayList2.add(new ProfileRejectionReason(RejectionStatus.valueOf(upperCase4), strS3, arrayList5));
                        } catch (Exception e9) {
                            e = e9;
                            str = str8;
                        }
                        i9++;
                        str8 = str;
                        str6 = str2;
                    }
                }
                if (jsonArrayO2 != null) {
                    int size5 = jsonArrayO2.f18186a.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        arrayList3.add(JsonElementExtensionsKt.r(jsonArrayO2, i12));
                    }
                }
                PassApplicationRejectionReasons passApplicationRejectionReasons = new PassApplicationRejectionReasons(arrayList, arrayList2, arrayList3);
                SuperPassNotificationHelper superPassNotificationHelper3 = SuperPassNotificationHelper.f8705a;
                return new NotificationDisplayData(3, passApplicationUpdate2, e(Source.SOURCE_NOTIFICATION, bookableSuperPassConfiguration, superPassUserDetails, passApplicationActionRequiredValueOf, passApplicationRejectionReasons, JsonElementExtensionsKt.h(jsonObject3, str9)));
            }
            if (i5 != 3 && i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return notificationDisplayData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(SuperPassPunchEvent superPassPunchEvent, ContinuationImpl continuationImpl) {
        PassPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1 passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1;
        SuperPassPunchEvent superPassPunchEvent2;
        JsonObject jsonObject;
        if (continuationImpl instanceof PassPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1) {
            passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1 = (PassPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1) continuationImpl;
            int i = passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1 = new PassPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1(this, continuationImpl);
            }
        } else {
            passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1 = new PassPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1(this, continuationImpl);
        }
        Object obj = passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str = superPassPunchEvent.c;
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str));
                String strJ = JsonElementExtensionsKt.j(jsonObjectG, "passId");
                UtilsKT utilsKT = UtilsKT.f10442a;
                passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.L$0 = superPassPunchEvent;
                passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.L$1 = jsonObjectG;
                passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.label = 1;
                Object objA = utilsKT.a(strJ, passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                superPassPunchEvent2 = superPassPunchEvent;
                jsonObject = jsonObjectG;
                obj = objA;
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jsonObject = (JsonObject) passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.L$1;
        superPassPunchEvent2 = (SuperPassPunchEvent) passPurchaseSceneResolverUseCase$fromSuperPassPunchNotification$1.L$0;
        ResultKt.b(obj);
        long jLongValue = ((Number) obj).longValue();
        SuperPassNotificationHelper superPassNotificationHelper = SuperPassNotificationHelper.f8705a;
        SuperPassTripReceipt superPassTripReceiptB = SuperPassNotificationHelper.b(jsonObject, jLongValue);
        if (superPassTripReceiptB != null) {
            return new NotificationDisplayData(4, superPassPunchEvent2, new TripSummaryArgs.TicketSummaryScreen(Source.NOTIFICATION, new BookingsRequestType.SuperPassRideType(superPassTripReceiptB.f9577a, jLongValue / ((long) 1000), superPassTripReceiptB.e)));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Source source, BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo, PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType, boolean z, ContinuationImpl continuationImpl) {
        PassPurchaseSceneResolverUseCase$purchaseFlow$1 passPurchaseSceneResolverUseCase$purchaseFlow$1;
        Source source2;
        boolean z2;
        if (continuationImpl instanceof PassPurchaseSceneResolverUseCase$purchaseFlow$1) {
            passPurchaseSceneResolverUseCase$purchaseFlow$1 = (PassPurchaseSceneResolverUseCase$purchaseFlow$1) continuationImpl;
            int i = passPurchaseSceneResolverUseCase$purchaseFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passPurchaseSceneResolverUseCase$purchaseFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                passPurchaseSceneResolverUseCase$purchaseFlow$1 = new PassPurchaseSceneResolverUseCase$purchaseFlow$1(this, continuationImpl);
            }
        } else {
            passPurchaseSceneResolverUseCase$purchaseFlow$1 = new PassPurchaseSceneResolverUseCase$purchaseFlow$1(this, continuationImpl);
        }
        Object obj = passPurchaseSceneResolverUseCase$purchaseFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passPurchaseSceneResolverUseCase$purchaseFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            boolean zB = BookableSuperPassConfigurationKt.b(bookableSuperPassConfiguration);
            passPurchaseSceneResolverUseCase$purchaseFlow$1.L$0 = source;
            passPurchaseSceneResolverUseCase$purchaseFlow$1.L$1 = bookableSuperPassConfiguration;
            passPurchaseSceneResolverUseCase$purchaseFlow$1.L$2 = superPassPurchaseStopsInfo;
            passPurchaseSceneResolverUseCase$purchaseFlow$1.L$3 = postPassPurchaseSuccessFlowType;
            passPurchaseSceneResolverUseCase$purchaseFlow$1.Z$0 = z;
            passPurchaseSceneResolverUseCase$purchaseFlow$1.Z$1 = zB;
            passPurchaseSceneResolverUseCase$purchaseFlow$1.label = 1;
            Serializable serializableI = this.f8334a.i(passPurchaseSceneResolverUseCase$purchaseFlow$1);
            if (serializableI == coroutineSingletons) {
                return coroutineSingletons;
            }
            source2 = source;
            z2 = zB;
            obj = serializableI;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = passPurchaseSceneResolverUseCase$purchaseFlow$1.Z$1;
            z = passPurchaseSceneResolverUseCase$purchaseFlow$1.Z$0;
            postPassPurchaseSuccessFlowType = (PostPassPurchaseSuccessFlowType) passPurchaseSceneResolverUseCase$purchaseFlow$1.L$3;
            superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) passPurchaseSceneResolverUseCase$purchaseFlow$1.L$2;
            bookableSuperPassConfiguration = (BookableSuperPassConfiguration) passPurchaseSceneResolverUseCase$purchaseFlow$1.L$1;
            Source source3 = (Source) passPurchaseSceneResolverUseCase$purchaseFlow$1.L$0;
            ResultKt.b(obj);
            source2 = source3;
        }
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = postPassPurchaseSuccessFlowType;
        boolean z3 = z;
        List list = (List) obj;
        String strA = null;
        if (list.isEmpty()) {
            if (z2) {
                BookableSuperPassConfiguration.INSTANCE.getClass();
                String strA2 = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
                if (superPassPurchaseStopsInfo != null) {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA = json.a(SuperPassPurchaseStopsInfo.INSTANCE.serializer(), superPassPurchaseStopsInfo);
                }
                return new SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof(source2, strA2, strA, postPassPurchaseSuccessFlowType2, z3);
            }
            BookableSuperPassConfiguration.INSTANCE.getClass();
            String strA3 = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
            if (superPassPurchaseStopsInfo != null) {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA = json2.a(SuperPassPurchaseStopsInfo.INSTANCE.serializer(), superPassPurchaseStopsInfo);
            }
            return new SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof(source2, strA3, strA, postPassPurchaseSuccessFlowType2, z3);
        }
        if (!z2) {
            BookableSuperPassConfiguration.INSTANCE.getClass();
            String strA4 = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
            if (superPassPurchaseStopsInfo != null) {
                Json json3 = ChaloJson.b;
                json3.getClass();
                strA = json3.a(SuperPassPurchaseStopsInfo.INSTANCE.serializer(), superPassPurchaseStopsInfo);
            }
            return new SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof(source2, strA4, strA, postPassPurchaseSuccessFlowType2, z3);
        }
        BookableSuperPassConfiguration.INSTANCE.getClass();
        String strA5 = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
        SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
        SuperPassUserDetails superPassUserDetails = (SuperPassUserDetails) list.get(0);
        companion.getClass();
        String strA6 = SuperPassUserDetails.Companion.a(superPassUserDetails);
        if (superPassPurchaseStopsInfo != null) {
            Json json4 = ChaloJson.b;
            json4.getClass();
            strA = json4.a(SuperPassPurchaseStopsInfo.INSTANCE.serializer(), superPassPurchaseStopsInfo);
        }
        return new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof(source2, strA5, strA6, strA, postPassPurchaseSuccessFlowType2, z3);
    }
}
