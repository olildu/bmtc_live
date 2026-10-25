package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.PremiumProductionModificationAdditionalInfoCtaActionType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationAdditionalInfoClickIntent$1", f = "NewPremiumBusReserveTicketActivationComponent.kt", l = {731, 740}, m = "invokeSuspend", v = 1)
final class NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationAdditionalInfoClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationAdditionalInfoClickIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ NewPremiumBusReserveTicketActivationComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7363a;

        static {
            int[] iArr = new int[PremiumProductionModificationAdditionalInfoCtaActionType.values().length];
            try {
                iArr[PremiumProductionModificationAdditionalInfoCtaActionType.CALL_CUSTOMER_CARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7363a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationAdditionalInfoClickIntent$1(NewPremiumBusReserveTicketActivationIntent.TripCancellationConfirmationAdditionalInfoClickIntent tripCancellationConfirmationAdditionalInfoClickIntent, NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = tripCancellationConfirmationAdditionalInfoClickIntent;
        this.this$0 = newPremiumBusReserveTicketActivationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationAdditionalInfoClickIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NewPremiumBusReserveTicketActivationComponent$handleTripCancellationConfirmationAdditionalInfoClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel = this.$intent.f7391a;
            PremiumProductionModificationAdditionalInfoCtaActionType premiumProductionModificationAdditionalInfoCtaActionType = premiumBusProductModificationAdditionalInfoAppModel != null ? premiumBusProductModificationAdditionalInfoAppModel.d : null;
            this.this$0.getClass();
            int i2 = premiumProductionModificationAdditionalInfoCtaActionType == null ? -1 : WhenMappings.f7363a[premiumProductionModificationAdditionalInfoCtaActionType.ordinal()];
            if (i2 == -1) {
                NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent = this.this$0;
                KotlinToastManager kotlinToastManager3 = newPremiumBusReserveTicketActivationComponent.u;
                this.L$0 = kotlinToastManager3;
                this.label = 2;
                obj = newPremiumBusReserveTicketActivationComponent.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager3;
                    hq0.s(kotlinToastManager, (String) obj);
                }
            } else {
                if (i2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                AnalyticsContract.DefaultImpls.a(this.this$0.p, "pb value pass booking cancellation upgrade CTA clicked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), vo1.s("passId", ""), null, false, 24);
                String str = this.$intent.f7391a.e;
                if (str == null || StringsKt.F(str)) {
                    NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent2 = this.this$0;
                    KotlinToastManager kotlinToastManager4 = newPremiumBusReserveTicketActivationComponent2.u;
                    this.L$0 = kotlinToastManager4;
                    this.label = 1;
                    obj = newPremiumBusReserveTicketActivationComponent2.s.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (obj != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager4;
                        hq0.s(kotlinToastManager2, (String) obj);
                    }
                } else {
                    this.this$0.v.d(str);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            hq0.s(kotlinToastManager2, (String) obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            hq0.s(kotlinToastManager, (String) obj);
        }
        return Unit.f17538a;
    }
}
