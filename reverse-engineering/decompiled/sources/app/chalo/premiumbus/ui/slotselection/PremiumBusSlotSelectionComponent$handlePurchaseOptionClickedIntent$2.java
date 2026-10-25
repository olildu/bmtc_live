package app.chalo.premiumbus.ui.slotselection;

import app.chalo.constants.Source;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsEntryRoutingKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowTypeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2", f = "PremiumBusSlotSelectionComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSlotSelectionIntent.PurchaseOptionClickedIntent $intent;
    final /* synthetic */ boolean $isPPRSelectionDisabled;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7854a;

        static {
            int[] iArr = new int[BookingSelectionType.values().length];
            try {
                iArr[BookingSelectionType.SINGLE_RIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookingSelectionType.MULTIPLE_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7854a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, PremiumBusSlotSelectionIntent.PurchaseOptionClickedIntent purchaseOptionClickedIntent, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$intent = purchaseOptionClickedIntent;
        this.$isPPRSelectionDisabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2(this.this$0, this.$intent, this.$isPPRSelectionDisabled, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2 premiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2 = (PremiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        premiumBusSlotSelectionComponent$handlePurchaseOptionClickedIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PBAvailableSlotsTripAppModel q = this.this$0.n.getQ();
        Unit unit = Unit.f17538a;
        if (q != null) {
            PremiumBusPurchaseOptionUiModel premiumBusPurchaseOptionUiModel = this.$intent.f7882a;
            if (!(premiumBusPurchaseOptionUiModel instanceof PremiumBusPurchaseOptionUiModel.SuperPassOption)) {
                if (Intrinsics.d(premiumBusPurchaseOptionUiModel, PremiumBusPurchaseOptionUiModel.DefaultOption.b)) {
                    this.this$0.W0(q, this.$isPPRSelectionDisabled);
                    return unit;
                }
                if (!(premiumBusPurchaseOptionUiModel instanceof PremiumBusPurchaseOptionUiModel.CustomerSupportOption)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.h1(new PremiumBusSlotSelectionIntent.CallCustomerSupportBtnClickIntent(((PremiumBusPurchaseOptionUiModel.CustomerSupportOption) this.$intent.f7882a).b));
                return unit;
            }
            String str = ((PremiumBusPurchaseOptionUiModel.SuperPassOption) premiumBusPurchaseOptionUiModel).d;
            PBOriginDestinationAppModel p = this.this$0.n.getP();
            if (p != null) {
                int i = WhenMappings.f7854a[((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).z.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.g1(q, str, ((PremiumBusPurchaseOptionUiModel.SuperPassOption) this.$intent.f7882a).f);
                    return unit;
                }
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
                PremiumBusPurchaseOptionUiModel.SuperPassOption superPassOption = (PremiumBusPurchaseOptionUiModel.SuperPassOption) this.$intent.f7882a;
                PremiumBusArgs.SlotSelectionArgs slotSelectionArgs = premiumBusSlotSelectionComponent.k;
                ChaloNavigationManager chaloNavigationManager = premiumBusSlotSelectionComponent.C;
                FareDetailsData.Companion companion = FareDetailsData.INSTANCE;
                FareDetailsData fareDetailsDataB = FareDetailsData.Companion.b(companion, q, p, null, 28);
                String str2 = q.f;
                SuperPassSubTypes.Companion companion2 = SuperPassSubTypes.INSTANCE;
                String str3 = superPassOption.f;
                companion2.getClass();
                PremiumBusFareDetailsFlowType.PurchaseThroughPass purchaseThroughPass = new PremiumBusFareDetailsFlowType.PurchaseThroughPass(str2, str, SuperPassSubTypes.Companion.a(str3));
                if (!q.c()) {
                    ChaloNavigationManagerKt.e(chaloNavigationManager, PremiumBusFareDetailsEntryRoutingKt.a(purchaseThroughPass, fareDetailsDataB, PremiumBusFareDetailsEntryContext.FromSlotSelection, EmptyList.f17557a, slotSelectionArgs.e), null, 6);
                    return unit;
                }
                String str4 = q.f;
                Json json = ChaloJson.b;
                json.getClass();
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusSeatSelectionArgs(Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), new PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass(str4, p.c, p.h, json.a(companion.serializer(), fareDetailsDataB), PremiumBusFareDetailsFlowTypeKt.a(purchaseThroughPass))), (String) null, slotSelectionArgs.e, 4), null, 6);
                return unit;
            }
        }
        return unit;
    }
}
