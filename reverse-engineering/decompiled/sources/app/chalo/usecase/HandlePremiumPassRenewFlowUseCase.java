package app.chalo.usecase;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PassTierType;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/HandlePremiumPassRenewFlowUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandlePremiumPassRenewFlowUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchCompleteProductConfigByIdUseCase f10200a;
    public final StoreCompleteProductConfigLocallyUseCase b;
    public final ChaloNavigationManager c;
    public final ProductBookingNavigationManager d;
    public final BasicInfoContract e;
    public final KotlinToastManager f;
    public final StringProvider g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10201a;

        static {
            int[] iArr = new int[PassTierType.values().length];
            try {
                iArr[PassTierType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PassTierType.VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PassTierType.PREMIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PassTierType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f10201a = iArr;
        }
    }

    public HandlePremiumPassRenewFlowUseCase(FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, ChaloNavigationManager chaloNavigationManager, ProductBookingNavigationManager productBookingNavigationManager, BasicInfoContract basicInfoContract, KotlinToastManager kotlinToastManager, StringProvider stringProvider) {
        this.f10200a = fetchCompleteProductConfigByIdUseCase;
        this.b = storeCompleteProductConfigLocallyUseCase;
        this.c = chaloNavigationManager;
        this.d = productBookingNavigationManager;
        this.e = basicInfoContract;
        this.f = kotlinToastManager;
        this.g = stringProvider;
    }

    public static boolean d(SuperPassTripPreferences superPassTripPreferences) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        return (superPassTripPreferences == null || (str = superPassTripPreferences.f9575a) == null || str.length() == 0 || (str2 = superPassTripPreferences.b) == null || str2.length() == 0 || (str3 = superPassTripPreferences.d) == null || str3.length() == 0 || (str4 = superPassTripPreferences.c) == null || str4.length() == 0 || (str5 = superPassTripPreferences.e) == null || str5.length() == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:90:0x017e  */
    public final Object a(String str, SuperPassTripPreferences superPassTripPreferences, Source source, Function0 function0, ContinuationImpl continuationImpl) {
        HandlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1 handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1;
        SuperPassTripPreferences superPassTripPreferences2;
        Source source2;
        KotlinToastManager kotlinToastManager;
        ChaloUseCaseResult chaloUseCaseResult;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel;
        String str2;
        SuperPassTripPreferences superPassTripPreferences3;
        Function0 function1;
        String str3 = str;
        Function0 function2 = function0;
        if (continuationImpl instanceof HandlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1) {
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1 = (HandlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1) continuationImpl;
            int i = handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1.label = i - Integer.MIN_VALUE;
            } else {
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1 = new HandlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1(this, continuationImpl);
            }
        } else {
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1 = new HandlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1(this, continuationImpl);
        }
        HandlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1 handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2 = handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$1;
        Object objB = handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            String str4 = superPassTripPreferences != null ? superPassTripPreferences.b : null;
            String str5 = superPassTripPreferences != null ? superPassTripPreferences.d : null;
            if (str3.length() == 0) {
                KotlinToastManager kotlinToastManager2 = this.f;
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$0 = kotlinToastManager2;
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.label = 1;
                objB = this.g.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2);
                if (objB != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                    KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                    return unit;
                }
            } else {
                if (str4 == null || str4.length() == 0 || str5 == null || str5.length() == 0 || !d(superPassTripPreferences)) {
                    e(str3, source, function2);
                    return unit;
                }
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$0 = str3;
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$1 = superPassTripPreferences;
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$2 = source;
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$3 = function2;
                handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.label = 2;
                objB = FetchCompleteProductConfigByIdUseCase.b(this.f10200a, str3, str4, str5, handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2, 8);
                if (objB != coroutineSingletons) {
                    superPassTripPreferences2 = superPassTripPreferences;
                    source2 = source;
                    chaloUseCaseResult = (ChaloUseCaseResult) objB;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        e(str3, source2, function2);
                        return unit;
                    }
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    if (productConfigCompleteDetailsListAppModel.f8205a.p.size() > 0) {
                    }
                    e(str3, source2, function2);
                    return unit;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            kotlinToastManager = (KotlinToastManager) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$0;
            ResultKt.b(objB);
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return unit;
        }
        if (i2 == 2) {
            Function0 function3 = (Function0) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$3;
            source2 = (Source) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$2;
            superPassTripPreferences2 = (SuperPassTripPreferences) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$1;
            String str6 = (String) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$0;
            ResultKt.b(objB);
            function2 = function3;
            str3 = str6;
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                e(str3, source2, function2);
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            productConfigCompleteDetailsListAppModel = (ProductConfigCompleteDetailsListAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            if (productConfigCompleteDetailsListAppModel.f8205a.p.size() > 0 || !d(superPassTripPreferences2)) {
                e(str3, source2, function2);
                return unit;
            }
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$0 = str3;
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$1 = superPassTripPreferences2;
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$2 = function2;
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$3 = null;
            handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.label = 3;
            if (this.b.a(productConfigCompleteDetailsListAppModel, handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2) != coroutineSingletons) {
                str2 = str3;
                superPassTripPreferences3 = superPassTripPreferences2;
                function1 = function2;
            }
            return coroutineSingletons;
        }
        if (i2 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function0) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$2;
        superPassTripPreferences3 = (SuperPassTripPreferences) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$1;
        String str7 = (String) handlePremiumPassRenewFlowUseCase$handlePremiumPassTierBannerClick$2.L$0;
        ResultKt.b(objB);
        str2 = str7;
        String str8 = superPassTripPreferences3.f9575a;
        String str9 = superPassTripPreferences3.b;
        String str10 = superPassTripPreferences3.c;
        String str11 = superPassTripPreferences3.d;
        String str12 = superPassTripPreferences3.e;
        if (function1 != null) {
            function1.invoke();
        }
        if (str8 != null && str8.length() != 0 && str9 != null && str9.length() != 0 && str10 != null && str10.length() != 0 && str11 != null && str11.length() != 0 && str12 != null && str12.length() != 0) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel = new PBOriginDestinationAppModel(CollectionsKt.R(str8), null, str9, str10, null, null, null, str11, str12, null, null, null, 32370);
            Source source3 = Source.PB_PASS_PURCHASE_LANDING_SCREEN;
            this.d.a(source3, str2, pBOriginDestinationAppModel, source3, str8, false);
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, SuperPassTripPreferences superPassTripPreferences, Source source, Function0 function0, ContinuationImpl continuationImpl) {
        HandlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1 handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1;
        KotlinToastManager kotlinToastManager;
        if (continuationImpl instanceof HandlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1) {
            handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1 = (HandlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1) continuationImpl;
            int i = handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.label = i - Integer.MIN_VALUE;
            } else {
                handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1 = new HandlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1(this, continuationImpl);
            }
        } else {
            handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1 = new HandlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1(this, continuationImpl);
        }
        Object objB = handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (superPassTripPreferences != null && d(superPassTripPreferences)) {
                handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.label = 1;
                if (f(superPassTripPreferences, function0, handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1) != obj) {
                    return unit;
                }
            } else {
                if (str.length() > 0) {
                    e(str, source, function0);
                    return unit;
                }
                KotlinToastManager kotlinToastManager2 = this.f;
                handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.L$0 = kotlinToastManager2;
                handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.label = 2;
                objB = this.g.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1);
                if (objB != obj) {
                    kotlinToastManager = kotlinToastManager2;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
            return unit;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) handlePremiumPassRenewFlowUseCase$handleRegularAndValuePassTierBannerClick$1.L$0;
        ResultKt.b(objB);
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return unit;
    }

    public final Object c(PassTierType passTierType, String str, SuperPassTripPreferences superPassTripPreferences, Source source, Function0 function0, SuspendLambda suspendLambda) {
        int i = WhenMappings.f10201a[passTierType.ordinal()];
        Unit unit = Unit.f17538a;
        if (i == 1 || i == 2) {
            Object objB = b(str, superPassTripPreferences, source, function0, suspendLambda);
            if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objB;
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                function0.invoke();
                return unit;
            }
            Object objA = a(str, superPassTripPreferences, source, function0, suspendLambda);
            if (objA == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objA;
            }
        }
        return unit;
    }

    public final void e(String str, Source source, Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        this.c.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.PremiumBusPassLandingScreenArgs(new PassLandingFlowType.WithConfigId(str), source, (String) null, 8), null, null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(SuperPassTripPreferences superPassTripPreferences, Function0 function0, ContinuationImpl continuationImpl) {
        HandlePremiumPassRenewFlowUseCase$navigateToProductSelection$1 handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1;
        String str;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        String str2;
        String str3;
        String str4;
        String str5;
        PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase;
        String strA;
        String strA2;
        if (continuationImpl instanceof HandlePremiumPassRenewFlowUseCase$navigateToProductSelection$1) {
            handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1 = (HandlePremiumPassRenewFlowUseCase$navigateToProductSelection$1) continuationImpl;
            int i = handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.label = i - Integer.MIN_VALUE;
            } else {
                handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1 = new HandlePremiumPassRenewFlowUseCase$navigateToProductSelection$1(this, continuationImpl);
            }
        } else {
            handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1 = new HandlePremiumPassRenewFlowUseCase$navigateToProductSelection$1(this, continuationImpl);
        }
        Object objC = handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.label;
        Unit unit = Unit.f17538a;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                String str6 = superPassTripPreferences.b;
                String str7 = superPassTripPreferences.c;
                String str8 = superPassTripPreferences.d;
                String str9 = superPassTripPreferences.e;
                str = superPassTripPreferences.f9575a;
                if (function0 != null) {
                    function0.invoke();
                }
                if (str6 != null && str6.length() != 0 && str7 != null && str7.length() != 0 && str8 != null && str8.length() != 0 && str9 != null && str9.length() != 0 && str != null && str.length() != 0) {
                    PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = new PBStopPlaceSelectedAppModel(str6, "searchPartnerChaloStop", str7, null, null, premiumBusSelectedLocationType);
                    PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = new PBStopPlaceSelectedAppModel(str8, "searchPartnerChaloStop", str9, null, null, premiumBusSelectedLocationType);
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$0 = str6;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$1 = str7;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$2 = str8;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$3 = str9;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$4 = str;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$5 = pBStopPlaceSelectedAppModel3;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$6 = pBStopPlaceSelectedAppModel4;
                    handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.label = 1;
                    objC = this.e.c(handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1);
                    if (objC == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel3;
                    pBStopPlaceSelectedAppModel2 = pBStopPlaceSelectedAppModel4;
                    str2 = str8;
                    str3 = str9;
                    str4 = str7;
                    str5 = str6;
                }
                return unit;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pBStopPlaceSelectedAppModel2 = (PBStopPlaceSelectedAppModel) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$6;
            pBStopPlaceSelectedAppModel = (PBStopPlaceSelectedAppModel) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$5;
            str = (String) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$4;
            String str10 = (String) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$3;
            String str11 = (String) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$2;
            String str12 = (String) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$1;
            String str13 = (String) handlePremiumPassRenewFlowUseCase$navigateToProductSelection$1.L$0;
            ResultKt.b(objC);
            str5 = str13;
            str3 = str10;
            str2 = str11;
            str4 = str12;
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(PremiumBusProductPurchaseFlowType.INSTANCE.serializer(), freshPurchase);
        } catch (Exception unused) {
            strA = null;
        }
        freshPurchase = new PremiumBusProductPurchaseFlowType.FreshPurchase(pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, ((Number) objC).longValue());
        if (strA != null) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel = new PBOriginDestinationAppModel(CollectionsKt.R(str), null, str5, str4, null, null, null, str2, str3, null, null, null, 32370);
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA2 = json2.a(PBOriginDestinationAppModel.INSTANCE.serializer(), pBOriginDestinationAppModel);
            } catch (Exception unused2) {
                strA2 = null;
            }
            this.c.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.PremiumProductSelectionArgs(strA, strA2, new PremiumBusProductSelectionConfig(true, 5), (String) null, 8), null, null, 6));
        }
        return unit;
    }
}
