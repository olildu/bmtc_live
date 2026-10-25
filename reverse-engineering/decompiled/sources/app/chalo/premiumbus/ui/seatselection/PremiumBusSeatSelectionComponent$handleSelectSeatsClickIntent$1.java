package app.chalo.premiumbus.ui.seatselection;

import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.managers.SelectSeatsResult;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import defpackage.gf;
import defpackage.ud;
import defpackage.vu0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1", f = "PremiumBusSeatSelectionComponent.kt", l = {754, 790}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SeatInfoAppModel> $selectedSeats;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX INFO: renamed from: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1$3", f = "PremiumBusSeatSelectionComponent.kt", l = {814}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProductConfigCompleteDetailsListAppModel $completeProductConfigResult;
        final /* synthetic */ FareDetailsData $fareDetailsData;
        final /* synthetic */ PremiumBusSeatSelectionFlowType $flowType;
        final /* synthetic */ Ref.BooleanRef $isMultipleSeatSelectionAllowed;
        final /* synthetic */ List<SeatInfoAppModel> $selectedSeats;
        Object L$0;
        int label;
        final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Ref.BooleanRef booleanRef, PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModel, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, FareDetailsData fareDetailsData, List list, Continuation continuation) {
            super(2, continuation);
            this.$isMultipleSeatSelectionAllowed = booleanRef;
            this.this$0 = premiumBusSeatSelectionComponent;
            this.$completeProductConfigResult = productConfigCompleteDetailsListAppModel;
            this.$flowType = premiumBusSeatSelectionFlowType;
            this.$fareDetailsData = fareDetailsData;
            this.$selectedSeats = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.$isMultipleSeatSelectionAllowed, this.this$0, this.$completeProductConfigResult, this.$flowType, this.$fareDetailsData, this.$selectedSeats, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KotlinToastManager kotlinToastManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                if (this.$isMultipleSeatSelectionAllowed.element || this.$selectedSeats.size() == 1) {
                    PremiumBusSeatSelectionComponent.G0(this.this$0, this.$completeProductConfigResult, this.$fareDetailsData);
                } else {
                    this.this$0.E0(new vu0(4));
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
                    KotlinToastManager kotlinToastManager2 = premiumBusSeatSelectionComponent.r;
                    this.L$0 = kotlinToastManager2;
                    this.label = 1;
                    obj = premiumBusSeatSelectionComponent.n.b(StringEnum.ONLY_1_SEAT_CAN_BE_SELECTED_WITH_YOUR_CURRENT_OFFER, new Object[0], this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kotlinToastManager = kotlinToastManager2;
                }
                return Unit.f17538a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1(List list, PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$selectedSeats = list;
        this.this$0 = premiumBusSeatSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1(this.$selectedSeats, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$handleSelectSeatsClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FareDetailsData fareDetailsData;
        Object objB;
        KotlinToastManager kotlinToastManager;
        FareDetailsData fareDetailsDataA;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return unit;
        }
        ResultKt.b(obj);
        if (this.$selectedSeats.isEmpty()) {
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
            KotlinToastManager kotlinToastManager3 = premiumBusSeatSelectionComponent.r;
            this.L$0 = kotlinToastManager3;
            this.label = 1;
            objB2 = premiumBusSeatSelectionComponent.n.b(StringEnum.PLEASE_SELECT_SEATS_TO_CONTINUE, new Object[0], this);
            if (objB2 != coroutineSingletons) {
                kotlinToastManager2 = kotlinToastManager3;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                return unit;
            }
        } else {
            this.this$0.E0(new ud(this.$selectedSeats, 21));
            PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = ((PremiumBusSeatSelectionDataState) this.this$0.f.getValue()).c;
            if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase)) {
                if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = this.this$0;
                    Json json = ChaloJson.b;
                    PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass freshPurchaseThroughPass = (PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) premiumBusSeatSelectionFlowType;
                    String str = freshPurchaseThroughPass.g;
                    json.getClass();
                    premiumBusSeatSelectionComponent2.X0((FareDetailsData) json.b(str, FareDetailsData.INSTANCE.serializer()), (PremiumBusFareDetailsFlowType) json.b(freshPurchaseThroughPass.h, PremiumBusFareDetailsFlowType.INSTANCE.serializer()));
                    return unit;
                }
                if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) {
                    PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = (PremiumBusSeatSelectionFlowType.BulkBooking) premiumBusSeatSelectionFlowType;
                    this.this$0.W0(bulkBooking.d, bulkBooking.e, bulkBooking.f, bulkBooking.g, bulkBooking.h, bulkBooking.i, bulkBooking.j, this.$selectedSeats, false);
                    return unit;
                }
                if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent3 = this.this$0;
                    String str2 = premiumBusSeatSelectionComponent3.k.e;
                    if (str2 != null) {
                        premiumBusSeatSelectionComponent3.t.c(new SelectSeatsResult(this.$selectedSeats), str2);
                    }
                    gf.u(null, this.this$0.s);
                    return unit;
                }
                if (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat) {
                    this.this$0.E0(new vu0(2));
                    return unit;
                }
                if (premiumBusSeatSelectionFlowType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.E0(new vu0(3));
                return unit;
            }
            ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModelK0 = this.this$0.o.getO();
            if (productConfigCompleteDetailsListAppModelK0 == null) {
                return unit;
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager = this.this$0.o;
            List<SeatInfoAppModel> list = this.$selectedSeats;
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModelN0 = premiumBusPurchaseInfoManager.getQ();
            if (pBAvailableSlotsTripAppModelN0 != null) {
                booleanRef.element = pBAvailableSlotsTripAppModelN0.r;
                PBOriginDestinationAppModel pBOriginDestinationAppModelV = premiumBusPurchaseInfoManager.getP();
                if (pBOriginDestinationAppModelV != null) {
                    FareDetailsData.Companion companion = FareDetailsData.INSTANCE;
                    List list2 = productConfigCompleteDetailsListAppModelK0.f8205a.f;
                    Integer num = new Integer(list.size());
                    companion.getClass();
                    fareDetailsDataA = FareDetailsData.Companion.a(pBAvailableSlotsTripAppModelN0, pBOriginDestinationAppModelV, list2, list, num);
                } else {
                    fareDetailsDataA = null;
                }
                fareDetailsData = fareDetailsDataA;
            } else {
                fareDetailsData = null;
            }
            if (fareDetailsData != null) {
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent4 = this.this$0;
                BuildersKt.d(premiumBusSeatSelectionComponent4.j, null, null, new AnonymousClass3(booleanRef, premiumBusSeatSelectionComponent4, productConfigCompleteDetailsListAppModelK0, premiumBusSeatSelectionFlowType, fareDetailsData, this.$selectedSeats, null), 3);
                return unit;
            }
            this.this$0.E0(new vu0(1));
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent5 = this.this$0;
            KotlinToastManager kotlinToastManager4 = premiumBusSeatSelectionComponent5.r;
            this.L$0 = kotlinToastManager4;
            this.label = 2;
            objB = premiumBusSeatSelectionComponent5.n.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager4;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
