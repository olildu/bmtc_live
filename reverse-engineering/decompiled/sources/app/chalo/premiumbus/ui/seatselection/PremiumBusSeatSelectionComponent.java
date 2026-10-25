package app.chalo.premiumbus.ui.seatselection;

import androidx.autofill.HintConstants;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.domain.CheckIfMultiSeatSelectionAllowedUseCase;
import app.chalo.premiumbus.domain.FetchAggregatedSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.FetchSeatSelectionLayoutUseCase;
import app.chalo.premiumbus.domain.GetSeatDisplayTypeUseCase;
import app.chalo.premiumbus.domain.ProcessSeatChangeRequestUseCase;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.managers.SeatSelectionResultStateManager;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsEntryRoutingKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState;
import app.chalo.premiumbus.ui.slotselection.DateAndSlotSelectedForBulkBooking;
import app.chalo.premiumbus.ui.slotselection.SlotsAvailableForSelection;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.domain.FetchUserProfileUseCase;
import app.chalo.userprofile.domain.UpdateUserProfileUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.chalologger.ChaloLog;
import com.arkivanov.decompose.ComponentContext;
import defpackage.lu0;
import defpackage.mu;
import defpackage.pu0;
import defpackage.qd;
import defpackage.su0;
import defpackage.ud;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionDataState;", "Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/PremiumBusSeatSelectionViewState;", "Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSeatSelectionComponent extends ChaloBaseStateMviComponent<PremiumBusSeatSelectionIntent, PremiumBusSeatSelectionDataState, PremiumBusSeatSelectionViewState, PremiumBusSeatSelectionSideEffect> {
    public final PremiumBusSeatSelectionUiStateFactory A;
    public final CheckIfMultiSeatSelectionAllowedUseCase B;
    public Job C;
    public Job D;
    public final PremiumBusArgs.PremiumBusSeatSelectionArgs k;
    public final FetchSeatSelectionLayoutUseCase l;
    public final FetchAggregatedSeatSelectionLayoutUseCase m;
    public final StringProvider n;
    public final PremiumBusPurchaseInfoManager o;
    public final ProcessSeatChangeRequestUseCase p;
    public final AnalyticsContract q;
    public final KotlinToastManager r;
    public final ChaloNavigationManager s;
    public final SeatSelectionResultStateManager t;
    public final UserProfileDetailsProvider u;
    public final PremiumBusDataStoreWrapper v;
    public final UpdateUserProfileUseCase w;
    public final FetchUserProfileUseCase x;
    public final GetSeatDisplayTypeUseCase y;
    public final SeatToggleDecisionHelper z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7718a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gender.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7718a = iArr;
            int[] iArr2 = new int[GenderPreferenceSelectionStates.values().length];
            try {
                iArr2[GenderPreferenceSelectionStates.PREFERENCE_SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GenderPreferenceSelectionStates.SHOW_PREFERENCE_NUDGE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GenderPreferenceSelectionStates.SHOW_PREFERENCE_BOTTOM_SHEET.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public PremiumBusSeatSelectionComponent(PremiumBusArgs.PremiumBusSeatSelectionArgs premiumBusSeatSelectionArgs, ComponentContext componentContext, FetchSeatSelectionLayoutUseCase fetchSeatSelectionLayoutUseCase, FetchAggregatedSeatSelectionLayoutUseCase fetchAggregatedSeatSelectionLayoutUseCase, StringProvider stringProvider, PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager, ProcessSeatChangeRequestUseCase processSeatChangeRequestUseCase, AnalyticsContract analyticsContract, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, SeatSelectionResultStateManager seatSelectionResultStateManager, UserProfileDetailsProvider userProfileDetailsProvider, PremiumBusDataStoreWrapper premiumBusDataStoreWrapper, UpdateUserProfileUseCase updateUserProfileUseCase, FetchUserProfileUseCase fetchUserProfileUseCase, GetSeatDisplayTypeUseCase getSeatDisplayTypeUseCase, SeatToggleDecisionHelper seatToggleDecisionHelper, PremiumBusSeatSelectionUiStateFactory premiumBusSeatSelectionUiStateFactory, CheckIfMultiSeatSelectionAllowedUseCase checkIfMultiSeatSelectionAllowedUseCase) {
        super(componentContext);
        this.k = premiumBusSeatSelectionArgs;
        this.l = fetchSeatSelectionLayoutUseCase;
        this.m = fetchAggregatedSeatSelectionLayoutUseCase;
        this.n = stringProvider;
        this.o = premiumBusPurchaseInfoManager;
        this.p = processSeatChangeRequestUseCase;
        this.q = analyticsContract;
        this.r = kotlinToastManager;
        this.s = chaloNavigationManager;
        this.t = seatSelectionResultStateManager;
        this.u = userProfileDetailsProvider;
        this.v = premiumBusDataStoreWrapper;
        this.w = updateUserProfileUseCase;
        this.x = fetchUserProfileUseCase;
        this.y = getSeatDisplayTypeUseCase;
        this.z = seatToggleDecisionHelper;
        this.A = premiumBusSeatSelectionUiStateFactory;
        this.B = checkIfMultiSeatSelectionAllowedUseCase;
        Source source = premiumBusSeatSelectionArgs.c;
        Json json = ChaloJson.b;
        String str = premiumBusSeatSelectionArgs.d;
        json.getClass();
        Y0(new PremiumBusSeatSelectionIntent.InitializationIntent(source, (PremiumBusSeatSelectionFlowType) json.b(str, PremiumBusSeatSelectionFlowType.INSTANCE.serializer())));
    }

    public static final void F0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, SeatInfoAppModel seatInfoAppModel) {
        int i = seatInfoAppModel.f7122a;
        StateFlow stateFlow = premiumBusSeatSelectionComponent.f;
        List list = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((SeatInfoAppModel) it.next()).f7122a == i) {
                    List<SeatInfoAppModel> list2 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d;
                    ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                    for (SeatInfoAppModel seatInfoAppModelA : list2) {
                        if (seatInfoAppModelA.f7122a == i) {
                            seatInfoAppModelA = SeatInfoAppModel.a(seatInfoAppModelA, null, !seatInfoAppModelA.i, 7935);
                        }
                        arrayList.add(seatInfoAppModelA);
                    }
                    premiumBusSeatSelectionComponent.E0(new qd(11, arrayList));
                    return;
                }
            }
        }
        ChaloLog.c("PremiumBusSeatSelection", "ToggleSeatSelection: seat " + i + " not in layout", null);
    }

    public static final void G0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel, FareDetailsData fareDetailsData) {
        String str;
        premiumBusSeatSelectionComponent.E0(new pu0(8));
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModelN0 = premiumBusSeatSelectionComponent.o.n0();
        if (pBAvailableSlotsTripAppModelN0 == null || (str = pBAvailableSlotsTripAppModelN0.f) == null) {
            str = "";
        }
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModel.f8205a;
        PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModelB = PremiumBusFareDetailsEntryRoutingKt.b(productConfigCompleteDetailsAppModel);
        String str2 = productConfigCompleteDetailsAppModel.f8203a;
        String str3 = productConfigCompleteDetailsAppModel.g;
        premiumBusSeatSelectionComponent.X0(fareDetailsData, new PremiumBusFareDetailsFlowType.FreshPurchase(str, str2, str3 != null ? str3 : "", premiumBusPassUpsellAppModelB));
    }

    public static final SeatSelectionBottomSheetType H0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, Gender gender, GenderPreferenceSelectionStates genderPreferenceSelectionStates, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType) {
        premiumBusSeatSelectionComponent.getClass();
        int i = genderPreferenceSelectionStates == null ? -1 : WhenMappings.b[genderPreferenceSelectionStates.ordinal()];
        if (i != -1) {
            if (i == 1) {
                int i2 = gender == null ? -1 : WhenMappings.f7718a[gender.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                            premiumBusSeatSelectionComponent.b1();
                            return SeatSelectionBottomSheetType.WomenReservedSeatsChoice.f7756a;
                        }
                        if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i2 != 2 && i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        }
        return new SeatSelectionBottomSheetType.GenderPreferenceBottomSheet(new GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType(3));
    }

    public static final void I0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, final PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType) {
        premiumBusSeatSelectionComponent.E0(new pu0(21));
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) {
            premiumBusSeatSelectionComponent.E0(new pu0(23));
            premiumBusSeatSelectionComponent.P0(((PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) premiumBusSeatSelectionFlowType).d, premiumBusSeatSelectionFlowType.f7725a, premiumBusSeatSelectionFlowType.b);
            return;
        }
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) {
            premiumBusSeatSelectionComponent.P0(((PremiumBusSeatSelectionFlowType.FreshPurchase) premiumBusSeatSelectionFlowType).d, premiumBusSeatSelectionFlowType.f7725a, premiumBusSeatSelectionFlowType.b);
            return;
        }
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) {
            final int i = 0;
            premiumBusSeatSelectionComponent.E0(new Function1() { // from class: tu0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PremiumBusSeatSelectionDataState it = (PremiumBusSeatSelectionDataState) obj;
                    switch (i) {
                        case 0:
                            Intrinsics.i(it, "it");
                            PremiumBusSeatSelectionFlowType.ChangeSeat changeSeat = (PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType;
                            int size = changeSeat.e.size();
                            String str = changeSeat.d;
                            return PremiumBusSeatSelectionDataState.a(it, false, null, null, Integer.valueOf(size), changeSeat.e, false, str, null, false, null, null, null, null, 65183);
                        default:
                            Intrinsics.i(it, "it");
                            return PremiumBusSeatSelectionDataState.a(it, false, null, null, Integer.valueOf(((PremiumBusSeatSelectionFlowType.Reschedule) premiumBusSeatSelectionFlowType).g), null, false, null, null, false, null, null, null, null, 65503);
                    }
                }
            });
            premiumBusSeatSelectionComponent.P0(((PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType).f, premiumBusSeatSelectionFlowType.f7725a, premiumBusSeatSelectionFlowType.b);
            return;
        }
        if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking)) {
            if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i2 = 1;
            premiumBusSeatSelectionComponent.E0(new Function1() { // from class: tu0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PremiumBusSeatSelectionDataState it = (PremiumBusSeatSelectionDataState) obj;
                    switch (i2) {
                        case 0:
                            Intrinsics.i(it, "it");
                            PremiumBusSeatSelectionFlowType.ChangeSeat changeSeat = (PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType;
                            int size = changeSeat.e.size();
                            String str = changeSeat.d;
                            return PremiumBusSeatSelectionDataState.a(it, false, null, null, Integer.valueOf(size), changeSeat.e, false, str, null, false, null, null, null, null, 65183);
                        default:
                            Intrinsics.i(it, "it");
                            return PremiumBusSeatSelectionDataState.a(it, false, null, null, Integer.valueOf(((PremiumBusSeatSelectionFlowType.Reschedule) premiumBusSeatSelectionFlowType).g), null, false, null, null, false, null, null, null, null, 65503);
                    }
                }
            });
            premiumBusSeatSelectionComponent.P0(((PremiumBusSeatSelectionFlowType.Reschedule) premiumBusSeatSelectionFlowType).d, premiumBusSeatSelectionFlowType.f7725a, premiumBusSeatSelectionFlowType.b);
            return;
        }
        premiumBusSeatSelectionComponent.E0(new pu0(24));
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = (PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType;
        List list = bulkBooking.j;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list2 = ((DateAndSlotSelectedForBulkBooking) it.next()).d;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SlotsAvailableForSelection) it2.next()).f7902a.b);
            }
            CollectionsKt.i(arrayList2, arrayList);
        }
        BuildersKt.d(premiumBusSeatSelectionComponent.j, null, null, new PremiumBusSeatSelectionComponent$fetchSeatLayoutForBulkBooking$1(premiumBusSeatSelectionComponent, bulkBooking, CollectionsKt.z(arrayList), null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Enum J0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1 premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1;
        premiumBusSeatSelectionComponent.getClass();
        if (continuationImpl instanceof PremiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1) {
            premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1 = (PremiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1) continuationImpl;
            int i = premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1 = new PremiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1(premiumBusSeatSelectionComponent, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1 = new PremiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1(premiumBusSeatSelectionComponent, continuationImpl);
        }
        Object objA = premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            FetchUserProfileUseCase fetchUserProfileUseCase = premiumBusSeatSelectionComponent.x;
            premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1.label = 1;
            objA = fetchUserProfileUseCase.a(premiumBusSeatSelectionComponent$fetchUserProfileAndGetGender$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            AnalyticsContractImplKt.b(premiumBusSeatSelectionComponent.q, "user profile fetch failed", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, null, false, 28);
            UserProfileAppModel userProfileAppModelF = premiumBusSeatSelectionComponent.u.f();
            return userProfileAppModelF != null ? userProfileAppModelF.d : Gender.MALE;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        AnalyticsContractImplKt.b(premiumBusSeatSelectionComponent.q, "user profile fetch success", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, vo1.s(HintConstants.AUTOFILL_HINT_GENDER, userProfileAppModel.d.get_value()), false, 24);
        return userProfileAppModel.d;
    }

    public static final boolean K0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType) {
        premiumBusSeatSelectionComponent.getClass();
        if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass)) {
            return true;
        }
        if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void L0(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, Gender gender) {
        Job job;
        Job job2 = premiumBusSeatSelectionComponent.C;
        if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = premiumBusSeatSelectionComponent.C) != null) {
            ((JobSupport) job).cancel(null);
        }
        premiumBusSeatSelectionComponent.C = BuildersKt.d(premiumBusSeatSelectionComponent.j, null, null, new PremiumBusSeatSelectionComponent$updateUserProfileAndBottomSheetState$1(premiumBusSeatSelectionComponent, gender, null), 3);
    }

    public static boolean M0(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((SeatInfoAppModel) it.next()).d == SeatStatus.AVAILABLE) {
                return false;
            }
        }
        return true;
    }

    public final void N0() {
        List list = ((PremiumBusSeatSelectionDataState) this.f.getValue()).d;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SeatInfoAppModel.a((SeatInfoAppModel) it.next(), null, false, 7935));
        }
        E0(new qd(12, arrayList));
    }

    public final void O0() {
        if (R0()) {
            StateFlow stateFlow = this.f;
            List listV0 = V0(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d);
            if (Intrinsics.d(listV0, ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d)) {
                return;
            }
            E0(new ud(listV0, 20));
        }
    }

    public final void P0(String str, String str2, String str3) {
        BuildersKt.d(this.j, null, null, new PremiumBusSeatSelectionComponent$fetchSeatLayout$1(this, str, str2, str3, null), 3);
    }

    public final int Q0(int i) {
        List<SeatInfoAppModel> list = ((PremiumBusSeatSelectionDataState) this.f.getValue()).d;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (SeatInfoAppModel seatInfoAppModel : list) {
                if (seatInfoAppModel.d == SeatStatus.AVAILABLE && !U0(seatInfoAppModel, i) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        if (i2 < 1) {
            return 1;
        }
        return i2;
    }

    public final boolean R0() {
        StateFlow stateFlow = this.f;
        Integer num = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).o;
        return S0() && ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).m == Gender.FEMALE && (num != null ? num.intValue() : 1) > 1;
    }

    public final boolean S0() {
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = ((PremiumBusSeatSelectionDataState) this.f.getValue()).c;
        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModelN0 = this.o.n0();
        this.B.getClass();
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) {
            if (pBAvailableSlotsTripAppModelN0 == null || !pBAvailableSlotsTripAppModelN0.r) {
                return false;
            }
        } else if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) {
            if (((PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType).e.size() <= 1) {
                return false;
            }
        } else {
            if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
                if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) || premiumBusSeatSelectionFlowType == null) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (((PremiumBusSeatSelectionFlowType.Reschedule) premiumBusSeatSelectionFlowType).g <= 1 || pBAvailableSlotsTripAppModelN0 == null || !pBAvailableSlotsTripAppModelN0.r) {
                return false;
            }
        }
        return true;
    }

    public final boolean T0(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState) {
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = premiumBusSeatSelectionDataState.c;
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) {
            return S0();
        }
        if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) || premiumBusSeatSelectionFlowType == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean U0(SeatInfoAppModel seatInfoAppModel, int i) {
        StateFlow stateFlow = this.f;
        Gender gender = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).m;
        if (gender == null) {
            gender = Gender.MALE;
        }
        PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c;
        this.y.getClass();
        return GetSeatDisplayTypeUseCase.b(seatInfoAppModel, gender, premiumBusSeatSelectionFlowType, i).b;
    }

    public final List V0(List list) {
        if (!R0()) {
            return list;
        }
        List<SeatInfoAppModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (SeatInfoAppModel seatInfoAppModelA : list2) {
            if (seatInfoAppModelA.b() && seatInfoAppModelA.i) {
                seatInfoAppModelA = SeatInfoAppModel.a(seatInfoAppModelA, null, false, 7935);
            }
            arrayList.add(seatInfoAppModelA);
        }
        return arrayList;
    }

    public final void W0(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, boolean z) {
        PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = new PremiumBusSeatSelectionFlowType.BulkBooking(str, str2, str3, str4, str5, str6, list, list2, z);
        Source source = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
        Json json = ChaloJson.b;
        json.getClass();
        ChaloNavigationManagerKt.e(this.s, new PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs(source, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), bulkBooking)), null, 6);
    }

    public final void X0(FareDetailsData fareDetailsData, PremiumBusFareDetailsFlowType premiumBusFareDetailsFlowType) {
        if (fareDetailsData == null) {
            BuildersKt.d(this.j, null, null, new PremiumBusSeatSelectionComponent$showSomethingWentWrongToast$1(this, null), 3);
            return;
        }
        PremiumBusFareDetailsEntryContext premiumBusFareDetailsEntryContext = PremiumBusFareDetailsEntryContext.FromSeatSelection;
        List list = ((PremiumBusSeatSelectionDataState) this.f.getValue()).d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SeatInfoAppModel) obj).i) {
                arrayList.add(obj);
            }
        }
        ChaloNavigationManagerKt.e(this.s, PremiumBusFareDetailsEntryRoutingKt.a(premiumBusFareDetailsFlowType, fareDetailsData, premiumBusFareDetailsEntryContext, arrayList, this.k.f), null, 6);
    }

    public final void Y0(PremiumBusSeatSelectionIntent intent) {
        int i;
        int iIntValue;
        boolean z;
        char c;
        char c2;
        char c3;
        int i2;
        Object objZ;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z2 = intent instanceof PremiumBusSeatSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z2) {
            PremiumBusSeatSelectionIntent.InitializationIntent initializationIntent = (PremiumBusSeatSelectionIntent.InitializationIntent) intent;
            Source source = initializationIntent.f7741a;
            PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = initializationIntent.b;
            if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                List list = ((PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType).j;
                c = 1;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = ((DateAndSlotSelectedForBulkBooking) it.next()).d;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((SlotsAvailableForSelection) it2.next()).f7902a.b);
                    }
                    CollectionsKt.i(arrayList2, arrayList);
                }
                c2 = 2;
                c3 = 0;
                i2 = 3;
                objZ = CollectionsKt.z(arrayList);
            } else {
                c = 1;
                c2 = 2;
                c3 = 0;
                i2 = 3;
                if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) {
                    objZ = ((PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType).f;
                } else if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) {
                    objZ = ((PremiumBusSeatSelectionFlowType.FreshPurchase) premiumBusSeatSelectionFlowType).d;
                } else if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) {
                    objZ = ((PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) premiumBusSeatSelectionFlowType).d;
                } else {
                    if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objZ = ((PremiumBusSeatSelectionFlowType.Reschedule) premiumBusSeatSelectionFlowType).d;
                }
            }
            Pair pair = new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(premiumBusSeatSelectionFlowType));
            Pair pair2 = new Pair("tripId", objZ);
            Pair pair3 = new Pair("from stop id", premiumBusSeatSelectionFlowType.f7725a);
            Pair pair4 = new Pair("to stop id", premiumBusSeatSelectionFlowType.b);
            Pair[] pairArr = new Pair[4];
            pairArr[c3] = pair;
            pairArr[c] = pair2;
            pairArr[c2] = pair3;
            pairArr[i2] = pair4;
            LinkedHashMap linkedHashMapK = MapsKt.k(pairArr);
            String str = this.k.f;
            if (str != null) {
                if (StringsKt.F(str)) {
                    str = null;
                }
                if (str != null) {
                    linkedHashMapK.put("attribution type", str);
                }
            }
            AnalyticsContractImplKt.b(this.q, "pb seat selection screen opened", source, linkedHashMapK, false, 24);
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleInitialisationIntent$1(this, initializationIntent, null), i2);
            return;
        }
        int i3 = 1;
        boolean zEquals = intent.equals(PremiumBusSeatSelectionIntent.SelectSeatsClickIntent.f7750a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            List list3 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list3) {
                if (((SeatInfoAppModel) obj).i) {
                    arrayList3.add(obj);
                }
            }
            Source source2 = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
            Pair pair5 = new Pair("selectedSeatIds", Integer.valueOf(arrayList3.size()));
            Pair pair6 = new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c));
            Pair pair7 = new Pair("selectedSeatNumbers", CollectionsKt.O(arrayList3, ", ", null, null, new pu0(9), 30));
            Pair pair8 = new Pair("selectedSeatIds", CollectionsKt.O(arrayList3, ", ", null, null, new pu0(10), 30));
            Pair pair9 = new Pair("availableOnAllSlots", CollectionsKt.O(arrayList3, ", ", null, null, new pu0(11), 30));
            if (arrayList3.isEmpty()) {
                z = false;
            } else {
                int size = arrayList3.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList3.get(i4);
                    i4++;
                    if (((SeatInfoAppModel) obj2).l) {
                        z = true;
                    }
                }
                z = false;
            }
            AnalyticsContractImplKt.b(this.q, "premium bus seat selection select seats clicked", source2, MapsKt.i(pair5, pair6, pair7, pair8, pair9, new Pair("isAutoAssigned", Boolean.valueOf(z))), false, 24);
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1(arrayList3, this, null), 3);
            return;
        }
        if (intent instanceof PremiumBusSeatSelectionIntent.ToggleSeatSelectionIntent) {
            PremiumBusSeatSelectionIntent.ToggleSeatSelectionIntent toggleSeatSelectionIntent = (PremiumBusSeatSelectionIntent.ToggleSeatSelectionIntent) intent;
            E0(new pu0(14));
            if (((PremiumBusSeatSelectionDataState) stateFlow.getValue()).j) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleToggleSeatSelectionIntent$2(this, toggleSeatSelectionIntent.f7751a.f7122a, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.SeatChangeSuccessScreenOkayBtnClickIntent.f7749a)) {
            String str2 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).h;
            AnalyticsContractImplKt.b(this.q, "premium bus seat selection change success screen okay btn click", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, vo1.s("bookingId", String.valueOf(str2)), false, 24);
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleSeatChangeSuccessScreenOkayBtnClickIntent$1(this, str2, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.SeatChangeConfirmationDialogDismissIntent.f7747a)) {
            Source source3 = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
            String str3 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).h;
            AnalyticsContractImplKt.b(this.q, "pb seat change confirm dismiss", source3, vo1.s("bookingId", str3 != null ? str3 : ""), false, 24);
            E0(new pu0(5));
            return;
        }
        if (intent instanceof PremiumBusSeatSelectionIntent.SeatChangeConfirmationDialogPositiveBtnClickIntent) {
            Source source4 = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
            String str4 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).h;
            AnalyticsContractImplKt.b(this.q, "pb seat change confirm proceed", source4, MapsKt.i(new Pair("bookingId", str4 != null ? str4 : ""), new Pair("selectedSeatIds", CollectionsKt.O(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).f, ", ", null, null, new pu0(22), 30))), false, 24);
            E0(new pu0(20));
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleSeatChangeConfirmationDialogPositiveBtnClickIntent$2(this, null), 3);
            return;
        }
        boolean zEquals2 = intent.equals(PremiumBusSeatSelectionIntent.OnBackPressedIntent.f7742a);
        SeatSelectionBottomSheetType.WomenReservedSeatsChoice womenReservedSeatsChoice = SeatSelectionBottomSheetType.WomenReservedSeatsChoice.f7756a;
        SeatSelectionBottomSheetType.PassengerCountSelection passengerCountSelection = SeatSelectionBottomSheetType.PassengerCountSelection.f7755a;
        if (zEquals2) {
            if (((PremiumBusSeatSelectionDataState) stateFlow.getValue()).l == null) {
                a1();
                q0(new su0(this, 0));
                return;
            }
            a1();
            SeatSelectionBottomSheetType seatSelectionBottomSheetType = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).l;
            if (seatSelectionBottomSheetType instanceof SeatSelectionBottomSheetType.GenderPreferenceBottomSheet) {
                c1();
            } else if (!Intrinsics.d(seatSelectionBottomSheetType, womenReservedSeatsChoice) && !Intrinsics.d(seatSelectionBottomSheetType, passengerCountSelection) && seatSelectionBottomSheetType != null) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new pu0(15));
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetDismissIntent.f7734a)) {
            AnalyticsContractImplKt.b(this.q, "pb seat gender confirm dismiss", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), new Pair(HintConstants.AUTOFILL_HINT_GENDER, String.valueOf(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).m))), false, 24);
            c1();
            E0(new pu0(6));
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.OnGenderConfirmationSuccessAnimationCompletedIntent.f7743a)) {
            E0(new pu0(17));
            PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType2 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c;
            if (premiumBusSeatSelectionFlowType2 != null) {
                BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleOnGenderConfirmationSuccessAnimationCompletedIntent$2$1(this, premiumBusSeatSelectionFlowType2, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent) {
            PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent genderSelectionOptionSelectedIntent = (PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent) intent;
            AnalyticsContractImplKt.b(this.q, "pb seat gender selected", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), new Pair(HintConstants.AUTOFILL_HINT_GENDER, genderSelectionOptionSelectedIntent.f7739a.name())), false, 24);
            SeatSelectionBottomSheetType seatSelectionBottomSheetType2 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).l;
            if (!(seatSelectionBottomSheetType2 instanceof SeatSelectionBottomSheetType.GenderPreferenceBottomSheet)) {
                if (!Intrinsics.d(seatSelectionBottomSheetType2, womenReservedSeatsChoice) && !Intrinsics.d(seatSelectionBottomSheetType2, passengerCountSelection) && seatSelectionBottomSheetType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            GenderConfirmationBottomSheetType genderConfirmationBottomSheetType = ((SeatSelectionBottomSheetType.GenderPreferenceBottomSheet) seatSelectionBottomSheetType2).f7754a;
            if (genderConfirmationBottomSheetType instanceof GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType) {
                E0(new lu0(i3, genderConfirmationBottomSheetType, genderSelectionOptionSelectedIntent));
                return;
            } else {
                if (!genderConfirmationBottomSheetType.equals(GenderConfirmationBottomSheetType.GenderPreferenceSelectionError.f7714a) && !genderConfirmationBottomSheetType.equals(GenderConfirmationBottomSheetType.GenderPreferenceSelectionSuccess.f7716a) && !genderConfirmationBottomSheetType.equals(GenderConfirmationBottomSheetType.GenderPreferenceSelectionLoading.f7715a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (intent instanceof PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetConfirmBtnClickIntent) {
            AnalyticsContractImplKt.b(this.q, "pb seat gender confirm positive", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), new Pair(HintConstants.AUTOFILL_HINT_GENDER, String.valueOf(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).m))), false, 24);
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleGenderConfirmationBottomSheetConfirmBtnClickIntent$1((PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetConfirmBtnClickIntent) intent, this, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetSkipBtnClickIntent.f7735a)) {
            AnalyticsContractImplKt.b(this.q, "pb seat gender confirm skip", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, vo1.s("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), false, 24);
            E0(new pu0(13));
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleGenderConfirmationBottomSheetSkipBtnClickIntent$2(this, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.GenderConfirmationErrorBottomSheetTryAgainBtnClickIntent.f7737a)) {
            AnalyticsContractImplKt.b(this.q, "pb seat gender confirm retry", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), new Pair(HintConstants.AUTOFILL_HINT_GENDER, String.valueOf(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).m))), false, 24);
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetTryAgainBtnClickIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.GenderConfirmationErrorBottomSheetSkipBtnClickIntent.f7736a)) {
            AnalyticsContractImplKt.b(this.q, "pb seat gender confirm error skip", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, vo1.s("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), false, 24);
            E0(new pu0(19));
            BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleGenderConfirmationErrorBottomSheetSkipBtnClickIntent$2(this, null), 3);
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.GenderPreferenceNudgeCardUpdateGenderClickIntent.f7738a)) {
            AnalyticsContractImplKt.b(this.q, "pb seat gender nudge update", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, vo1.s("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), false, 24);
            E0(new pu0(16));
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.AutoAssignMySeatsCtaClickIntent.f7731a)) {
            PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType3 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c;
            if (premiumBusSeatSelectionFlowType3 instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                Z0(premiumBusSeatSelectionFlowType3);
                PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = (PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType3;
                W0(bulkBooking.d, bulkBooking.e, bulkBooking.f, bulkBooking.g, bulkBooking.h, bulkBooking.i, bulkBooking.j, EmptyList.f17557a, true);
                return;
            } else if (premiumBusSeatSelectionFlowType3 instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) {
                Z0(premiumBusSeatSelectionFlowType3);
                E0(new pu0(18));
                BuildersKt.d(contextScope, null, null, new PremiumBusSeatSelectionComponent$handleAutoAssignMySeatsCtaClickIntent$2(this, null), 3);
                return;
            } else {
                if (!(premiumBusSeatSelectionFlowType3 instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) && !(premiumBusSeatSelectionFlowType3 instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType3 instanceof PremiumBusSeatSelectionFlowType.Reschedule) && premiumBusSeatSelectionFlowType3 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.IWillPickMySeatCtaClickIntent.f7740a)) {
            PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType4 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c;
            LinkedHashMap linkedHashMapK2 = MapsKt.k(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(premiumBusSeatSelectionFlowType4)));
            if (premiumBusSeatSelectionFlowType4 instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking2 = (PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType4;
                linkedHashMapK2.put("from stop id", bulkBooking2.f);
                linkedHashMapK2.put("to stop id", bulkBooking2.g);
            } else if (!(premiumBusSeatSelectionFlowType4 instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) && !(premiumBusSeatSelectionFlowType4 instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) && !(premiumBusSeatSelectionFlowType4 instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType4 instanceof PremiumBusSeatSelectionFlowType.Reschedule) && premiumBusSeatSelectionFlowType4 != null) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContractImplKt.b(this.q, "pb seat pick seat click", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, linkedHashMapK2, false, 24);
            E0(new pu0(12));
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.EditPassengerCountClickIntent.f7732a)) {
            if (T0((PremiumBusSeatSelectionDataState) stateFlow.getValue())) {
                Source source5 = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
                Pair pair10 = new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c));
                Integer num = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).o;
                AnalyticsContractImplKt.b(this.q, "pb seat passenger count edit click", source5, MapsKt.i(pair10, new Pair("desiredPassengerCount", Integer.valueOf(num != null ? num.intValue() : 1))), false, 24);
                E0(new pu0(7));
                return;
            }
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.PassengerCountIncrementIntent.f7746a)) {
            Integer num2 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).o;
            if (num2 != null) {
                int iIntValue2 = num2.intValue() + 1;
                if (iIntValue2 > Q0(iIntValue2)) {
                    return;
                }
                E0(new mu(iIntValue2, 6));
                O0();
                return;
            }
            return;
        }
        if (intent.equals(PremiumBusSeatSelectionIntent.PassengerCountDecrementIntent.f7745a)) {
            Integer num3 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).o;
            if (num3 == null || (iIntValue = num3.intValue()) <= 1) {
                return;
            }
            E0(new mu(iIntValue, 5));
            O0();
            return;
        }
        if (!intent.equals(PremiumBusSeatSelectionIntent.PassengerCountConfirmIntent.f7744a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.d(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).l, passengerCountSelection)) {
            Integer num4 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).o;
            int iIntValue3 = num4 != null ? num4.intValue() : 1;
            List list4 = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).d;
            if ((list4 instanceof Collection) && list4.isEmpty()) {
                i = 0;
            } else {
                Iterator it3 = list4.iterator();
                int i5 = 0;
                while (it3.hasNext()) {
                    if (((SeatInfoAppModel) it3.next()).i && (i5 = i5 + 1) < 0) {
                        CollectionsKt.y0();
                        throw null;
                    }
                }
                i = i5;
            }
            AnalyticsContractImplKt.b(this.q, "pb seat passenger count confirmed", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, MapsKt.i(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c)), new Pair("desiredPassengerCount", Integer.valueOf(iIntValue3))), false, 24);
            E0(new mu(iIntValue3, 4));
            if (i > iIntValue3) {
                N0();
            }
            O0();
        }
    }

    public final void Z0(PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType) {
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.a(premiumBusSeatSelectionFlowType)), new Pair("from stop id", premiumBusSeatSelectionFlowType.f7725a), new Pair("to stop id", premiumBusSeatSelectionFlowType.b));
        if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
            PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = (PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType;
            linkedHashMapK.put("from stop name", bulkBooking.h);
            linkedHashMapK.put("to stop name", bulkBooking.i);
        } else if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) && !(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContractImplKt.b(this.q, "pb seat auto assign click", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, linkedHashMapK, false, 24);
    }

    public final void a1() {
        String string;
        Source source = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
        StateFlow stateFlow = this.f;
        Pair pair = new Pair("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) stateFlow.getValue()).c));
        SeatSelectionBottomSheetType seatSelectionBottomSheetType = ((PremiumBusSeatSelectionDataState) stateFlow.getValue()).l;
        if (seatSelectionBottomSheetType == null || (string = seatSelectionBottomSheetType.toString()) == null) {
            string = "none";
        }
        AnalyticsContractImplKt.b(this.q, "pb seat back", source, MapsKt.i(pair, new Pair("bottomSheetType", string)), false, 24);
    }

    public final void b1() {
        AnalyticsContractImplKt.b(this.q, "pb seat women choice shown", Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, vo1.s("pbSeatSelectionFlowType", PremiumBusSeatSelectionFlowTypeKt.b(((PremiumBusSeatSelectionDataState) this.f.getValue()).c)), false, 24);
    }

    public final void c1() {
        GenderPreferenceSelectionStates genderPreferenceSelectionStates;
        String strM;
        SeatSelectionBottomSheetType seatSelectionBottomSheetType = ((PremiumBusSeatSelectionDataState) this.f.getValue()).l;
        if (seatSelectionBottomSheetType == null) {
            genderPreferenceSelectionStates = null;
        } else if (seatSelectionBottomSheetType instanceof SeatSelectionBottomSheetType.GenderPreferenceBottomSheet) {
            GenderConfirmationBottomSheetType genderConfirmationBottomSheetType = ((SeatSelectionBottomSheetType.GenderPreferenceBottomSheet) seatSelectionBottomSheetType).f7754a;
            if (genderConfirmationBottomSheetType.equals(GenderConfirmationBottomSheetType.GenderPreferenceSelectionSuccess.f7716a)) {
                genderPreferenceSelectionStates = GenderPreferenceSelectionStates.PREFERENCE_SELECTED;
            } else {
                if (!genderConfirmationBottomSheetType.equals(GenderConfirmationBottomSheetType.GenderPreferenceSelectionError.f7714a) && !genderConfirmationBottomSheetType.equals(GenderConfirmationBottomSheetType.GenderPreferenceSelectionLoading.f7715a) && !(genderConfirmationBottomSheetType instanceof GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType)) {
                    throw new NoWhenBranchMatchedException();
                }
                genderPreferenceSelectionStates = GenderPreferenceSelectionStates.SHOW_PREFERENCE_NUDGE_CARD;
            }
        } else {
            if (!seatSelectionBottomSheetType.equals(SeatSelectionBottomSheetType.WomenReservedSeatsChoice.f7756a) && !seatSelectionBottomSheetType.equals(SeatSelectionBottomSheetType.PassengerCountSelection.f7755a)) {
                throw new NoWhenBranchMatchedException();
            }
            genderPreferenceSelectionStates = null;
        }
        if (genderPreferenceSelectionStates == null || (strM = this.u.m()) == null) {
            return;
        }
        BuildersKt.d(this.j, null, null, new PremiumBusSeatSelectionComponent$updateGenderPreferenceSelectionStateInDataStore$1$1$1(this, genderPreferenceSelectionStates, strM, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState = (PremiumBusSeatSelectionDataState) obj;
        return this.A.t(premiumBusSeatSelectionDataState, new PremiumBusSeatSelectionComponent$convertToUiState$2(1, this, PremiumBusSeatSelectionComponent.class, "processIntent", "processIntent(Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionIntent;)V", 0), new PremiumBusSeatSelectionComponent$convertToUiState$3(1, this, PremiumBusSeatSelectionComponent.class, "getMaxAllowedPassengerCount", "getMaxAllowedPassengerCount(I)I", 0), T0(premiumBusSeatSelectionDataState), continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new PremiumBusSeatSelectionDataState(false, false, null, emptyList, null, emptyList, false, null, null, false, null, null, null, false, null);
    }
}
