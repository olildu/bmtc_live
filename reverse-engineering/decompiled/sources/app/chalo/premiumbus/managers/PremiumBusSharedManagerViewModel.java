package app.chalo.premiumbus.managers;

import app.chalo.constants.Source;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusJourneyEntry;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.ui.productselection.PBProductConfigAppModel;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsNavAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.kn0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/managers/PremiumBusSharedManagerViewModel;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/managers/PremiumBusSharedIntent;", "Lapp/chalo/premiumbus/managers/PremiumBusSharedState;", "Lapp/chalo/premiumbus/managers/PremiumBusSharedEffect;", "Lapp/chalo/premiumbus/managers/PremiumBusBookingNavigationHelper;", "Lapp/chalo/premiumbus/managers/PremiumBusPurchaseInfoManager;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSharedManagerViewModel extends ChaloBaseStateMviComponent<PremiumBusSharedIntent, PremiumBusSharedState, PremiumBusSharedState, PremiumBusSharedEffect> implements PremiumBusBookingNavigationHelper, PremiumBusPurchaseInfoManager {
    public final ComponentContext k;
    public PremiumBusProductPurchaseFlowType l;
    public final String m;
    public final PBProductConfigAppModel n;
    public ProductConfigCompleteDetailsListAppModel o;
    public PBOriginDestinationAppModel p;
    public PBAvailableSlotsTripAppModel q;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/managers/PremiumBusSharedManagerViewModel$Companion;", "", "", "RIDE_BASED_PASS_SUB_TYPE", "Ljava/lang/String;", "MAGIC_SUPER_PASS_SUB_TYPE", "PREMIUM_BUS_STATE_KEEPER_KEY", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7275a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PremiumBusBookingSteps.values().length];
            try {
                iArr[PremiumBusBookingSteps.PRODUCT_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusBookingSteps.STOP_SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusBookingSteps.SLOT_SELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusBookingSteps.PASS_PLAN_SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumBusBookingSteps.FARE_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumBusBookingSteps.CHECKOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PremiumBusBookingSteps.SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PremiumBusBookingSteps.BOOKING_TYPE_SELECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PremiumBusBookingSteps.HAILING_FLOW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f7275a = iArr;
            int[] iArr2 = new int[SuperPassSubTypes.values().length];
            try {
                iArr2[SuperPassSubTypes.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SuperPassSubTypes.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SuperPassSubTypes.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            b = iArr2;
        }
    }

    public PremiumBusSharedManagerViewModel(PremiumBusArgs premiumBusArgs, ComponentContext componentContext, ChaloNavigationManager chaloNavigationManager) {
        Pair pairG0;
        Object objB;
        super(componentContext);
        this.k = componentContext;
        StateKeeper b = componentContext.getB();
        PremiumBusSharedRestoredState.Companion companion = PremiumBusSharedRestoredState.INSTANCE;
        PremiumBusSharedRestoredState premiumBusSharedRestoredState = (PremiumBusSharedRestoredState) b.a("PREMIUM_BUS_RESTORED_STATE", companion.serializer());
        componentContext.getB().d("PREMIUM_BUS_RESTORED_STATE", companion.serializer(), new kn0(this, 28));
        if (premiumBusSharedRestoredState != null) {
            PremiumBusPurchaseInfoState premiumBusPurchaseInfoState = premiumBusSharedRestoredState.f7276a;
            if (premiumBusPurchaseInfoState != null) {
                this.n = premiumBusPurchaseInfoState.f7273a;
                this.p = premiumBusPurchaseInfoState.b;
                this.q = premiumBusPurchaseInfoState.c;
            }
            PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = premiumBusSharedRestoredState.b;
            if (premiumBusProductPurchaseFlowType != null) {
                X(premiumBusProductPurchaseFlowType);
            }
            ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = premiumBusSharedRestoredState.c;
            if (productConfigCompleteDetailsListAppModel != null) {
                this.o = productConfigCompleteDetailsListAppModel;
            }
        }
        boolean z = premiumBusArgs instanceof PremiumBusArgs.StopSelectionArgs;
        PBOriginDestinationAppModel pBOriginDestinationAppModel = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        if (z) {
            PremiumBusArgs.StopSelectionArgs stopSelectionArgs = (PremiumBusArgs.StopSelectionArgs) premiumBusArgs;
            pairG0 = G0(stopSelectionArgs.f, stopSelectionArgs.g);
        } else if (premiumBusArgs instanceof PremiumBusArgs.SlotSelectionArgs) {
            PremiumBusArgs.SlotSelectionArgs slotSelectionArgs = (PremiumBusArgs.SlotSelectionArgs) premiumBusArgs;
            pairG0 = G0(slotSelectionArgs.c, slotSelectionArgs.e);
        } else if (premiumBusArgs instanceof PremiumBusArgs.PremiumProductSelectionArgs) {
            pairG0 = G0(null, ((PremiumBusArgs.PremiumProductSelectionArgs) premiumBusArgs).f);
        } else if (premiumBusArgs instanceof PremiumBusArgs.PremiumStopDetailsArgs) {
            pairG0 = G0(null, ((PremiumBusArgs.PremiumStopDetailsArgs) premiumBusArgs).g);
        } else if (premiumBusArgs instanceof PremiumBusArgs.PremiumBusPassLandingScreenArgs) {
            PremiumBusArgs.PremiumBusPassLandingScreenArgs premiumBusPassLandingScreenArgs = (PremiumBusArgs.PremiumBusPassLandingScreenArgs) premiumBusArgs;
            pairG0 = G0(premiumBusPassLandingScreenArgs.d, premiumBusPassLandingScreenArgs.f);
        } else if (premiumBusArgs instanceof PremiumBusArgs.PremiumBusSeatSelectionArgs) {
            PremiumBusArgs.PremiumBusSeatSelectionArgs premiumBusSeatSelectionArgs = (PremiumBusArgs.PremiumBusSeatSelectionArgs) premiumBusArgs;
            pairG0 = G0(premiumBusSeatSelectionArgs.c, premiumBusSeatSelectionArgs.f);
        } else {
            if (!(premiumBusArgs instanceof PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs) && !(premiumBusArgs instanceof PremiumBusArgs.PremiumBusSlotListScreenArgs)) {
                throw new NoWhenBranchMatchedException();
            }
            Pair pair = new Pair(Boolean.FALSE, null);
            pairG0 = pair;
        }
        ((Boolean) pairG0.getFirst()).booleanValue();
        String str = (String) pairG0.getSecond();
        this.m = (str == null || StringsKt.F(str)) ? null : str;
        if (premiumBusArgs instanceof PremiumBusArgs.SlotSelectionArgs) {
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str2 = ((PremiumBusArgs.SlotSelectionArgs) premiumBusArgs).d;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB4 = json.b(str2, PremiumBusProductPurchaseFlowType.INSTANCE.serializer());
            } catch (Exception unused) {
            }
            if (((PremiumBusProductPurchaseFlowType) objB4) != null) {
                return;
            }
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (z) {
            return;
        }
        if (premiumBusArgs instanceof PremiumBusArgs.PremiumStopDetailsArgs) {
            PremiumBusArgs.PremiumStopDetailsArgs premiumStopDetailsArgs = (PremiumBusArgs.PremiumStopDetailsArgs) premiumBusArgs;
            new PBStopDetailsNavAppModel(premiumStopDetailsArgs.d, premiumStopDetailsArgs.e, premiumStopDetailsArgs.c);
            return;
        }
        if (!(premiumBusArgs instanceof PremiumBusArgs.PremiumProductSelectionArgs)) {
            if (premiumBusArgs instanceof PremiumBusArgs.PremiumBusPassLandingScreenArgs) {
                PremiumBusArgs.PremiumBusPassLandingScreenArgs premiumBusPassLandingScreenArgs2 = (PremiumBusArgs.PremiumBusPassLandingScreenArgs) premiumBusArgs;
                new PremiumBusJourneyEntry.NavigateToPassPurchaseLandingScreen(premiumBusPassLandingScreenArgs2.c, premiumBusPassLandingScreenArgs2.d, premiumBusPassLandingScreenArgs2.e, this.m);
                return;
            }
            if (!(premiumBusArgs instanceof PremiumBusArgs.PremiumBusSeatSelectionArgs)) {
                if (premiumBusArgs instanceof PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs) {
                    ChaloNavigationManagerKt.c(chaloNavigationManager);
                    return;
                } else {
                    if (!(premiumBusArgs instanceof PremiumBusArgs.PremiumBusSlotListScreenArgs)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChaloNavigationManagerKt.c(chaloNavigationManager);
                    return;
                }
            }
            ChaloJson chaloJson2 = ChaloJson.f6455a;
            String str3 = ((PremiumBusArgs.PremiumBusSeatSelectionArgs) premiumBusArgs).d;
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB2 = json2.b(str3, PremiumBusSeatSelectionFlowType.INSTANCE.serializer());
            } catch (Exception unused2) {
            }
            if (((PremiumBusSeatSelectionFlowType) objB2) != null) {
                return;
            }
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        PremiumBusArgs.PremiumProductSelectionArgs premiumProductSelectionArgs = (PremiumBusArgs.PremiumProductSelectionArgs) premiumBusArgs;
        String str4 = premiumProductSelectionArgs.c;
        String str5 = premiumProductSelectionArgs.d;
        if (str4 == null) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        try {
            Json json3 = ChaloJson.b;
            json3.getClass();
            objB = json3.b(str4, PremiumBusProductPurchaseFlowType.FreshPurchase.INSTANCE.serializer());
        } catch (Exception unused3) {
            objB = null;
        }
        PremiumBusProductPurchaseFlowType.FreshPurchase freshPurchase = (PremiumBusProductPurchaseFlowType.FreshPurchase) objB;
        if (str5 != null) {
            try {
                Json json4 = ChaloJson.b;
                json4.getClass();
                objB3 = json4.b(str5, PBOriginDestinationAppModel.INSTANCE.serializer());
            } catch (Exception unused4) {
            }
            pBOriginDestinationAppModel = (PBOriginDestinationAppModel) objB3;
        }
        if (freshPurchase == null) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        } else {
            if (pBOriginDestinationAppModel != null) {
                this.p = pBOriginDestinationAppModel;
            }
        }
    }

    public static Pair G0(Source source, String str) {
        if (str == null || StringsKt.F(str)) {
            str = null;
        }
        boolean z = true;
        if ((source != Source.CHALO_BUS_SCREEN_TAB || str == null) && source != Source.DEEPLINK_PRODUCT && str == null) {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), str);
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager
    public final void C(ProductConfigCompleteDetailsListAppModel completeProductConfig) {
        Intrinsics.i(completeProductConfig, "completeProductConfig");
        this.o = completeProductConfig;
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager
    public final void E(PBOriginDestinationAppModel odPair) {
        Intrinsics.i(odPair, "odPair");
        this.p = odPair;
    }

    public final boolean F0() {
        String str;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel;
        SuperPassSubTypes.Companion companion = SuperPassSubTypes.INSTANCE;
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = this.o;
        if (productConfigCompleteDetailsListAppModel == null || (productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModel.f8205a) == null || (str = productConfigCompleteDetailsAppModel.t) == null) {
            str = "";
        }
        companion.getClass();
        int i = WhenMappings.b[SuperPassSubTypes.Companion.a(str).ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager
    public final void G(PBAvailableSlotsTripAppModel slotSelected) {
        Intrinsics.i(slotSelected, "slotSelected");
        this.q = slotSelected;
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager
    /* JADX INFO: renamed from: V, reason: from getter */
    public final PBOriginDestinationAppModel getP() {
        return this.p;
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusBookingNavigationHelper
    public final void X(PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType) {
        Intrinsics.i(premiumBusProductPurchaseFlowType, "premiumBusProductPurchaseFlowType");
        if (this.l != null) {
            return;
        }
        this.l = premiumBusProductPurchaseFlowType;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // app.chalo.premiumbus.managers.PremiumBusBookingNavigationHelper
    public final PremiumBusBookingSteps h0(PremiumBusBookingSteps currentStep) {
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel2;
        Intrinsics.i(currentStep, "currentStep");
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = this.l;
        String str = null;
        if ((premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.FreshPurchase) || (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.RePurchaseTicket) || (premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass)) {
            switch (WhenMappings.f7275a[currentStep.ordinal()]) {
                case 1:
                    ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel = this.o;
                    if (Intrinsics.d((productConfigCompleteDetailsListAppModel == null || (productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModel.f8205a) == null) ? null : productConfigCompleteDetailsAppModel.t, "premiumReserveTicket")) {
                        if (this.q != null && this.p != null) {
                            return PremiumBusBookingSteps.FARE_DETAILS;
                        }
                    } else if (F0()) {
                        return PremiumBusBookingSteps.PASS_PLAN_SELECTION;
                    }
                case 2:
                    if (this.p != null) {
                        return PremiumBusBookingSteps.SLOT_SELECTION;
                    }
                    break;
                case 3:
                    ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel2 = this.o;
                    if (productConfigCompleteDetailsListAppModel2 != null && (productConfigCompleteDetailsAppModel2 = productConfigCompleteDetailsListAppModel2.f8205a) != null) {
                        str = productConfigCompleteDetailsAppModel2.t;
                    }
                    if (Intrinsics.d(str, "premiumReserveTicket")) {
                        return (this.q == null || this.p == null) ? PremiumBusBookingSteps.PRODUCT_SELECTION : PremiumBusBookingSteps.FARE_DETAILS;
                    }
                    return F0() ? PremiumBusBookingSteps.PASS_PLAN_SELECTION : PremiumBusBookingSteps.PRODUCT_SELECTION;
                case 4:
                case 7:
                case 8:
                case 9:
                    break;
                case 5:
                    return PremiumBusBookingSteps.CHECKOUT;
                case 6:
                    return PremiumBusBookingSteps.SUCCESS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (!(premiumBusProductPurchaseFlowType instanceof PremiumBusProductPurchaseFlowType.RescheduleTicket)) {
            if (premiumBusProductPurchaseFlowType == null) {
                return PremiumBusBookingSteps.PRODUCT_SELECTION;
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final ProductConfigCompleteDetailsListAppModel getO() {
        return this.o;
    }

    @Override // app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager
    /* JADX INFO: renamed from: n0, reason: from getter */
    public final PBAvailableSlotsTripAppModel getQ() {
        return this.q;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PremiumBusSharedState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusSharedState();
    }
}
