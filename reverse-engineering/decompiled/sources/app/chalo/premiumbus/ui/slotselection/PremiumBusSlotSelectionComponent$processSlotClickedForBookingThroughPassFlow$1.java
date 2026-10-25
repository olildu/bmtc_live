package app.chalo.premiumbus.ui.slotselection;

import app.chalo.constants.Source;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingAvailableOptionsAppModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusBookingPurchaseOptionDetailsAppModel;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsEntryRoutingKt;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowTypeKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PremiumBusArgs;
import defpackage.av0;
import defpackage.dv0;
import java.util.Iterator;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$processSlotClickedForBookingThroughPassFlow$1", f = "PremiumBusSlotSelectionComponent.kt", l = {2416}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$processSlotClickedForBookingThroughPassFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passId;
    final /* synthetic */ List<PremiumBusBookingPurchaseOptionAppModel> $purchaseOptions;
    final /* synthetic */ PBAvailableSlotsTripAppModel $slot;
    final /* synthetic */ PBOriginDestinationAppModel $stopPoints;
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7857a;
        public static final /* synthetic */ int[] b;

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
            f7857a = iArr;
            int[] iArr2 = new int[PremiumBusPurchaseOptionState.values().length];
            try {
                iArr2[PremiumBusPurchaseOptionState.NO_PURCHASE_OPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PremiumBusPurchaseOptionState.NO_PASS_OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PremiumBusPurchaseOptionState.ATLEAST_ONE_PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$processSlotClickedForBookingThroughPassFlow$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, List list, PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, PBOriginDestinationAppModel pBOriginDestinationAppModel, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
        this.$purchaseOptions = list;
        this.$slot = pBAvailableSlotsTripAppModel;
        this.$stopPoints = pBOriginDestinationAppModel;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$processSlotClickedForBookingThroughPassFlow$1(this.this$0, this.$purchaseOptions, this.$slot, this.$stopPoints, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$processSlotClickedForBookingThroughPassFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        String str;
        String str2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
            List<PremiumBusBookingPurchaseOptionAppModel> list = this.$purchaseOptions;
            premiumBusSlotSelectionComponent.getClass();
            int i2 = WhenMappings.b[PremiumBusSlotSelectionComponent.Z0(list).ordinal()];
            if (i2 == 1) {
                this.this$0.E0(new dv0(14));
                this.this$0.W0(this.$slot, false);
            } else if (i2 == 2) {
                this.this$0.E0(new dv0(15));
                this.this$0.W0(this.$slot, false);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                List<PremiumBusBookingPurchaseOptionAppModel> list2 = this.$purchaseOptions;
                String str4 = this.$passId;
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel = (PremiumBusBookingPurchaseOptionAppModel) next;
                    PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel = premiumBusBookingPurchaseOptionAppModel.c;
                    if (Intrinsics.d(premiumBusBookingPurchaseOptionDetailsAppModel != null ? premiumBusBookingPurchaseOptionDetailsAppModel.c : null, str4) && premiumBusBookingPurchaseOptionAppModel.c.h) {
                        break;
                    }
                }
                PremiumBusBookingPurchaseOptionAppModel premiumBusBookingPurchaseOptionAppModel2 = (PremiumBusBookingPurchaseOptionAppModel) next;
                if (premiumBusBookingPurchaseOptionAppModel2 != null) {
                    PremiumBusBookingPurchaseOptionDetailsAppModel premiumBusBookingPurchaseOptionDetailsAppModel2 = premiumBusBookingPurchaseOptionAppModel2.c;
                    this.this$0.E0(new dv0(16));
                    int i3 = WhenMappings.f7857a[((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).z.ordinal()];
                    String str5 = "";
                    if (i3 == 1) {
                        FareDetailsData.Companion companion = FareDetailsData.INSTANCE;
                        FareDetailsData fareDetailsDataB = FareDetailsData.Companion.b(companion, this.$slot, this.$stopPoints, null, 24);
                        SuperPassSubTypes.Companion companion2 = SuperPassSubTypes.INSTANCE;
                        if (premiumBusBookingPurchaseOptionDetailsAppModel2 == null || (str = premiumBusBookingPurchaseOptionDetailsAppModel2.b) == null) {
                            str = "";
                        }
                        companion2.getClass();
                        SuperPassSubTypes superPassSubTypesA = SuperPassSubTypes.Companion.a(str);
                        String str6 = this.$slot.f;
                        if (premiumBusBookingPurchaseOptionDetailsAppModel2 != null && (str2 = premiumBusBookingPurchaseOptionDetailsAppModel2.c) != null) {
                            str5 = str2;
                        }
                        PremiumBusFareDetailsFlowType.PurchaseThroughPass purchaseThroughPass = new PremiumBusFareDetailsFlowType.PurchaseThroughPass(str6, str5, superPassSubTypesA);
                        if (this.$slot.c()) {
                            String str7 = this.$slot.f;
                            Json json = ChaloJson.b;
                            json.getClass();
                            String strA = json.a(companion.serializer(), fareDetailsDataB);
                            String strA2 = PremiumBusFareDetailsFlowTypeKt.a(purchaseThroughPass);
                            PBOriginDestinationAppModel pBOriginDestinationAppModel = this.$stopPoints;
                            ChaloNavigationManagerKt.e(this.this$0.C, new PremiumBusArgs.PremiumBusSeatSelectionArgs(Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN, json.a(PremiumBusSeatSelectionFlowType.INSTANCE.serializer(), new PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass(str7, pBOriginDestinationAppModel.c, pBOriginDestinationAppModel.h, strA, strA2)), (String) null, this.this$0.k.e, 4), null, 6);
                        } else {
                            PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent2 = this.this$0;
                            ChaloNavigationManagerKt.e(premiumBusSlotSelectionComponent2.C, PremiumBusFareDetailsEntryRoutingKt.a(purchaseThroughPass, fareDetailsDataB, PremiumBusFareDetailsEntryContext.FromSlotSelection, EmptyList.f17557a, premiumBusSlotSelectionComponent2.k.e), null, 6);
                        }
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent3 = this.this$0;
                        PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.$slot;
                        String str8 = this.$passId;
                        if (premiumBusBookingPurchaseOptionDetailsAppModel2 != null && (str3 = premiumBusBookingPurchaseOptionDetailsAppModel2.b) != null) {
                            str5 = str3;
                        }
                        premiumBusSlotSelectionComponent3.g1(pBAvailableSlotsTripAppModel, str8, str5);
                    }
                } else {
                    boolean zB = PremiumBusBookingAvailableOptionsAppModelKt.b(this.$purchaseOptions);
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent4 = this.this$0;
                    List<PremiumBusBookingPurchaseOptionAppModel> list3 = this.$purchaseOptions;
                    this.label = 1;
                    obj = premiumBusSlotSelectionComponent4.a1(list3, this, zB);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new av0((PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) obj, 2));
        return Unit.f17538a;
    }
}
