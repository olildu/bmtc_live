package app.chalo.mticket.ui.tripinfo;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.constants.Source;
import app.chalo.data.ProductBookingBranding;
import app.chalo.instantticket.ui.routeselection.RouteSelectionStopType;
import app.chalo.mticket.domain.CheckIfFreeRideAvailableUseCase;
import app.chalo.mticket.domain.FreeRideHelpUrlUseCase;
import app.chalo.mticket.ui.MTicketSjtConfigSelectorKt;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoRestoredState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoResultStateMeta;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetailsKt;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.domain.FetchFreeRideCountForUserUseCase;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.instantticket.InstantTicketResultState;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.ag0;
import defpackage.dd0;
import defpackage.tg0;
import defpackage.va;
import defpackage.xg0;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoDataState;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoUIState;", "Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketTripInfoComponent extends ChaloBaseStateMviComponent<MTicketTripInfoIntent, MTicketTripInfoDataState, MTicketTripInfoUIState, MTicketTripInfoEffect> {
    public final MTicketTripInfoRestoredState A;
    public final AnalyticsContract k;
    public final CheckIfFreeRideAvailableUseCase l;
    public final FetchFreeRideCountForUserUseCase m;
    public final ProductPurchaseRepository n;
    public final FetchProductConfigsUseCase o;
    public final StringProvider p;
    public final RouteSearchResultStateManager q;
    public final ChaloNavigationManager r;
    public final KotlinToastManager s;
    public final FreeRideHelpUrlUseCase t;
    public final SystemHelper u;
    public final MTicketTripInfoUIStateFactory v;
    public String w;
    public Boolean x;
    public Job y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoComponent$Companion;", "", "", "STATE_KEEPER_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MTicketTripInfoComponent(ComponentContext componentContext, TicketPurchaseArgs.MTicketTripInfoArgs mTicketTripInfoArgs, AnalyticsContract analyticsContract, CheckIfFreeRideAvailableUseCase checkIfFreeRideAvailableUseCase, FetchFreeRideCountForUserUseCase fetchFreeRideCountForUserUseCase, ProductPurchaseRepository productPurchaseRepository, FetchProductConfigsUseCase fetchProductConfigsUseCase, StringProvider stringProvider, RouteSearchResultStateManager routeSearchResultStateManager, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, FreeRideHelpUrlUseCase freeRideHelpUrlUseCase, SystemHelper systemHelper, MTicketTripInfoUIStateFactory mTicketTripInfoUIStateFactory) {
        Object objB;
        RouteAppModel routeAppModel;
        super(componentContext);
        this.k = analyticsContract;
        this.l = checkIfFreeRideAvailableUseCase;
        this.m = fetchFreeRideCountForUserUseCase;
        this.n = productPurchaseRepository;
        this.o = fetchProductConfigsUseCase;
        this.p = stringProvider;
        this.q = routeSearchResultStateManager;
        this.r = chaloNavigationManager;
        this.s = kotlinToastManager;
        this.t = freeRideHelpUrlUseCase;
        this.u = systemHelper;
        this.v = mTicketTripInfoUIStateFactory;
        this.z = true;
        StateKeeper b = componentContext.getB();
        MTicketTripInfoRestoredState.Companion companion = MTicketTripInfoRestoredState.INSTANCE;
        this.A = (MTicketTripInfoRestoredState) b.a("mticket_trip_info_statekeeper_key", companion.serializer());
        final int i = 0;
        componentContext.getB().d("mticket_trip_info_statekeeper_key", companion.serializer(), new Function0(this) { // from class: yg0
            public final /* synthetic */ MTicketTripInfoComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MTicketTripInfoDataState mTicketTripInfoDataState = (MTicketTripInfoDataState) this.b.f.getValue();
                        Intrinsics.i(mTicketTripInfoDataState, "<this>");
                        return new MTicketTripInfoRestoredState(mTicketTripInfoDataState.f5765a, mTicketTripInfoDataState.b, mTicketTripInfoDataState.c, mTicketTripInfoDataState.d);
                    default:
                        MTicketTripInfoComponent mTicketTripInfoComponent = this.b;
                        String str = mTicketTripInfoComponent.w;
                        if (str != null) {
                            return new MTicketTripInfoResultStateMeta(str, mTicketTripInfoComponent.x);
                        }
                        return null;
                }
            }
        });
        Source source = mTicketTripInfoArgs.c;
        String str = mTicketTripInfoArgs.d;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(RouteAppModel.INSTANCE.serializer()));
            } catch (Exception unused) {
                objB = null;
            }
            routeAppModel = (RouteAppModel) objB;
        } else {
            routeAppModel = null;
        }
        L0(new MTicketTripInfoIntent.InitialisationIntent(source, routeAppModel, mTicketTripInfoArgs.e));
        RouteSearchResultStateManager routeSearchResultStateManager2 = this.q;
        StateKeeper b2 = this.f5983a.getB();
        MTicketTripInfoResultStateMeta.Companion companion2 = MTicketTripInfoResultStateMeta.INSTANCE;
        KSerializer<MTicketTripInfoResultStateMeta> kSerializerSerializer = companion2.serializer();
        KSerializer<MTicketTripInfoResultStateMeta> kSerializerSerializer2 = companion2.serializer();
        final int i2 = 1;
        ResultStateRecoveredData resultStateRecoveredDataA = routeSearchResultStateManager2.a("MTicketTripInfo_SK_Key", b2, kSerializerSerializer, kSerializerSerializer2, new Function0(this) { // from class: yg0
            public final /* synthetic */ MTicketTripInfoComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MTicketTripInfoDataState mTicketTripInfoDataState = (MTicketTripInfoDataState) this.b.f.getValue();
                        Intrinsics.i(mTicketTripInfoDataState, "<this>");
                        return new MTicketTripInfoRestoredState(mTicketTripInfoDataState.f5765a, mTicketTripInfoDataState.b, mTicketTripInfoDataState.c, mTicketTripInfoDataState.d);
                    default:
                        MTicketTripInfoComponent mTicketTripInfoComponent = this.b;
                        String str2 = mTicketTripInfoComponent.w;
                        if (str2 != null) {
                            return new MTicketTripInfoResultStateMeta(str2, mTicketTripInfoComponent.x);
                        }
                        return null;
                }
            }
        });
        if (resultStateRecoveredDataA != null) {
            this.y = BuildersKt.d(this.j, null, null, new MTicketTripInfoComponent$3$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object F0(MTicketTripInfoComponent mTicketTripInfoComponent, ProductBookingRouteDetails productBookingRouteDetails, ContinuationImpl continuationImpl) {
        MTicketTripInfoComponent$fetchFreeRideValidityInfo$1 mTicketTripInfoComponent$fetchFreeRideValidityInfo$1;
        String str;
        Object objA;
        String str2;
        ChaloUseCaseResult chaloUseCaseResult;
        ProductBookingRouteDetails productBookingRouteDetails2;
        ProductBookingRouteDetails productBookingRouteDetails3;
        StateFlow stateFlow = mTicketTripInfoComponent.f;
        if (continuationImpl instanceof MTicketTripInfoComponent$fetchFreeRideValidityInfo$1) {
            mTicketTripInfoComponent$fetchFreeRideValidityInfo$1 = (MTicketTripInfoComponent$fetchFreeRideValidityInfo$1) continuationImpl;
            int i = mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketTripInfoComponent$fetchFreeRideValidityInfo$1 = new MTicketTripInfoComponent$fetchFreeRideValidityInfo$1(mTicketTripInfoComponent, continuationImpl);
            }
        } else {
            mTicketTripInfoComponent$fetchFreeRideValidityInfo$1 = new MTicketTripInfoComponent$fetchFreeRideValidityInfo$1(mTicketTripInfoComponent, continuationImpl);
        }
        Object obj = mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            str = productBookingRouteDetails.f8194a;
            CheckIfFreeRideAvailableUseCase checkIfFreeRideAvailableUseCase = mTicketTripInfoComponent.l;
            mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$0 = productBookingRouteDetails;
            mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$1 = str;
            mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.label = 1;
            objA = checkIfFreeRideAvailableUseCase.a(mTicketTripInfoComponent$fetchFreeRideValidityInfo$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str3 = (String) mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$1;
            ProductBookingRouteDetails productBookingRouteDetails4 = (ProductBookingRouteDetails) mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$0;
            ResultKt.b(obj);
            str = str3;
            productBookingRouteDetails = productBookingRouteDetails4;
            objA = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$0;
            ResultKt.b(obj);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            productBookingRouteDetails3 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
            if (Intrinsics.d(productBookingRouteDetails3 != null ? productBookingRouteDetails3.f8194a : null, str2)) {
                mTicketTripInfoComponent.E0(new va(((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue() > 0, 9));
                return unit;
            }
        } else {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            productBookingRouteDetails2 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
            if (Intrinsics.d(productBookingRouteDetails2 != null ? productBookingRouteDetails2.f8194a : null, str2)) {
                mTicketTripInfoComponent.E0(new xg0(3));
                return unit;
            }
        }
        return unit;
        if (!((Boolean) objA).booleanValue()) {
            mTicketTripInfoComponent.E0(new xg0(0));
            return unit;
        }
        if (!productBookingRouteDetails.f) {
            mTicketTripInfoComponent.E0(new xg0(1));
            return unit;
        }
        mTicketTripInfoComponent.E0(new xg0(2));
        FetchFreeRideCountForUserUseCase fetchFreeRideCountForUserUseCase = mTicketTripInfoComponent.m;
        String str4 = productBookingRouteDetails.c;
        mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$0 = str;
        mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.L$1 = null;
        mTicketTripInfoComponent$fetchFreeRideValidityInfo$1.label = 2;
        Object objA2 = fetchFreeRideCountForUserUseCase.a(str4, mTicketTripInfoComponent$fetchFreeRideValidityInfo$1);
        if (objA2 != coroutineSingletons) {
            String str5 = str;
            obj = objA2;
            str2 = str5;
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                productBookingRouteDetails3 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
                if (Intrinsics.d(productBookingRouteDetails3 != null ? productBookingRouteDetails3.f8194a : null, str2)) {
                    mTicketTripInfoComponent.E0(new va(((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue() > 0, 9));
                    return unit;
                }
            } else {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                productBookingRouteDetails2 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
                if (Intrinsics.d(productBookingRouteDetails2 != null ? productBookingRouteDetails2.f8194a : null, str2)) {
                    mTicketTripInfoComponent.E0(new xg0(3));
                    return unit;
                }
            }
            return unit;
        }
        return coroutineSingletons;
    }

    public static final void G0(MTicketTripInfoComponent mTicketTripInfoComponent, ResultStateData resultStateData, Boolean bool) {
        Object objB;
        Object objB2;
        mTicketTripInfoComponent.w = null;
        if (resultStateData instanceof ResultStateData.Cancelled) {
            return;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        InstantTicketResultState instantTicketResultState = (InstantTicketResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str = instantTicketResultState.f9056a;
        String str2 = instantTicketResultState.b;
        if (str != null && str.length() != 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB2 = json.b(str, ProductBookingRouteDetails.INSTANCE.serializer());
            } catch (Exception unused) {
                objB2 = null;
            }
            ProductBookingRouteDetails productBookingRouteDetails = (ProductBookingRouteDetails) objB2;
            if (productBookingRouteDetails != null) {
                mTicketTripInfoComponent.L0(new MTicketTripInfoIntent.RouteDataReceivedIntent(productBookingRouteDetails, false));
            }
        } else if (str2 != null && str2.length() != 0) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str2, ProductBookingStopDetails.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            ProductBookingStopDetails productBookingStopDetails = (ProductBookingStopDetails) objB;
            if (productBookingStopDetails != null && bool != null) {
                mTicketTripInfoComponent.L0(new MTicketTripInfoIntent.StopDataReceivedIntent(bool.booleanValue(), productBookingStopDetails, false));
            }
        }
        Job job = mTicketTripInfoComponent.y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        mTicketTripInfoComponent.y = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(MTicketTripInfoComponent mTicketTripInfoComponent, ProductBookingRouteDetails productBookingRouteDetails, ContinuationImpl continuationImpl) {
        MTicketTripInfoComponent$setPartnerInfo$1 mTicketTripInfoComponent$setPartnerInfo$1;
        mTicketTripInfoComponent.getClass();
        if (continuationImpl instanceof MTicketTripInfoComponent$setPartnerInfo$1) {
            mTicketTripInfoComponent$setPartnerInfo$1 = (MTicketTripInfoComponent$setPartnerInfo$1) continuationImpl;
            int i = mTicketTripInfoComponent$setPartnerInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketTripInfoComponent$setPartnerInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketTripInfoComponent$setPartnerInfo$1 = new MTicketTripInfoComponent$setPartnerInfo$1(mTicketTripInfoComponent, continuationImpl);
            }
        } else {
            mTicketTripInfoComponent$setPartnerInfo$1 = new MTicketTripInfoComponent$setPartnerInfo$1(mTicketTripInfoComponent, continuationImpl);
        }
        Object objK0 = mTicketTripInfoComponent$setPartnerInfo$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketTripInfoComponent$setPartnerInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objK0);
            String str = productBookingRouteDetails.c;
            mTicketTripInfoComponent$setPartnerInfo$1.label = 1;
            objK0 = mTicketTripInfoComponent.K0(str, mTicketTripInfoComponent$setPartnerInfo$1);
            if (objK0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK0);
        }
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) objK0;
        Unit unit = Unit.f17538a;
        if (singleJourneyTicketAppModel == null) {
            mTicketTripInfoComponent.E0(new xg0(9));
            return unit;
        }
        if (singleJourneyTicketAppModel.u.f3827a) {
            mTicketTripInfoComponent.E0(new tg0(singleJourneyTicketAppModel, 2));
            return unit;
        }
        mTicketTripInfoComponent.E0(new xg0(10));
        return unit;
    }

    public final void I0(String str, Boolean bool) {
        Job job = this.y;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.w = str;
        this.x = bool;
        this.y = BuildersKt.d(this.j, null, null, new MTicketTripInfoComponent$collectSearchResultState$1(this, str, bool, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        if (r11 == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(boolean r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent.J0(boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(String str, ContinuationImpl continuationImpl) {
        MTicketTripInfoComponent$getSJTConfigForAgency$1 mTicketTripInfoComponent$getSJTConfigForAgency$1;
        if (continuationImpl instanceof MTicketTripInfoComponent$getSJTConfigForAgency$1) {
            mTicketTripInfoComponent$getSJTConfigForAgency$1 = (MTicketTripInfoComponent$getSJTConfigForAgency$1) continuationImpl;
            int i = mTicketTripInfoComponent$getSJTConfigForAgency$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketTripInfoComponent$getSJTConfigForAgency$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketTripInfoComponent$getSJTConfigForAgency$1 = new MTicketTripInfoComponent$getSJTConfigForAgency$1(this, continuationImpl);
            }
        } else {
            mTicketTripInfoComponent$getSJTConfigForAgency$1 = new MTicketTripInfoComponent$getSJTConfigForAgency$1(this, continuationImpl);
        }
        Object objE = mTicketTripInfoComponent$getSJTConfigForAgency$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketTripInfoComponent$getSJTConfigForAgency$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            mTicketTripInfoComponent$getSJTConfigForAgency$1.L$0 = str;
            mTicketTripInfoComponent$getSJTConfigForAgency$1.label = 1;
            objE = this.n.e(mTicketTripInfoComponent$getSJTConfigForAgency$1);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) mTicketTripInfoComponent$getSJTConfigForAgency$1.L$0;
            ResultKt.b(objE);
        }
        List list = (List) objE;
        if (list != null) {
            return MTicketSjtConfigSelectorKt.a(str, list);
        }
        return null;
    }

    public final void L0(MTicketTripInfoIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof MTicketTripInfoIntent.InitialisationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleInitialisationIntent$1(this, (MTicketTripInfoIntent.InitialisationIntent) intent, null), 3);
            return;
        }
        if (intent.equals(MTicketTripInfoIntent.RetryFetchFreeRideValidityIntent.f5769a)) {
            BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleRetryFetchFreeRideValidityIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof MTicketTripInfoIntent.RetryFetchProductConfigurationIntent) {
            BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleRetryFetchProductConfigurationIntent$1(this, (MTicketTripInfoIntent.RetryFetchProductConfigurationIntent) intent, null), 3);
            return;
        }
        boolean zEquals = intent.equals(MTicketTripInfoIntent.RouteOptionClickedIntent.f5772a);
        int i = 6;
        ChaloNavigationManager chaloNavigationManager = this.r;
        if (zEquals) {
            String strA = KUUID.a();
            I0(strA, null);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PickRouteLocationArgs(strA, true, Source.MTICKET_BOOKING_SCREEN), null, null, 6));
            return;
        }
        boolean z2 = intent instanceof MTicketTripInfoIntent.RouteDataReceivedIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            MTicketTripInfoIntent.RouteDataReceivedIntent routeDataReceivedIntent = (MTicketTripInfoIntent.RouteDataReceivedIntent) intent;
            ProductBookingRouteDetails productBookingRouteDetails = routeDataReceivedIntent.f5771a;
            String str = productBookingRouteDetails.c;
            ProductBookingRouteDetails productBookingRouteDetails2 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
            E0(new dd0(routeDataReceivedIntent, 20));
            if (!Intrinsics.d(productBookingRouteDetails2 != null ? productBookingRouteDetails2.c : null, str)) {
                this.z = true;
                BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleRouteDataReceivedIntent$2(this, routeDataReceivedIntent, null), 3);
            }
            BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleRouteDataReceivedIntent$3(this, routeDataReceivedIntent, null), 3);
            if (routeDataReceivedIntent.b) {
                return;
            }
            String str2 = productBookingRouteDetails.f8194a;
            String str3 = productBookingRouteDetails.b;
            Source source = Source.MTICKET_BOOKING_SCREEN;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            AnalyticsContractImplKt.b(this.k, "mticket route selected", source, MapsKt.i(new Pair("agency", lowerCase), new Pair("routeId", str2), new Pair("routeName", str3)), false, 24);
            return;
        }
        if (intent instanceof MTicketTripInfoIntent.StopOptionClickedIntent) {
            boolean z3 = ((MTicketTripInfoIntent.StopOptionClickedIntent) intent).f5774a;
            ProductBookingRouteDetails productBookingRouteDetails3 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
            if (productBookingRouteDetails3 == null) {
                E0(new ag0(29));
                BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleStopOptionClickedIntent$2(this, null), 3);
                return;
            }
            RouteSelectionStopType routeSelectionStopType = z3 ? RouteSelectionStopType.FROM : RouteSelectionStopType.TO;
            ProductBookingStopDetails productBookingStopDetails = ((MTicketTripInfoDataState) stateFlow.getValue()).c;
            String str4 = productBookingStopDetails != null ? productBookingStopDetails.f8199a : null;
            ProductBookingStopDetails productBookingStopDetails2 = ((MTicketTripInfoDataState) stateFlow.getValue()).d;
            List listA = ProductBookingRouteDetailsKt.a(productBookingRouteDetails3, routeSelectionStopType, str4, productBookingStopDetails2 != null ? productBookingStopDetails2.f8199a : null);
            String strA2 = KUUID.a();
            I0(strA2, Boolean.valueOf(z3));
            Source source2 = Source.MTICKET_BOOKING_SCREEN;
            Json json = ChaloJson.b;
            json.getClass();
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PickStopArgs(source2, strA2, (ChaloTransitMode) null, json.a(new ArrayListSerializer(ProductBookingStopDetails.INSTANCE.serializer()), listA), 4), null, null, 6));
            return;
        }
        if (intent instanceof MTicketTripInfoIntent.StopDataReceivedIntent) {
            MTicketTripInfoIntent.StopDataReceivedIntent stopDataReceivedIntent = (MTicketTripInfoIntent.StopDataReceivedIntent) intent;
            E0(new dd0(stopDataReceivedIntent, 21));
            if (stopDataReceivedIntent.c) {
                return;
            }
            ProductBookingStopDetails productBookingStopDetails3 = stopDataReceivedIntent.b;
            AnalyticsContractImplKt.b(this.k, "mticket stop selected", Source.MTICKET_BOOKING_SCREEN, MapsKt.i(new Pair("stopType", stopDataReceivedIntent.f5773a ? "FROM" : "TO"), new Pair("stopId", productBookingStopDetails3.f8199a), new Pair("stopName", productBookingStopDetails3.b)), false, 24);
            return;
        }
        if (!intent.equals(MTicketTripInfoIntent.NextClickedIntent.f5768a)) {
            if (!intent.equals(MTicketTripInfoIntent.FreeRideBannerClickedIntent.f5766a)) {
                throw new NoWhenBranchMatchedException();
            }
            Boolean bool = ((MTicketTripInfoDataState) stateFlow.getValue()).h;
            if (bool != null) {
                if (bool.booleanValue()) {
                    AnalyticsContractImplKt.b(this.k, "free rides info clicked", Source.MTICKET_BOOKING_SCREEN, null, false, 20);
                    BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$1(this, null), 3);
                    return;
                } else {
                    AnalyticsContractImplKt.b(this.k, "invite", Source.MTICKET_BOOKING_SCREEN, null, false, 20);
                    BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$2(this, null), 3);
                    return;
                }
            }
            return;
        }
        ProductBookingRouteDetails productBookingRouteDetails4 = ((MTicketTripInfoDataState) stateFlow.getValue()).b;
        if (productBookingRouteDetails4 == null) {
            E0(new xg0(4));
            return;
        }
        ProductBookingStopDetails productBookingStopDetails4 = ((MTicketTripInfoDataState) stateFlow.getValue()).c;
        ProductBookingStopDetails productBookingStopDetails5 = ((MTicketTripInfoDataState) stateFlow.getValue()).d;
        if (productBookingStopDetails4 == null) {
            E0(new xg0(5));
        } else if (productBookingStopDetails5 == null) {
            E0(new xg0(i));
        } else {
            BuildersKt.d(contextScope, null, null, new MTicketTripInfoComponent$handleNextClickedIntent$4(this, productBookingRouteDetails4, productBookingStopDetails4, productBookingStopDetails5, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        MTicketTripInfoComponent$convertToUiState$2 mTicketTripInfoComponent$convertToUiState$2 = new MTicketTripInfoComponent$convertToUiState$2(1, this, MTicketTripInfoComponent.class, "processIntent", "processIntent(Lapp/chalo/mticket/ui/tripinfo/MTicketTripInfoIntent;)V", 0);
        return this.v.a((MTicketTripInfoDataState) obj, mTicketTripInfoComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new MTicketTripInfoDataState(null, null, null, null, null, false, ProductBookingBranding.None.INSTANCE, null, null);
    }
}
