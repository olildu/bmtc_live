package app.chalo.productsummary.ui.ticket;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import defpackage.hi1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productsummary.ui.ticket.TicketSummaryComponent$handleOnBannerCtaClickIntent$1", f = "TicketSummaryComponent.kt", l = {265}, m = "invokeSuspend", v = 1)
final class TicketSummaryComponent$handleOnBannerCtaClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TicketSummaryIntent.OnBannerCtaClickIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ TicketSummaryComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8802a;

        static {
            int[] iArr = new int[ProductSummaryBannerCtaType.values().length];
            try {
                iArr[ProductSummaryBannerCtaType.TRY_BOOKING_AGAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductSummaryBannerCtaType.USE_PRODUCT_NOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductSummaryBannerCtaType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8802a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketSummaryComponent$handleOnBannerCtaClickIntent$1(TicketSummaryComponent ticketSummaryComponent, TicketSummaryIntent.OnBannerCtaClickIntent onBannerCtaClickIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketSummaryComponent;
        this.$intent = onBannerCtaClickIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketSummaryComponent$handleOnBannerCtaClickIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketSummaryComponent$handleOnBannerCtaClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new hi1(29));
            AnalyticsContract analyticsContract = this.this$0.t;
            Source source = Source.TICKET_SUMMARY_SCREEN;
            Pair pair = new Pair("bannerCtaType", this.$intent.f8808a.name());
            ChaloUserBookingType chaloUserBookingType = ((TicketSummaryDataState) this.this$0.f.getValue()).f;
            Pair pair2 = new Pair("productType", String.valueOf(chaloUserBookingType != null ? chaloUserBookingType.b : null));
            ChaloUserBookingType chaloUserBookingType2 = ((TicketSummaryDataState) this.this$0.f.getValue()).f;
            AnalyticsContractImplKt.b(analyticsContract, "product summary banner cta click", source, MapsKt.i(pair, pair2, new Pair("productSubType", String.valueOf(chaloUserBookingType2 != null ? chaloUserBookingType2.c : null))), false, 24);
            int i2 = WhenMappings.f8802a[this.$intent.f8808a.ordinal()];
            if (i2 == 1) {
                TicketSummaryComponent ticketSummaryComponent = this.this$0;
                ticketSummaryComponent.E0(new hi1(14));
                AnalyticsContract analyticsContract2 = ticketSummaryComponent.t;
                StateFlow stateFlow = ticketSummaryComponent.f;
                ChaloUserBookingType chaloUserBookingType3 = ((TicketSummaryDataState) stateFlow.getValue()).f;
                Pair pair3 = new Pair("passRequestType", String.valueOf(chaloUserBookingType3 != null ? chaloUserBookingType3.f2987a : null));
                ChaloUserBookingType chaloUserBookingType4 = ((TicketSummaryDataState) stateFlow.getValue()).f;
                Pair pair4 = new Pair("productType", String.valueOf(chaloUserBookingType4 != null ? chaloUserBookingType4.b : null));
                ChaloUserBookingType chaloUserBookingType5 = ((TicketSummaryDataState) stateFlow.getValue()).f;
                AnalyticsContractImplKt.b(analyticsContract2, "summary book again clicked", source, MapsKt.i(pair3, pair4, new Pair("productSubType", String.valueOf(chaloUserBookingType5 != null ? chaloUserBookingType5.c : null))), false, 24);
                BuildersKt.d(ticketSummaryComponent.j, null, null, new TicketSummaryComponent$handleBookAgainClickedIntent$2(ticketSummaryComponent, null), 3);
            } else if (i2 == 2) {
                ChaloUserBookingType chaloUserBookingType6 = ((TicketSummaryDataState) this.this$0.f.getValue()).f;
                if (chaloUserBookingType6 != null) {
                    TicketSummaryComponent ticketSummaryComponent2 = this.this$0;
                    BuildersKt.d(ticketSummaryComponent2.j, null, null, new TicketSummaryComponent$handleProductActivation$1(ticketSummaryComponent2, chaloUserBookingType6, null), 3);
                } else {
                    TicketSummaryComponent ticketSummaryComponent3 = this.this$0;
                    KotlinToastManager kotlinToastManager2 = ticketSummaryComponent3.v;
                    this.L$0 = kotlinToastManager2;
                    this.label = 1;
                    obj = ticketSummaryComponent3.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kotlinToastManager = kotlinToastManager2;
                }
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
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
